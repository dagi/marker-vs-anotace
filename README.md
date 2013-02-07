marker-vs-anotace
=================

Priklad ukazujici rozdil v chovani pokud na classpath v runtime chybi interface a nebo anotace http://www.dagblog.cz/2013_02_03_archive.html#1626665415050616123


```
java -classpath . Test PersonWithAnnotation
PersonWithMarker@d2a7c1e
java -classpath . Test PersonWithMarker
PersonWithMarker@d2abd1e
rm IPersistable.class
rm Persistable.class
java -classpath . Test PersonWithAnnotation
java -classpath . Test PersonWithMarker

dagi$ java -classpath . Test PersonWithMarker
Exception in thread "main" java.lang.NoClassDefFoundError: IPersistable
	at java.lang.ClassLoader.defineClass1(Native Method)
	at java.lang.ClassLoader.defineClass(ClassLoader.java:791)
	at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
	at java.net.URLClassLoader.defineClass(URLClassLoader.java:449)
	at java.net.URLClassLoader.access$100(URLClassLoader.java:71)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:361)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:355)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.net.URLClassLoader.findClass(URLClassLoader.java:354)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:423)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:308)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:356)
	at java.lang.Class.forName0(Native Method)
	at java.lang.Class.forName(Class.java:186)
	at Test.main(Test.java:8)
Caused by: java.lang.ClassNotFoundException: IPersistable
	at java.net.URLClassLoader$1.run(URLClassLoader.java:366)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:355)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.net.URLClassLoader.findClass(URLClassLoader.java:354)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:423)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:308)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:356)
	... 15 more

dagi$ java -classpath . Test PersonWithAnnotation
PersonWithAnnotation@4d68af51
```