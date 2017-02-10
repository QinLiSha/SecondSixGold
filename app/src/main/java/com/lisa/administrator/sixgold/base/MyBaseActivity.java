package com.lisa.administrator.sixgold.base;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bigkoo.pickerview.OptionsPickerView;
import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.bean.ProvinceBean;
import com.lisa.administrator.sixgold.json.JsonFileReader;
import com.lisa.administrator.sixgold.view.ActionBarOneImg;
import com.lisa.administrator.sixgold.view.ActionBarTwoImg;
import com.zhy.autolayout.AutoLayoutActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.Unbinder;

/**
 * Created by One Of A Kind Lisa on 2016/12/10
 */

public class MyBaseActivity<T> extends AutoLayoutActivity {
    private static final String TAG = "MyBaseActivity";
    private Toast toast;
    private static int screenW, screenH;
    private Dialog dialog;
    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        screenW = getWindowManager().getDefaultDisplay().getWidth();
        screenH = getWindowManager().getDefaultDisplay().getWidth();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        unbinder.unbind();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    /**
     * =========================
     * 公共功能的封装
     * =========================
     */
    public void showToast(String msg) {
        if (toast == null)
            toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setText(msg);
        toast.show();

    }

    public void openActivity(Class<?> pClass) {
        openActivity(pClass, null, null);
    }

    public void openActivity(Class<?> pClass, Bundle bundle) {
        openActivity(pClass, bundle, null);
    }

    public void openActivity(Class<?> pClass, Bundle bundle, Uri uri) {
        Intent intent = new Intent(this, pClass);
        if (bundle != null)
            intent.putExtras(bundle);
        if (uri != null)
            intent.setData(uri);
        startActivity(intent);
        //增加动画
//        overridePendingTransition(R.anim.anim_activity_bottom_in, R.anim.anim_activity_botton_out);
//        overridePendingTransition(R.anim.anim_activity_right_in, R.anim.anim_activity_right_out);
    }

    public void showLoadingDialog(Context context, String msg, boolean cancel) {
        View view = LayoutInflater.from(context).inflate(R.layout.loading_dialog, null);//加载一个自定义的布局
        LinearLayout layout = (LinearLayout) view.findViewById(R.id.ll_dialog_view);
        ImageView iv = (ImageView) view.findViewById(R.id.iv_loading_img);
        TextView tv = (TextView) view.findViewById(R.id.tv_loading_msg);
        Animation roatAnim = AnimationUtils.loadAnimation(context, R.anim.loading_animation);//设置一个动画
        iv.setAnimation(roatAnim);
        if (null != msg) {
            tv.setText(msg);
        }
        dialog = new Dialog(context, R.style.loading_dialog);//设置dialog的样式
        dialog.setContentView(layout, new LinearLayout.LayoutParams(ViewGroup.LayoutParams
                .MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        dialog.show();
    }

    /**
     * 拨打电话的功能
     */
    public void dialByPhoneNumber(long phonenumber){
        // TODO: 2017/1/21 直接拨打客服电话
        Intent intent = new Intent(Intent.ACTION_DIAL);
        Uri data = Uri.parse("tel:" + phonenumber);
        intent.setData(data);
        startActivity(intent);
    }

    /**
     * 有2个ImageView的ActionBar
     *
     * @param leftId
     * @param title
     * @param rightId
     * @param onClickListener
     */
    public void initActionBarTwoImg(int leftId, String title, int rightId, View.OnClickListener onClickListener) {
        ActionBarTwoImg actionBarTwoImg = (ActionBarTwoImg) findViewById(R.id.actionbarView_twoImg);
        actionBarTwoImg.initActionBarTwoImg(leftId, title, rightId, onClickListener);//调用ActionBarTwoImg里面的initActionBarTwoImg方法
//        ActionBarViewOneImg actionBarViewOneImg = findViewById(R.id.action)
//        imageview_left_twoImg = (ImageView) findViewById(R.id.iv_left_actionbar_two_img);
//        imageview_right_twoImg = (ImageView) findViewById(R.id.iv_right_actionbar_two_img);
//        textview_title_twoImg = (TextView) findViewById(R.id.tv_title_actionbar_two_img);
//
//        if (leftId == -1) {
//            imageview_left_twoImg.setVisibility(View.INVISIBLE);
//        } else {
//            imageview_left_twoImg.setVisibility(View.VISIBLE);
//            imageview_left_twoImg.setImageResource(leftId);
//        }
//        if (TextUtils.isEmpty(title)) {
//            textview_title_twoImg.setVisibility(View.INVISIBLE);
//        } else {
//            textview_title_twoImg.setVisibility(View.VISIBLE);
//            textview_title_twoImg.setText(title);
//        }
//        if (rightId == -1) {
//            imageview_right_twoImg.setVisibility(View.INVISIBLE);
//        } else {
//            imageview_right_twoImg.setVisibility(View.VISIBLE);
//            imageview_right_twoImg.setImageResource(rightId);
//        }
    }


    /**
     * 有一个ImageView和一个TextView的ActionBar
     *
     * @param leftId
     * @param title
     * @param rightString
     * @param onClickListener
     */
    public void initActionBarOneImg(int leftId, String title, String rightString, View.OnClickListener onClickListener) {
        ActionBarOneImg actionBarOneImg = (ActionBarOneImg) findViewById(R.id.actionbarView_oneImg);
        actionBarOneImg.initActionBarOneImg(leftId, title, rightString, onClickListener);//调用ActionBarOneImg里面的initActionBarOneImg方法
//        imageview_left_oneImg = (ImageView) findViewById(R.id.iv_left_actionbar_one_img);
//        textview_right_oneImg = (TextView) findViewById(R.id.tv_right_actionbar_one_img);
//        textview_title_oneImg = (TextView) findViewById(R.id.tv_title_actionbar_one_img);
//        //左边的Img
//        if (leftId == -1) {
//            imageview_left_oneImg.setVisibility(View.INVISIBLE);
//        } else {
//            imageview_left_oneImg.setVisibility(View.VISIBLE);
//            imageview_left_oneImg.setImageResource(leftId);
//        }
//        //中间的标题title
//        if (TextUtils.isEmpty(title)) {
//            textview_title_oneImg.setVisibility(View.INVISIBLE);
//        } else {
//            textview_title_oneImg.setVisibility(View.VISIBLE);
//            textview_title_oneImg.setText(title);
//        }
//        //右边的文字
//        if (TextUtils.isEmpty(rightString)) {
//            textview_right_oneImg.setVisibility(View.INVISIBLE);
//        } else {
//            textview_right_oneImg.setVisibility(View.VISIBLE);
//            textview_right_oneImg.setText(title);
//        }
    }

    /**************************************************************************************************
     * 下面的方法需要的一些初始化的控件(仿ios的三级联动地址)
     */
    OptionsPickerView pvOptions;
    //  省份
    ArrayList<ProvinceBean> provinceBeanList = new ArrayList<>();
    //  城市
    ArrayList<String> cities;
    ArrayList<List<String>> cityList = new ArrayList<>();
    //  区/县
    ArrayList<String> district;
    ArrayList<List<String>> districts;
    ArrayList<List<List<String>>> districtList = new ArrayList<>();

    /**
     * 每一次点击时将textView初始化(省市区都显示)
     */
    public void initAddress_all(final TextView textView) {
        //  创建选项选择器
        pvOptions = new OptionsPickerView(this);
        //  获取json数据
        String province_data_json = JsonFileReader.getJson(this, "province_data.json");
        //  解析json数据
        parseJson(province_data_json);
        //  设置三级联动效果
        pvOptions.setPicker(provinceBeanList, cityList, districtList, true);
        //  设置选择的三级单位
        //pvOptions.setLabels("省", "市", "区");
        //pvOptions.setTitle("选择城市");
        //  设置是否循环滚动
        pvOptions.setCyclic(false, false, false);
        // 设置默认选中的三级项目
        pvOptions.setSelectOptions(0, 0, 0);
        //  监听确定选择按钮
        pvOptions.setOnoptionsSelectListener(new OptionsPickerView.OnOptionsSelectListener() {
            @Override
            public void onOptionsSelect(int options1, int option2, int options3) {
                //返回的分别是三个级别的选中位置
                String city = provinceBeanList.get(options1).getPickerViewText();
                String address;
                //  如果是直辖市或者特别行政区只设置市和区/县
                //****************************************下面是省市区都显示的**************************************************/
                if ("北京市".equals(city) || "上海市".equals(city) || "天津市".equals(city) || "重庆市".equals(city) || "澳门".equals(city) || "香港".equals(city)) {
                    address = provinceBeanList.get(options1).getPickerViewText()
                            + " " + districtList.get(options1).get(option2).get(options3);
                } else {
                    address = provinceBeanList.get(options1).getPickerViewText()
                            + " " + cityList.get(options1).get(option2)
                            + " " + districtList.get(options1).get(option2).get(options3);
                }
            }
        });
        pvOptions.show();
    }
    /**
     * 每一次点击时将textView初始化(只显示省)
     */
    public void initAddress_province(final TextView textView) {
        //  创建选项选择器
        pvOptions = new OptionsPickerView(this);
        //  获取json数据
        String province_data_json = JsonFileReader.getJson(this, "province_data.json");
        //  解析json数据
        parseJson(province_data_json);
        //  设置三级联动效果
        pvOptions.setPicker(provinceBeanList, cityList, districtList, true);
        //  设置选择的三级单位
        //pvOptions.setLabels("省", "市", "区");
        //pvOptions.setTitle("选择城市");
        //  设置是否循环滚动
        pvOptions.setCyclic(false, false, false);
        // 设置默认选中的三级项目
        pvOptions.setSelectOptions(0, 0, 0);
        //  监听确定选择按钮
        pvOptions.setOnoptionsSelectListener(new OptionsPickerView.OnOptionsSelectListener() {
            @Override
            public void onOptionsSelect(int options1, int option2, int options3) {
                //返回的分别是三个级别的选中位置
                String city = provinceBeanList.get(options1).getPickerViewText();
                String address;
                //  如果是直辖市或者特别行政区只设置市和区/县
                //**********************************************下面是只显示省的********************************************/
                if ("北京市".equals(city) || "上海市".equals(city) || "天津市".equals(city) || "重庆市".equals(city) || "澳门".equals(city) || "香港".equals(city)) {
                    address = provinceBeanList.get(options1).getPickerViewText();
                } else {
                    address = provinceBeanList.get(options1).getPickerViewText();
                }
                textView.setText(address);
            }
        });
        pvOptions.show();
    }
    /**
     * 每一次点击时将textView初始化(只显示市)
     */
    public void initAddress_city(final TextView textView) {
        //  创建选项选择器
        pvOptions = new OptionsPickerView(this);
        //  获取json数据
        String province_data_json = JsonFileReader.getJson(this, "province_data.json");
        //  解析json数据
        parseJson(province_data_json);
        //  设置三级联动效果
        pvOptions.setPicker(provinceBeanList, cityList, districtList, true);
        //  设置选择的三级单位
        //pvOptions.setLabels("省", "市", "区");
        //pvOptions.setTitle("选择城市");
        //  设置是否循环滚动
        pvOptions.setCyclic(false, false, false);
        // 设置默认选中的三级项目
        pvOptions.setSelectOptions(0, 0, 0);
        //  监听确定选择按钮
        pvOptions.setOnoptionsSelectListener(new OptionsPickerView.OnOptionsSelectListener() {
            @Override
            public void onOptionsSelect(int options1, int option2, int options3) {
                //返回的分别是三个级别的选中位置
                String city = provinceBeanList.get(options1).getPickerViewText();
                String address;
                //  如果是直辖市或者特别行政区只设置市和区/县

                //**********************************************下面是只显示市的********************************************/
                if ("北京市".equals(city) || "上海市".equals(city) || "天津市".equals(city) || "重庆市".equals(city) || "澳门".equals(city) || "香港".equals(city)) {
                    address = provinceBeanList.get(options1).getPickerViewText();
                } else {
                    address =cityList.get(options1).get(option2);
                }
                textView.setText(address);
            }
        });
        pvOptions.show();
    }
    /**
     * 每一次点击时将textView初始化(只显示区)
     */
    public void initAddress_district(final TextView textView) {
        //  创建选项选择器
        pvOptions = new OptionsPickerView(this);
        //  获取json数据
        String province_data_json = JsonFileReader.getJson(this, "province_data.json");
        //  解析json数据
        parseJson(province_data_json);
        //  设置三级联动效果
        pvOptions.setPicker(provinceBeanList, cityList, districtList, true);
        //  设置选择的三级单位
        //pvOptions.setLabels("省", "市", "区");
        //pvOptions.setTitle("选择城市");
        //  设置是否循环滚动
        pvOptions.setCyclic(false, false, false);
        // 设置默认选中的三级项目
        pvOptions.setSelectOptions(0, 0, 0);
        //  监听确定选择按钮
        pvOptions.setOnoptionsSelectListener(new OptionsPickerView.OnOptionsSelectListener() {
            @Override
            public void onOptionsSelect(int options1, int option2, int options3) {
                //返回的分别是三个级别的选中位置
                String city = provinceBeanList.get(options1).getPickerViewText();
                String address;
                //  如果是直辖市或者特别行政区只设置市和区/县

                //**********************************************下面是只显示区的********************************************/
                if ("北京市".equals(city) || "上海市".equals(city) || "天津市".equals(city) || "重庆市".equals(city) || "澳门".equals(city) || "香港".equals(city)) {
                    address =districtList.get(options1).get(option2).get(options3);
                } else {
                    address =districtList.get(options1).get(option2).get(options3);
                }
                textView.setText(address);
            }
        });
        pvOptions.show();
    }
    //  解析json填充集合
    public void parseJson(String str) {
        try {
            //  获取json中的数组
            JSONArray jsonArray = new JSONArray(str);
            //  遍历数据组
            for (int i = 0; i < jsonArray.length(); i++) {
                //  获取省份的对象
                JSONObject provinceObject = jsonArray.optJSONObject(i);
                //  获取省份名称放入集合
                String provinceName = provinceObject.getString("name");
                provinceBeanList.add(new ProvinceBean(provinceName));
                //  获取城市数组
                JSONArray cityArray = provinceObject.optJSONArray("city");
                cities = new ArrayList<>();//   声明存放城市的集合
                districts = new ArrayList<>();//声明存放区县集合的集合
                //  遍历城市数组
                for (int j = 0; j < cityArray.length(); j++) {
                    //  获取城市对象
                    JSONObject cityObject = cityArray.optJSONObject(j);
                    //  将城市放入集合
                    String cityName = cityObject.optString("name");
                    cities.add(cityName);
                    district = new ArrayList<>();// 声明存放区县的集合
                    //  获取区县的数组
                    JSONArray areaArray = cityObject.optJSONArray("area");
                    //  遍历区县数组，获取到区县名称并放入集合
                    for (int k = 0; k < areaArray.length(); k++) {
                        String areaName = areaArray.getString(k);
                        district.add(areaName);
                    }
                    //  将区县的集合放入集合
                    districts.add(district);
                }
                //  将存放区县集合的集合放入集合
                districtList.add(districts);
                //  将存放城市的集合放入集合
                cityList.add(cities);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    /***三级联动公共方法结束 ************************************************************************/
}
