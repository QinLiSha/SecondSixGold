package com.lisa.administrator.sixgold.activity.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.store.DangdangActivity;
import com.lisa.administrator.sixgold.activity.store.JingdongActivity;
import com.lisa.administrator.sixgold.activity.store.JumeiActivity;
import com.lisa.administrator.sixgold.activity.store.MogujieActivity;
import com.lisa.administrator.sixgold.activity.store.SuningActivity;
import com.lisa.administrator.sixgold.activity.store.TaoBaoActivity;
import com.lisa.administrator.sixgold.activity.store.TianMaoActivity;
import com.lisa.administrator.sixgold.activity.store.WeipinhuiActivity;
import com.lisa.administrator.sixgold.activity.store.YihaodianActivity;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyStoreActivity extends MyBaseActivity {


    @BindView(R.id.iv_my_store_taobao)
    ImageView ivMyStoreTaobao;
    @BindView(R.id.tv_my_store_taobao)
    TextView tvMyStoreTaobao;
    @BindView(R.id.ll_my_store_taobao)
    LinearLayout llMyStoreTaobao;
    @BindView(R.id.iv_my_store_tianmao)
    ImageView ivMyStoreTianmao;
    @BindView(R.id.tv_my_store_tianmao)
    TextView tvMyStoreTianmao;
    @BindView(R.id.ll_my_store_tianmao)
    LinearLayout llMyStoreTianmao;
    @BindView(R.id.iv_my_store_jingdong)
    ImageView ivMyStoreJingdong;
    @BindView(R.id.tv_my_store_jingdong)
    TextView tvMyStoreJingdong;
    @BindView(R.id.ll_my_store_jingdong)
    LinearLayout llMyStoreJingdong;
    @BindView(R.id.iv_my_store_yihaodian)
    ImageView ivMyStoreYihaodian;
    @BindView(R.id.tv_my_store_yihaodian)
    TextView tvMyStoreYihaodian;
    @BindView(R.id.ll_my_store_yihaodian)
    LinearLayout llMyStoreYihaodian;
    @BindView(R.id.iv_my_store_weipinhui)
    ImageView ivMyStoreWeipinhui;
    @BindView(R.id.tv_my_store_weipinhui)
    TextView tvMyStoreWeipinhui;
    @BindView(R.id.ll_my_store_weipinhui)
    LinearLayout llMyStoreWeipinhui;
    @BindView(R.id.iv_my_store_jumeiyoupin)
    ImageView ivMyStoreJumeiyoupin;
    @BindView(R.id.tv_my_store_jumeiyoupin)
    TextView tvMyStoreJumeiyoupin;
    @BindView(R.id.ll_my_store_jumeiyoupin)
    LinearLayout llMyStoreJumeiyoupin;
    @BindView(R.id.iv_my_store_mogujie)
    ImageView ivMyStoreMogujie;
    @BindView(R.id.tv_my_store_mogujie)
    TextView tvMyStoreMogujie;
    @BindView(R.id.ll_my_store_mogujie)
    LinearLayout llMyStoreMogujie;
    @BindView(R.id.iv_my_store_dangdang)
    ImageView ivMyStoreDangdang;
    @BindView(R.id.tv_my_store_dangdang)
    TextView tvMyStoreDangdang;
    @BindView(R.id.ll_my_store_dangdang)
    LinearLayout llMyStoreDangdang;
    @BindView(R.id.iv_my_store_suning)
    ImageView ivMyStoreSuning;
    @BindView(R.id.tv_my_store_suning)
    TextView tvMyStoreSuning;
    @BindView(R.id.ll_my_store_suning)
    LinearLayout llMyStoreSuning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_store);
        ButterKnife.bind(this);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "我的商城", -1, null);
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
    @OnClick({R.id.iv_my_store_taobao, R.id.tv_my_store_taobao, R.id.ll_my_store_taobao,
            R.id.iv_my_store_tianmao, R.id.tv_my_store_tianmao, R.id.ll_my_store_tianmao,
            R.id.iv_my_store_jingdong, R.id.tv_my_store_jingdong, R.id.ll_my_store_jingdong,
            R.id.iv_my_store_yihaodian, R.id.tv_my_store_yihaodian, R.id.ll_my_store_yihaodian,
            R.id.iv_my_store_weipinhui, R.id.tv_my_store_weipinhui, R.id.ll_my_store_weipinhui,
            R.id.iv_my_store_jumeiyoupin, R.id.tv_my_store_jumeiyoupin, R.id.ll_my_store_jumeiyoupin,
            R.id.iv_my_store_mogujie, R.id.tv_my_store_mogujie, R.id.ll_my_store_mogujie,
            R.id.iv_my_store_dangdang, R.id.tv_my_store_dangdang, R.id.ll_my_store_dangdang,
            R.id.iv_my_store_suning, R.id.tv_my_store_suning, R.id.ll_my_store_suning})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_my_store_taobao:
            case R.id.tv_my_store_taobao:
            case R.id.ll_my_store_taobao:
                openActivity(TaoBaoActivity.class);
                break;
            case R.id.iv_my_store_tianmao:
            case R.id.tv_my_store_tianmao:
            case R.id.ll_my_store_tianmao:
                openActivity(TianMaoActivity.class);
                break;
            case R.id.iv_my_store_jingdong:
            case R.id.tv_my_store_jingdong:
            case R.id.ll_my_store_jingdong:
                openActivity(JingdongActivity.class);
                break;
            case R.id.iv_my_store_yihaodian:
            case R.id.tv_my_store_yihaodian:
            case R.id.ll_my_store_yihaodian:
                openActivity(YihaodianActivity.class);
                break;
            case R.id.iv_my_store_weipinhui:
            case R.id.tv_my_store_weipinhui:
            case R.id.ll_my_store_weipinhui:
                openActivity(WeipinhuiActivity.class);
                break;
            case R.id.iv_my_store_jumeiyoupin:
            case R.id.tv_my_store_jumeiyoupin:
            case R.id.ll_my_store_jumeiyoupin:
                openActivity(JumeiActivity.class);
                break;
            case R.id.iv_my_store_mogujie:
            case R.id.tv_my_store_mogujie:
            case R.id.ll_my_store_mogujie:
                openActivity(MogujieActivity.class);
                break;
            case R.id.iv_my_store_dangdang:
            case R.id.tv_my_store_dangdang:
            case R.id.ll_my_store_dangdang:
                openActivity(DangdangActivity.class);
                break;
            case R.id.iv_my_store_suning:
            case R.id.tv_my_store_suning:
            case R.id.ll_my_store_suning:
                openActivity(SuningActivity.class);
                break;
        }
    }
}
