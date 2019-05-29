package com.corejava;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CustomClassLoader extends ClassLoader {

    @Override
    public Class findClass(String name) {

        byte[] b = loadClassData(name);
        return defineClass(name, b, 0, b.length);
    }

    private byte[] loadClassData(String className) {
        // read class
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(className.replace(".", "/")+".class");

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        int len = 0;

        while(true) {
            try {
                if (!((len = inputStream.read()) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayOutputStream.write(len);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
