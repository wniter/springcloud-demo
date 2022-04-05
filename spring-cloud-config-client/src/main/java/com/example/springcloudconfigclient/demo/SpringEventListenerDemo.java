package com.example.springcloudconfigclient.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring 自定义 事件/监听器
 *
 * @create 2022-02-28 7:22
 */
public class SpringEventListenerDemo {
    public static void main(String[] args) {
        // Annotation 驱动的 Spring 上下文
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        //注册监听器
        context.addApplicationListener(
                (MyApplicationEvent event) -> {
                    System.out.println("接收到事件：" + event.getSource() + " @ " + event.getApplicationContext());
                }
        );
        context.refresh();
        //发布事件
        context.publishEvent(new MyApplicationEvent(context,"Hello World"));
        context.publishEvent(new MyApplicationEvent(context,1));
        context.publishEvent(new MyApplicationEvent(context ,new Integer(100)));
    }

    private static class MyApplicationEvent extends ApplicationEvent {

        private final ApplicationContext applicationContext;
        /**
         * Create a new ApplicationEvent.
         *
         * @param source the object on which the event initially occurred (never {@code null})
         */
        public MyApplicationEvent(ApplicationContext applicationContext, Object source) {
            super(source);
            this.applicationContext=applicationContext;
        }

        public ApplicationContext getApplicationContext() {
            return applicationContext;
        }
    }
}
