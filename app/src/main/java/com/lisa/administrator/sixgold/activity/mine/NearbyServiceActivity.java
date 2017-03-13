package com.lisa.administrator.sixgold.activity.mine;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

public class NearbyServiceActivity extends MyBaseActivity {
    private WebView browser;
    WebSettings settings;
    //    String TestUrl = "http://map.baidu.com/";
    String TestUrl = "http://m.amap.com/nearby/index/";
//    String TestUrl = "http://ditu.amap.com/";
    //    String TestUrl = "https://m.taobao.com/";
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_service);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "附近服务", -1, null);
        initBrowser();
//        init();
        initBack();
    }

    private void init() {
        WebView webView = (WebView) findViewById(R.id.wv_taobao);
        WebSettings webSettings = webView.getSettings();
//webview支持js脚本
        webSettings.setJavaScriptEnabled(true);
//启用数据库
        webSettings.setDatabaseEnabled(true);
//设置定位的数据库路径
        String dir = this.getApplicationContext().getDir("database", Context.MODE_PRIVATE).getPath();
        webSettings.setGeolocationDatabasePath(dir);
//启用地理定位
        webSettings.setGeolocationEnabled(true);
//开启DomStorage缓存
        webSettings.setDomStorageEnabled(true);
//配置权限
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onReceivedIcon(WebView view, Bitmap icon) {
                super.onReceivedIcon(view, icon);

            }

            @Override
            public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
                callback.invoke(origin, true, false);
                super.onGeolocationPermissionsShowPrompt(origin, callback);

            }
        });

    }


    /**
     * 初始化和设置webview
     */
    private void initBrowser() {
        //WebView
        browser = (WebView) findViewById(R.id.wv_nearby);
        browser.loadUrl(TestUrl);
        settings = browser.getSettings();
        //设置可自由缩放网页
        settings.setSupportZoom(true);
        settings.setJavaScriptEnabled(true);//有JavaScript功能的一定要实现
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAppCacheEnabled(true);//是否使用缓存
        ///////////////////////////////
        settings.setGeolocationEnabled(true);//启用地理定位
//***最重要的方法，一定要设置，这就是出不来的主要原因
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        String dir = this.getApplicationContext().getDir("database", Context.MODE_PRIVATE).getPath();
        settings.setGeolocationDatabasePath(dir);
//配置权限（同样在WebChromeClient中实现）
        /**
         * 此处很重要，必须要
         */
        browser.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onReceivedIcon(WebView view, Bitmap icon) {
                super.onReceivedIcon(view, icon);
            }
        });
        browser.setWebChromeClient(new WebChromeClient() {
            //配置权限（同样在WebChromeClient中实现）
            @Override
            public void onGeolocationPermissionsShowPrompt(String origin,
                                                           GeolocationPermissions.Callback callback) {
                callback.invoke(origin, true, false);
                super.onGeolocationPermissionsShowPrompt(origin, callback);
            }
        });
        ///////////////////////////////
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
//                view.loadUrl(url);
//                //  重写此方法表明点击网页里面的链接还是在当前的webview里跳转，不跳到浏览器那边
//                return false;
            }
        });
//        if (Build.VERSION.SDK_INT >= 23) {
//            int checkPermission = ContextCompat.checkSelfPermission(TaoBaoActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION);
//            if (checkPermission != PackageManager.PERMISSION_GRANTED) {
//                ActivityCompat.requestPermissions(TaoBaoActivity.this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
//                ActivityCompat.requestPermissions(TaoBaoActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
//                Log.d("TTTT", "弹出提示");
//            }
//        }
    }

    //go back
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        WebView browser = (WebView) findViewById(R.id.);
        // Check if the key event was the Back button and if there's history

        if ((keyCode == KeyEvent.KEYCODE_BACK) && browser.canGoBack()) {
            browser.goBack();
            return true;
        }
        //  return true;
        // If it wasn't the Back key or there's no web page history, bubble up to the default
        // system behavior (probably exit the activity)
        return super.onKeyDown(keyCode, event);
    }
}