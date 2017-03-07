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
import com.lisa.administrator.sixgold.activity.order.ToPlaceOrderActivity;
import com.lisa.administrator.sixgold.activity.toplaceorder.PlaceOrderLegworkActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class PlaceOrderLegworkFragment extends Fragment {
    @BindView(R.id.iv_legwork_from_address_1)
    ImageView ivLegworkFromAddress1;
    @BindView(R.id.tv_legwork_from_address_1)
    TextView tvLegworkFromAddress1;
    @BindView(R.id.tv_legwork_from_address)
    TextView tvLegworkFromAddress;
    @BindView(R.id.ll_legwork_from_address)
    LinearLayout llLegworkFromAddress;
    @BindView(R.id.iv_legwork_from_address_details)
    ImageView ivLegworkFromAddressDetails;
    @BindView(R.id.iv_legwork_from_star)
    ImageView ivLegworkFromStar;
    @BindView(R.id.iv_legwork_to_address_1)
    ImageView ivLegworkToAddress1;
    @BindView(R.id.tv_legwork_to_address_1)
    TextView tvLegworkToAddress1;
    @BindView(R.id.tv_legwork_to_address)
    TextView tvLegworkToAddress;
    @BindView(R.id.ll_legwork_to_address)
    LinearLayout llLegworkToAddress;
    @BindView(R.id.iv_legwork_to_address_details)
    ImageView ivLegworkToAddressDetails;
    @BindView(R.id.iv_legwork_to_star)
    ImageView ivLegworkToStar;
    @BindView(R.id.et_legwork_shipper_name)
    EditText etLegworkShipperName;
    @BindView(R.id.et_legwork_shipper_num)
    EditText etLegworkShipperNum;
    @BindView(R.id.tv_legwork_shipper_mail_list)
    TextView tvLegworkShipperMailList;
    @BindView(R.id.et_legwork_receiver_name)
    EditText etLegworkReceiverName;
    @BindView(R.id.et_legwork_receiver_num)
    EditText etLegworkReceiverNum;
    @BindView(R.id.tv_legwork_receiver_mail_list)
    TextView tvLegworkReceiverMailList;
    @BindView(R.id.tv_legwork_collection)
    TextView tvLegworkCollection;
    @BindView(R.id.iv_legwork_collection)
    ImageView ivLegworkCollection;
    @BindView(R.id.ll_legwork_collection)
    LinearLayout llLegworkCollection;
    @BindView(R.id.tv_legwork_nearby)
    TextView tvLegworkNearby;
    @BindView(R.id.iv_legwork_nearby)
    ImageView ivLegworkNearby;
    @BindView(R.id.ll_legwork_nearby)
    LinearLayout llLegworkNearby;
    @BindView(R.id.tv_legwork_credit)
    TextView tvLegworkCredit;
    @BindView(R.id.iv_legwork_credit)
    ImageView ivLegworkCredit;
    @BindView(R.id.ll_legwork_credit)
    LinearLayout llLegworkCredit;
    @BindView(R.id.button_legwork_sure)
    Button buttonLegworkSure;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_place_order_legwork, container, false);
        ButterKnife.bind(this, view);
        return view;
    }


    @OnClick({R.id.iv_legwork_from_address_1, R.id.tv_legwork_from_address_1, R.id.tv_legwork_from_address,
            R.id.ll_legwork_from_address, R.id.iv_legwork_from_address_details, R.id.iv_legwork_from_star,
            R.id.iv_legwork_to_address_1, R.id.tv_legwork_to_address_1, R.id.tv_legwork_to_address, R.id.ll_legwork_to_address,
            R.id.iv_legwork_to_address_details, R.id.iv_legwork_to_star, R.id.et_legwork_shipper_name, R.id.et_legwork_shipper_num,
            R.id.tv_legwork_shipper_mail_list, R.id.et_legwork_receiver_name, R.id.et_legwork_receiver_num,
            R.id.tv_legwork_receiver_mail_list, R.id.tv_legwork_collection, R.id.iv_legwork_collection,
            R.id.ll_legwork_collection, R.id.tv_legwork_nearby, R.id.iv_legwork_nearby, R.id.ll_legwork_nearby,
            R.id.tv_legwork_credit, R.id.iv_legwork_credit, R.id.ll_legwork_credit, R.id.button_legwork_sure})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_legwork_from_address_1:
            case R.id.tv_legwork_from_address_1:
            case R.id.tv_legwork_from_address:
            case R.id.ll_legwork_from_address:
            case R.id.iv_legwork_from_address_details:
                ((ToPlaceOrderActivity) getActivity()).initAddress_all(tvLegworkFromAddress);
                break;
            case R.id.iv_legwork_from_star:
                break;
            case R.id.iv_legwork_to_address_1:
            case R.id.tv_legwork_to_address_1:
            case R.id.tv_legwork_to_address:
            case R.id.ll_legwork_to_address:
            case R.id.iv_legwork_to_address_details:
                ((ToPlaceOrderActivity) getActivity()).initAddress_all(tvLegworkToAddress);
                break;
            case R.id.iv_legwork_to_star:
                break;
            case R.id.et_legwork_shipper_name:
                break;
            case R.id.et_legwork_shipper_num:
                break;
            case R.id.tv_legwork_shipper_mail_list:
                break;
            case R.id.et_legwork_receiver_name:
                break;
            case R.id.et_legwork_receiver_num:
                break;
            case R.id.tv_legwork_receiver_mail_list:
                break;
            case R.id.tv_legwork_collection:
                break;
            case R.id.iv_legwork_collection:
                break;
            case R.id.ll_legwork_collection:
                break;
            case R.id.tv_legwork_nearby:
                break;
            case R.id.iv_legwork_nearby:
                break;
            case R.id.ll_legwork_nearby:
                break;
            case R.id.tv_legwork_credit:
                break;
            case R.id.iv_legwork_credit:
                break;
            case R.id.ll_legwork_credit:
                break;
            case R.id.button_legwork_sure:
                Intent intent = new Intent(getActivity(), PlaceOrderLegworkActivity.class);
                startActivity(intent);
                break;
        }
    }
}