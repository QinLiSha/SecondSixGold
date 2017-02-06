package com.lisa.administrator.sixgold.fragment.toplaceorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.toplaceorder.PlaceOrderLocalCityActivity;

public class PlaceOrderLocalCityFragment extends Fragment {
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_place_order_local_city, container, false);
        button = (Button) view.findViewById(R.id.button_local_city_sure);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PlaceOrderLocalCityActivity.class);
                startActivity(intent);
            }
        });
    }
}
