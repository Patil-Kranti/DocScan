<hr>

# DocScan

This is an android project written in kotlin turns your mobile into a portable scanner, which can be used for scanning handwritten notes and printed documents.

It automatically detect the edge of the paper over a contrasting surface.After the page is detected, it compensates any perspective from the image adjusting it to a 90 degree top view and saves it on a folder on the device.
<hr>

## Features

* Scan handwritten or printed documents
* Detects page frame and corrects perspective automatically
* Fast and smooth Image Processing on the fly
* Scans are saved to your device as images or pdf 
* Advance image processing to enhance images for greyscale and contrast


# Example
you can detect paper on desktop like this

## detecting previewing picture
<img src="https://raw.githubusercontent.com/Patil-Kranti/DocScan/master/app/src/main/res/values/beforeCrop.jpg" width="220">

## crop picture
<img src="https://raw.githubusercontent.com/Patil-Kranti/DocScan/master/app/src/main/res/values/afterCrop.png" width="220">

## enhance picture
<img src="https://raw.githubusercontent.com/Patil-Kranti/DocScan/master/app/src/main/res/values/enhance.png" width="220">

# Addition
code is written in pure kotlin, hope this project will be helpful to you.

Requirements
------------

Because of the version of OpenCV that is used in the project it needs to run on Android 5.0 (lollipop) or newer.

In order to capture and manipulate images DocScan depends on  the OpenCV Library.


How to Install
--------------

Binary APK file is available (https://github.com/Patil-Kranti/DocScan/releases) of the project.

Instructions for building
-------------------------

### Android Studio

Import the project from GitHub using File -> New -> Project from Version Control -> GitHub, fill the URL https://github.com/Patil-Kranti/DocScan.git

It will ask for a base directory, normally AndroidStudioProjects, you can change it to your preference.

After this the DocScan can be built.


### Command Line

Go to your base folder and import it using ```git```:

```
$ git clone https://github.com/Patil-Kranti/DocScan.git
```

This should import the Open Note Scanner repository in DocScan folder

You need to point the environment variable ```ANDROID_HOME``` to your Android SDK folder and run ```gradle``` to build the project:

```
$ cd DocScan
$ export ANDROID_HOME=~/android-sdk-linux
$ ./gradlew assembleRelease
```

Motivation
-------
It all started with inception of idea in our Prof.Athwale Sir's mind to make available a Open Source Scanner without of watermark,paid version to contribute towards Open source to  promotes the development of powerful software tools which we are increasingly reliant on .

Roadmap
-------

* add cloud support
* register a share action in order to obtain documents already pictured through standard camera apps


Contributing
------------

If you have any idea, feel free to fork it and submit your changes back to us at following address
*Kranti Patil <Krantipatil20@gmail.com>
*Rohan Pawar <rohapawar22@gmail.com>
*Utkarsha Shinkar <utkarshashinkar@gmail.com>
*Yash Lunawat <lunawatyash279@gmail.com>

Thanks
------

### Contributors

As an open source application, contribution are always welcome. Everyone that submits any code will be listed here.

* Kranti Patil
* Rohan Pawar
* Utkarsha Shinkar
* Yash Lunawat

### External code

This application wouldn't be possible without the great material produced by the community. I would like to give special thanks to the authors of essencial parts I've got on the internet and used in the code:

* [Open Source Computer Vision Library](https://github.com/opencv/opencv)
* [Android-er / GridView code sample](http://android-er.blogspot.com.br/2012/07/gridview-loading-photos-from-sd-card.html)
* [Adrian Rosebrock from pyimagesearch.com for the excellent tutorial on how to handle the images](http://www.pyimagesearch.com/2014/09/01/build-kick-ass-mobile-document-scanner-just-5-minutes/)


License
-------

 Patil-Kranti/DocScan is licensed under the
Apache License 2.0

A permissive license whose main conditions require preservation of copyright and license notices. Contributors provide an express grant of patent rights. Licensed works, modifications, and larger works may be distributed under different terms and without source code.
