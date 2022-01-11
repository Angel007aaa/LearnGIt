package com.qq;

//人类这一层已经有了属性（名字+年龄），再抽象成接口就不合理了，所以声明一个类
public class Person implements Primate{

    String name;
    String sex;
    private Integer age;

    //构造函数
    public Person(String name,String sex, Integer age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    @Override
    public void eat() {
        System.out.println(name+"开始干饭");
    }

    @Override
    public void move() {
        System.out.println(name+"没病走两步");
    }
    //由于年龄这个属性我们已经加了private,外界看不到，但我们可以提供一个public方法让外界访问到
    //这个方法我们处理一下，不让对方看我们女士的年龄
    public  void printAge(){
        if(isLady(sex)){ //isLady这个方法其他类访问不到，但该自身类是可以访问的
            System.out.println(name+"女生的年龄不告诉你");
        }else{
            System.out.println(name+age+"岁了");

        }
    }
    //这个方法也用了private来修饰，外部类看不到，也无法调用该方法，这就是封装
    private boolean isLady(String sex){
        if(sex.equals("女")){
            return true;
        }
        return false;
    }
}
