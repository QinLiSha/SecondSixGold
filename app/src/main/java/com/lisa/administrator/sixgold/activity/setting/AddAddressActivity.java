package com.lisa.administrator.sixgold.activity.setting;

import android.os.Bundle;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

public class AddAddressActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_address);
        initActionBarOneImg(R.drawable.ic_chevron_left_grey_24dp, "新建收货地址", "保存", null);
    }
}
