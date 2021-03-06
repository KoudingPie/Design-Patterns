# facade-pattern
外观模式：提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。

# note
* 当需要简化并统一一个很大的接口或者一群复杂的借口时候，使用外观。
* 外观将客户从一个复杂的子系统中解耦。
* 实现一个外观，需要将子系统组合进外观中，然后将工作委托给子系统执行。
* 可以为一个子系统实现一个以上的外观。
* 外观将一群对象“包装”起来以简化其接口。

# 设计原则
最少知识原则：只和你的密友谈话。
