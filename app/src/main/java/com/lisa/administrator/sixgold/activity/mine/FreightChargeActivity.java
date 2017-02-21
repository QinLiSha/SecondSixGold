package com.lisa.administrator.sixgold.activity.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 运费计算
 */
public class FreightChargeActivity extends MyBaseActivity {

    @BindView(R.id.tv_freight_charge_from_address_1)
    TextView tvFreightChargeFromAddress1;
    @BindView(R.id.tv_freight_charge_from_address)
    TextView tvFreightChargeFromAddress;
    @BindView(R.id.iv_freight_charge_from_address_details)
    ImageView ivFreightChargeFromAddressDetails;
    @BindView(R.id.tv_freight_charge_to_address_1)
    TextView tvFreightChargeToAddress1;
    @BindView(R.id.tv_freight_charge_to_address)
    TextView tvFreightChargeToAddress;
    @BindView(R.id.iv_freight_charge_to_address_details)
    ImageView ivFreightChargeToAddressDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freight_charge);
        ButterKnife.bind(this);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "运费计算", -1, null);
    }

    @OnClick({R.id.tv_freight_charge_from_address_1, R.id.tv_freight_charge_from_address, R.id.iv_freight_charge_from_address_details, R.id.tv_freight_charge_to_address_1, R.id.tv_freight_charge_to_address, R.id.iv_freight_charge_to_address_details})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_freight_charge_from_address_1:
            case R.id.tv_freight_charge_from_address:
            case R.id.iv_freight_charge_from_address_details:
                initAddress_all(tvFreightChargeFromAddress);
                break;
            case R.id.tv_freight_charge_to_address_1:
            case R.id.tv_freight_charge_to_address:
            case R.id.iv_freight_charge_to_address_details:
                initAddress_all(tvFreightChargeToAddress);
                break;
        }
    }
}
