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
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.order.ToPlaceOrderActivity;
import com.lisa.administrator.sixgold.activity.toplaceorder.PlaceOrderLongDistanceFreightActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class PlaceOrderLongDistanceFreightFragment extends Fragment {


    @BindView(R.id.iv_long_distance_from_address_1)
    ImageView ivLongDistanceFromAddress1;
    @BindView(R.id.tv_long_distance_from_address_1)
    TextView tvLongDistanceFromAddress1;
    @BindView(R.id.tv_long_distance_from_address)
    TextView tvLongDistanceFromAddress;
    @BindView(R.id.ll_long_distance_from_address)
    LinearLayout llLongDistanceFromAddress;
    @BindView(R.id.iv_long_distance_from_address_details)
    ImageView ivLongDistanceFromAddressDetails;
    @BindView(R.id.iv_long_distance_from_star)
    ImageView ivLongDistanceFromStar;
    @BindView(R.id.iv_long_distance_to_address_1)
    ImageView ivLongDistanceToAddress1;
    @BindView(R.id.tv_long_distance_to_address_1)
    TextView tvLongDistanceToAddress1;
    @BindView(R.id.tv_long_distance_to_address)
    TextView tvLongDistanceToAddress;
    @BindView(R.id.ll_long_distance_to_address)
    LinearLayout llLongDistanceToAddress;
    @BindView(R.id.iv_long_distance_to_address_details)
    ImageView ivLongDistanceToAddressDetails;
    @BindView(R.id.iv_long_distance_to_star)
    ImageView ivLongDistanceToStar;
    @BindView(R.id.et_long_distance_shipper_name)
    EditText etLongDistanceShipperName;
    @BindView(R.id.et_long_distance_shipper_num)
    EditText etLongDistanceShipperNum;
    @BindView(R.id.tv_long_distance_shipper_mail_list)
    TextView tvLongDistanceShipperMailList;
    @BindView(R.id.et_long_distance_receiver_name)
    EditText etLongDistanceReceiverName;
    @BindView(R.id.et_long_distance_receiver_num)
    EditText etLongDistanceReceiverNum;
    @BindView(R.id.tv_long_distance_receiver_mail_list)
    TextView tvLongDistanceReceiverMailList;
    @BindView(R.id.tv_long_distance_choose_cartype)
    TextView tvLongDistanceChooseCartype;
    @BindView(R.id.iv_long_distance_choose_cartype)
    ImageView ivLongDistanceChooseCartype;
    @BindView(R.id.ll_long_distance_choose_cartype)
    LinearLayout llLongDistanceChooseCartype;
    @BindView(R.id.tv_long_distance_freight_company)
    TextView tvLongDistanceFreightCompany;
    @BindView(R.id.iv_long_distance_freight_company)
    ImageView ivLongDistanceFreightCompany;
    @BindView(R.id.ll_long_distance_freight_company)
    LinearLayout llLongDistanceFreightCompany;
    @BindView(R.id.tv_long_distance_fast_matching)
    TextView tvLongDistanceFastMatching;
    @BindView(R.id.rl_long_distance_fast_matching)
    RelativeLayout rlLongDistanceFastMatching;
    @BindView(R.id.tv_long_distance_nearby)
    TextView tvLongDistanceNearby;
    @BindView(R.id.tv_long_distance_collect_money)
    TextView tvLongDistanceCollectMoney;
    @BindView(R.id.tv_long_distance_need_handling)
    TextView tvLongDistanceNeedHandling;
    @BindView(R.id.tv_long_distance_price)
    TextView tvLongDistancePrice;
    @BindView(R.id.iv_long_distance_price)
    ImageView ivLongDistancePrice;
    @BindView(R.id.ll_long_distance_price)
    LinearLayout llLongDistancePrice;
    @BindView(R.id.tv_long_distance_credit)
    TextView tvLongDistanceCredit;
    @BindView(R.id.iv_long_distance_credit)
    ImageView ivLongDistanceCredit;
    @BindView(R.id.ll_long_distance_credit)
    LinearLayout llLongDistanceCredit;
    @BindView(R.id.tv_long_distance_collection)
    TextView tvLongDistanceCollection;
    @BindView(R.id.iv_long_distance_collection)
    ImageView ivLongDistanceCollection;
    @BindView(R.id.ll_long_distance_collection)
    LinearLayout llLongDistanceCollection;
    @BindView(R.id.button_long_distance_sure)
    Button buttonLongDistanceSure;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_place_order_long_distance_freight, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R.id.iv_long_distance_from_address_1, R.id.tv_long_distance_from_address_1, R.id.tv_long_distance_from_address, R.id.ll_long_distance_from_address, R.id.iv_long_distance_from_address_details, R.id.iv_long_distance_from_star, R.id.iv_long_distance_to_address_1, R.id.tv_long_distance_to_address_1, R.id.tv_long_distance_to_address, R.id.ll_long_distance_to_address, R.id.iv_long_distance_to_address_details, R.id.iv_long_distance_to_star, R.id.et_long_distance_shipper_name, R.id.et_long_distance_shipper_num, R.id.tv_long_distance_shipper_mail_list, R.id.et_long_distance_receiver_name, R.id.et_long_distance_receiver_num, R.id.tv_long_distance_receiver_mail_list, R.id.tv_long_distance_choose_cartype, R.id.iv_long_distance_choose_cartype, R.id.ll_long_distance_choose_cartype, R.id.tv_long_distance_freight_company, R.id.iv_long_distance_freight_company, R.id.ll_long_distance_freight_company, R.id.tv_long_distance_fast_matching, R.id.rl_long_distance_fast_matching, R.id.tv_long_distance_nearby, R.id.tv_long_distance_collect_money, R.id.tv_long_distance_need_handling, R.id.tv_long_distance_price, R.id.iv_long_distance_price, R.id.ll_long_distance_price, R.id.tv_long_distance_credit, R.id.iv_long_distance_credit, R.id.ll_long_distance_credit, R.id.tv_long_distance_collection, R.id.iv_long_distance_collection, R.id.ll_long_distance_collection, R.id.button_long_distance_sure})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_long_distance_from_address_1:
            case R.id.tv_long_distance_from_address_1:
            case R.id.tv_long_distance_from_address:
            case R.id.ll_long_distance_from_address:
            case R.id.iv_long_distance_from_address_details:
                ((ToPlaceOrderActivity) getActivity()).initAddress_all(tvLongDistanceFromAddress);
                break;
            case R.id.iv_long_distance_from_star:
                break;
            case R.id.iv_long_distance_to_address_1:
            case R.id.tv_long_distance_to_address_1:
            case R.id.tv_long_distance_to_address:
            case R.id.ll_long_distance_to_address:
            case R.id.iv_long_distance_to_address_details:
                ((ToPlaceOrderActivity) getActivity()).initAddress_all(tvLongDistanceToAddress);
                break;
            case R.id.iv_long_distance_to_star:
                break;
            case R.id.et_long_distance_shipper_name:
                break;
            case R.id.et_long_distance_shipper_num:
                break;
            case R.id.tv_long_distance_shipper_mail_list:
                break;
            case R.id.et_long_distance_receiver_name:
                break;
            case R.id.et_long_distance_receiver_num:
                break;
            case R.id.tv_long_distance_receiver_mail_list:
                break;
            case R.id.tv_long_distance_choose_cartype:
                break;
            case R.id.iv_long_distance_choose_cartype:
                break;
            case R.id.ll_long_distance_choose_cartype:
                break;
            case R.id.tv_long_distance_freight_company:
                break;
            case R.id.iv_long_distance_freight_company:
                break;
            case R.id.ll_long_distance_freight_company:
                break;
            case R.id.tv_long_distance_fast_matching:
                break;
            case R.id.rl_long_distance_fast_matching:
                break;
            case R.id.tv_long_distance_nearby:
                break;
            case R.id.tv_long_distance_collect_money:
                break;
            case R.id.tv_long_distance_need_handling:
                break;
            case R.id.tv_long_distance_price:
                break;
            case R.id.iv_long_distance_price:
                break;
            case R.id.ll_long_distance_price:
                break;
            case R.id.tv_long_distance_credit:
                break;
            case R.id.iv_long_distance_credit:
                break;
            case R.id.ll_long_distance_credit:
                break;
            case R.id.tv_long_distance_collection:
                break;
            case R.id.iv_long_distance_collection:
                break;
            case R.id.ll_long_distance_collection:
                break;
            case R.id.button_long_distance_sure:
                Intent intent = new Intent(getActivity(), PlaceOrderLongDistanceFreightActivity.class);
                startActivity(intent);
                break;
        }
    }
}
