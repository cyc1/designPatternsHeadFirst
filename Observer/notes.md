# 观察者(Observer)模式
## 定义了一系列对象之间的一对多关系。当一个对象改变状态，其他依赖者都会收到通知。
a作为主题（被观察者），b1、b2、b3等等作为观察者。当a的状态发生变化时，b1、b2、b3都会收到通知（a主动推送给b们）；或者当b1、b2、b3需要一些状态数据时，b们可以主动从a获取数据（b们主动从a拉数据）。
