package com.lisa.administrator.sixgold.fragment.myorder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.mine.MyOrderNewActivity;
import com.lisa.administrator.sixgold.activity.order.OrderStatusDetailsActivity;
import com.lisa.administrator.sixgold.adapter.OrderDetailsListviewAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;


public class OrderTypeFragment extends Fragment {
    @BindView(R.id.lv_order_type)
    ListView lvOrderType;
    private OrderDetailsListviewAdapter orderDetailsListviewAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_order_type, container, false);
        ButterKnife.bind(this, view);
        initListView();
        return view;
    }

    private void initListView() {
        if (orderDetailsListviewAdapter == null) {
            orderDetailsListviewAdapter = new OrderDetailsListviewAdapter(getContext());
        }
        lvOrderType.setAdapter(orderDetailsListviewAdapter);
        lvOrderType.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ((MyOrderNewActivity) getActivity()).openActivity(OrderStatusDetailsActivity.class);
            }
        });
    }

}
