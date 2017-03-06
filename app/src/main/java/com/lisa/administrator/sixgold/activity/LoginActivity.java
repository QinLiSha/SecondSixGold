package com.lisa.administrator.sixgold.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.home.MineActivity;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * 登录界面
 */
public class LoginActivity extends MyBaseActivity {

    @BindView(R.id.et_tel_num)
    EditText etTelNum;
    @BindView(R.id.et_pwd)
    EditText etPwd;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.tv_free_register)
    TextView tvFreeRegister;
    @BindView(R.id.tv_foget_pwd)
    TextView tvFogetPwd;
    @BindView(R.id.activity_login)
    LinearLayout activityLogin;
    private Unbinder binder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "注册", -1, null);
        binder = ButterKnife.bind(this);
        initBack();
    }

    /********************************************************************************
     * 以下是返回ImageView
     ******************************************************************************/
    protected ImageView ivBack;

    private void initBack() {
        ivBack = (ImageView) findViewById(R.id.iv_left_two_img);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    /********************************************************************************
     * 以上是返回ImageView
     ******************************************************************************/
    @Override
    protected void onDestroy() {
        super.onDestroy();
        binder.unbind();
    }

    @OnClick({R.id.et_tel_num, R.id.et_pwd, R.id.btn_login, R.id.tv_free_register, R.id.tv_foget_pwd, R.id.activity_login})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.et_tel_num:
                break;
            case R.id.et_pwd:
                break;
            case R.id.btn_login:
                finish();
                openActivity(MineActivity.class);
                break;
            case R.id.tv_free_register:
                finish();
                openActivity(RegisterActivity.class);
                break;
            case R.id.tv_foget_pwd:
                finish();
                openActivity(FindPwdActivity.class);
                break;
            case R.id.activity_login:
                break;
        }
    }
}
