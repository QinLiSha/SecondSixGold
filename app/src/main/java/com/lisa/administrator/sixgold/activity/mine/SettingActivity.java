package com.lisa.administrator.sixgold.activity.mine;

import android.os.Bundle;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

public class SettingActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "设置", -1, null);

    }
}
