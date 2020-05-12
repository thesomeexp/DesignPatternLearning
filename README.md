# 设计模式Java实现
这里只是设计模式的一些Java代码实例演示. 
作为<软件秘籍 设计模式那点事>的代码笔记保存, 还有一些例子. 

# 第一部分 创建型模式

## 1.简单工厂模式SimpleFactory
简单来说就是根据参数的不同返回不同类的实例, 被创建的实例通常都具有共同的父类. 
JDK中Calendar类的createCalendar方法创建实例时就使用了简单工厂模式. 
### 1. 图表库ChartLibrary
某软件公司要基于Java语言开发一套图表库，该图表库可以为应用系统提供多种不同外观的图表，例如柱状图(HistogramChart), 饼状图(PieChart), 折线图(LineChart)等。该软件公司图表库设计人员希望为应用系统开发人员提供一套灵活易用的图表库，通过设置不同的参数即可得到不同类型的图表，而且可以较为方便地对图表库进行扩展，以便能够在将来增加一些新类型的图表。现使用简单工厂模式来设计该图表库。

## 2.工厂方法模式FactoryMethod
工厂方法模式简单来说是一个特定的工厂创建一个特定的产品. 
JDK中java.util.List作为一个抽象接口工厂, 它有一个iterator()方法, 该方法会返回一个迭代器接口Iterator(抽象产品). List子类java.util.LinkedList实现iterator()方法, 返回具体的产品AbstractList$ListItr. 
List子类java.util.ArrayList实现iterator()方法, 返回具体的产品AbstractList$Itr. 他们返回的产品都是AbstractList内部类, 实现了Iterator接口. 
### 1.曹操献刀CaoCaoOfferedKnife
书中作者提到的一个例子, 在曹操献刀这个故事中, 王允作为武器工厂生产抽象宝刀, 而曹操则负责生产具体的七星宝刀, 曹操2则是八星宝刀. (为什么标题是刀, 里面是剑...)我修改了源代码的包结构, 使例子更容易理解. 
### 2.日志记录系统LoggerSystem
某系统运行日志记录器(Logger)可以通过多种途径保存系统的运行日志，例如通过文件记录或数据库记录，用户可以通过修改配置文件灵活地更换日志记录方式。在设计各类日志记录器时，开发人员发现需要对日志记录器进行一些初始化工作，初始化参数的设置过程较为复杂，而且某些参数的设置有严格的先后次序，否则可能会发生记录失败。为了更好地封装记录器的初始化过程并保证多种记录器切换的灵活性，现使用工厂方法模式设计该系统。(因为只是作为工厂方法模式的学习演示, 修改配置文件的那部分就不在这里实现了)

## 3.抽象工厂模式AbstractFactory
提供一个用于创建相关或者依赖对象的家族(产品族)的接口, 而不需要指定具体实现类. 
JDK中java.sql.DriverManager就是抽象工厂的一个实现吧. 
Mysql, Oracle等驱动管理器继承于它, 从而生产不同的Connection, Statement, PreparedStatement等产品…
### 1.窗口换肤 皮肤库SkinLibrary
某软件公司要开发一套界面皮肤库，可以对基于Java的桌面软件进行界面美化。用户在使用时可以通过菜单来选择皮肤，不同的皮肤将提供视觉效果不同的按钮、文本框、组合框等界面元素，例如春天(Spring)风格的皮肤将提供浅绿色的按钮、绿色边框的文本框和绿色边框的组合框; 而夏天(Summer)风格的皮肤则提供浅蓝色的按钮、蓝色边框的文本框和蓝色边框的组合框。该皮肤库需要具备良好的灵活性和可扩展性，用户可以自由选择不同的皮肤，开发人员可以在不修改既有代码的基础上增加新的皮肤。现使用抽象工厂模式来设计该界面皮肤库。
### 2.顾客kfc点餐KfcFactory
这是书作者举的一个例子, 但我觉得这个例子没有上面的那个换皮肤好理解. 

## 4.建造者模式Builder
使用场合: 生成的产品对象内部结构复杂. 不同建造者定义不同的构建过程. 
JavaSDK中StringBuilder就是一个简易的没有建造者的建造者模式. 
### 1.手机套餐创建MobilePackage
作者举的一个例子, 例子中手机套餐作为一个复杂的对象, 客户作为终端需求, 营业厅操作员作为指导者通知建造者(计算机)需要生产什么样的手机套餐, 最后返回手机套餐(产品). 
### 2.简易游戏角色的构建GameActorBuilde
游戏角色具有复杂但结构相似的对象, 使用建造者模式构建复杂的角色.

## 5.原型模式Protorype
简单来说生产新的复杂对象直接从模板那里复制一份就行了. 
使用场合: 产生的对象原型比较复杂, 初始化需要许多资源时, 希望框架原型和产生对象分开时, 同一个对象供其他调用者同时访问时. 
### 1. 重复的日常生活DailyLife
小李每天都过着重复的日常生活, 但偶尔每天只有一点小改变, 所以今天的小李相对于昨天的小李来说或许只是其中某一个方面不一样了, 不同天的小李都差不了多少. (这个例子用的是Object对象的clone方法. )
### 2. 相似的周报WeeklyLogSystem
在使用某OA系统时, 有些岗位的员工发现他们每周的工作都大同小异, 因此在填写工作周报时很多内容都是重复的, 为了提高工作周报的创建效率, 大家迫切希望有一种机制能够快速创建相同或者相似的周报, 包括创建周报的附件. (附件有两种克隆方式. 浅克隆和深克隆, 这里的深克隆用的是序列化的深克隆方式而不是Object里面的clone. )

## 6.单例模式Singleton
单例模式主要想做的就是在系统中只允许有一个实例. 作者说了两种创建单例模式类的方法: 
一种是判断当前类是否为null, 然后再创建, 不过这可能会导致线程不安全的问题所以需要用synchronized关键字. 
第二种方法是直接在类里new, 获得实例的方法直接返回, 这样对比第一种方式提高了执行效率, 缺点是产生内存浪费. 
### 1. 懒汉式单例方法Method1
懒汉式用了锁的方法来确保不会出现脏读, 有几种锁的方式. 
### 2. 饿汉式单例方方法Method2
饿汉式直接返回. 

# 第二部分 结构型模式

## 7.适配器模式Adapter
将一个类的接口转换成客户希望的另一个接口, 适配器模式让那些接口不兼容的类可以一起工作. 简单理解就是适配器通过一个类能转变为我需要的那个类. 有利于代码重用. 
### 1. 电源适配器PowerAdapter
当你只有220v电源的时候, 你想让它变成12v电源, 那么电源适配器类将包裹一个220v电源的类, 并实现12v的接口, 使其支持12v电源. (这个例子使用了两种适配器的实现方法, 对象适配器(组合)和类适配器(继承). )
### 2. 玩具车ToyCar
某公司欲开发一款儿童玩具汽车, 为了更好地吸引小朋友的注意力, 该玩具汽车在移动过程中伴随着灯光闪烁和声音提示. 在该公司以往的产品中已经实现了控制灯光闪烁(例如警灯闪烁)和声音提示(例如警笛音效)的程序, 为了重用先前的代码并且使得汽车控制软件具有更好的灵活性和扩展性, 现使用适配器模式设计该玩具汽车控制软件. 


## 8.桥接模式Bridge
将抽象部分与它的实现部分解耦, 使得两者都能够独立变化. 适用于两个维度各自的扩充. 
### 1.跨平台图像浏览系统ImageParseInMultipleSystem
某软件公司要开发一个跨平台图像浏览系统，要求该系统能够显示BMP、JPG、GIF、PNG等多种格式的文件，并且能够在Windows、Linux、UNIX等多个操作系统上运行。系统首先将各种格式的文件解析为像素矩阵(Matrix)，然后将像素矩阵显示在屏幕上，在不同的操作系统中可以调用不同的绘制函数来绘制像素矩阵。另外，系统需具有较好的扩展性，以便在将来支持新的文件格式和操作系统。试使用桥接模式设计该跨平台图像浏览系统。
### 2.开关和电灯SwitchsAndLights
开关和电灯都可以多维度扩充, 怎么样实现呢?

## 9.组合模式Composite
组合多个对象形成树形结构以表示具有部分-整体关系的层次结构. 组合模式让客户端可以统一对待单个对象和组合对象. 将对象组织到树形结构中, 可以用来描述整体与部分的关系. 它能清楚的定义分层次的复杂对象. 
透明组合模式: 拿文件夹来举例子, 文件夹的增删查改方法写在抽象类的话就属于透明组合模式, 文件继承抽象类文件也会
有这几个方法, 但具体文件类的实现应该是个空方法. 优点是可以一致对待所有对象, 缺点是不够安全. 
安全组合模式: 上面的文件夹增删查改方法不写在抽象文件类里, 而是在文件夹里. 客户端要区别对待, 缺点是不够透明. 
JDK中的java.awt.Container就是很好的组合模式, java.awt.Container继承java.awt.Component类, java.awt.Container类有add(java.awt.Component方法. 
### 1.公司层级结构company
某个管理层员工的下一级可能是管理其他员工的员工也有可能是普通员工. (文件系统中可能是文件夹或者是文件)
### 2.不同文件的采用不同杀毒方式FileSystem
某软件公司欲开发一个杀毒(Antivirus)软件, 该软件既可以对某个文件夹(Folder)杀毒, 也可以对某个指定的文件(File)进行杀毒. 该杀毒软件还可以根据各类文件的特点, 为不同类型的文件提供不同的杀毒方式, 例如图像文件(ImageFile)和文本文件(TextFile)的杀毒方式就有所差异. 现使用组合模式来设计该杀毒软件的整体框架. 

## 10.装饰者模式Decorator
装饰者模式是在不改变原类文件和使用继承的情况下, 动态地扩展一个对象的功能. 它是通过创建一个包装对象, 也就是装饰来包裹真实的对象. 使用对象之间的关联关系取代类之间的继承关系, 可以在不需要创建更多子类的情况下, 让对象的功能得以扩展. 
透明装饰模式: 客户端完全针对抽象编程, 具体构件对象和具体装饰对象没有任何区别, 无法直接调用装饰者扩展的方法. 
半透明装饰模式: 和上面不同, 它对客户端透明但对具体装饰类型是不透明的. 
### 1.构件库VisualComponent
某软件公司基于面向对象技术开发了一套图形界面构件库——VisualComponent, 该构件库提供了大量基本构件, 如窗体, 文本框, 列表框等, 由于在使用该构件库时, 用户经常要求定制一些特殊的显示效果, 如带滚动条的窗体, 带黑色边框的文本框, 既带滚动条又带黑色边框的列表框等等, 因此经常需要对该构件库进行扩展以增强其功能. 现使用装饰模式来设计该图形界面构件库. 
### 2.染色馒头Bread
书中作者举得一个染色馒头例子, 当馒头工序很多时, 会创建很多的类, 但使用装饰者模式后就能简化不同过程的扩展. 

## 11.外观模式Facade
外观模式为子系统中的一组接口提供一个高层接口, 客户端通过外观接口读取内部资源而不与子系统交互. 通过一个外观接口松开了客户端和高复杂度子系统之间的耦合. 
(迪米特法则: 一个软件实体应当尽可能少地与其他实体发生相互作用. 也就是"只和你的密友谈话". )
### 1.糖醋排骨Spareribs
书中作者以制作糖醋排骨的过程, 平常是我们要考虑如何做糖醋排骨, 我们需要了解糖醋排骨的制作过程, 但通过厨师这个外观类, 我们之间对厨师说做糖醋排骨, 他知道如何去做, 就不需要我和制作过程做交互了. 
### 2.加密系统Encrypt
某软件公司要开发一个可应用于多个软件的文件加密模块, 该模块可以对文件中的数据进行加密并将加密之后的数据存储在一个新文件中, 具体的流程包括3个部分, 分别是读取源文件, 加密, 保存加密之后的文件, 其中, 读取文件和保存文件使用流来实现, 加密操作通过求模运算实现. 这3个操作相对独立, 为了实现代码的独立重用, 让设计更符合单一职责原则, 这3个操作的业务代码封装在3个不同的类中. (这个例子使用了抽象外观模式, 它一定程度上解决了在修改子系统中必须修改外观类的问题. )

## 12.享元模式Flyweight
享元模式以共享的方式高效支持大量的细粒度对象, 通过复用内存中已存在的对象, 降低系统创建对象实例的性能消. 
简单来说就是当大量类的某个属性相同时, 可以共用一个同对象来创建对象, 从而减少创建对象的性能消耗. 
### 1.五子棋FiveChessman
棋盘中有很多棋子, 正常来说意味着要创建很多棋子对象, 但考虑到棋子非黑即白, 如果每次创建一个新的棋子都要new一下黑/白棋子, 无疑会影响性能. 该例子通过使用一个HashTable来做新建棋子对象时的缓存, 提升性能. 
PS: 关于什么是粗粒度细粒度: 
(什么是对象的粒度? 粗粒度, 细粒度? 
答: 同样一个系统，同样的需求。两个设计师给出两种设计。两个设计总的代码行数差不多，但是类的数目不同。第一个设计有10个类，第二个设计有50个类。这样平均起来每个类所含有的代码行数就有很大的区别，第一种设计中的
代码行数平均比第二种设计多大约5倍。第一种设计是粗粒度的，第二种设计是细粒度的。第一种设计中对象的粒度平均是第二种设计中对象粒度的5倍。原本项目组中的ejb程序员要求我每一个查询列表对应一个dao,相应的,粒度就比较细但我注意到许多列表本身的数据访问接口是一致的,区别只在于SQL语句的不同于是就采用一个数据访问接口对应一个静态工厂的方式封装这些dao,
于是,粒度就比较粗对于要使用我的dao的ejb程序员而言, 粒度越细,出现匹配错误的可能性就越小, 因为,一旦匹配错误,在编译期,就会报类型错误而我宁愿粒度粗一些,因为这在实现重用时有更大的自由度。————————————————版权声明：本文为CSDN博主「xkhzk2」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。原文链接：https://blog.csdn.net/xkhzk2/java/article/details/84289252)

## 13.代理模式Proxy
代理模式在客户端和目标对象之间引入一个代理对象, 它充当中介, 可以去掉客户端不能看到的内容或者增加客户需要的格外新服务, 有效的降低了耦合. 
常见的代理模式: 
远程代理(Remote Proxy): 为一个位于不同的地址空间的对象提供一个本地的代理对象, 这个不同地址空间可以在同一台主机中, 也可以在另一台主机中, 远程代理又称为大使(Ambassador). 
虚拟代理(Virtual Proxy): 当目标对象加载起来因为耗资源比较慢时, 先创建一个消耗较小的对象来临时表示. 真正的对象在需要时加载或者后台慢慢加载. 
保护代理(Protect Proxy): 简单来说就是在目标对象的基础上加上鉴权, 不同的用户有不同的使用权限. 
智能引用代理(Smart Referenc Proxy): 当一个对象被引用时, 提供一些格外操作, 例如将对象被调用的次数记录下来. 
### 1.收费查询系统SearcherSystem
使用代理模式实现的在用户查询时鉴权以及记录查询日志. 

### 2.OA系统OASystem动态代理实现
需要代理多个类时, 静态代理的缺点就暴露出来, 代理类过于庞大或者产生的代理类过多, 不易维护等. 可以通过动态代理改进. 而动态代理有通过实现接口的JDK动态代理和通过继承的cglib动态代理等. 这里使用JDK动态代理实现. 
某软件公司欲为公司OA系统数据访问层DAO增加方法调用日志，记录每一个方法被调用的时间和调用结果，现使用动态代理进行设计和实现。

### 3.简单的JDK动态代理实现实例SimpleDynamic
模板

### 4.红酒代理商RedWine
模拟用户->红酒代理商->红酒厂商

# 第三部分 行为型模式

## 14.责任链模式ChainOfResponsibility
在责任链模式中, 具体处理节点中含有对下一个处理节点的引用而形成一个责任链条, 请求在这个链条上传递, 客户端并不知道链上的哪一个对象最终处理这个请求. 避免将一个请求的发送者与接收者耦合在一起, 让多个对象都有机会处理请求. 
- 纯的责任链模式: 
一个具体处理者对象只能在两个行为中选择一个：要么承担全部责任，要么将责任推给下家; 
不允许出现某一个具体处理者对象在承担了一部分或全部责任后又将责任向下传递的情况; 
一个请求必须被某一个处理者对象所接收，不能出现某个请求未被任何一个处理者对象处理的情况.
- 不纯的责任链模式: 
允许某个请求被一个具体处理者部分处理后向下传递，或者一个具体处理者处理完某请求后其后继处理者可以继续处理该请求; 
一个请求可以最终不被任何处理者对象所接收并处理;
JavaScript的事件浮升(Event Bubbling)处理机制.
### 1.学生请假AskForLeave
根据学生请假状态请求的等级来决定是班长, 老师还是校长处理请假. 
### 2.供应链管理Supply Chain Management
某企业的SCM(Supply Chain Management，供应链管理)系统中包含一个采购审批子系统。该企业的采购审批是分级进行的，即根据采购金额的不同由不同层次的主管人员来审批，主任可以审批5万元以下（不包括5万元）的采购单，副董事长可以审批5万元至10万元（不包括10万元）的采购单，董事长可以审批10万元至50万元（不包括50万元）的采购单，50万元及以上的采购单就需要开董事会讨论决定。

## 22.策略模式Strategy
### 1.打折策略选择MarketPromotion
商品打折策略选择, 我们有: 打8折商品促销策略, 满1000减200商品促销策略, 高于200部分打8折商品促销策略应该如何用策略模式实现?
### 2.不同企业的口号StrategyOfCompany
企业策略选择(超简单实现), 不同的企业有着不同的口号.



