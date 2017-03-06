package com.lisa.administrator.sixgold.activity.ordercar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;
import com.lisa.administrator.sixgold.fragment.toplaceorder.PlaceOrderLongDistanceFreightFragment;

/**
 * 车型界面中的长途货运的下单界面
 */
public class OrderCarLongActivity extends MyBaseActivity {

    private PlaceOrderLongDistanceFreightFragment placeOrderLongDistanceFreightFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_car_long);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "长途货车", R.drawable.ic_more_vert_white_24dp, null);
        initBack();
        loadOrderLongFragment();
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
    private void loadOrderLongFragment() {
        placeOrderLongDistanceFreightFragment = new PlaceOrderLongDistanceFreightFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.contianer, placeOrderLongDistanceFreightFragment).commit();
    }
}
