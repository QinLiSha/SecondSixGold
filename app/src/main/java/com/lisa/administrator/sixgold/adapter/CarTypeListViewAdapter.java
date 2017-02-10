package com.lisa.administrator.sixgold.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseAdapter;

/**
 * Created by One Of A Kind Lisa on 2017/1/10
 */

public class CarTypeListViewAdapter extends MyBaseAdapter {

    public CarTypeListViewAdapter(Context context) {
        super(context);
    }

    @Override
    public int getCount() {
        return 20;
//        return super.getCount();
    }

    @Override
    public Object getItem(int position) {
        return super.getItem(position);
    }

    /**
     * 获得某一位置的数据
     */

    /**
     * 获得唯一标识
     */
    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public View getMyView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
//        convertView = layoutInflater.inflate(R.layout.cartype_listview_courier_item, null);
//        vh = new ViewHolder();
//        vh.iv_car_people_img = (ImageView) convertView.findViewById(R.id.iv_car_people_img);
//        vh.tv_distance = (TextView) convertView.findViewById(R.id.tv_distance);
//        vh.tv_cartype = (TextView) convertView.findViewById(R.id.tv_cartype);
//        vh.tv_can_weight = (TextView) convertView.findViewById(R.id.tv_can_weight);
//        vh.tv_delivery_times = (TextView) convertView.findViewById(R.id.tv_delivery_times);
//        vh.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
//        vh.tv_rate_of_praise = (TextView) convertView.findViewById(R.id.tv_rate_of_praise);
//        convertView.setTag(vh);

        //获得组件，实例化组件
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.layout_listview_item_long_distance, null);
            vh = new ViewHolder();
            vh.iv_car_people_img = (ImageView) convertView.findViewById(R.id.iv_car_people_img);
            vh.tv_distance = (TextView) convertView.findViewById(R.id.tv_distance);
            vh.tv_cartype = (TextView) convertView.findViewById(R.id.tv_cartype);
            vh.tv_can_weight = (TextView) convertView.findViewById(R.id.tv_can_weight);
            vh.tv_delivery_times = (TextView) convertView.findViewById(R.id.tv_delivery_times);
            vh.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            vh.tv_rate_of_praise = (TextView) convertView.findViewById(R.id.tv_rate_of_praise);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        vh.iv_car_people_img.setBackgroundResource(R.mipmap.truck);
        vh.tv_distance.setText(300 + "米");
        vh.tv_cartype.setText("大卡车");
        vh.tv_can_weight.setText(2 + "吨");
        vh.tv_delivery_times.setText(2045 + "");
        vh.tv_name.setText("张师傅");
        vh.tv_rate_of_praise.setText(94 + "%");
//        vh.tv_cartype.setText(getItem(position).getSummary());
//        vh.tv_distance.setText(getItem(position).getTitle());
//        vh.tv_can_weight.setText(getItem(position).getStamp());
//        new MyImageLoader(context).display(getItem(position).getIcon(), vh.iv_car_people_img);
        return convertView;
    }

    public class ViewHolder {
        TextView tv_cartype, tv_distance, tv_can_weight, tv_delivery_times, tv_name, tv_rate_of_praise;
        ImageView iv_car_people_img;
    }
}
