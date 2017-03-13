package com.lisa.administrator.sixgold.activity.store;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

/**
 * 之前一号店的界面总是出现::ERR_CACHE_MISS错误，将一些代码不写就好了
 * settings.setBlockNetworkLoads(true);//就是这一句话惹得错
 */
public class YihaodianActivity extends MyBaseActivity {
    private WebView browser;
    WebSettings settings;
    String TestUrl = "http://www.yhd.com/";
//    String TestUrl = "http://www.suning.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yihaodian);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "1号店", -1, null);
        initBrowser();
        initBack();
    }

    /********************************************************************************
     * 以下是返回ImageView
     ******************************************************************************/
    protected ImageView ivBack;

    private void initBack() {
        ivBack = (ImageView) findViewById(R.id.iv_left_two_img);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    /********************************************************************************
     *以上是返回ImageView
     ******************************************************************************/
    /**
     * 初始化和设置webview
     */
    private void initBrowser() {
        //WebView
        browser = (WebView) findViewById(R.id.wv_yihaodian);
        browser.loadUrl(TestUrl);
        settings = browser.getSettings();
        //设置可自由缩放网页
        //出现net::ERR_CACHE_MISS错误提示
        //使用缓存的方式是基于导航类型。正常页面加载的情况下将缓存内容。当导航返回,
        //内容不会恢复（重新加载生成）,而只是从缓存中取回内容
//        if (Build.VERSION.SDK_INT >= 19) {
//            settings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
//        }
        settings.setSupportZoom(true);
        settings.setJavaScriptEnabled(true);//有JavaScript功能的一定要实现
        settings.setBuiltInZoomControls(true);//支持缩放
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);//bushi
        settings.setAllowContentAccess(true);//
        settings.setAppCacheEnabled(true);//是否使用缓存
        // 如果页面中链接，如果希望点击链接继续在当前browser中响应，
        // 而不是新开Android的系统browser中响应该链接，必须覆盖webview的WebViewClient对象
//        browser.setWebChromeClient(new WebChromeClient());//只写这句会选择使用web浏览器选择
        browser.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.startsWith("http:") || url.startsWith("https:")) {
                    view.loadUrl(url);
                    return false;
                } else {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                    return true;
                }
            }
        });
    }

    //    go back
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if ((keyCode == KeyEvent.KEYCODE_BACK) && browser.canGoBack()) {
            browser.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}