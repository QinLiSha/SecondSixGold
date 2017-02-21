package com.lisa.administrator.sixgold.activity.toplaceorder;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;
import com.lisa.administrator.sixgold.view.ChooseGoodsTypeGridItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PlaceOrderLegworkActivity extends MyBaseActivity implements AbsListView.MultiChoiceModeListener {
    TextView tv_legwork_pay_please_choose;
    PopupWindow popupWindow;
    private GridView mGridView_red; //物品的类型的gridview
    private GridAdapter mGridAdapterRed; //物品的类型的适配器
    private Button button_sure; //确定按钮
    private Button button_cancel; //确定按钮
    private Map mSelectMapRed = new HashMap(); //存放选择物品的类型的数字的集合
    ArrayList<String> mList;
    Map mImgIds_red = new HashMap(); //存放物品的类型的集合

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order_legwork);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "跑腿下单", -1, null);
        initPopupWindowChooseGoodsType();
        tv_legwork_pay_please_choose = (TextView) findViewById(R.id.tv_legwork_pay_please_choose);
        tv_legwork_pay_please_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (popupWindow.isShowing()) {
                    popupWindow.dismiss();
                } else if (popupWindow != null) {
//            popupWindow.showAsDropDown(tv_legwork_pay_please_choose, 0, 0);//最后一个是对距离控件tv_legwork_pay_please_choose的设置
                    popupWindow.showAtLocation(tv_legwork_pay_please_choose, Gravity.BOTTOM, 0, 0);
                }
            }
        });
    }

    public void initPopupWindowChooseGoodsType() {
        View view = getLayoutInflater().inflate(R.layout.layout_popup_item_choose_goods_type, null);
        /***********************************初始化popupwindow中的GridView*********************************************************************/
        mList = new ArrayList<String>();
        mList.add("普通");
        mList.add("其他");
        mList.add("美食");
        mList.add("文件");
        mList.add("易碎");
        mList.add("洗衣");
        mList.add("手机");
        mList.add("蛋糕");
        mList.add("鲜花");
        mList.add("贵重物品");
        mList.add("钥匙");
        /*********************************/
        mList.add("数码产品");
        mList.add("液体");
        mList.add("气球");
        mList.add("玩具");
        mList.add("玩偶");
        mList.add("生鲜");
        //显示物品的类型区域的图片
        for (int i = 0; i < mList.size(); i++) {
            mImgIds_red.put(i, R.drawable.gradview_item_box);
        }
        mGridView_red = (GridView) view.findViewById(R.id.gridview_choose_goods_type); //初始化物品的类型的gridview
        button_sure = (Button) view.findViewById(R.id.button_sure); //初始化确定按钮
        button_cancel = (Button) view.findViewById(R.id.button_cancel); //初始化取消按钮
        mGridView_red.setChoiceMode(GridView.CHOICE_MODE_MULTIPLE);// 设置为多选模式
        mGridAdapterRed = new GridAdapter(this); //为物品的类型new一个适配器
        mGridView_red.setAdapter(mGridAdapterRed);// 物品的类型数据适配
        mGridView_red.setMultiChoiceModeListener(this);// 设置物品的类型多选模式监听器
        popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup
                .LayoutParams.WRAP_CONTENT, true);//构造方法设置为True表明点击空白的位置popup会消失

        //findViewById前面的view不能少，不然会报错(EGL_BAD_MATCH)
//监听按钮
        button_sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringSelectedGoodsType = ""; //物品的类型
                List listSelectedGoodsType = new ArrayList(); //存放选中物品的类型的list
                SparseBooleanArray selectedposition_red;
                selectedposition_red = mGridView_red.getCheckedItemPositions();
                for (int i = 0; i < mImgIds_red.size(); i++) {
                    if (selectedposition_red.get(i)) {
                        listSelectedGoodsType.add(mList.get(i));//
                    }
                }
                for (int i = 0; i < listSelectedGoodsType.size(); i++) {
                    stringSelectedGoodsType = stringSelectedGoodsType + listSelectedGoodsType.get(i) + " ";
                }
                if (stringSelectedGoodsType != "") {
                    tv_legwork_pay_please_choose.setText(stringSelectedGoodsType);
                } else {
                    tv_legwork_pay_please_choose.setText("请选择");
                }
                if (popupWindow.isShowing()) {
                    popupWindow.dismiss();
                }
            }
        });
        button_cancel.setOnClickListener(new View.OnClickListener() {
            //点击取消按钮想要实现的是：
            // 1.popupwindow消失
            // 2.所有选中状态的item都变成没有选中的状态
            @Override
            public void onClick(View v) {
                tv_legwork_pay_please_choose.setText("请选择");
                if (popupWindow.isShowing()) {
                    popupWindow.dismiss();
                }
            }
        });
        /********************************************************************************************************/

    }

    ///////////////////////////////以下是GridView多选时重写的方法//////////////////////////////////////////////////////////////
    @Override
    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        return true;
    }


    @Override
    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        return true;
    }


    @Override
    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        return true;
    }


    @Override
    public void onDestroyActionMode(ActionMode mode) {
        mGridAdapterRed.notifyDataSetChanged();
    }


    @Override
    public void onItemCheckedStateChanged(ActionMode mode, int position,
                                          long id, boolean checked) {
        mSelectMapRed.put(position, checked);/* 放入选中的集合中 */
        mode.invalidate();
    }


    //适配器
    private class GridAdapter extends BaseAdapter {


        private Context mContext;


        public GridAdapter(Context ctx) {
            mContext = ctx;
        }


        @Override
        public int getCount() {
            return mImgIds_red.size();
        }


        @Override
        public Integer getItem(int position) {
            return Integer.valueOf(mImgIds_red.get(position).toString());
        }


        @Override
        public long getItemId(int position) {
            return position;
        }


        @Override
/* 得到View */
        public View getView(int position, View convertView, ViewGroup parent) {
            ChooseGoodsTypeGridItem item;
            if (convertView == null) {
                item = new ChooseGoodsTypeGridItem(mContext);
                item.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT,
                        AbsListView.LayoutParams.MATCH_PARENT));
            } else {
                item = (ChooseGoodsTypeGridItem) convertView;
            }
            item.setImgResId(getItem(position));
            item.setItemText(mList.get(position));
            item.setChecked(mSelectMapRed.get(position) == null ? false : (Boolean) mSelectMapRed.get(position));
            return item;
        }
    }

    //////////////////////////////////以上是GridView多选时重写的方法///////////////////////////////////////////////////////////////


}