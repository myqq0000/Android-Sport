package com.WatchMovie.AndroidSport.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.orhanobut.logger.Logger;
import com.WatchMovie.AndroidSport.R;

/**
 * 聊天详情界面
 * Created by WatchMovie on 17/8/12
 */
public class ArticleActivity extends BaseActivity {

    public static final String BUNDLE_URL = "url";
    //private static final String TEST_URL = "http://192.168.0.104:8080/Sport/NewsDetail?id=3";

    private WebView mWebView;
    //文章的url
    //private String mArticleUrl = "file:///assets/chat.html";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        mWebView = (WebView) findViewById(R.id.article_wv);

        initWebView();

        Logger.d("start loading local file.");
        mWebView.loadUrl("file:///android_asset/chat.html");

    }

    private void initWebView() {
        WebSettings settings = mWebView.getSettings();

        settings.setJavaScriptEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        mWebView.setScrollBarStyle(View.SCROLLBARS_OUTSIDE_OVERLAY);
    }
}
