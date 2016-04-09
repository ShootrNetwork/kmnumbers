[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-KMNumbers-green.svg?style=true)](https://android-arsenal.com/details/1/3389) [![Build Status](https://travis-ci.org/ShootrNetwork/kmnumbers.svg?branch=master)](https://travis-ci.org/ShootrNetwork/kmnumbers)

# KMNumbers
Android library to shorten long numbers. For example: 10.000 -> 10.0K, 10.000.000 -> 10.0M.

The sample
----------

```java

KMNumbers.formatNumbers(1000L); // should return 1000,
KMNumbers.formatNumbers(10000L); // should return 10.0K,
KMNumbers.formatNumbers(1000000L); // should return 1.0M,
KMNumbers.formatNumbers(10000000L); // should return 10.0M.

```

#Download

* Grab via Gradle:
```groovy
compile 'com.shootr:KMNumbers:1.0.0'
```
* Grab via Maven:
```xml
<dependency>
  <groupId>com.shootr</groupId>
  <artifactId>KMNumbers</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

Contributors
============

* Development: _Arturo Jiménez_ ([@artjimlop](https://github.com/artjimlop)), _Jorge Martínez_ ([@jmartinez360](https://github.com/jmartinez360))