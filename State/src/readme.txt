状态模式

1.定义一个State接口。在该接口内，糖果机的每个动作都有一个对应的方法。

2.为机器中的每个状态实现状态类，这些类将负责在对应的状态下进行机器的行为。

3.将动作委托到状态类