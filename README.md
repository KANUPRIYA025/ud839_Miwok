Miwok App
===================================

This app displays lists of vocabulary words for the user to learn the Miwok language.
Used in a Udacity course in the Beginning Android Nanodegree.


Prerequisites
--------------

- Android Studio 3.2.1 or higher
- compileSdkVersion 32 (For AndroidX dependencies, the min compileSdkVersion version is 31)
- minSdkVersion 21
- Supports up to Android 12
- Gradle 7.2.0

To run app in an Android Virtual Device (AVD), we have used the following configuration:
- Pixel 4 Mobile device with x86 System image
- API level 30
- Android 11

Note - Gradle Updates
---------------

The Android Studio build system depends on Gradle and its plugins. The Gradle and its plugins have to be updated separately of Android Studio.
For the updated version, refer to the following updated files:
~/build.gradle (project) file
~/app/build.graddle(: app) file
~/gradle/wrapper/gradle-wrapper.properties file
You can refer anytime to the latest [Android Gradle plugin release notes](https://developer.android.com/studio/releases/gradle-plugin) for the newest version of plugins.


This sample uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.

Troubleshoot
---------------
- Gradle version and Android Gradle Plugin version should be compatible. See the table [here](https://developer.android.com/studio/releases/gradle-plugin#updating-gradle)
- Sometimes, if you face unexpected behavior, go to File > Invalidate Caches/Restart. 


License
-------

Copyright 2016 The Android Open Source Project, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
