package com.lisa.administrator.sixgold.activity.setting;

import android.os.Bundle;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

/**
 * 设置中的通用activity
 */

public class SettingCurrencyActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_currency);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "通用", -1, null);

    }
}
