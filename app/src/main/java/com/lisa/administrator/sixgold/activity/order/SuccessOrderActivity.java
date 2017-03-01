package com.lisa.administrator.sixgold.activity.order;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

public class SuccessOrderActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_order);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "下单成功", -1, null);
        initBack();
    }

    /********************************************************************************
     * 以下是返回ImageView
     ******************************************************************************/
    protected ImageView ivBack;

    private void initBack() {
        ivBack = (ImageView) findViewById(R.id.iv_left_two_img);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    /********************************************************************************
     *以上是返回ImageView
     ******************************************************************************/
}
