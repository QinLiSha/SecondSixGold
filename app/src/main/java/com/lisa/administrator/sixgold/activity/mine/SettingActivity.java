package com.lisa.administrator.sixgold.activity.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.setting.AccountSecurityActivity;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SettingActivity extends MyBaseActivity {

    @BindView(R.id.tv_setting_my_information)
    TextView tvSettingMyInformation;
    @BindView(R.id.iv_setting_my_information)
    ImageView ivSettingMyInformation;
    @BindView(R.id.rl_setting_my_information)
    RelativeLayout rlSettingMyInformation;
    @BindView(R.id.tv_setting_account_and_security)
    TextView tvSettingAccountAndSecurity;
    @BindView(R.id.iv_setting_account_and_security)
    ImageView ivSettingAccountAndSecurity;
    @BindView(R.id.rl_setting_account_and_security)
    RelativeLayout rlSettingAccountAndSecurity;
    @BindView(R.id.tv_setting_currency)
    TextView tvSettingCurrency;
    @BindView(R.id.iv_setting_currency)
    ImageView ivSettingCurrency;
    @BindView(R.id.rl_setting_currency)
    RelativeLayout rlSettingCurrency;
    @BindView(R.id.btn_setting_sing_out)
    Button btnSettingSingOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "设置", -1, null);

    }

    @OnClick({R.id.tv_setting_my_information, R.id.iv_setting_my_information, R.id.rl_setting_my_information, R.id.tv_setting_account_and_security, R.id.iv_setting_account_and_security, R.id.rl_setting_account_and_security, R.id.tv_setting_currency, R.id.iv_setting_currency, R.id.rl_setting_currency, R.id.btn_setting_sing_out})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_setting_my_information:
            case R.id.iv_setting_my_information:
            case R.id.rl_setting_my_information:
                openActivity(MyInformationActivity.class);
                break;
            case R.id.tv_setting_account_and_security:
            case R.id.iv_setting_account_and_security:
            case R.id.rl_setting_account_and_security:
                openActivity(AccountSecurityActivity.class);
                break;
            case R.id.tv_setting_currency:
            case R.id.iv_setting_currency:
            case R.id.rl_setting_currency:
                // TODO: 2017/2/10 通用的设置 
                break;
            case R.id.btn_setting_sing_out:
                // TODO: 2017/2/10 退出登录 
                break;
        }
    }
}
