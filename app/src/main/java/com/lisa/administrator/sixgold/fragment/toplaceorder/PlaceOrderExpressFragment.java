package com.lisa.administrator.sixgold.fragment.toplaceorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.toplaceorder.PlaceOrderExpressActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class PlaceOrderExpressFragment extends Fragment {


    @BindView(R.id.iv_express_from_address_1)
    ImageView ivExpressFromAddress1;
    @BindView(R.id.tv_express_from_address_1)
    TextView tvExpressFromAddress1;
    @BindView(R.id.tv_express_from_address)
    TextView tvExpressFromAddress;
    @BindView(R.id.ll_express_from_address)
    LinearLayout llExpressFromAddress;
    @BindView(R.id.iv_express_from_address_details)
    ImageView ivExpressFromAddressDetails;
    @BindView(R.id.iv_express_from_star)
    ImageView ivExpressFromStar;
    @BindView(R.id.iv_express_to_address_1)
    ImageView ivExpressToAddress1;
    @BindView(R.id.tv_express_to_address_1)
    TextView tvExpressToAddress1;
    @BindView(R.id.tv_express_to_address)
    TextView tvExpressToAddress;
    @BindView(R.id.ll_express_to_address)
    LinearLayout llExpressToAddress;
    @BindView(R.id.iv_express_to_address_details)
    ImageView ivExpressToAddressDetails;
    @BindView(R.id.iv_express_to_star)
    ImageView ivExpressToStar;
    @BindView(R.id.et_express_shipper_name)
    EditText etExpressShipperName;
    @BindView(R.id.et_express_shipper_num)
    EditText etExpressShipperNum;
    @BindView(R.id.tv_express_shipper_mail_list)
    TextView tvExpressShipperMailList;
    @BindView(R.id.et_express_receiver_name)
    EditText etExpressReceiverName;
    @BindView(R.id.et_express_receiver_num)
    EditText etExpressReceiverNum;
    @BindView(R.id.tv_express_receiver_mail_list)
    TextView tvExpressReceiverMailList;
    @BindView(R.id.tv_express_collection)
    TextView tvExpressCollection;
    @BindView(R.id.iv_express_collection)
    ImageView ivExpressCollection;
    @BindView(R.id.ll_express_collection)
    LinearLayout llExpressCollection;
    @BindView(R.id.tv_express_nearby)
    TextView tvExpressNearby;
    @BindView(R.id.iv_express_nearby)
    ImageView ivExpressNearby;
    @BindView(R.id.ll_express_nearby)
    LinearLayout llExpressNearby;
    @BindView(R.id.tv_express_credit)
    TextView tvExpressCredit;
    @BindView(R.id.iv_express_credit)
    ImageView ivExpressCredit;
    @BindView(R.id.ll_express_credit)
    LinearLayout llExpressCredit;
    @BindView(R.id.button_express_sure)
    Button buttonExpressSure;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_place_order_express, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R.id.iv_express_from_address_1, R.id.tv_express_from_address_1, R.id.tv_express_from_address, R.id.ll_express_from_address, R.id.iv_express_from_address_details, R.id.iv_express_from_star, R.id.iv_express_to_address_1, R.id.tv_express_to_address_1, R.id.tv_express_to_address, R.id.ll_express_to_address, R.id.iv_express_to_address_details, R.id.iv_express_to_star, R.id.tv_express_shipper_mail_list, R.id.tv_express_receiver_mail_list, R.id.tv_express_collection, R.id.iv_express_collection, R.id.ll_express_collection, R.id.tv_express_nearby, R.id.iv_express_nearby, R.id.ll_express_nearby, R.id.tv_express_credit, R.id.iv_express_credit, R.id.ll_express_credit, R.id.button_express_sure})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_express_from_address_1:
            case R.id.tv_express_from_address_1:
            case R.id.tv_express_from_address:
            case R.id.ll_express_from_address:
            case R.id.iv_express_from_address_details:
                break;
            case R.id.iv_express_from_star:
                break;
            case R.id.iv_express_to_address_1:
            case R.id.tv_express_to_address_1:
            case R.id.tv_express_to_address:
            case R.id.ll_express_to_address:
            case R.id.iv_express_to_address_details:
                break;
            case R.id.iv_express_to_star:
                break;
            case R.id.tv_express_shipper_mail_list:
                break;
            case R.id.tv_express_receiver_mail_list:
                break;
            case R.id.tv_express_collection:
                break;
            case R.id.iv_express_collection:
                break;
            case R.id.ll_express_collection:
                break;
            case R.id.tv_express_nearby:
                break;
            case R.id.iv_express_nearby:
                break;
            case R.id.ll_express_nearby:
                break;
            case R.id.tv_express_credit:
                break;
            case R.id.iv_express_credit:
                break;
            case R.id.ll_express_credit:
                break;
            case R.id.button_express_sure:
                Intent intent = new Intent(getActivity(), PlaceOrderExpressActivity.class);
                startActivity(intent);
                break;
        }
    }
}