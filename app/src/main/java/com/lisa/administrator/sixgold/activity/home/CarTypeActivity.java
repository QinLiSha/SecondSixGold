package com.lisa.administrator.sixgold.activity.home;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.HomeLongDistanceFreightActivity;
import com.lisa.administrator.sixgold.adapter.CarTypeListViewAdapter;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CarTypeActivity extends MyBaseActivity {

    private PopupWindow popupWindow;
    private CarTypeListViewAdapter carTypeListViewAdapter_all;
    @BindView(R.id.lv_car_type_all)
    ListView lvCarTypeAll;
    @BindView(R.id.tv_from_address)
    TextView tvFromAddress;
    @BindView(R.id.iv_from_address_1)
    ImageView ivFromAddress1;
    @BindView(R.id.iv_from_address_2)
    ImageView ivFromAddress2;
    @BindView(R.id.rl_from_address)
    RelativeLayout rlFromAddress;
    @BindView(R.id.tv_to_address)
    TextView tvToAddress;
    @BindView(R.id.iv_to_address_1)
    ImageView ivToAddress1;
    @BindView(R.id.iv_to_address_2)
    ImageView ivToAddress2;
    @BindView(R.id.rl_to_address)
    RelativeLayout rlToAddress;
    @BindView(R.id.tv_cartype_carlength)
    TextView tvCartypeCarlength;
    @BindView(R.id.iv_cartype_carlength_1)
    ImageView ivCartypeCarlength1;
    @BindView(R.id.iv_cartype_carlength_2)
    ImageView ivCartypeCarlength2;
    @BindView(R.id.rl_cartype_carlength)
    RelativeLayout rlCartypeCarlength;
    @BindView(R.id.tv_choose_type)
    TextView tvChooseType;
    @BindView(R.id.iv_choose_type_1)
    ImageView ivChooseType1;
    @BindView(R.id.iv_choose_type_2)
    ImageView ivChooseType2;
    @BindView(R.id.rl_choose_type)
    RelativeLayout rlChooseType;
    @BindView(R.id.iv_home_homepage)
    ImageView ivHomeHomepage;
    @BindView(R.id.tv_home_homepage)
    TextView tvHomeHomepage;
    @BindView(R.id.ll_home_homepage)
    LinearLayout llHomeHomepage;
    @BindView(R.id.iv_car_type)
    ImageView ivCarType;
    @BindView(R.id.tv_car_type)
    TextView tvCarType;
    @BindView(R.id.ll_car_type)
    LinearLayout llCarType;
    @BindView(R.id.iv_home_I)
    ImageView ivHomeI;
    @BindView(R.id.tv_home_I)
    TextView tvHomeI;
    @BindView(R.id.ll_home_I)
    LinearLayout llHomeI;
    @BindView(R.id.ll_home_bottom_item)
    LinearLayout llHomeBottomItem;
    @BindView(R.id.activity_car_type)
    LinearLayout activityCarType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_type);
        ButterKnife.bind(this);
        initPopupWindow();
    }


    private void initListView() {
        if (carTypeListViewAdapter_all == null) {
            carTypeListViewAdapter_all = new CarTypeListViewAdapter(this);
        }
        lvCarTypeAll.setAdapter(carTypeListViewAdapter_all);

        lvCarTypeAll.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                openActivity(HomeLongDistanceFreightActivity.class);
            }
        });
    }


    @OnClick({R.id.tv_from_address, R.id.iv_from_address_1, R.id.iv_from_address_2, R.id.rl_from_address, R.id.tv_to_address, R.id.iv_to_address_1, R.id.iv_to_address_2, R.id.rl_to_address, R.id.tv_cartype_carlength, R.id.iv_cartype_carlength_1, R.id.iv_cartype_carlength_2, R.id.rl_cartype_carlength, R.id.tv_choose_type, R.id.iv_choose_type_1, R.id.iv_choose_type_2, R.id.rl_choose_type, R.id.iv_home_homepage, R.id.tv_home_homepage, R.id.ll_home_homepage, R.id.iv_car_type, R.id.tv_car_type, R.id.ll_car_type, R.id.iv_home_I, R.id.tv_home_I, R.id.ll_home_I, R.id.ll_home_bottom_item, R.id.activity_car_type})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_from_address:
                break;
            case R.id.iv_from_address_1:
                break;
            case R.id.iv_from_address_2:
                break;
            case R.id.rl_from_address:
                break;
            case R.id.tv_to_address:
                break;
            case R.id.iv_to_address_1:
                break;
            case R.id.iv_to_address_2:
                break;
            case R.id.rl_to_address:
                break;
            case R.id.tv_cartype_carlength:
                break;
            case R.id.iv_cartype_carlength_1:
                break;
            case R.id.iv_cartype_carlength_2:
                break;
            case R.id.rl_cartype_carlength:
                break;
            case R.id.tv_choose_type:
            case R.id.iv_choose_type_1:
            case R.id.iv_choose_type_2:
            case R.id.rl_choose_type:
                if (popupWindow.isShowing()) {
                    popupWindow.dismiss();
                } else if (popupWindow != null) {
                    popupWindow.showAsDropDown(tvChooseType, 0, 0);//最后一个是对距离网页标题栏的设置
                }
                break;
            case R.id.iv_home_homepage:
                break;
            case R.id.tv_home_homepage:
                break;
            case R.id.ll_home_homepage:
                break;
            case R.id.iv_car_type:
                break;
            case R.id.tv_car_type:
                break;
            case R.id.ll_car_type:
                break;
            case R.id.iv_home_I:
                break;
            case R.id.tv_home_I:
                break;
            case R.id.ll_home_I:
                break;
            case R.id.ll_home_bottom_item:
                break;
            case R.id.activity_car_type:
                break;
        }
    }


    /**
     * 初始化popupwindow
     */
    public void initPopupWindow() {
        View view = getLayoutInflater().inflate(R.layout.layout_popup_item, null);
        popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup
                .LayoutParams.WRAP_CONTENT, true);//构造方法设置为True表明点击空白的位置popup会消失
        //findViewById前面的view不能少，不然会报错(EGL_BAD_MATCH)
        TextView tv1 = (TextView) view.findViewById(R.id.tv_all);
        TextView tv2 = (TextView) view.findViewById(R.id.tv_courier);
        TextView tv3 = (TextView) view.findViewById(R.id.tv_express_outlets);
        TextView tv4 = (TextView) view.findViewById(R.id.tv_run_people);
        TextView tv5 = (TextView) view.findViewById(R.id.tv_local_city_car);
        TextView tv6 = (TextView) view.findViewById(R.id.tv_long_distant_car);
        TextView tv7 = (TextView) view.findViewById(R.id.tv_logistics_network);
        TextView tv8 = (TextView) view.findViewById(R.id.tv_my_favorite);
        LinearLayout ll1 = (LinearLayout) view.findViewById(R.id.ll_all);
        LinearLayout ll2 = (LinearLayout) view.findViewById(R.id.ll_courier);
        LinearLayout ll3 = (LinearLayout) view.findViewById(R.id.ll_express_outlets);
        LinearLayout ll4 = (LinearLayout) view.findViewById(R.id.ll_run_people);
        LinearLayout ll5 = (LinearLayout) view.findViewById(R.id.ll_local_city_car);
        LinearLayout ll6 = (LinearLayout) view.findViewById(R.id.ll_long_distant_car);
        LinearLayout ll7 = (LinearLayout) view.findViewById(R.id.ll_logistics_network);
        LinearLayout ll8 = (LinearLayout) view.findViewById(R.id.ll_my_favorite);

        tv1.setOnClickListener(onClickListener);
        tv2.setOnClickListener(onClickListener);
        tv3.setOnClickListener(onClickListener);
        tv4.setOnClickListener(onClickListener);
        tv5.setOnClickListener(onClickListener);
        tv6.setOnClickListener(onClickListener);
        tv7.setOnClickListener(onClickListener);
        tv8.setOnClickListener(onClickListener);
        ll1.setOnClickListener(onClickListener);
        ll2.setOnClickListener(onClickListener);
        ll3.setOnClickListener(onClickListener);
        ll4.setOnClickListener(onClickListener);
        ll5.setOnClickListener(onClickListener);
        ll6.setOnClickListener(onClickListener);
        ll7.setOnClickListener(onClickListener);
        ll8.setOnClickListener(onClickListener);

    }

    /**
     * popupwindow点击事件
     */
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.tv_all:
                case R.id.ll_all:
                    initListView();
                    break;
                case R.id.tv_courier:
                case R.id.ll_courier:
                    break;
                case R.id.tv_express_outlets:
                case R.id.ll_express_outlets:
                    break;
                case R.id.tv_run_people:
                case R.id.ll_run_people:
                    break;
                case R.id.tv_local_city_car:
                case R.id.ll_local_city_car:
                    break;
                case R.id.tv_long_distant_car:
                case R.id.ll_long_distant_car:
                    break;
                case R.id.tv_logistics_network:
                case R.id.ll_logistics_network:
                    break;
                case R.id.tv_my_favorite:
                case R.id.ll_my_favorite:
                    break;
            }
            popupWindow.dismiss();
        }

    };

}


//    private LinearLayout layout;
//    private ListView listView;
//    private PopupWindow popupWindow;
//    private String title[] = {"全部", "快递员", "快递网点", "跑腿人员", "同城货运", "长途货车", "物流网点", "我的收藏"};

//    public void showPopupWindow(View parent) {
//        //加载布局
//        layout = (LinearLayout) LayoutInflater.from(CarTypeActivity.this).inflate(
//                R.layout.cartype_popup_listview, null);
//        //找到布局的控件
////        listView = (ListView) layout.findViewById(R.id.lv_dialog);
//        //设置适配器
//        listView.setAdapter(new ArrayAdapter<String>(CarTypeActivity.this,
//                R.layout.cartype_popup_listview_item, R.id.tv_popup_item, title));
//        // 实例化popupWindow
//        popupWindow = new PopupWindow(layout, 200, 500);
//        //控制键盘是否可以获得焦点
//        popupWindow.setFocusable(true);
//        //设置popupWindow弹出窗体的背景
//        popupWindow.setBackgroundDrawable(new BitmapDrawable(null, ""));
//        WindowManager manager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
//        @SuppressWarnings("deprecation")
//        //获取xoff
//                int xpos = manager.getDefaultDisplay().getWidth() / 2 - popupWindow.getWidth() / 2;
//        //xoff,yoff基于anchor的左下角进行偏移。
//        popupWindow.showAsDropDown(parent);
//        //监听
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
//                                    long arg3) {
//                //关闭popupWindow
//                popupWindow.dismiss();
//                popupWindow = null;
//            }
//        });
//    }