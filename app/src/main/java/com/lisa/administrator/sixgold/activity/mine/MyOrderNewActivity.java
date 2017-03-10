package com.lisa.administrator.sixgold.activity.mine;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
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
    private PopupWindow popupWindowOrderType;
    @BindView(R.id.iv_my_order_left)
    ImageView ivMyOrderLeft;
    @BindView(R.id.iv_my_order_right)
    ImageView ivMyOrderRight;
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
        loadOrderTypeFragment();
        initPopupWindowOrderType();
    }
    /********************************************************************************
     * 以下是poppupwindow的设置
     ******************************************************************************/
    /**
     * 初始化我的订单中的右上角的下拉popupWindow的列表
     */
    private void initPopupWindowOrderType() {
        View view = getLayoutInflater().inflate(R.layout.layout_popup_item_ordertype, null);
        popupWindowOrderType = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT, true);//PopupWindow的构造方法为TRUE的话，点击空白的部分Popupwindow会消失；
        TextView tv1 = (TextView) view.findViewById(R.id.tv_order_type_all);
        TextView tv2 = (TextView) view.findViewById(R.id.tv_order_type_legwork);
        TextView tv3 = (TextView) view.findViewById(R.id.tv_order_type_express);
        TextView tv4 = (TextView) view.findViewById(R.id.tv_order_type_local_city_car);
        TextView tv5 = (TextView) view.findViewById(R.id.tv_order_type_long_distant);
        TextView tv6 = (TextView) view.findViewById(R.id.tv_order_type_logistics);
        LinearLayout ll1 = (LinearLayout) view.findViewById(R.id.ll_order_type_all);
        LinearLayout ll2 = (LinearLayout) view.findViewById(R.id.ll_order_type_legwork);
        LinearLayout ll3 = (LinearLayout) view.findViewById(R.id.ll_order_type_express);
        LinearLayout ll4 = (LinearLayout) view.findViewById(R.id.ll_order_type_local_city_car);
        LinearLayout ll5 = (LinearLayout) view.findViewById(R.id.ll_order_type_long_distant);
        LinearLayout ll6 = (LinearLayout) view.findViewById(R.id.ll_order_type_logistics);
        tv1.setOnClickListener(onClickListenerPop);
        tv2.setOnClickListener(onClickListenerPop);
        tv3.setOnClickListener(onClickListenerPop);
        tv4.setOnClickListener(onClickListenerPop);
        tv5.setOnClickListener(onClickListenerPop);
        tv6.setOnClickListener(onClickListenerPop);
        ll1.setOnClickListener(onClickListenerPop);
        ll2.setOnClickListener(onClickListenerPop);
        ll3.setOnClickListener(onClickListenerPop);
        ll4.setOnClickListener(onClickListenerPop);
        ll5.setOnClickListener(onClickListenerPop);
        ll6.setOnClickListener(onClickListenerPop);
    }

    private View.OnClickListener onClickListenerPop = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.tv_order_type_all:
                case R.id.ll_order_type_all:
                    showToast(getString(R.string.all));
                    break;
                case R.id.tv_order_type_legwork:
                case R.id.ll_order_type_legwork:
                    showToast(getString(R.string.legwork));
                    break;
                case R.id.tv_order_type_express:
                case R.id.ll_order_type_express:
                    showToast(getString(R.string.express));
                    break;
                case R.id.tv_order_type_local_city_car:
                case R.id.ll_order_type_local_city_car:
                    showToast(getString(R.string.local_city_car));
                    break;
                case R.id.tv_order_type_long_distant:
                case R.id.ll_order_type_long_distant:
                    showToast(getString(R.string.long_distant_car));
                    break;
                case R.id.tv_order_type_logistics:
                case R.id.ll_order_type_logistics:
                    showToast(getString(R.string.logistic));
                    break;
            }
        }
    };
    /********************************************************************************
     * 以上是poppupwindow的设置
     ******************************************************************************/
    /**
     * 加载fragment
     */
    protected void loadOrderTypeFragment() {
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

    @OnClick({R.id.iv_my_order_left, R.id.iv_my_order_right, R.id.tv_all_type, R.id.view_all_type, R.id.rl_all_type,
            R.id.tv_wait_for_pickup, R.id.view_wait_for_pickup, R.id.rl_wait_for_pickup, R.id.view_transporting,
            R.id.tv_transporting, R.id.rl_transporting, R.id.view_already_sign, R.id.tv_already_sign, R.id.rl_already_sign,
            R.id.tv_toEvaluate, R.id.view_toEvaluate, R.id.rl_toEvaluate, R.id.tv_refound, R.id.view_refound, R.id.rl_refound,
            R.id.contianer})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_my_order_left:
                finish();
                break;
            case R.id.iv_my_order_right:
                if (popupWindowOrderType.isShowing()) {
                    popupWindowOrderType.dismiss();
                } else if (popupWindowOrderType != null) {
                    popupWindowOrderType.showAsDropDown(ivMyOrderRight, 0, 0);//最后一个是对距离高度的设置
                }
                break;
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
