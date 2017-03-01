package com.lisa.administrator.sixgold.activity.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;
import com.lisa.administrator.sixgold.fragment.myorder.OrderAlreadySignFragment;
import com.lisa.administrator.sixgold.fragment.myorder.OrderRefoundFragment;
import com.lisa.administrator.sixgold.fragment.myorder.OrderToEvaluateFragment;
import com.lisa.administrator.sixgold.fragment.myorder.OrderTranslatingFragment;
import com.lisa.administrator.sixgold.fragment.myorder.OrderTypeFragment;
import com.lisa.administrator.sixgold.fragment.myorder.OrderWaitForPickupFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.lisa.administrator.sixgold.R.color.defaultTextViewColor;
import static com.lisa.administrator.sixgold.R.color.themeBlue;

public class MyOrderNewActivity extends MyBaseActivity {


    @BindView(R.id.tv_all_type)
    TextView tvAllType;
    @BindView(R.id.view_all_type)
    View viewAllType;
    @BindView(R.id.rl_all_type)
    RelativeLayout rlAllType;
    @BindView(R.id.tv_wait_for_pickup)
    TextView tvWaitForPickup;
    @BindView(R.id.view_wait_for_pickup)
    View viewWaitForPickup;
    @BindView(R.id.rl_wait_for_pickup)
    RelativeLayout rlWaitForPickup;
    @BindView(R.id.view_transporting)
    View viewTransporting;
    @BindView(R.id.tv_transporting)
    TextView tvTransporting;
    @BindView(R.id.rl_transporting)
    RelativeLayout rlTransporting;
    @BindView(R.id.view_already_sign)
    View viewAlreadySign;
    @BindView(R.id.tv_already_sign)
    TextView tvAlreadySign;
    @BindView(R.id.rl_already_sign)
    RelativeLayout rlAlreadySign;
    @BindView(R.id.tv_toEvaluate)
    TextView tvToEvaluate;
    @BindView(R.id.view_toEvaluate)
    View viewToEvaluate;
    @BindView(R.id.rl_toEvaluate)
    RelativeLayout rlToEvaluate;
    @BindView(R.id.tv_refound)
    TextView tvRefound;
    @BindView(R.id.view_refound)
    View viewRefound;
    @BindView(R.id.rl_refound)
    RelativeLayout rlRefound;
    @BindView(R.id.contianer)
    RelativeLayout contianer;
    private OrderTypeFragment orderTypeFragment;
    private OrderWaitForPickupFragment orderWaitForPickupFragment;
    private OrderTranslatingFragment orderTranslatingFragment;
    private OrderAlreadySignFragment orderAlreadySignFragment;
    private OrderToEvaluateFragment orderToEvaluateFragment;
    private OrderRefoundFragment orderRefoundFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order_new);
        ButterKnife.bind(this);
        //右边是详情的符号
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "我的订单", R.drawable.ic_more_vert_white_24dp, null);
        loadOrderTypeFragment();
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
     * 以上是返回ImageView
     ******************************************************************************/
    private void loadOrderTypeFragment() {
        orderTypeFragment = new OrderTypeFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.contianer, orderTypeFragment).commit();
    }

    /**
     * 全部（选择的类型）
     */
    protected void showOrderTypeFragment() {
        if (orderTypeFragment == null) {
            orderTypeFragment = new OrderTypeFragment();
        }
        setDefaultColorAndView();
        tvAllType.setTextColor(getPressTextColor());
        viewAllType.setVisibility(View.VISIBLE);
        getSupportFragmentManager().beginTransaction().replace(R.id.contianer, orderTypeFragment).commit();
    }

    /**
     * 待取件
     */
    protected void showOrderWaitForPickupFragment() {
        if (orderWaitForPickupFragment == null) {
            orderWaitForPickupFragment = new OrderWaitForPickupFragment();
        }
        setDefaultColorAndView();
        tvWaitForPickup.setTextColor(getPressTextColor());
        viewWaitForPickup.setVisibility(View.VISIBLE);
        getSupportFragmentManager().beginTransaction().replace(R.id.contianer, orderWaitForPickupFragment).commit();
    }

    /**
     * 运送中
     */
    protected void showOrderTranslatingFragment() {
        if (orderTranslatingFragment == null) {
            orderTranslatingFragment = new OrderTranslatingFragment();
        }
        setDefaultColorAndView();
        tvTransporting.setTextColor(getPressTextColor());
        viewTransporting.setVisibility(View.VISIBLE);
        getSupportFragmentManager().beginTransaction().replace(R.id.contianer, orderTranslatingFragment).commit();
    }

    /**
     * 已签收
     */
    protected void showOrderAlreadySignFragment() {
        if (orderAlreadySignFragment == null) {
            orderAlreadySignFragment = new OrderAlreadySignFragment();
        }
        setDefaultColorAndView();
        tvAlreadySign.setTextColor(getPressTextColor());
        viewAlreadySign.setVisibility(View.VISIBLE);
        getSupportFragmentManager().beginTransaction().replace(R.id.contianer, orderAlreadySignFragment).commit();
    }

    /**
     * 待评价
     */
    protected void showOrderToEvaluateFragment() {
        if (orderToEvaluateFragment == null) {
            orderToEvaluateFragment = new OrderToEvaluateFragment();
        }
        setDefaultColorAndView();
        tvToEvaluate.setTextColor(getPressTextColor());
        viewToEvaluate.setVisibility(View.VISIBLE);
        getSupportFragmentManager().beginTransaction().replace(R.id.contianer, orderToEvaluateFragment).commit();
    }

    /**
     * 退款
     */
    protected void showOrderRefoundFragment() {
        if (orderRefoundFragment == null) {
            orderRefoundFragment = new OrderRefoundFragment();
        }
        setDefaultColorAndView();
        tvRefound.setTextColor(getPressTextColor());
        viewRefound.setVisibility(View.VISIBLE);
        getSupportFragmentManager().beginTransaction().replace(R.id.contianer, orderRefoundFragment).commit();
    }

    @OnClick({R.id.tv_all_type, R.id.view_all_type, R.id.rl_all_type, R.id.tv_wait_for_pickup, R.id.view_wait_for_pickup, R.id.rl_wait_for_pickup, R.id.view_transporting, R.id.tv_transporting, R.id.rl_transporting, R.id.view_already_sign, R.id.tv_already_sign, R.id.rl_already_sign, R.id.tv_toEvaluate, R.id.view_toEvaluate, R.id.rl_toEvaluate, R.id.tv_refound, R.id.view_refound, R.id.rl_refound, R.id.contianer})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_all_type:
            case R.id.view_all_type:
            case R.id.rl_all_type:
                showOrderTypeFragment();
                break;
            case R.id.tv_wait_for_pickup:
            case R.id.view_wait_for_pickup:
            case R.id.rl_wait_for_pickup:
                showOrderWaitForPickupFragment();
                break;
            case R.id.view_transporting:
            case R.id.tv_transporting:
            case R.id.rl_transporting:
                showOrderTranslatingFragment();
                break;
            case R.id.view_already_sign:
            case R.id.tv_already_sign:
            case R.id.rl_already_sign:
                showOrderAlreadySignFragment();
                break;
            case R.id.tv_toEvaluate:
            case R.id.view_toEvaluate:
            case R.id.rl_toEvaluate:
                showOrderToEvaluateFragment();
                break;
            case R.id.tv_refound:
            case R.id.view_refound:
            case R.id.rl_refound:
                showOrderRefoundFragment();
                break;
            case R.id.contianer:
                break;
        }
    }

    private void setDefaultColorAndView() {
        tvAllType.setTextColor(getDefaultCorlor());
        tvAlreadySign.setTextColor(getDefaultCorlor());
        tvRefound.setTextColor(getDefaultCorlor());
        tvToEvaluate.setTextColor(getDefaultCorlor());
        tvTransporting.setTextColor(getDefaultCorlor());
        tvWaitForPickup.setTextColor(getDefaultCorlor());
        viewAllType.setVisibility(View.INVISIBLE);
        viewAlreadySign.setVisibility(View.INVISIBLE);
        viewRefound.setVisibility(View.INVISIBLE);
        viewToEvaluate.setVisibility(View.INVISIBLE);
        viewTransporting.setVisibility(View.INVISIBLE);
        viewWaitForPickup.setVisibility(View.INVISIBLE);
    }


    private int getPressTextColor() {
        return getResources().getColor(themeBlue);
    }

    private int getDefaultCorlor() {
        return getResources().getColor(defaultTextViewColor);
    }
}
