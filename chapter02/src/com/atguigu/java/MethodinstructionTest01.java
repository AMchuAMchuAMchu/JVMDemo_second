package com.atguigu.java;

/**
 * Description ==> TODO
 * BelongsProject ==> JVMDemo_second
 * BelongsPackage ==> com.atguigu.java
 * Version ==> 1.0
 * CreateTime ==> 2022-11-03 16:17:05
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class MethodinstructionTest01 {

    public void test01(){
        A a = new B();
        a.printA();
        B b = new B();
        b.printB();
    }


}

interface A{
    void printA();
}

class B implements A{

    @Override
    public void printA() {

    }

    public void printB(){

    }
}
