package com.lisa.administrator.sixgold.view;

/**
 * Created by One Of A Kind Lisa on 2017/2/17
 * 自定义View继承Checable接口
 */


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.zhy.autolayout.AutoLinearLayout;

public class ChooseGoodsTypeGridItem extends AutoLinearLayout implements Checkable {
    private Context mContext;
    private boolean mChecked;//判断该选项是否被选上的标志量
    private ImageView mImgView = null; //点击前的图片
    private ImageView mSecletView = null; //点击后的图片
    private TextView mItemText = null; //显示的物品类型

    public ChooseGoodsTypeGridItem(Context context) {
        this(context, null, 0);
    }


    public ChooseGoodsTypeGridItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }


    public ChooseGoodsTypeGridItem(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mContext = context;
        LayoutInflater.from(mContext).inflate(R.layout.layout_gridview_item_choose_goods_type, this); //初始化item布局
        mImgView = (ImageView) findViewById(R.id.iv_tv_box); //初始化原始布局id
        mSecletView = (ImageView) findViewById(R.id.iv_tv_box_choosed); //物品类型背景的id
        mItemText = (TextView) findViewById(R.id.tv_itemText); //物品类型文字的id
    }

    @Override
    public void setChecked(boolean checked) {
// TODO Auto-generated method stub
        mChecked = checked;
        mSecletView.setVisibility(checked ? View.VISIBLE : View.GONE);//选上了图片变成选中状态
    }

    @Override
    public boolean isChecked() {
        return mChecked;
    }


    @Override
    public void toggle() {
        setChecked(!mChecked);
    }


    public void setImgResId(int resId) {
        if (mImgView != null) {
            mImgView.setBackgroundResource(resId);//设置背景
        }
    }

    public void setItemText(String itemText) {
        mItemText.setText(itemText); //设置文字
    }
}