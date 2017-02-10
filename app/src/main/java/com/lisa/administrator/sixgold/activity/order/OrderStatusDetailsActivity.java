package com.lisa.administrator.sixgold.activity.order;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;
import com.lisa.administrator.sixgold.fragment.order.OrderDetailsFragment;
import com.lisa.administrator.sixgold.fragment.order.OrderStatusFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.lisa.administrator.sixgold.R.color.defaultTextViewColor;
import static com.lisa.administrator.sixgold.R.color.themeBlue;

public class OrderStatusDetailsActivity extends MyBaseActivity {

    private OrderStatusFragment orderStatusFragment;
    private OrderDetailsFragment orderDetailsFragment;
    @BindView(R.id.contianer)
    RelativeLayout contianer;
    @BindView(R.id.tv_order_status)
    TextView tvOrderStatus;
    @BindView(R.id.view_order_status)
    View viewOrderStatus;
    @BindView(R.id.rl_order_status)
    RelativeLayout rlOrderStatus;
    @BindView(R.id.view_order_details)
    View viewOrderDetails;
    @BindView(R.id.tv_order_details)
    TextView tvOrderDetails;
    @BindView(R.id.rl_order_details)
    RelativeLayout rlOrderDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_status_details);
        ButterKnife.bind(this);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "订单状态", -1, null);
        loadOrderStatusFragment();

    }

    private void loadOrderStatusFragment() {
        orderStatusFragment = new OrderStatusFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.contianer, orderStatusFragment).commit();
    }

    protected void showOrderStatusFragment() {
        if (orderStatusFragment == null) {
            orderStatusFragment = new OrderStatusFragment();
        }
        setDefaultColorAndView();
        tvOrderStatus.setTextColor(getPressTextColor());
        viewOrderStatus.setVisibility(View.VISIBLE);
        getSupportFragmentManager().beginTransaction().replace(R.id.contianer, orderStatusFragment).commit();
    }

    protected void showOrderDetailsFragment() {
        if (orderDetailsFragment == null) {
            orderDetailsFragment = new OrderDetailsFragment();
        }
        setDefaultColorAndView();
        tvOrderDetails.setTextColor(getPressTextColor());
        viewOrderDetails.setVisibility(View.VISIBLE);
        getSupportFragmentManager().beginTransaction().replace(R.id.contianer, orderDetailsFragment).commit();
    }

    @OnClick({R.id.tv_order_status, R.id.view_order_status, R.id.rl_order_status, R.id.view_order_details, R.id.tv_order_details, R.id.rl_order_details})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_order_status:
            case R.id.view_order_status:
            case R.id.rl_order_status:
                showOrderStatusFragment();
                break;
            case R.id.view_order_details:
            case R.id.tv_order_details:
            case R.id.rl_order_details:
                showOrderDetailsFragment();
                break;
        }
    }

    private void setDefaultColorAndView() {
        tvOrderDetails.setTextColor(getDefaultCorlor());
        tvOrderStatus.setTextColor(getDefaultCorlor());
        viewOrderDetails.setVisibility(View.INVISIBLE);
        viewOrderStatus.setVisibility(View.INVISIBLE);
    }


    private int getPressTextColor() {
        return getResources().getColor(themeBlue);
    }

    private int getDefaultCorlor() {
        return getResources().getColor(defaultTextViewColor);
    }

}
