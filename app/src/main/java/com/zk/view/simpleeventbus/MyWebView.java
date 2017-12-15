package com.zk.view.simpleeventbus;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/**
 * @author Created by zhangke
 * @filename MyWebView
 * @date on 2017\12\15 0015 15:42
 * @email 206357792@qq.com
 * @describe TODO
 */

public class MyWebView extends WebView {
    public MyWebView(Context context) {
        super(context);
    }

    public MyWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean performLongClick() {
        return super.performLongClick();
    }
}
