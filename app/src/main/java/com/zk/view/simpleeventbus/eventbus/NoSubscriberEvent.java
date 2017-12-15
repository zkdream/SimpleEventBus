package com.zk.view.simpleeventbus.eventbus;

/**
 * @author Created by zhangke
 * @filename NoSubscriberEvent
 * @date on 2017\12\15 0015 15:26
 * @email 206357792@qq.com
 * @describe TODO
 */

public class NoSubscriberEvent {
    /** The {@link EventBus} instance to with the original event was posted to. */
    public final EventBus eventBus;

    /** The original event that could not be delivered to any subscriber. */
    public final Object originalEvent;

    public NoSubscriberEvent(EventBus eventBus, Object originalEvent) {
        this.eventBus = eventBus;
        this.originalEvent = originalEvent;
    }
}
