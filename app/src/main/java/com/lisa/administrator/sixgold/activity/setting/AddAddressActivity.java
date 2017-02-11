package com.lisa.administrator.sixgold.activity.setting;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddAddressActivity extends MyBaseActivity {

    @BindView(R.id.et_addaddress_name)
    EditText etAddaddressName;
    @BindView(R.id.et_addaddress_tele_num)
    EditText etAddaddressTeleNum;
    @BindView(R.id.tv_addaddress_choosecity_left)
    TextView tvAddaddressChoosecityLeft;
    @BindView(R.id.tv_addaddress_choosecity)
    TextView tvAddaddressChoosecity;
    @BindView(R.id.ll_addaddress_choosecity)
    LinearLayout llAddaddressChoosecity;
    @BindView(R.id.et_addaddress_detail_address)
    EditText etAddaddressDetailAddress;
    @BindView(R.id.et_addaddress_postcodes)
    EditText etAddaddressPostcodes;
    @BindView(R.id.cb_addaddress_set_defultaddress)
    CheckBox cbAddaddressSetDefultaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_address);
        initActionBarOneImg(R.drawable.ic_chevron_left_grey_24dp, "新建收货地址", "保存", null);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_addaddress_choosecity_left, R.id.tv_addaddress_choosecity,
            R.id.ll_addaddress_choosecity, R.id.cb_addaddress_set_defultaddress})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_addaddress_choosecity_left:
            case R.id.tv_addaddress_choosecity:
            case R.id.ll_addaddress_choosecity:
                
                break;
            case R.id.cb_addaddress_set_defultaddress:
                break;
        }
    }
}
