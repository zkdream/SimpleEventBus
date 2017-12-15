package com.zk.view.simpleeventbus.eventbus;

/**
 * @author Created by zhangke
 * @filename EventBusException
 * @date on 2017\12\15 0015 11:55
 * @email 206357792@qq.com
 * @describe TODO
 */

public class EventBusException extends RuntimeException{
    private static final long serialVersionUID = -2912559384646531479L;

    public EventBusException(String detailMessage) {
        super(detailMessage);
    }

    public EventBusException(Throwable throwable) {
        super(throwable);
    }

    public EventBusException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }
}
