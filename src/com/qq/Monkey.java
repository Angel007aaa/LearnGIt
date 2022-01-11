package com.qq;
//声明一个猴子类
public class Monkey implements Primate {
   //添加一个属性，未加private 同类包就能访问
    String name;

    //构造函数
    public Monkey (String name){
        this.name=name;
    }

    @Override
    public void eat() {  //实现该行为
        System.out.println(name+"吃了香蕉");
    }

    @Override
    public void move() { //实现该行为
        System.out.println(name+"开始在树上跳");
    }
}
