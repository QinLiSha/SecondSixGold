package com.lisa.administrator.sixgold.activity.mine;

import android.os.Bundle;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

public class MyStoreActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_store);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "我的商城", -1, null);
    }
}
