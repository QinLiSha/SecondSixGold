package com.lisa.administrator.sixgold.activity.mine;

import android.os.Bundle;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

public class ShareToFriendActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_to_friend);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp,"分享好友",-1,null);
    }
}
