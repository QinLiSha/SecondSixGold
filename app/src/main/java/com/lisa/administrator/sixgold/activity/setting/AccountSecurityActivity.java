package com.lisa.administrator.sixgold.activity.setting;

import android.os.Bundle;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

public class AccountSecurityActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_security);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "账户与安全", -1, null);
    }
}
