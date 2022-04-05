package com.example.springcloudconfigclient.demo;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

/**
 * 观察者模式
 *
 * @create 2022-02-28 7:32
 */
public class ObserverDemo {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();



        //增加订阅者
        observable.addObserver((Observable o, Object value) -> {
            System.out.println(value);
        });
        observable.setChanged();
        //发布者通知
        observable.notifyObservers("hello world");

        //一个遍历
        echoIterator();
    }

    private static void echoIterator() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }

    static class MyObservable extends Observable {
        public void setChanged() {
            super.setChanged();
        }
    }

}

