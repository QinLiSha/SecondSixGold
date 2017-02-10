package com.lisa.administrator.sixgold.activity.setting;

import android.os.Bundle;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

public class MyAddressBookActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_address_book);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "我的收货地址", -1, null);

    }
}
