package com.lisa.administrator.sixgold.activity.mine;

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

public class AboutUsActivity extends MyBaseActivity {

    private WebView browser;
    WebSettings settings;
    //        String TestUrl = "https://m.taobao.com/#index";
//    String TestUrl = "http://www.xinxin88.net/";
    String TestUrl = "http://www.xinxin88.net/plus/list.php?tid=2/";
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
        setContentView(R.layout.activity_about_us);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "关于我们", -1, null);
        initBack();
        //WebView
        browser = (WebView) findViewById(R.id.testStore);
        browser.loadUrl(TestUrl);
        settings = browser.getSettings();

        //设置可自由缩放网页
        settings.setSupportZoom(true);
        settings.setJavaScriptEnabled(true);//有JavaScript功能的一定要实现
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
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
//                view.loadUrl(url);
//                //  重写此方法表明点击网页里面的链接还是在当前的webview里跳转，不跳到浏览器那边
//                return false;
            }
        });
    }

    //go back
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        WebView browser = (WebView) findViewById(R.id.testStore);
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
