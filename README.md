# ToastUtil
ToastUtil library for Android Applications to easily show Toasts in a decent way with three different type of Toasts. This library have three different type of messages, SUCCESS, WARNING and ERROR with different colors. This library have two different methods for two different gravities i.e TOP and BOTTOM.

# Screenshots

<img src="https://github.com/taimour1446/ToastUtil/blob/master/Screenshots/Screenshot_20180719-095232.jpg " width="200"> <img src="https://github.com/taimour1446/ToastUtil/blob/master/Screenshots/Screenshot_20180719-095240.jpg " width="200"> <img src="https://github.com/taimour1446/ToastUtil/blob/master/Screenshots/Screenshot_20180719-095247.jpg " width="200"> <img src="https://github.com/taimour1446/ToastUtil/blob/master/Screenshots/Screenshot_20180719-095253.jpg " width="200">


# Download

Add the dependency to your add module `build.gradle` file:

```
dependencies {
    compile 'com.github.taimour1446:ToastUtil:v1.0'
}

```
# Usage
This library has two static methods. 
**1. Toaster.showOnBottom**
**2. Toaster.showOnTop**

Each method takes following arguments
Context
Message text
Message type i.e Toaster.SUCCESS, Toaster.ERROR, Toaster.WARNING
Duration

Call these methods to show toasts 

In your Activity or Fragment class,
For showing Toast at bottom of the screen,

````java
     Toaster.showOnBottom(mContext,"This is a success message",Toaster.SUCCESS, Toast.LENGTH_LONG);
````
For showing Toast on top of the screen,

````java
     Toaster.showOnTop(mContext,"This is a warning message",Toaster.WARNING, Toast.LENGTH_LONG);
````


See sample code for [ItemRecyclerView](https://github.com/taimour1446/RecyclerView-AdvanceViewHolder/blob/master/app/src/main/java/com/xplores/inventory/ItemRecyclerView.java) for better understanding

# License
```
MIT License

Copyright (c) 2018 TAIMOUR KHAN KHAN

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```
