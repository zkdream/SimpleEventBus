package com.zk.view.simpleeventbus.eventbus.meta;

/**
 * @author Created by zhangke
 * @filename SubscriberInfoIndex
 * @date on 2017\12\15 0015 11:43
 * @email 206357792@qq.com
 * @describe 生成索引的接口
 */

public interface SubscriberInfoIndex {
    SubscriberInfo getSubscriberInfo(Class<?> subscriberClass);
}
