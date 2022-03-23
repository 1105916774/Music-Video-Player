Music-Video-Player 音乐视频播放器（安卓）
=================

###### 综合运用UI界面设计、数据存储、Activity(活动)、Service（服务）、MusicPlayer、ListView等知识，设计开发一款具有音乐列表的音乐播放器。
###### 1.Fragment（碎片）是一种可以嵌入在Activity中的UI片段，它可以用来描述Activity中的一部分布局。

###### 2.ListView以列表的形式展示数据内容，并且能够根据列表的高度自适应屏幕显示。数据适配器是数据与视图之间的桥梁，它类似于一个转换器，将复杂的数据转换成用户可以接受的方式进行呈现。BaseAdapter是基本的适配器，是一个抽象类。

###### 3.音乐播放功能使用服务进行本地通信来实现，首先需要创建一个Service类，该类会提供一个onBind()方法，onBind()方法的返回值是一个IBinder对象，IBinder对象会作为参数传递给ServiceConnection类中onServiceConnected(ComponentName name,IBinder service)方法，这样访问者就可以通过IBinder对象与Service进行通信。

###### 4.MediaPlayer类用于播放音频和视频文件，该类提供了全面的方法支持多种格式的音频文件（3gp、mp4）。

### 1. 音乐播放器
![image](https://user-images.githubusercontent.com/45795105/159695653-313f1756-7889-4a7c-9631-356933154f24.png) ![image](https://user-images.githubusercontent.com/45795105/159695632-ae5d4e4a-6ad2-424e-a7fc-04e022dc5a1f.png)

### 2. 视频播放器
![image](https://user-images.githubusercontent.com/45795105/159695712-221fe0fd-d017-4b05-a66b-c3a3f4b2764d.png) ![image](https://user-images.githubusercontent.com/45795105/159696826-1ab19e34-90eb-42b6-b980-e04c1baa3167.png)
