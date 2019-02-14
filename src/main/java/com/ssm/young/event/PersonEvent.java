package com.ssm.young.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Auther:dep
 * @Date: 2019/2/14 10:25
 * @Description: 继承applicationEvent 表明这是一个事件 即要执行的操作
 */
public class PersonEvent extends ApplicationEvent {
    private String  reciver;

    private String message;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public PersonEvent(Object source) {
        super(source);
    }

    public String getReciver() {
        return reciver;
    }

    public void setReciver(String reciver) {
        this.reciver = reciver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PersonEvent(Object source, String reciver, String message) {
        super(source);
        this.reciver = reciver;
        this.message = message;
    }

    public  void sendMsgEvent(){
        System.out.println("1111111111111111");
    }

}
