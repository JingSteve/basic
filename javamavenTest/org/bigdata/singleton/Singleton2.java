package org.bigdata.singleton;

/**
 * 恶汉式
 * 在静态代码块中创建该类对象
 */
public class Singleton2 {

    //私有构造方法
    private Singleton2() {
    }

    //在成员位置创建该类的对象
    private static Singleton2 instance;

    //在静态代码块中进行赋值
    static {
        instance = new Singleton2();
    }

    //对外提供静态方法获取该对象
    public static Singleton2 getInstance() {
        return instance;
    }
}
