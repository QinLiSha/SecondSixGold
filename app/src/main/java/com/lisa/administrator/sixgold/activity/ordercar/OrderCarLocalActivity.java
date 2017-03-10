package com.lisa.administrator.sixgold.activity.ordercar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;
import com.lisa.administrator.sixgold.fragment.toplaceorder.PlaceOrderLocalCityFragment;

/**
 * 车型界面中的同城货运的下单界面
 */
public class OrderCarLocalActivity extends MyBaseActivity {
    private PlaceOrderLocalCityFragment placeOrderLocalCityFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_car_local);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "同城货车", -1, null);
        initBack();
        loadOrderLocalFragment();
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
    private void loadOrderLocalFragment() {
        placeOrderLocalCityFragment = new PlaceOrderLocalCityFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.contianer, placeOrderLocalCityFragment).commit();
    }
}
