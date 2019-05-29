package com.objpool;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Concept
 *  Use two hashTable data structure, store hashtable with connection Object and time. Time to check the expiry time.
 *  When client wants the connection get it from unused connection pool
 *  When client done with connection when return back to conneciton pool
 * Checkout:
 *  1. Iterate through the Unused pools
 *  2. Check if any unused pools has expiry time (connection not closed) then close connection
 *  3. validate the connection if connection is closed then , return the connection and add it to the connection pool
 *  4. Closed the connection
 *
 * @param <T>
 */
public abstract class ObjectPool<T> {

    Map<T, Long> usedPools;
    Map<T, Long> unsedPools;

    long expiry;

    public ObjectPool() {
        // 30 seconds
        expiry = 30000;
        usedPools = new HashMap();
        unsedPools = new HashMap();
    }

    // take action for connection expiry
    public abstract void expiry(T o);
    public abstract T create();

    // validate the connection is closed or not
    public abstract boolean validate(T o);

    public T checkout() {
        // get the unused maps
        T t;
        if (unsedPools.size() > 0) {
            Set keys = unsedPools.keySet();
            Iterator iterator = keys.iterator();
            while(iterator.hasNext()) {
                t = (T) iterator.next();
                if (System.currentTimeMillis() - unsedPools.get(t) > expiry) {
                    unsedPools.remove(t);
                    expiry(t);
                    t = null;
                } else {
                    if (validate(t)) {
                        unsedPools.remove(t);
                        usedPools.put(t, System.currentTimeMillis());
                        return t;
                    } else {
                        unsedPools.remove(t);
                        expiry(t);
                        t = null;
                    }
                }

            }
        }
        // no object available
        t = create();
        usedPools.put(t, System.currentTimeMillis());
        return t;
    }

    public void checkIn(T t) {
        usedPools.remove(t);
        unsedPools.put(t, System.currentTimeMillis());
    }
}
