package com.lisa.administrator.sixgold.activity.setting;

import android.os.Bundle;
import android.widget.Button;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyAddressBookActivity extends MyBaseActivity {

    @BindView(R.id.btn_addaddressbook_add)
    Button btnAddaddressbookAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_address_book);
        ButterKnife.bind(this);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "我的收货地址", -1, null);

    }

    @OnClick(R.id.btn_addaddressbook_add)
    public void onClick() {
        openActivity(AddAddressActivity.class);
    }
}
