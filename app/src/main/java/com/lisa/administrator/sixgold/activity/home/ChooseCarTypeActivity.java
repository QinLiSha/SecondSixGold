package com.lisa.administrator.sixgold.activity.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.adapter.GridViewSingleAdapter;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import java.util.ArrayList;

public class ChooseCarTypeActivity extends MyBaseActivity {
    private GridView gridView1;
    private GridViewSingleAdapter gridViewSingleAdapter1;
    private ArrayList<String> mList1;
    private Context mContext;
    private GridView gridView2;
    private GridViewSingleAdapter gridViewSingleAdapter2;
    private ArrayList<String> mList2;
    private Button button;
    private String name1 = "不限";
    private String name2 = "不限";
    public static final String KEY_CAR_TYPE_AND_LENGTH = "result_car_type_and_length";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_car_type);
        initActionBarTwoImg(-1, "车型车长", -1, null);
        initView();
        initViewCarLength();
        initViewCarType();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name1.equals("不限")) {
                    backCarInfo(name2);
                }
                if (name2.equals("不限")) {
                    backCarInfo(name1);
                }
                if (name1 != "不限" && name2 != "不限") {
                    backCarInfo(name1 + name2);
                }
// TODO: 2017/2/5
            }
        });
    }

    private void initView() {
        button = (Button) findViewById(R.id.btn_sure_choose_cartype);
    }


    /**
     * 初始化控件和添加数据上面的GridView
     */
    private void initViewCarLength() {
        mContext = this;
        gridView1 = (GridView) findViewById(R.id.gridView1);
        mList1 = new ArrayList<String>();
        //添加数据
//        for (int i = 1; i <= 32; i++) {
//            mList1.add("" + i);
//      }
        mList1.add("不限");
        mList1.add("4.2米");
        mList1.add("4.5米");
        mList1.add("6.2米");
        mList1.add("6.8米");
        mList1.add("7.2米");
        mList1.add("7.6米");
        mList1.add("8.2米");
        mList1.add("8.6米");
        mList1.add("9.6米");
        mList1.add("11.7米");
        mList1.add("12.5米");
        mList1.add("13米");
        mList1.add("13.5米");
        mList1.add("14米");
        mList1.add("15米");
        mList1.add("17米");
        mList1.add("17.5米");
        mList1.add("18米");
        gridViewSingleAdapter1 = new GridViewSingleAdapter(mList1, mContext);
        gridView1.setAdapter(gridViewSingleAdapter1);
        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                gridViewSingleAdapter1.setSelection(arg2);
                gridViewSingleAdapter1.notifyDataSetChanged();
                name1 = mList1.get(arg2);

//                int id1 = arg2;
//               可把获取到的字段作为参数传递
//                Toast.makeText(mContext, "你选择了" + name1 + ",第" + (arg2 + 1) + "个item",
//                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 初始化控件和添加数据下面的GridView
     */
    private void initViewCarType() {
        mContext = this;
        gridView2 = (GridView) findViewById(R.id.gridView2);
        mList2 = new ArrayList<String>();
        //添加数据
//        for (int i = 1; i <= 36; i++) {
//            mList2.add("" + i);
//        }
        mList2.add("不限");
        mList2.add("面包");
        mList2.add("平板");
        mList2.add("箱式");
        mList2.add("高低板");
        mList2.add("保温");
        mList2.add("冷藏");
        mList2.add("危险品");
        mList2.add("自卸车");
        mList2.add("中卡");

        gridViewSingleAdapter2 = new GridViewSingleAdapter(mList2, mContext);
        gridView2.setAdapter(gridViewSingleAdapter2);
        gridView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                gridViewSingleAdapter2.setSelection(arg2);
                gridViewSingleAdapter2.notifyDataSetChanged();
                name2 = mList2.get(arg2);
//                int id2 = arg2;
                //可把获取到的字段作为参数传递
//                Toast.makeText(mContext, "你选择了" + name2 + ",第" + (arg2 + 1) + "个item",
//                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void backCarInfo(String carInfo) {
        Intent data = new Intent();
        data.putExtra(KEY_CAR_TYPE_AND_LENGTH, carInfo);
        setResult(RESULT_OK, data);
        finish();
    }
}
