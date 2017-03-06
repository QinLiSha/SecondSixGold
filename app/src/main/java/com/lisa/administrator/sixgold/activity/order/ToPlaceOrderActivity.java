package com.lisa.administrator.sixgold.activity.order;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;
import com.lisa.administrator.sixgold.fragment.toplaceorder.PlaceOrderExpressFragment;
import com.lisa.administrator.sixgold.fragment.toplaceorder.PlaceOrderLegworkFragment;
import com.lisa.administrator.sixgold.fragment.toplaceorder.PlaceOrderLocalCityFragment;
import com.lisa.administrator.sixgold.fragment.toplaceorder.PlaceOrderLogisticsFragment;
import com.lisa.administrator.sixgold.fragment.toplaceorder.PlaceOrderLongDistanceFreightFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * 我要下单界面
 */
public class ToPlaceOrderActivity extends MyBaseActivity {

    @BindView(R.id.tv_legwork)
    TextView tvLegwork;
    @BindView(R.id.tv_express)
    TextView tvExpress;
    @BindView(R.id.tv_logistics)
    TextView tvLogistics;
    @BindView(R.id.tv_long_distance_freight)
    TextView tvLongDistanceFreight;
    @BindView(R.id.tv_local_city_freight)
    TextView tvLocalCityFreight;
    @BindView(R.id.contianer)
    RelativeLayout contianer;
    @BindView(R.id.activity_to_place_order)
    LinearLayout activityToPlaceOrder;
    private PlaceOrderLegworkFragment placeOrderLegworkFragment;
    private PlaceOrderExpressFragment placeOrderExpressFragment;
    private PlaceOrderLocalCityFragment placeOrderLocalCityFragment;
    private PlaceOrderLogisticsFragment placeOrderLogisticsFragment;
    private PlaceOrderLongDistanceFreightFragment placeOrderLongDistanceFreightFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_place_order);
        ButterKnife.bind(this);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "我要下单", -1, null);
        loadLegworkFragment();
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
     *以上是返回ImageView
     ******************************************************************************/
    /**
     * 加载主界面的方法
     */
    private void loadLegworkFragment() {
        placeOrderLegworkFragment = new PlaceOrderLegworkFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.contianer, placeOrderLegworkFragment).commit();
    }

    /**
     * 跑腿
     */
    public void showLegworkFragment() {
        if (placeOrderLegworkFragment == null) {
            placeOrderLegworkFragment = new PlaceOrderLegworkFragment();
        }
        setDefaultColor();
        tvLegwork.setTextColor(getPressTextColor());
        getSupportFragmentManager().beginTransaction().replace(R.id.contianer, placeOrderLegworkFragment)
                .commit();
    }

    /**
     * 快递
     */
    public void showExpressFragment() {
        if (placeOrderExpressFragment == null) {
            placeOrderExpressFragment = new PlaceOrderExpressFragment();
        }
        setDefaultColor();
        tvExpress.setTextColor(getPressTextColor());
        getSupportFragmentManager().beginTransaction().replace(R.id.contianer, placeOrderExpressFragment)
                .commit();
    }

    /**
     * 物流
     */
    public void showLogisticsFragment() {
        if (placeOrderLogisticsFragment == null) {
            placeOrderLogisticsFragment = new PlaceOrderLogisticsFragment();
        }
        setDefaultColor();
        tvLogistics.setTextColor(getPressTextColor());
        getSupportFragmentManager().beginTransaction().replace(R.id.contianer, placeOrderLogisticsFragment)
                .commit();
    }

    /**
     * 长途货运
     */
    public void showLongDistanceFreightFragment() {
        if (placeOrderLongDistanceFreightFragment == null) {
            placeOrderLongDistanceFreightFragment = new PlaceOrderLongDistanceFreightFragment();
        }
        setDefaultColor();
        tvLongDistanceFreight.setTextColor(getPressTextColor());
        getSupportFragmentManager().beginTransaction().replace(R.id.contianer, placeOrderLongDistanceFreightFragment)
                .commit();
    }

    /**
     * 同城货运
     */
    public void showLocalCityFragment() {
        if (placeOrderLocalCityFragment == null) {
            placeOrderLocalCityFragment = new PlaceOrderLocalCityFragment();
        }
        setDefaultColor();
        tvLocalCityFreight.setTextColor(getPressTextColor());
        getSupportFragmentManager().beginTransaction().replace(R.id.contianer, placeOrderLocalCityFragment)
                .commit();
    }

    @OnClick({R.id.tv_legwork, R.id.tv_express, R.id.tv_logistics, R.id.tv_long_distance_freight, R.id.tv_local_city_freight, R.id.contianer})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_legwork:
                showLegworkFragment();
                break;
            case R.id.tv_express:
                showExpressFragment();
                break;
            case R.id.tv_logistics:
                showLogisticsFragment();
                break;
            case R.id.tv_long_distance_freight:
                showLongDistanceFreightFragment();
                break;
            case R.id.tv_local_city_freight:
                showLocalCityFragment();
                break;
        }
    }

    private void setDefaultColor() {
        tvExpress.setTextColor(getDefaultCorlor());
        tvLocalCityFreight.setTextColor(getDefaultCorlor());
        tvLegwork.setTextColor(getDefaultCorlor());
        tvLogistics.setTextColor(getDefaultCorlor());
        tvLongDistanceFreight.setTextColor(getDefaultCorlor());
    }

    private int getPressTextColor() {
        return ContextCompat.getColor(this, R.color.gold);
    }

    private int getDefaultCorlor() {
        return ContextCompat.getColor(this, R.color.white);
    }
    /**
     * //将已经过时的换成没有过时的
     * //tv_buy.setTextColor(this.getResources().getColor(R.color.green));//已经过时
     *tv_buy.setTextColor(ContextCompat.getColor(this,R.color.green));//替代已过时getColor
     */


}
