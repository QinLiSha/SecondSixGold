package com.lisa.administrator.sixgold.fragment.toplaceorder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.order.ToPlaceOrderActivity;
import com.lisa.administrator.sixgold.activity.toplaceorder.PlaceOrderLogisticsActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PlaceOrderLogisticsFragment extends Fragment {


    @BindView(R.id.iv_logistics_from_address_1)
    ImageView ivLogisticsFromAddress1;
    @BindView(R.id.tv_logistics_from_address_1)
    TextView tvLogisticsFromAddress1;
    @BindView(R.id.tv_logistics_from_address)
    TextView tvLogisticsFromAddress;
    @BindView(R.id.ll_logistics_from_address)
    LinearLayout llLogisticsFromAddress;
    @BindView(R.id.iv_logistics_from_address_details)
    ImageView ivLogisticsFromAddressDetails;
    @BindView(R.id.iv_logistics_from_star)
    ImageView ivLogisticsFromStar;
    @BindView(R.id.iv_logistics_to_address_1)
    ImageView ivLogisticsToAddress1;
    @BindView(R.id.tv_logistics_to_address_1)
    TextView tvLogisticsToAddress1;
    @BindView(R.id.tv_logistics_to_address)
    TextView tvLogisticsToAddress;
    @BindView(R.id.ll_logistics_to_address)
    LinearLayout llLogisticsToAddress;
    @BindView(R.id.iv_logistics_to_address_details)
    ImageView ivLogisticsToAddressDetails;
    @BindView(R.id.iv_logistics_to_star)
    ImageView ivLogisticsToStar;
    @BindView(R.id.et_logistics_shipper_name)
    EditText etLogisticsShipperName;
    @BindView(R.id.et_logistics_shipper_num)
    EditText etLogisticsShipperNum;
    @BindView(R.id.tv_logistics_shipper_mail_list)
    TextView tvLogisticsShipperMailList;
    @BindView(R.id.et_logistics_receiver_name)
    EditText etLogisticsReceiverName;
    @BindView(R.id.et_logistics_receiver_num)
    EditText etLogisticsReceiverNum;
    @BindView(R.id.tv_logistics_receiver_mail_list)
    TextView tvLogisticsReceiverMailList;
    @BindView(R.id.tv_logistics_common_logistics)
    TextView tvLogisticsCommonLogistics;
    @BindView(R.id.iv_logistics_common_logistics)
    ImageView ivLogisticsCommonLogistics;
    @BindView(R.id.ll_logistics_common_logistics)
    LinearLayout llLogisticsCommonLogistics;
    @BindView(R.id.tv_logistics_special_logistics)
    TextView tvLogisticsSpecialLogistics;
    @BindView(R.id.iv_logistics_special_logistics)
    ImageView ivLogisticsSpecialLogistics;
    @BindView(R.id.ll_logistics_special_logistics)
    LinearLayout llLogisticsSpecialLogistics;
    @BindView(R.id.tv_logistics_fast_matching)
    TextView tvLogisticsFastMatching;
    @BindView(R.id.rl_logistics_fast_matching)
    RelativeLayout rlLogisticsFastMatching;
    @BindView(R.id.tv_logistics_nearby)
    TextView tvLogisticsNearby;
    @BindView(R.id.tv_logistics_self_delivery)
    TextView tvLogisticsSelfDelivery;
    @BindView(R.id.tv_logistics_delivery_in_logistics)
    TextView tvLogisticsDeliveryInLogistics;
    @BindView(R.id.tv_logistics_price)
    TextView tvLogisticsPrice;
    @BindView(R.id.iv_logistics_price)
    ImageView ivLogisticsPrice;
    @BindView(R.id.ll_logistics_price)
    LinearLayout llLogisticsPrice;
    @BindView(R.id.tv_logistics_credit)
    TextView tvLogisticsCredit;
    @BindView(R.id.iv_logistics_credit)
    ImageView ivLogisticsCredit;
    @BindView(R.id.ll_logistics_credit)
    LinearLayout llLogisticsCredit;
    @BindView(R.id.tv_logistics_collection)
    TextView tvLogisticsCollection;
    @BindView(R.id.iv_logistics_collection)
    ImageView ivLogisticsCollection;
    @BindView(R.id.ll_logistics_collection)
    LinearLayout llLogisticsCollection;
    @BindView(R.id.button_logistics_sure)
    Button buttonLogisticsSure;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_place_order_logistics, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R.id.iv_logistics_from_address_1, R.id.tv_logistics_from_address_1, R.id.tv_logistics_from_address,
            R.id.ll_logistics_from_address, R.id.iv_logistics_from_address_details, R.id.iv_logistics_from_star,
            R.id.iv_logistics_to_address_1, R.id.tv_logistics_to_address_1, R.id.tv_logistics_to_address,
            R.id.ll_logistics_to_address, R.id.iv_logistics_to_address_details, R.id.iv_logistics_to_star,
            R.id.et_logistics_shipper_name, R.id.et_logistics_shipper_num, R.id.tv_logistics_shipper_mail_list,
            R.id.et_logistics_receiver_name, R.id.et_logistics_receiver_num, R.id.tv_logistics_receiver_mail_list,
            R.id.tv_logistics_common_logistics, R.id.iv_logistics_common_logistics, R.id.ll_logistics_common_logistics,
            R.id.tv_logistics_special_logistics, R.id.iv_logistics_special_logistics, R.id.ll_logistics_special_logistics,
            R.id.tv_logistics_fast_matching, R.id.rl_logistics_fast_matching, R.id.tv_logistics_nearby, R.id.tv_logistics_self_delivery,
            R.id.tv_logistics_delivery_in_logistics, R.id.tv_logistics_price, R.id.iv_logistics_price, R.id.ll_logistics_price,
            R.id.tv_logistics_credit, R.id.iv_logistics_credit, R.id.ll_logistics_credit, R.id.tv_logistics_collection,
            R.id.iv_logistics_collection, R.id.ll_logistics_collection, R.id.button_logistics_sure})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_logistics_from_address_1:
            case R.id.tv_logistics_from_address_1:
            case R.id.tv_logistics_from_address:
            case R.id.ll_logistics_from_address:
            case R.id.iv_logistics_from_address_details:
                ((ToPlaceOrderActivity) getActivity()).initAddress_all(tvLogisticsFromAddress);
                break;
            case R.id.iv_logistics_from_star:
                break;
            case R.id.iv_logistics_to_address_1:
            case R.id.tv_logistics_to_address_1:
            case R.id.tv_logistics_to_address:
            case R.id.ll_logistics_to_address:
            case R.id.iv_logistics_to_address_details:
                ((ToPlaceOrderActivity) getActivity()).initAddress_all(tvLogisticsToAddress);
                break;
            case R.id.iv_logistics_to_star:
                break;
            case R.id.et_logistics_shipper_name:
                break;
            case R.id.et_logistics_shipper_num:
                break;
            case R.id.tv_logistics_shipper_mail_list:
                break;
            case R.id.et_logistics_receiver_name:
                break;
            case R.id.et_logistics_receiver_num:
                break;
            case R.id.tv_logistics_receiver_mail_list:
                break;
            case R.id.tv_logistics_common_logistics:
            case R.id.iv_logistics_common_logistics:
            case R.id.ll_logistics_common_logistics:
                break;
            case R.id.tv_logistics_special_logistics:
            case R.id.iv_logistics_special_logistics:
            case R.id.ll_logistics_special_logistics:
                break;
            case R.id.tv_logistics_fast_matching:
            case R.id.rl_logistics_fast_matching:
                break;
            case R.id.tv_logistics_nearby:
                break;
            case R.id.tv_logistics_self_delivery:
                break;
            case R.id.tv_logistics_delivery_in_logistics:
                break;
            case R.id.tv_logistics_price:
            case R.id.iv_logistics_price:
            case R.id.ll_logistics_price:
                break;
            case R.id.tv_logistics_credit:
            case R.id.iv_logistics_credit:
            case R.id.ll_logistics_credit:
                break;
            case R.id.tv_logistics_collection:
            case R.id.iv_logistics_collection:
            case R.id.ll_logistics_collection:
                break;
            case R.id.button_logistics_sure:
                ((ToPlaceOrderActivity) getActivity()).openActivity(PlaceOrderLogisticsActivity.class);
                break;
        }
    }
}
