package com.lisa.administrator.sixgold.activity.mine;

import android.os.Bundle;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import butterknife.ButterKnife;


public class MessagesActivity extends MyBaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        ButterKnife.bind(this);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "系统消息", -1, null);
    }


}
