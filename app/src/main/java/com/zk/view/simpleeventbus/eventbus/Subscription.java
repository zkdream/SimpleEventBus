package com.zk.view.simpleeventbus.eventbus;

/**
 * @author Created by zhangke
 * @filename Subscription
 * @date on 2017\12\15 0015 14:27
 * @email 206357792@qq.com
 * @describe TODO
 */

public class Subscription {

    final Object subscriber;
    final SubscriberMethod subscriberMethod;

    /**
     * Becomes false as soon as
     */
    volatile boolean active;

    Subscription(Object subscriber, SubscriberMethod subscriberMethod) {
        this.subscriber = subscriber;
        this.subscriberMethod = subscriberMethod;
        active = true;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Subscription) {
            Subscription otherSubscription = (Subscription) other;
            return subscriber == otherSubscription.subscriber
                    && subscriberMethod.equals(otherSubscription.subscriberMethod);
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return subscriber.hashCode() + subscriberMethod.methodString.hashCode();
    }
}
