# Design-Patterns
设计模式的代码实践与资料整理，代码实践过程采用TDD的方式

# 学习资料
书籍：《Head First Design Patterns》

# 设计模式的六大原则
1. 开闭原则(Open-Closed-Principle)：一个软件实体应当对扩展开放，对修改关闭。即：软件实体尽量在不修改原有代码的情况下进行拓展。
2. 里氏替换原则(Liskow-Substitution-Principle)：所有引用基类的地方，都必须能够透明的使用子类的对象。
3. 依赖倒转原则(Dependency-Inversion-Principle):抽象不依赖于具体细节，细节依赖于抽象。即要针对接口编程，而非针对实现编程。小结：开闭原则是目标，里氏替换是基础，依赖导致是手段。
4. 单一职责原则(Single-Responsibility-Principle):一个类只负责一个功能领域中的响应职责，或者定义为：就一个类而言，应该只有一个引起它变化的原因。
5. 接口隔离原则(Interface-Segregation-Principle):使用多个专门的接口，而不要使用单一的总接口。
6. 迪米特法则(Law-of-Demeter):一个软件实体应当尽可能少的与其他实体发生作用（无熟人难办事）。
