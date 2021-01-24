Set the JDK6 env:
1. Download the JDK6
2. Run the jdk6.bat
3. Compile the source file: javac -d out src\org\fenixsoft\jvm\chapter2\RuntimeConstantPoolOOM_1.java
4. Run the source file: https://www.baeldung.com/java-could-not-find-load-main-class, java -XX:PermSize=6M -XX:MaxPermSize=6M -cp out org.fenixsoft.jvm.chapter2.RuntimeConstantPoolOOM_1
5. Check the result
