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
previous version only work well on device of 1080 * 1920 resolution ratio, this bug fixed in this version.

