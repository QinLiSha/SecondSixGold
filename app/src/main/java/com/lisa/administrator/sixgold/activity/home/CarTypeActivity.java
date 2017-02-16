package com.lisa.administrator.sixgold.activity.home;


import android.content.Intent;
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

import com.android.datetimepicker.date.DatePickerDialog;
import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.HomeLongDistanceFreightActivity;
import com.lisa.administrator.sixgold.activity.LoginActivity;
import com.lisa.administrator.sixgold.adapter.CarTypeListViewAdapter;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CarTypeActivity extends MyBaseActivity implements DatePickerDialog.OnDateSetListener {

    @BindView(R.id.tv_transport_type)
    TextView tvTransportType;
    @BindView(R.id.iv_transport_type_1)
    ImageView ivTransportType1;
    @BindView(R.id.rl_transport_type)
    RelativeLayout rlTransportType;
    @BindView(R.id.iv_date_1)
    ImageView ivDate1;
    @BindView(R.id.tv_date)
    TextView tvDate;
    @BindView(R.id.rl_date)
    RelativeLayout rlDate;
    @BindView(R.id.iv_home_mail_list)
    ImageView ivHomeMailList;
    @BindView(R.id.tv_home_mail_list)
    TextView tvHomeMailList;
    @BindView(R.id.ll_home_mail_list)
    LinearLayout llHomeMailList;
    private PopupWindow popupWindow_cartype;
    private PopupWindow popupWindow_transporttype;
    private CarTypeListViewAdapter carTypeListViewAdapter_all;
    private static final int REQUEST_CODE_CAR_TYPE_AND_LENGTH = 1;
    @BindView(R.id.lv_car_type_all)
    ListView lvCarTypeAll;
    @BindView(R.id.tv_from_address)
    TextView tvFromAddress;
    @BindView(R.id.iv_from_address_1)
    ImageView ivFromAddress1;
    @BindView(R.id.rl_from_address)
    RelativeLayout rlFromAddress;
    @BindView(R.id.tv_to_address)
    TextView tvToAddress;
    @BindView(R.id.iv_to_address_1)
    ImageView ivToAddress1;
    @BindView(R.id.rl_to_address)
    RelativeLayout rlToAddress;
    @BindView(R.id.tv_cartype_carlength)
    TextView tvCartypeCarlength;
    @BindView(R.id.iv_cartype_carlength_1)
    ImageView ivCartypeCarlength1;
    @BindView(R.id.rl_cartype_carlength)
    RelativeLayout rlCartypeCarlength;
    @BindView(R.id.tv_choose_type)
    TextView tvChooseType;
    @BindView(R.id.iv_choose_type_1)
    ImageView ivChooseType1;

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
        initDate();//初始化日历的方法
        initPopupWindowCarType();
        initPopupWindowTransportType();
    }


    /**
     * listview的初始化（车型的）
     */
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

    //重写onActivityResult方法
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == REQUEST_CODE_CAR_TYPE_AND_LENGTH && resultCode == RESULT_OK) {
            if (data != null) {
                String result = data.getStringExtra(ChooseCarTypeActivity.KEY_CAR_TYPE_AND_LENGTH);
                tvCartypeCarlength.setText(result);
            }
        }
    }


    @OnClick({R.id.tv_from_address, R.id.iv_from_address_1, R.id.rl_from_address, R.id.tv_to_address, R.id.iv_to_address_1,
            R.id.rl_to_address, R.id.tv_cartype_carlength, R.id.iv_cartype_carlength_1, R.id.rl_cartype_carlength, R.id.tv_choose_type,
            R.id.iv_choose_type_1, R.id.rl_choose_type, R.id.iv_home_homepage, R.id.tv_home_homepage, R.id.ll_home_homepage,
            R.id.tv_transport_type, R.id.iv_transport_type_1, R.id.rl_transport_type, R.id.iv_date_1, R.id.tv_date, R.id.rl_date,
            R.id.iv_car_type, R.id.tv_car_type, R.id.ll_car_type, R.id.iv_home_I, R.id.tv_home_I, R.id.ll_home_I, R.id.ll_home_bottom_item,
            R.id.iv_home_mail_list, R.id.tv_home_mail_list, R.id.ll_home_mail_list, R.id.activity_car_type})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_from_address:
            case R.id.iv_from_address_1:
            case R.id.rl_from_address:
                initAddress_district(tvFromAddress);
                break;
            case R.id.tv_to_address:
            case R.id.iv_to_address_1:
            case R.id.rl_to_address:
                initAddress_district(tvToAddress);
                break;
            case R.id.tv_cartype_carlength:
            case R.id.iv_cartype_carlength_1:
            case R.id.rl_cartype_carlength:
                Intent intent = new Intent(CarTypeActivity.this, ChooseCarTypeActivity.class);
                startActivityForResult(intent, REQUEST_CODE_CAR_TYPE_AND_LENGTH);
                break;
            case R.id.tv_transport_type:
            case R.id.iv_transport_type_1:
            case R.id.rl_transport_type:
                if (popupWindow_transporttype.isShowing()) {
                    popupWindow_transporttype.dismiss();
                } else if (popupWindow_transporttype != null) {
                    popupWindow_transporttype.showAsDropDown(tvTransportType, 0, 0);//最后一个是对距离网页标题栏的设置
                }
                break;
            case R.id.iv_date_1:
            case R.id.tv_date:
            case R.id.rl_date:
                // TODO: 2017/2/15 年月日
                DatePickerDialog.newInstance(this, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show(getFragmentManager(), "datePicker");
                break;
            case R.id.tv_choose_type:
            case R.id.iv_choose_type_1:
            case R.id.rl_choose_type:
                if (popupWindow_cartype.isShowing()) {
                    popupWindow_cartype.dismiss();
                } else if (popupWindow_cartype != null) {
                    popupWindow_cartype.showAsDropDown(tvChooseType, 0, 0);//最后一个是对距离网页标题栏的设置
                }
                break;
            case R.id.iv_home_homepage:
            case R.id.tv_home_homepage:
            case R.id.ll_home_homepage:
                openActivity(NewHomeActivity.class);
                break;
            case R.id.iv_car_type:
            case R.id.tv_car_type:
            case R.id.ll_car_type:
                // TODO: 2017/2/15 因为是车型界面上的车型，所以不设点击事件
//                openActivity(CarTypeActivity.class);
                break;
            case R.id.iv_home_I:
            case R.id.tv_home_I:
            case R.id.ll_home_I:
                openActivity(LoginActivity.class);
                break;
            case R.id.iv_home_mail_list:
            case R.id.tv_home_mail_list:
            case R.id.ll_home_mail_list:
                openActivity(MailListActivity.class);
                break;
        }
    }


    /**
     * 初始化popupwindow 车的类型（全部，同城，长途货运）
     */
    public void initPopupWindowCarType() {
        View view = getLayoutInflater().inflate(R.layout.layout_popup_item_cartype, null);
        popupWindow_cartype = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup
                .LayoutParams.WRAP_CONTENT, true);//构造方法设置为True表明点击空白的位置popup会消失
        //findViewById前面的view不能少，不然会报错(EGL_BAD_MATCH)
        TextView tv1 = (TextView) view.findViewById(R.id.tv_all_car_type);
        TextView tv2 = (TextView) view.findViewById(R.id.tv_local_city_car);
        TextView tv3 = (TextView) view.findViewById(R.id.tv_long_distant_car);
        LinearLayout ll1 = (LinearLayout) view.findViewById(R.id.ll_all_car_type);
        LinearLayout ll2 = (LinearLayout) view.findViewById(R.id.ll_local_city_car);
        LinearLayout ll3 = (LinearLayout) view.findViewById(R.id.ll_long_distant_car);
        tv1.setOnClickListener(onClickListener);
        tv2.setOnClickListener(onClickListener);
        tv3.setOnClickListener(onClickListener);
        ll1.setOnClickListener(onClickListener);
        ll2.setOnClickListener(onClickListener);
        ll3.setOnClickListener(onClickListener);
    }

    /**
     * 初始化popupwindow 运输类型（全部，往返，单程，中转）
     */
    public void initPopupWindowTransportType() {
        View view = getLayoutInflater().inflate(R.layout.layout_popup_item_transporttype, null);
        popupWindow_transporttype = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup
                .LayoutParams.WRAP_CONTENT, true);//构造方法设置为True表明点击空白的位置popup会消失
        TextView textView1 = (TextView) view.findViewById(R.id.tv_all_transport_type);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_go_and_back);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_one_way);
        TextView textView4 = (TextView) view.findViewById(R.id.tv_transship);
        LinearLayout linearLayout1 = (LinearLayout) view.findViewById(R.id.ll_all_transport_type);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.ll_go_and_back);
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.ll_one_way);
        LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.ll_transship);
        textView1.setOnClickListener(onClickListener);
        textView2.setOnClickListener(onClickListener);
        textView3.setOnClickListener(onClickListener);
        textView4.setOnClickListener(onClickListener);
        linearLayout1.setOnClickListener(onClickListener);
        linearLayout2.setOnClickListener(onClickListener);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout4.setOnClickListener(onClickListener);

    }

    /**
     * popupwindow点击事件
     */
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.tv_all_car_type:
                case R.id.ll_all_car_type:
                    initListView();
                    break;
                case R.id.tv_local_city_car:
                case R.id.ll_local_city_car:
                    break;
                case R.id.tv_long_distant_car:
                case R.id.ll_long_distant_car:
                    break;

                case R.id.tv_all_transport_type:
                case R.id.ll_all_transport_type:
                    initListView();
                    break;
                case R.id.tv_go_and_back:
                case R.id.ll_go_and_back:
                    break;
                case R.id.tv_one_way:
                case R.id.ll_one_way:
                    break;
                case R.id.tv_transship:
                case R.id.ll_transship:
                    break;
            }
            if (popupWindow_transporttype != null) {
                popupWindow_transporttype.dismiss();
            }
            if (popupWindow_cartype != null) {
                popupWindow_cartype.dismiss();
            }

        }
    };

    /*********************************************************************************************************************************************
     * 以下是选择date日历的方法
     */
    private Calendar calendar;
    private DateFormat dateFormat;
    private SimpleDateFormat timeFormat;
    private static final String TIME_PATTERN = "HH:mm";

    /**
     * initDate()需要写在create方法中
     */
    private void initDate() {
        calendar = Calendar.getInstance();
        dateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault());
        timeFormat = new SimpleDateFormat(TIME_PATTERN, Locale.getDefault());
        update();
    }


    private void update() {
        tvDate.setText(dateFormat.format(calendar.getTime()));
    }

    /**
     * @param dialog
     * @param year
     * @param monthOfYear
     * @param dayOfMonth
     */
    @Override
    public void onDateSet(DatePickerDialog dialog, int year, int monthOfYear, int dayOfMonth) {
        calendar.set(year, monthOfYear, dayOfMonth);
        update();
    }
    /**
     *以上是选择date日历的方法
     ********************************************************************************************************************************************/
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