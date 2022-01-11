package com.qq;

//灵长类继承了动物这个接口，所以也继承了吃的行为（这就是继承带来的好处，不用重复写一次吃这个行为的代码）
public interface Primate extends Animal{
  //这里扩展了一个move（）行走行为的方法
    public void move();

}
