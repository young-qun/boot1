package com.ssm.young.listener;

import com.ssm.young.event.PersonEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Auther:dep
 * @Date: 2019/2/14 10:29
 * @Description: 为personEvent 添加事件监听
 */
public class sendMsgEventListener implements ApplicationListener<PersonEvent> {
    /**
     * 监听到personEvent的事件后执行的操作
     * @param event
     */
    @Override
    public void onApplicationEvent(PersonEvent event) {
        event.sendMsgEvent();
        System.out.println("333333333333333333333333333");
    }
}
