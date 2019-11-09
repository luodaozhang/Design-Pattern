#   wait for update ......

GOF 23 Design Patterns

抽象是一种约束.

simpleFactory : 由一个工厂对象决定创建哪一种产品类的实例.在jdk,mysql...中使用

factoryMethod : 将对象的创建延迟到子类,关注产品等级.在jdk,logback...中使用

abstractFactory : 将对象的创建延迟到子类,关注产品族.在jdk,mybatis...中使用

prototype : 拷贝对象,适用用类初始化消耗较多资源,构造函数复杂,循环体中产生大量对象.注意风险(深拷贝,浅拷贝),拷贝不会调用构造函数,在jdk中使用...

builder : 将一个复杂的对象的构建和表示进行分离,使得同样的构建过程可以创建不同的表示形式,出现在spring,jdk,mybatis,guava...

singleton : 保证类只有一个实例,提供一个全局访问点.需要注意反射和序列化攻击.使用地方太多了.

软件设计7大原则:
    1.开闭原则
    2.依赖倒置原则
    3.接口隔离原则
    4.迪米特法则(最少知道原则)
    5.合成(组合)/聚合原则
    6.里氏替换原则
    7.单一职责原则