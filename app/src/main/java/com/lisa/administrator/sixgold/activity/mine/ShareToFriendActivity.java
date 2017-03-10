package com.lisa.administrator.sixgold.activity.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;

public class ShareToFriendActivity extends MyBaseActivity {

    @BindView(R.id.iv_shared)
    ImageView ivShared;
    @BindView(R.id.tv_shared)
    TextView tvShared;
    @BindView(R.id.ll_share)
    LinearLayout llShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_to_friend);
        ButterKnife.bind(this);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "分享好友", -1, null);
        initBack();
    }

    private void initShare() {
        OnekeyShare oks = new OnekeyShare();
        oks.setTitle("鑫鑫快运");
        oks.setText("鑫鑫快运：省心，省力，省时又省钱的发货神器！");
        oks.setImageUrl("http://www.xinxin88.net/images/logo.png");
        oks.setTitleUrl("http://www.xinxin88.net/");
        oks.show(ShareToFriendActivity.this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ShareSDK.stopSDK(this);
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

    @OnClick({R.id.iv_shared, R.id.tv_shared, R.id.ll_share})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_shared:
            case R.id.tv_shared:
            case R.id.ll_share:
                initShare();
                break;
        }
    }
    /********************************************************************************
     *以上是返回ImageView
     ******************************************************************************/
}
