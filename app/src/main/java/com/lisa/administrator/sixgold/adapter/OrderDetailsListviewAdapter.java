package com.lisa.administrator.sixgold.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseAdapter;

/**
 * Created by One Of A Kind Lisa on 2017/2/9
 */

public class OrderDetailsListviewAdapter extends MyBaseAdapter {
    public OrderDetailsListviewAdapter(Context context) {
        super(context);
    }

    @Override
    public int getCount() {
        return 20;
//        return super.getCount();
    }

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
        //获得组件，实例化组件
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.layout_listview_item_myorder, null);
            vh = new ViewHolder();
            vh.tv_goods_from_address = (TextView) convertView.findViewById(R.id.tv_goods_from_address);
            vh.tv_goods_to_address = (TextView) convertView.findViewById(R.id.tv_goods_to_address);
            vh.tv_price_transport = (TextView) convertView.findViewById(R.id.tv_price_transport);
            vh.tv_add_price_transport = (TextView) convertView.findViewById(R.id.tv_add_price_transport);
            vh.tv_transport_type = (TextView) convertView.findViewById(R.id.tv_transport_type);
            vh.tv_transport_state = (TextView) convertView.findViewById(R.id.tv_transport_state);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();

        }
        vh.tv_add_price_transport.setText("250元");
        return convertView;
    }

    public class ViewHolder {
        TextView tv_goods_from_address, tv_goods_to_address, tv_price_transport, tv_add_price_transport, tv_transport_type, tv_transport_state;

    }
}
