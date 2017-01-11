package com.lisa.administrator.sixgold.activity.home;

import android.os.Bundle;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import butterknife.ButterKnife;

public class MineActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        ButterKnife.bind(this);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "我的", -1, null);

    }
}
