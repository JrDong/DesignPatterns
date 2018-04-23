package xyz.ibat.designpatterns.singleton;

/**
 * Created by jerry on 2018/4/23.
 *
 * 单例模式实现方式太多，推荐一种最优秀的实现。
 */

class Singleton {

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

    private static class SingletonInstance{
        static Singleton INSTANCE = new Singleton();
    }

}
