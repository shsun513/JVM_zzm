package org.fenixsoft.jvm.chapter8;

/**
 *  javac -d out src\org\fenixsoft\jvm\chapter8\LocalVariableTableGC.java
 *  java -XX:+PrintGCDetails -cp out org.fenixsoft.jvm.chapter8.LocalVariableTableGC
 */
public class LocalVariableTableGC {
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        int a = 0; //clear the slot of the LocalVariableTable
        System.gc();
    }
}
