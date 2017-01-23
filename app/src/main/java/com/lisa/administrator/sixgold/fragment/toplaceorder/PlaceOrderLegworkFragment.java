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
import com.lisa.administrator.sixgold.activity.toplaceorder.PlaceOrderLegworkActivity;


public class PlaceOrderLegworkFragment extends Fragment {
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_place_order_legwork, container, false);
        button = (Button) view.findViewById(R.id.button_legwork_sure);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PlaceOrderLegworkActivity.class);
                startActivity(intent);
            }
        });
    }
}
