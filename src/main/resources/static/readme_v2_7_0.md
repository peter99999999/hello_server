>微信公众号：颜家大少
如有问题或建议，请公众号留言

###内容目录（由[TOC]自动生成）

[TOC]

###Md2All 简介
Markdown排版利器，支持 **"一键排版"** 、自定义css、80多种代码高亮。
能让Markdown内容，无需作任何调整就能**一键复制**到微信公众号、博客园、掘金、知乎、csdn、51cto、wordpress、hexo。。。等平台。
支持把图片自动上传到云图床，并生成Markdown。
[Md2All完整教程请参考：https://www.cnblogs.com/garyyan/p/8329343.html](https://www.cnblogs.com/garyyan/p/8329343.html )

###对公众号、博客的优化
支持代码块，并解决常见的代码块换行不正确,特别是iPone、iPad上不能滚动的问题;
解决把内容粘贴到公众号时，图片、或样式丢失的问题;

支持直接把页面"复制"到 "CSDN" 和 "博客园" 中，所有的样式保持一致。
[请参考此博文：http://blog.csdn.net/gary_yan/article/details/78645303](http://blog.csdn.net/gary_yan/article/details/78645303)
支持直接把页面"复制"到 "掘金" 中：
[请参考此博文：https://juejin.im/post/5a1bcc6ef265da431f4acb09](https://juejin.im/post/5a1bcc6ef265da431f4acb09)
支持直接把页面"复制"到 **"知乎"** 、51CTO、worpress ,hex......中。




###代码块显示效果
注：markdown对代码块的语法是开始和结束行都要添加：\`\`\`,其中 \` 为windows键盘左上角那个，如下：

```
public class MyActivity extends AppCompatActivity {
@Override  //override the function
    protected void onCreate(@Nullable Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       try {
            OkhttpManager.getInstance().setTrustrCertificates(getAssets().open("mycer.cer");
            OkHttpClient mOkhttpClient= OkhttpManager.getInstance().build();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
```
要精确指定语言（如：`java,cpp,css,xml,javascript,python,php,go,kotlin,lua,objectivec`等等）时，在头部直接指定，如：\`\`\`javascript，如下：

```javascript
function DisplayWindowSize(){

  var w=window.innerWidth
  || document.documentElement.clientWidth
  || document.body.clientWidth;
}
``` 
注：当指定语言时,会自动保留代码中的空行
如果所有的"代码主题"都不符合你的要求，你可以参考"一键排版"下的"代码块样式"自定义自己喜欢的代码高亮

***
###图片显示
下面的是我的公众号二维码图片，欢迎关注我。
![图注:大少公众号](http://img.blog.csdn.net/20171012163602706) 
注：markdown对图片链接的语法是:`![]()`,如：`![这里写图片描述](http://img.blog.csdn.net/20171012163602706)`,
可直接把网络图片地址添加到markdown中，
默认为图片居中，如果想居左时，请打开"一键排版"下的css样式中的`img{margin:0 0;}`,
`[这里写图片描述]`中对图片的描述内容会自动生成在图片的底部，对应样式`figcaption{}`
###云图床功能
Md2All支持云图床，设置好云图床后，能把本地图片自动上传到云图床，并自动生成markdown.
[请参考云图床教程:https://www.cnblogs.com/garyyan/p/9181809.html](https://www.cnblogs.com/garyyan/p/9181809.html)

###Tips
####自动保存
请点击左上角"编辑"图标再开始写作，这样就能自动保存写作内容，目前，所有保存的内容都是储存在本地浏览器缓存中(local storage)，所以,就算重新开机，这些内容都不会丢失的呵，但为了安全起见，在未实现帐号云同步功能前，请自行备份重要内容; 
####一键排版
**"一键排版"** 支持标准的css,已提供了不少的样式模板，但因为每个人的喜好不一样，所以，如果现有的样式模板不适合你，请尽情地自定义css样式吧。
就算改错了也就"恢复预设值"就OK了，所以不用担心呵。一旦掌握自定义css样式后，你就会知到它到底有多大的威力了 ^_^;

####浏览器兼容性
未做浏览器兼容测试，请尽可能使用 **Chrome** 浏览器作编辑! 
###Markdown基本语法
####标题
支持6种大小的标题，分别对应`#`,`##`,`###`,`####`,`#####`,`######`，如：
#####H5
######H6
####行内代码
如：`AppCompatActivity`类,markdown对行内代码的语法是前后用：\`,其中 \` 为windows键盘左上角那个,

####强调
**我是强调**
####斜体
试试*斜体*
####强调的斜体
试试***强调的斜体***
####删除
试试 ~~删除~~
####外链的超链接
试试外链的超链接：[我是外链的超链接](http://blog.csdn.net/gary_yan/article/details/78645303),markdown对链接的语法为：`[]()`,如：`[我是外链的超链接](http://blog.csdn.net/gary_yan/article/details/78645303)`
####页内的超链接
试试页内的超链接：[我是页内的超链接](#jump_1)，注：你先要在要跳转的到地方放置一个类似：`<a id="jump_1">任意内容</a>`的锚点。由`id="jump_1" `来匹配。


####有序列表
1. 有序列表 1
2. 有序列表 2
3. 有序列表 3

####无序列表
- 无序列表 1
- 无序列表 2 
- 无序列表 3

####引用块
只需要在前面加 `>`,如下:
>我是引用块
微信公众号：颜家大少
欢迎关注我，一起学习，一起进步!




###Markdown扩展语法

####表格 
| 班级 | 男生 | 女生 |
|-----|-----|------|
| 一(7)班 | 30   | 25 |
| 一(8)班 | 25   | 30 |

注：表格在公众号预览时，可能在PC端显示的不是正确的全屏，但在手机上预览时就会正常显示为全屏的了。

####任务列表
- [x] 任务1，已完成;
- [x] 任务2，已完成;
- [ ] 任务3，未完成; 


####katex数据公式:
行内显示：$e^{x^2}\neq{e^x}^2$,再来一个:$\sin\alpha+\sin\beta=\sin\gamma$

块显示
$$e^{x^2}\neq{e^x}^2$$
来个 *"复杂点"* 的:
$$H(D_2) = -(\frac{2}{4}\ log_2 \frac{2}{4} + \frac{2}{4}\ log_2 \frac{2}{4}) = 1$$

和：

$$\sum_{i=1}^n i^3 = \left( \frac{n(n+1)} 2 \right) ^2$$
注：很遗憾告诉你，像上面这种座标位置 *"复杂点"* 的公式，涉及到的一些属性 **公众号** 并不支持，建议你用[http://quicklatex.com/](http://quicklatex.com/)来生成相应的图片Url,再把图片Url链接到文中。
如下,链的是上面数学公式在http://quicklatex.com/生成图片对应的链接Url:
![](http://quicklatex.com/cache3/f3/ql_9c4483ab771d5f2f97441c89404c23f3_l3.png)


####注脚
我是注脚[^10]。点点就能知到我跳到了那儿。
或跳到放置：`<a id="footnote-10">任意内容</a>`的地方,[^10] 对应`id="footnote-10"`


####TOC
看内容目录就是用`[toc]`生成的
注：只要放置:`[TOC]`,就能把其后面的标题如：`#,##,...######`自动生成目录树，注意，`[TOC]`要独立一行，并前面和后面都要空一行


###直接支持html,css
如果你懂html和css，那下面这些效果就不在话下了：

<a href="#jump_1">来个页内跳转</a>，跳转到文未的：`<a id="jump_1">我是页内跳转到的位置</a>` ,对应：`id="jump_1"`
<span  style="color: #5bdaed; ">先给点颜色你看看</span>
<span  style="color: #AE87FA; ">再给点颜色你看看</span> 
<span  style="font-size:1.3em;">试试改变字体大小</span>
<span  style="font-size:1.3em;font-weight: bold;">改变字体大小，再来个粗体又如何？</span>

<p style="text-align:center">
试试内容居中

</p>

<p style="text-align:right">
那内容居右呢？
</p>

<p style="text-align:center;color:#1e819e;font-size:1.3em;font-weight: bold;">
来个综合的试试
<br/>
第二行
</p>

请参考"一键排版"中的"标题首字突出"样式的提示修改,可把此标题首字突出:
###<span class="firstletter">1</span>试试首字突出

注:理论上Md2All是支持所有标准的html和css，但问题是公众号很多都不支持，所以上面只演示了部分支持的。


###版本更新记录
***
版本号：V2.7.0
更新日期：2018-06-14
1:增加云图床功能，选择本地图片后能自动上传到云图床
2：改善当编辑的内容很多时输入卡的问题
3:增加用\能跳脱html标签的作用，如\<div>test\</div>
4:解决注脚在代码块或代码行中的显示问题


***
版本号：V2.6.1
更新日期：2018-02-26 
1:解决V2.6.0版本中，当图片url中含有特殊字符时(如@的转义字符%40）可能解析错误的问题；
2:解决在一些特殊机型的手机（如OPPO R11）上，代码块的缩进没效果的问题；
3:解决在代码块中含有成对出现的~时，代码会被转换的问题。

***
版本号：V2.6.0 
更新日期：2018-02-05
1:增加图片注释内容显示,并增加相应的css样式`figcaption{}`;
2:支持内容目录`[TOC]`[^7],能根据所有的标题自动生成目录表，并自动实现链接。并在每个模板中增加相应`.toc{}`的样式;
3:增加对`go,kotlin,lua`这几种编程语言的高亮;
4:对“综合示例”的标题h2进行修改;

***
版本号：V2.5.0 
更新日期：2018-02-04
1:增加"代码行数显示"选项,让用户选择是否显示代码的行数；
2:更新"标题突出"样式，之前的版本在复制到公众号时，标题样式无效，现版本提供html的解决方法，不过要用户自己根据说明去更改
3:更新"网格背景"和"综合示例"样式，解决网格在FireFox上显示可能不对的问题。
4:解决"标题前修饰"找不到样式文件的问题
5:增加网站备案号显示

***
版本号：V2.4.0 
更新日期：2018-01-22
1：修改编辑栏的主色调，使编辑和预览对比强点。并把编辑栏的输入语法检测去掉;
2：增加material color的选择面板，方便自定义颜色时作参考; 
3: 增加"标题淡雅","标题倒挂","标题后修饰 "，"网格背景"样式，并对"标题首字突出","标题四边框","标题上下边框"进行了调整;
4: 在"综合示例 " 中增加更多的参考，让你更清楚知到怎样改样式
4：解决一些katex公式显示不正确的问题，如：
$$H(D_2) = -(\frac{2}{4}\ log_2 \frac{2}{4} + \frac{2}{4}\ log_2 \frac{2}{4}) = 1$$

***
版本号：V2.3.0 
更新日期：2018-01-10
1. 增加了这些样式：标题下边框，标题上下边框，标题四边框，标题首字突出，综合示例。并在每个样式下面增加了更多的说明;
2. 把每个样式下面的`p code{}`改为`code
{}`避免行内代码的样式在列表时可能失效;
3. 更新了`引用块样式`，使其更改再有代表性。

 

***
版本号：V2.2.0
更新日期：2018-01-04
1. 增加任务列表[^4]，katex数学公式[^5]，注脚[^6]; 并在每个样式文件下增加其对应的css样式.

***
版本号：V2.1.0
更新日期：2017-12-20
1. 增加文件导出功能，使能导出包含样式的html文件;
2. 把编辑栏的横向滚动的功能去掉，现在的做法是当用户输入内容的长度超出输入框时，会自动换行到下一行，而不是之前的向右滚动，感觉这样编辑体验会好点;
3. 增加css样式：'标题背景渐变'和'字距偏大';
4. 增加table的demo及相应样式table{};
5. 每个模式下增加，使图片默认居中，并图片不会超出屏幕，这样会更接近实际的情况：
	img
	{
	  display: block;
      margin:0 auto;
	  max-width:100%;
	} 
	a {
	  word-wrap:break-word; 
	｝

***
版本号：V2.0.7
更新日期：2017-12-06
1. 在所有样式主题下增加行内代码(p code)、和斜体（em)的css样式值，及相应的demo
 
2. "一键排版"下所有样式主题文件中增加说明，使不熟悉css的朋友更清楚相应的功能 
3. 增加图片居中demo

***
版本号：V2.0.6
更新日期：2017-12-04
1. 增加支持h1~h6 span下的:before和:after, 并增加对应"标题前后修饰"样式
2. 基于掘金网的更新，而更新了"掘金样式"

***
版本号：V2.0.5
更新日期：2017-11-29
1. 对"一键排版"中的"掘金样式"进行更详细的描述;
注："掘金"的PC端浏览器显示是OK的，但手机端app现在还不支持自定义样式，所以会看到有些样式丢失了，此问题已向 "掘金" 的技术人员反馈，他们答复会尽快修复.
2. 对"代码主题"中的"xt256"的padding进行了调整使边距更合理;

***
版本号：V2.0.4
更新日期：2017-11-27
1. 在"一键排版"中增加"掘金样式"，增加到掘金网的支持。

***
版本号：V2.0.3
更新日期：2017-11-27
1. 把HTML功能拿掉。考虑到用户很少用到。如果想看相应的HTML只需“复制”到文本编辑器中即可。

***
版本号：V2.0.2
更新日期：2017-11-24
1. 解决“一键排版”中一些全局样式无效的情况
2. 增加“一键排版”更多的样式，并开放了所有的css样式供你修改
注：会重设所有的样式，你之前保存的会无效。
3. 把之前保存到cookie中的一些内容保存到local stage下，避免4KB的限制
4. “复制"内容到csdn,博客园时，不再需要点选HTML


***
版本号：V2.0.1
更新日期：2017-11-20
1. 解决代码块加注释'//'时导致后面的highlight失效的问题
2. 只有html模式时才把空格转为转义字符;

***
版本号：V2.0.0
更新日期：2017-11-13
1. 增加css样式参考模板，及自定义css样式
2. 增加HTML源码功能，可把HTML源码直接“复制"/"粘贴”到 csdn、博客园等的html编辑器或富文本编辑器下的html中，这样能保持所有的样式
3. 增加编辑和预览的滚动条同步滚动的功能（现在还不是很精确，之后会再改善）
4. 增加favorite代码样式下少的一些属性
5. 增加选“编辑”后，自动保存草稿到本地浏览器缓存的功能。
6. 增加指定代码所属语言的示例
***
版本号：V1.0.4
更新日期：2017-10-20
1. 更新“代码主题”：favorite下对js和css的显示
2. 更新“代码主题”：monokai-sublime和monokai中漏的一些属性
3. 更新说明文档
***
版本号：V1.0.3
更新日期：2017-10-18
1. 把“代码紧凑”模式下的代码间的行距加大
***
版本号：V1.0.2
更新日期：2017-10-17
1. 增加一个很酷的“代码主题”：favorite，并作为默认主题
2. 增加“代码紧凑” 的选项，使手机一屏能显示更多的代码
***

版本号：V1.0.1
更新日期：2017-10-13
1. 第一个版本正式上线
***

<a id="jump_1">我是页内跳转到的位置</a>
[^10]: 注脚跳转位置


 