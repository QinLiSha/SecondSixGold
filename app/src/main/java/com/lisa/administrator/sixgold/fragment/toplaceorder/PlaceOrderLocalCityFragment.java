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
import com.lisa.administrator.sixgold.activity.toplaceorder.PlaceOrderLocalCityActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PlaceOrderLocalCityFragment extends Fragment {
    @BindView(R.id.iv_local_city_from_address_1)
    ImageView ivLocalCityFromAddress1;
    @BindView(R.id.tv_local_city_from_address_1)
    TextView tvLocalCityFromAddress1;
    @BindView(R.id.tv_local_city_from_address)
    TextView tvLocalCityFromAddress;
    @BindView(R.id.ll_local_city_from_address)
    LinearLayout llLocalCityFromAddress;
    @BindView(R.id.iv_local_city_from_address_details)
    ImageView ivLocalCityFromAddressDetails;
    @BindView(R.id.iv_local_city_from_star)
    ImageView ivLocalCityFromStar;
    @BindView(R.id.iv_local_city_to_address_1)
    ImageView ivLocalCityToAddress1;
    @BindView(R.id.tv_local_city_to_address_1)
    TextView tvLocalCityToAddress1;
    @BindView(R.id.tv_local_city_to_address)
    TextView tvLocalCityToAddress;
    @BindView(R.id.ll_local_city_to_address)
    LinearLayout llLocalCityToAddress;
    @BindView(R.id.iv_local_city_to_address_details)
    ImageView ivLocalCityToAddressDetails;
    @BindView(R.id.iv_local_city_to_star)
    ImageView ivLocalCityToStar;
    @BindView(R.id.et_local_city_shipper_name)
    EditText etLocalCityShipperName;
    @BindView(R.id.et_local_city_shipper_num)
    EditText etLocalCityShipperNum;
    @BindView(R.id.tv_local_city_shipper_mail_list)
    TextView tvLocalCityShipperMailList;
    @BindView(R.id.et_local_city_receiver_name)
    EditText etLocalCityReceiverName;
    @BindView(R.id.et_local_city_receiver_num)
    EditText etLocalCityReceiverNum;
    @BindView(R.id.tv_local_city_receiver_mail_list)
    TextView tvLocalCityReceiverMailList;
    @BindView(R.id.tv_local_city_choose_cartype)
    TextView tvLocalCityChooseCartype;
    @BindView(R.id.iv_local_city_choose_cartype)
    ImageView ivLocalCityChooseCartype;
    @BindView(R.id.ll_local_city_choose_cartype)
    LinearLayout llLocalCityChooseCartype;
    @BindView(R.id.tv_local_city_freight_company)
    TextView tvLocalCityFreightCompany;
    @BindView(R.id.iv_local_city_freight_company)
    ImageView ivLocalCityFreightCompany;
    @BindView(R.id.ll_local_city_freight_company)
    LinearLayout llLocalCityFreightCompany;
    @BindView(R.id.tv_local_city_nearby)
    TextView tvLocalCityNearby;
    @BindView(R.id.tv_local_city_collect_money)
    TextView tvLocalCityCollectMoney;
    @BindView(R.id.tv_local_city_need_handling)
    TextView tvLocalCityNeedHandling;
    @BindView(R.id.tv_local_city_price)
    TextView tvLocalCityPrice;
    @BindView(R.id.iv_local_city_price)
    ImageView ivLocalCityPrice;
    @BindView(R.id.ll_local_city_price)
    LinearLayout llLocalCityPrice;
    @BindView(R.id.tv_local_city_credit)
    TextView tvLocalCityCredit;
    @BindView(R.id.iv_local_city_credit)
    ImageView ivLocalCityCredit;
    @BindView(R.id.ll_local_city_credit)
    LinearLayout llLocalCityCredit;
    @BindView(R.id.tv_local_city_collection)
    TextView tvLocalCityCollection;
    @BindView(R.id.iv_local_city_collection)
    ImageView ivLocalCityCollection;
    @BindView(R.id.ll_local_city_collection)
    LinearLayout llLocalCityCollection;
    @BindView(R.id.button_local_city_sure)
    Button buttonLocalCitySure;
    @BindView(R.id.tv_local_city_fast_matching)
    TextView tvLocalCityFastMatching;
    @BindView(R.id.rl_local_city_fast_matching)
    RelativeLayout rlLocalCityFastMatching;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_place_order_local_city, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R.id.iv_local_city_from_address_1, R.id.tv_local_city_from_address_1, R.id.tv_local_city_from_address, R.id.ll_local_city_from_address,
            R.id.iv_local_city_from_address_details, R.id.iv_local_city_from_star, R.id.iv_local_city_to_address_1, R.id.tv_local_city_to_address_1,
            R.id.tv_local_city_to_address, R.id.ll_local_city_to_address, R.id.iv_local_city_to_address_details, R.id.iv_local_city_to_star,
            R.id.et_local_city_shipper_name, R.id.et_local_city_shipper_num, R.id.tv_local_city_shipper_mail_list, R.id.et_local_city_receiver_name,
            R.id.et_local_city_receiver_num, R.id.tv_local_city_receiver_mail_list, R.id.tv_local_city_choose_cartype, R.id.iv_local_city_choose_cartype,
            R.id.ll_local_city_choose_cartype, R.id.tv_local_city_freight_company, R.id.iv_local_city_freight_company, R.id.ll_local_city_freight_company,
            R.id.tv_local_city_fast_matching, R.id.rl_local_city_fast_matching, R.id.tv_local_city_nearby, R.id.tv_local_city_collect_money,
            R.id.tv_local_city_need_handling, R.id.tv_local_city_price, R.id.iv_local_city_price, R.id.ll_local_city_price, R.id.tv_local_city_credit,
            R.id.iv_local_city_credit, R.id.ll_local_city_credit, R.id.tv_local_city_collection, R.id.iv_local_city_collection,
            R.id.ll_local_city_collection, R.id.button_local_city_sure})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_local_city_from_address_1:
            case R.id.tv_local_city_from_address_1:
            case R.id.tv_local_city_from_address:
            case R.id.ll_local_city_from_address:
            case R.id.iv_local_city_from_address_details:
                ((ToPlaceOrderActivity) getActivity()).initAddress_all(tvLocalCityFromAddress);
                break;
            case R.id.iv_local_city_from_star:
                break;
            case R.id.iv_local_city_to_address_1:
            case R.id.tv_local_city_to_address_1:
            case R.id.tv_local_city_to_address:
            case R.id.ll_local_city_to_address:
            case R.id.iv_local_city_to_address_details:
                ((ToPlaceOrderActivity) getActivity()).initAddress_all(tvLocalCityToAddress);
                break;
            case R.id.iv_local_city_to_star:
                break;
            case R.id.et_local_city_shipper_name:
                break;
            case R.id.et_local_city_shipper_num:
                break;
            case R.id.tv_local_city_shipper_mail_list:
                break;
            case R.id.et_local_city_receiver_name:
                break;
            case R.id.et_local_city_receiver_num:
                break;
            case R.id.tv_local_city_receiver_mail_list:
                break;
            case R.id.tv_local_city_choose_cartype:
                break;
            case R.id.iv_local_city_choose_cartype:
                break;
            case R.id.ll_local_city_choose_cartype:
                break;
            case R.id.tv_local_city_freight_company:
                break;
            case R.id.iv_local_city_freight_company:
                break;
            case R.id.ll_local_city_freight_company:
                break;
            case R.id.tv_local_city_fast_matching:
            case R.id.rl_local_city_fast_matching:
                break;
            case R.id.tv_local_city_nearby:
                break;
            case R.id.tv_local_city_collect_money:
                break;
            case R.id.tv_local_city_need_handling:
                break;
            case R.id.tv_local_city_price:
                break;
            case R.id.iv_local_city_price:
                break;
            case R.id.ll_local_city_price:
                break;
            case R.id.tv_local_city_credit:
                break;
            case R.id.iv_local_city_credit:
                break;
            case R.id.ll_local_city_credit:
                break;
            case R.id.tv_local_city_collection:
                break;
            case R.id.iv_local_city_collection:
                break;
            case R.id.ll_local_city_collection:
                break;
            case R.id.button_local_city_sure:
                Intent intent = new Intent(getActivity(), PlaceOrderLocalCityActivity.class);
                startActivity(intent);
                break;
        }
    }
}