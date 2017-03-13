package com.lisa.administrator.sixgold.activity.home;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.MapView;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MarkerOptions;
import com.lisa.administrator.sixgold.BuildConfig;
import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.LoginActivity;
import com.lisa.administrator.sixgold.activity.mine.MineNoticeActivity;
import com.lisa.administrator.sixgold.activity.order.ToPlaceOrderActivity;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewHomeActivity extends MyBaseActivity {
    //    @BindView(R.id.iv_current_city)
//    ImageView ivCurrentCity;
    @BindView(R.id.ll_current_city)
    LinearLayout llCurrentCity;
    @BindView(R.id.iv_weather)
    ImageView ivWeather;
    @BindView(R.id.tv_weather)
    TextView tvWeather;
    @BindView(R.id.ll_weather)
    LinearLayout llWeather;
    @BindView(R.id.iv_notice)
    ImageView ivNotice;
    //    @BindView(R.id.tv_notice)
//    TextView tvNotice;
    @BindView(R.id.tv_rolling_word)
    TextView tvRollingWord;
    @BindView(R.id.ll_tv_rolling_word)
    LinearLayout llTvRollingWord;
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
    @BindView(R.id.activity_new_home)
    LinearLayout activityNewHome;
    @BindView(R.id.tv_current_city)
    TextView tvCurrentCity;
    @BindView(R.id.ll_notice)
    LinearLayout llNotice;
    @BindView(R.id.iv_home_mail_list)
    ImageView ivHomeMailList;
    @BindView(R.id.tv_home_mail_list)
    TextView tvHomeMailList;
    @BindView(R.id.ll_home_mail_list)
    LinearLayout llHomeMailList;
    @BindView(R.id.mv_home_mapView)
    MapView mvHomeMapView;
    private static final String TAG = "NewHomeActivity";
    @BindView(R.id.iv_home_current_location)
    ImageView ivHomeCurrentLocation;
    @BindView(R.id.tv_to_order)
    TextView tvToOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_home);
        ButterKnife.bind(this);
        mvHomeMapView.onCreate(savedInstanceState);//在activity执行onCreate时执行mvHomeMapView.onCreate(savedInstanceState)，创建地图
        initView();//初始化定位
    }

    /*************
     * 地图的配置****以下
     ******************************************************************************************************************/

    private AMapLocationClient mLocationClient;    //声明AMapLocationClient类对象
    private AMapLocationClientOption mLocationOption;    //声明AMapLocationClientOption对象
    private AMap aMap;
    private double lat;
    private double lon;

    //初始化定位
    private void initView() {
        mLocationClient = new AMapLocationClient(getApplicationContext());
        mLocationClient.setLocationListener(mLocationListener);//设置定位回调监听
        mLocationOption = new AMapLocationClientOption();//初始化AMapLocationClientOption对象，初始化定位参数
        if (aMap == null) {
            aMap = mvHomeMapView.getMap();//初始化AMap对象
        }
        setUpMap();
    }

    /**
     * 配置定位参数
     */
    private void setUpMap() {
        mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);//设置定位模式为高精度模式，Battery_Saving为低功耗模式，Device_Sensors是仅设备模式
        mLocationOption.setNeedAddress(true);   //设置是否返回地址信息（默认返回地址信息）
        mLocationOption.setOnceLocation(true);        //设置是否只定位一次,默认为false
        // TODO: 2017/2/28
//        mLocationOption.setWifiScan(true); //设置是否强制刷新WIFI，默认为强制刷新
        mLocationOption.setWifiActiveScan(true);        //设置是否强制刷新WIFI，默认为强制刷新//已经过时
        mLocationOption.setMockEnable(false);        //设置是否允许模拟位置,默认为false，不允许模拟位置
        mLocationOption.setInterval(2000000000);        //设置定位间隔,单位毫秒,默认为2000ms
        mLocationClient.setLocationOption(mLocationOption); //给定位客户端对象设置定位参数
        mLocationClient.startLocation();        //启动定位
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mvHomeMapView.onDestroy(); //在activity执行onDestroy时执行mvHomeMapView.onDestroy()，销毁地图
    }

    @Override
    protected void onResume() {
        super.onResume();
        mvHomeMapView.onResume(); //在activity执行onResume时执行mvHomeMapView.onResume ()，重新绘制加载地图
    }

    @Override
    protected void onPause() {
        super.onPause();
        mvHomeMapView.onPause(); //在activity执行onPause时执行mvHomeMapView.onPause ()，暂停地图的绘制
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mvHomeMapView.onSaveInstanceState(outState);  //在activity执行onSaveInstanceState时执行mvHomeMapView.onSaveInstanceState (outState)，保存地图当前的状态
    }

    /**
     * 声明定位回调监听器
     */
    public AMapLocationListener mLocationListener = new AMapLocationListener() {
        @Override
        public void onLocationChanged(AMapLocation amapLocation) {
            if (amapLocation != null) {
                if (amapLocation.getErrorCode() == 0) {
                    //定位成功回调信息，设置相关消息
                    amapLocation.getLocationType();//获取当前定位结果来源，如网络定位结果，详见定位类型表
                    amapLocation.getLatitude();//获取纬度
                    amapLocation.getLongitude();//获取经度
                    amapLocation.getAccuracy();//获取精度信息
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    Date date = new Date(amapLocation.getTime());
                    df.format(date);//定位时间
                    amapLocation.getAddress();//地址，如果option中设置isNeedAddress为false，则没有此结果，网络定位结果中会有地址信息，GPS定位不返回地址信息。
                    amapLocation.getCountry();//国家信息
                    amapLocation.getProvince();//省信息
                    amapLocation.getCity();//城市信息
                    amapLocation.getDistrict();//城区信息
                    amapLocation.getStreet();//街道信息
                    amapLocation.getStreetNum();//街道门牌号信息
                    amapLocation.getCityCode();//城市编码
                    amapLocation.getAdCode();//地区编码
                    amapLocation.getAoiName();//获取当前定位点的AOI信息
                    lat = amapLocation.getLatitude();
                    lon = amapLocation.getLongitude();
                    tvCurrentCity.setText(amapLocation.getCity());
                    Log.e(TAG, "onLocationChanged: ===============================" + "lat : " + lat + " lon : " + lon);
                    Log.e(TAG, "onLocationChanged: =====================" + "Country : " + amapLocation.getCountry() + " province : " + amapLocation.getProvince() + " City : " + amapLocation.getCity() + " District : " + amapLocation.getDistrict());
                    Log.e("pcw", "lat : " + lat + " lon : " + lon);
                    Log.e("pcw", "Country : " + amapLocation.getCountry() + " province : " + amapLocation.getProvince() + " City : " + amapLocation.getCity() + " District : " + amapLocation.getDistrict());
                    // 设置当前地图显示为当前位置
                    aMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(lat, lon), 18));//后面的数字是定位地图的放大倍数
//                    aMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(lat, lon), 19));
                    MarkerOptions markerOptions = new MarkerOptions();
                    markerOptions.position(new LatLng(lat, lon));
                    markerOptions.title("当前位置");
                    markerOptions.visible(true); //本来写的是true
                    BitmapDescriptor bitmapDescriptor = BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_add_location_blue_24dp));
                    markerOptions.icon(bitmapDescriptor);
                    aMap.addMarker(markerOptions);
                } else {
                    //显示错误信息ErrCode是错误码，errInfo是错误信息，详见错误码表。
                    Log.e("AmapError", "location Error, ErrCode:"
                            + amapLocation.getErrorCode() + ", errInfo:"
                            + amapLocation.getErrorInfo());
                }
            }
        }
    };

    /*********************************************************************************************************************
     * *************************************地图的配置****以上
     *************************************************************/
    ///////////////////////////////////////////////权限方法以下//////////////////////////////////////////////////////////////////////////////////

    /**
     * 跳转到miui的权限管理页面
     */
    private void gotoMiuiPermission() {
        Intent i = new Intent("miui.intent.action.APP_PERM_EDITOR");
        ComponentName componentName = new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
        i.setComponent(componentName);
        i.putExtra("extra_pkgname", getPackageName());
        try {
            startActivity(i);
        } catch (Exception e) {
            e.printStackTrace();
            gotoMeizuPermission();
        }
    }

    /**
     * 跳转到魅族的权限管理系统
     */
    private void gotoMeizuPermission() {
        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        intent.putExtra("packageName", BuildConfig.APPLICATION_ID);
        try {
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            gotoHuaweiPermission();
        }
    }

    /**
     * 华为的权限管理页面
     */
    private void gotoHuaweiPermission() {
        try {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            ComponentName comp = new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity");//华为权限管理
            intent.setComponent(comp);
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            startActivity(getAppDetailSettingIntent());
        }

    }

    /**
     * 获取应用详情页面intent
     */
    private Intent getAppDetailSettingIntent() {
        Intent localIntent = new Intent();
        localIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        if (Build.VERSION.SDK_INT >= 9) {
            localIntent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            localIntent.setData(Uri.fromParts("package", getPackageName(), null));
        } else if (Build.VERSION.SDK_INT <= 8) {
            localIntent.setAction(Intent.ACTION_VIEW);
            localIntent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
            localIntent.putExtra("com.android.settings.ApplicationPkgName", getPackageName());
        }
        return localIntent;
    }

    ///////////////////////////////////////////////权限方法以上//////////////////////////////////////////////////////////////////////////////////
    //    R.id.tv_notice,R.id.iv_current_city,
    @OnClick({R.id.tv_current_city, R.id.ll_current_city, R.id.iv_weather, R.id.tv_weather, R.id.ll_weather,
            R.id.iv_home_current_location, R.id.tv_to_order,
            R.id.iv_notice, R.id.ll_notice, R.id.tv_rolling_word, R.id.ll_tv_rolling_word,
            R.id.iv_home_homepage, R.id.tv_home_homepage, R.id.ll_home_homepage, R.id.iv_car_type,
            R.id.tv_car_type, R.id.ll_car_type, R.id.iv_home_I, R.id.tv_home_I, R.id.ll_home_I, R.id.ll_home_bottom_item,
            R.id.activity_new_home, R.id.iv_home_mail_list, R.id.tv_home_mail_list, R.id.ll_home_mail_list})
    public void onClick(View view) {
        switch (view.getId()) {
//            case R.id.iv_current_city:
            case R.id.tv_current_city:
            case R.id.ll_current_city:
                showToast("当前的城市");
                break;
            case R.id.iv_weather:
            case R.id.tv_weather:
            case R.id.ll_weather:
//                initView();
                showToast("当前城市的天气");
//                openActivity(SuccessOrderActivity.class);
                break;
            case R.id.iv_notice:
//            case R.id.tv_notice:
            case R.id.ll_notice:
                showToast("消息提示");
                openActivity(MineNoticeActivity.class);
                break;
            case R.id.tv_rolling_word:
            case R.id.ll_tv_rolling_word:
                showToast("滚动字幕");
                break;
            case R.id.tv_to_order:
                openActivity(ToPlaceOrderActivity.class);
                break;
            case R.id.iv_home_current_location:
                initView();
                break;
            case R.id.iv_home_homepage:
            case R.id.tv_home_homepage:
            case R.id.ll_home_homepage:
//                openActivity(NewHomeActivity.class); //主页上的主页按钮就没有写点击事件
                break;
            case R.id.iv_car_type:
            case R.id.tv_car_type:
            case R.id.ll_car_type:
                finish();
                openActivity(CarTypeActivity.class);
                break;
            case R.id.iv_home_I:
            case R.id.tv_home_I:
            case R.id.ll_home_I:
                finish();
                openActivity(LoginActivity.class);
                break;
            case R.id.iv_home_mail_list:
            case R.id.tv_home_mail_list:
            case R.id.ll_home_mail_list:
                finish();
                openActivity(MailListActivity.class);
                break;
            case R.id.ll_home_bottom_item:
                break;
            case R.id.activity_new_home:
                break;
        }
    }


}