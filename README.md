###### 本示例均来自慕课网geely老师的设计模式教程.

GOF 23 Design Patterns

抽象是一种约束.

creational(创造型):

    1.*simpleFactory (简单工厂) : 由一个工厂对象决定创建哪一种产品类的实例.(不属于GOF 23)
    
    2.*factoryMethod (工厂方法) : 将对象的创建延迟到子类,关注产品等级.
    
    3.*abstractFactory (抽象工厂) : 将对象的创建延迟到子类,关注产品族.
    
    4.prototype (原型) : 拷贝对象,适用用类初始化消耗较多资源,构造函数复杂,循环体中产生大量对象.注意风险(深拷贝,浅拷贝),拷贝不会调用构造函数.
    
    5.*builder (建造者) : 将一个复杂的对象的构建和表示进行分离,使得同样的构建过程可以创建不同的表示形式.
    
    6.*singleton (单例) : 保证类只有一个实例,提供一个全局访问点.需要注意反射和序列化攻击.

structural(结构型)

    1.*facade (外观) : 又称门面模式,提供一个外部的接口与子系统进行交互.
    
    2.*decorator (装饰者): 在不改变原有基础之上,将功能附加到对象上,继承的有力补充,比继承更加有弹性.
    
    3.*adapter (适配器) : 将一个类的接口转换成另一个接口,使原本不兼容的接口可以在一起工作.
    
    4.*flyweight (享元) : 减少对象的创建数量从而达到减少内存的占用,提高性能.
                                
    5.composite (组合) : 将单个对象和组合对象保持一致的处理方式.
    
    6.*bridge (桥接): 将它的抽象部分和它的实现部分进行分离,使它们都可以独立的变化,通过组合建立联系.
    
    7.*proxy (代理) : 为目标对象提供代理,以控制这个对象的服务.
    
behavioral(行为型)
    
    1.*templateMethod (模板方法) : 定义了一个算法的骨架,并运行子类为一个或多个步骤提供实现.

    2.itrator (迭代器) : 提供一种方法,顺序访问一个集合对象的各个元素,而又不暴露该对象的内部表示.
    
    3.*strategy (策略) : 定义了算法家族,分别封装起来,让它们之间可以相互替换,此模式让算法的变化不会影响到使用算法的用户.
    
    4.interpreter(解释器) : 为了解释一种语言,而为语言创建的解释器.
    
    5.observer (观察者) :定义了对象之间的一对多依赖,让多个观察者对象同时监听某个主题对象,当主题对象发生变化时,他的所有依赖者(观察者)都会收到通知并更新.

    6.memento (备忘录) : 保存一个对象的某个状态,以便在适当的时候恢复对象.

    7.command(命令) : 将"请求"封装成对象,以便使用不同的请求.
    
    8.mediator(中介) : 定义了一个封装一组对象如何交互的对象.

    9.chainOfResponsibility (责任链) : 为请求创建一个接收此次请求对象的链.

    10.visitor (访问者) : 封装作用于某数据结构(如List/Set/Map等)中的各元素的操作.(对不同的visitor操作相同的数据尝试不同的行为)
    
    11.*state (状态) : 允许一个对象在其内部状态改变时,改变它的行为.

软件设计7大原则:

    1.openClose(开闭原则) : 一个软件实体如类,模块和函数应该对扩展开放,对修改关闭.
    
    2.dependenceInversion(依赖倒置原则) : 高层模块不应该依赖低层模块,二者都应该依赖其抽象.
    
    3.interfaceSegregation(接口隔离原则) : 用多个专门的接口,而不使用单一的总接口,客户端不用管依赖它不需要的接口,注意适度.
    
    4.demeter(迪米特法则/最少知道原则) : 一个对象应该对其他对象保持最少的了解,尽量降低类与类之间的耦合.
    
    5.compositionAggregation(合成/组合-聚合原则) : 尽量使用对象组合或聚合,而不是继承关系达到软件复用的目的.
    
    6.liskovSubstitution(里氏替换原则) : 所有引用基类的地方必须能透明地使用其子类的对象.
    
    7.singleResponsiblity(单一职责原则) : 不要存在多于一个导致类变更的原因.