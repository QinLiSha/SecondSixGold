package com.lisa.administrator.sixgold.activity.home;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.LoginActivity;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewHomeActivity extends MyBaseActivity {


//    @BindView(R.id.iv_current_city)
//    ImageView ivCurrentCity;
    @BindView(R.id.tv_current_city)
    TextView tvCurrentCity;
    @BindView(R.id.ll_current_city)
    LinearLayout llCurrentCity;
    @BindView(R.id.iv_weather)
    ImageView ivWeather;
    @BindView(R.id.tv_weather)
    TextView tvWeather;
    @BindView(R.id.ll_weather)
    LinearLayout llWeather;
    @BindView(R.id.iv_notice)
    ImageView ivNotice;
//    @BindView(R.id.tv_notice)
//    TextView tvNotice;
    @BindView(R.id.ll_notice)
    LinearLayout llNotice;
    @BindView(R.id.tv_rolling_word)
    TextView tvRollingWord;
    @BindView(R.id.ll_tv_rolling_word)
    LinearLayout llTvRollingWord;
    @BindView(R.id.iv_home_homepage)
    ImageView ivHomeHomepage;
    @BindView(R.id.tv_home_homepage)
    TextView tvHomeHomepage;
    @BindView(R.id.ll_home_homepage)
    LinearLayout llHomeHomepage;
    @BindView(R.id.iv_car_type)
    ImageView ivCarType;
    @BindView(R.id.tv_car_type)
    TextView tvCarType;
    @BindView(R.id.ll_car_type)
    LinearLayout llCarType;
    @BindView(R.id.iv_home_I)
    ImageView ivHomeI;
    @BindView(R.id.tv_home_I)
    TextView tvHomeI;
    @BindView(R.id.ll_home_I)
    LinearLayout llHomeI;
    @BindView(R.id.ll_home_bottom_item)
    LinearLayout llHomeBottomItem;
    @BindView(R.id.activity_new_home)
    LinearLayout activityNewHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_home);
        ButterKnife.bind(this);


    }

//    R.id.tv_notice,R.id.iv_current_city,
    @OnClick({ R.id.tv_current_city, R.id.ll_current_city, R.id.iv_weather, R.id.tv_weather, R.id.ll_weather, R.id.iv_notice, R.id.ll_notice, R.id.tv_rolling_word, R.id.ll_tv_rolling_word, R.id.iv_home_homepage, R.id.tv_home_homepage, R.id.ll_home_homepage, R.id.iv_car_type, R.id.tv_car_type, R.id.ll_car_type, R.id.iv_home_I, R.id.tv_home_I, R.id.ll_home_I, R.id.ll_home_bottom_item, R.id.activity_new_home})
    public void onClick(View view) {
        switch (view.getId()) {
//            case R.id.iv_current_city:
            case R.id.tv_current_city:
            case R.id.ll_current_city:
                showToast("当前的城市");
                break;
            case R.id.iv_weather:
            case R.id.tv_weather:
            case R.id.ll_weather:
                showToast("当前城市的天气");
                break;
            case R.id.iv_notice:
//            case R.id.tv_notice:
            case R.id.ll_notice:
                showToast("消息提示");
                break;
            case R.id.tv_rolling_word:
            case R.id.ll_tv_rolling_word:
                showToast("滚动字幕");
                break;
            case R.id.iv_home_homepage:
            case R.id.tv_home_homepage:
            case R.id.ll_home_homepage:
                openActivity(NewHomeActivity.class);
                break;
            case R.id.iv_car_type:
            case R.id.tv_car_type:
            case R.id.ll_car_type:
                openActivity(CarTypeActivity.class);
                break;
            case R.id.iv_home_I:
            case R.id.tv_home_I:
            case R.id.ll_home_I:
                openActivity(LoginActivity.class);
                break;
            case R.id.ll_home_bottom_item:
                break;
            case R.id.activity_new_home:
                break;
        }
    }



}
