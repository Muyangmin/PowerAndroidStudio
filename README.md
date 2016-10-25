经历了几次换电脑的过程，每次都是草草下一个最新版的AS开始用，调好logcat，安装插件，但总会有遗漏。开发过程中偶有新发现，在下次配置电脑的时候多半又会忘记，而每次重新去找各种配置也是很麻烦的一件事情。因此萌生了记录下Android Studio最强大好用配置的想法。  
为文档简明起见，除非必要，本文不提供详细步骤截图，如不会操作，请自行求助搜索引擎或社区。同时非常欢迎各位分享Android Studio的使(qi)用(ji)心(yin)得(qiao)。

## Licence & Contribution
本文及本项目遵从**知识共享署名(CC BY )4.0协议**，协议文本在[这里](https://creativecommons.org/licenses/by/4.0/)。
欢迎Star和Fork，可直接在线编辑之后commit提交PR，也可手动Fork之后PR。

Ok， 让我们开始吧。

## 一、下载Android Studio
###### 官网下载
推荐从[这个地址](https://sites.google.com/a/android.com/tools/recent  )获得最新的Android Studio，包含`stable`, `dev`, `canary` 渠道。此外，还可以从[Android Developers](http://developer.android.com/develop/index.html)找到下载地址。
###### 国内镜像下载
国内推荐使用[AndroidDevTools](http://androiddevtools.cn/)或[腾讯Bugly镜像站](http://android-mirror.bugly.qq.com:8080/)获取更新。
> 镜像站虽好，但是维护镜像站的同学也很辛苦，所以镜像站总会比官网有一定的延迟。永远记住，Android开发入门第一步：先学会怎么上网。

## 二、安装插件
下载安装完成后，接下来当然最重要的是安装各种插件啦。以下是非常赞的通用插件：  
* **ignore**:必备插件，支持多种VCS的忽略配置和语法高亮。
* **Android Parcelable code generator**:自动生成`Parcelable`接口所需的各种模板代码，简单省心。
* **GsonFormat**：根据Json字符串生成Gson实体类，支持自动生成`SerializedName`等功能。实际上如果是简单的字段完全对应的实体类，也可以供fastjson等库使用。
* **Android Drawable Importer**:可以减少导入缩放图像到Android项目所需的工作量。
* **ADB Idea**：将常规的Adb操作集成到AS面板中。
* **Methods Count**：提供`build.gradle`文件中的库的方法数计算。
* Android-Butterknife-Zelezny:根据指定的XML文件快速生成butterknife注入代码。
* SelectorChapek for Android:根据约定的文件名自动生成对应的selector文件。
* Lifecyle Sorter:按照Activity/Fragment的生命周期将回调方法排序。
* Markdown:见名知意，Markdown文本编辑器。
* Genymotion：在工具栏添加Genymotion的管理面板入口，如果使用Genymotion做测试会非常实用。
* Activity createIntent Inspection:检查非抽象Activity是否存在`createIntent`方法并提供一个quickFix。类似插件还有Fragment newInstance Inspection.
* ideaVim：嘛，Geek们可能会喜欢……

> 注意：
* 本文的目的并非为这些插件做文档或任何形式的使用说明，请自行使用搜索引擎查找相关资料。
* 这里列出的所有插件名字均为其在IDEA Plugin Repository里搜索显示的名字，按照对应名字搜索即可找到和安装对应插件。本文不提供这些插件的源码目录（并且实际上有些插件并非开源）。
* 这里只列出常用的插件，小众的插件不在这里列出。要寻找更多的插件推荐，请参考以下链接：
https://www.zhihu.com/question/28026027  
https://www.zhihu.com/question/28527388  

## 三、修改设置项
###### 设置Logcat
在Setting里找到logcat，修改配色。参考值如下：
Assert:`#FF4949`， Debug:`#6897BB`, Error: `#FF6B68`,
Info `#6A8759`, Verbose `#BBBBBB`, Warn `#BBB529`。

###### 设置Encoding
确保IDE Encoding、Project Encoding和 Properties Encoding都设置为**UTF-8**。

###### 设置输入时自动换行*(Line Wrap)*
* Setting->Editor->Code Style，在`Default Options`里设置Right margin，通常推荐100或者120。勾选`wrap on typing`。
* 再找Code Style->Java，点击右侧标签Wrapping and Braces，勾选**Line breaks**和**Ensure right margin is not exceeded**。

###### 设置Keymap
这一步按照自己最喜欢的即可。就我个人而言，我喜欢把Duplicate Line 和Delete Line的`Ctrl+Y`和`Ctrl+D`调换过来。

###### 设置自动注释类版本
Setting->Editor->File And Code Templates->Includes，修改Java 文件的Header为以下格式：
```Java
/**
 * Created by ${USER} on ${DATE}.
 * @since 1.0.0
 */
```
以后每次开始新的版本迭代时，修改这个地方的版本号，从此不用担心每个类是从什么时候加入的啦！

## 四、设置Live Templates
Android Studio 已经内置了非常多的使用Live Template，例如 `fori`, `$number$.for`, `$iterable$.fori`, `$iterable$.forr`, `$condExpr$.if`, `$obj$.nn`, `$obj$.null`, `$obj$ inst`，还有很多没有列出的操作。如果你对这些常用的Live Templpate还不熟悉，强烈建议你试用一下。

使用自定义的Live templates可以进一步提高工作效率。请打开项目路径下的`LiveTemplates.java`文件，寻找感兴趣的代码块，通过Setting->Editor->LiveTemplates添加到你的Studio，然后尽情享受吧！
