package com.zk.view.simpleeventbus.eventbus.meta;

import com.zk.view.simpleeventbus.eventbus.SubscriberMethod;

/**
 * @author Created by zhangke
 * @filename SubscriberInfo
 * @date on 2017\12\15 0015 11:45
 * @email 206357792@qq.com
 * @describe 通过注释处理创建的生成的索引类的基类
 */

public interface SubscriberInfo {
    Class<?> getSubscriberClass();

    SubscriberMethod[] getSubscriberMethods();

    SubscriberInfo getSuperSubscriberInfo();

    boolean shouldCheckSuperclass();
}
