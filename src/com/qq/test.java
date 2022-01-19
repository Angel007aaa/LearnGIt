package com.qq;

public class test {
    public static void main(String[] args) {
        Animal animal1= new Monkey("小猴子1");  //小猴1以animal形态出现
        Animal animal2 = new Person("张三", "男", 21); //张三以animal2的形态出现
        Primate primate= new Person("李四","男",22); //李四以primate的形态出现
        Person person1 = new Person("王五", "男", 23);//王五以person的形态出现
        Person person2 = new Person("小燕子", "女", 24);//小燕子以person2的形态出现
        System.out.println("------");
        animal1.eat(); //以animal1的形态出现，只能调用Animal里的eat()方法，
        animal2.eat(); //以animal2的形态出现，只能调用Animal里的eat()方法
        //animal1.move();报错 以animal形态出现时，只能调用Animal里面的方法
        primate.eat(); //以primate形态出现，由于继承了Animal类，可以调用Animal里面的eat()方法
        primate.move();//以primate形态出现，直接调用自身的方法
        //primate.printAge();报错 以primate出现只能调用primate类里及其父类的方法
        System.out.println("----");
        person1.eat();//以person形态出现，可以调用继承的方法
        person1.move();//以person形态出现，可以调用继承的方法
        person1.printAge();//以person形态出现，可以调用自身的方法
        person2.printAge();//以person形态出现，可以调用自身的方法
       /*
       1.不管是动物，鸟类，人类，猴子，我们都可以抽象成类，类是对象的模板，通过new关键字，
        可以创建一个个对象。animal1和animal2，虽然都是同一个形态（Animal），
        由于指向的是子类对象，当调用同一个eat()方法，运行时会智能匹配到子类的实现，最后得到的结果也不一样，
        这种形为，我们称之为多态。
        多态要满足三个条件。
        一、要有继承；（Person继承了Animal，Monkey也继承了Animal）
        二、要有重写；（q都重写了父类的eat方法）
        三、父类引用指向子类对象。

        2.
        person2这个对象能访问到name、sex属性，eat()、printAge()方法，但无法访问age属性，isLady()方法。
        是因为我们在该属性和方法前面加了private关键字。隐藏了不想对客户端暴露的age属性和isLady()方法（这里的客户端是main方法），
        但是我们对客户端提供了一个printAge方法来打印年龄，但在打印年龄前，我们对年龄做了一系列处理（不打印女士年龄）。
        对于这种隐藏对象属性和实现细节，仅对外公开指定方法来控制程序中属性的访问和修改，我们称之为封装。

        */


    }
}
