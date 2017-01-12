package com.lisa.administrator.sixgold.activity.home;

import android.os.Bundle;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

public class ChooseCarTypeActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_car_type);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "车型车长",-1, null);
    }
}
