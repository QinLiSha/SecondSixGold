package com.lisa.administrator.sixgold.activity.setting;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;
import com.lisa.administrator.sixgold.tools.DataCleanManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 设置中的通用activity
 */

public class SettingCurrencyActivity extends MyBaseActivity {

    @BindView(R.id.tv_clean_cache)
    TextView tvCleanCache;
    private static final String TAG = "SettingCurrencyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_currency);
        ButterKnife.bind(this);

        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "通用", -1, null);

        try {
            tvCleanCache.setText(DataCleanManager.getTotalCacheSize(this));
            Log.e(TAG, "onCreate: ++++++++++++++++++++++++++++++++++" + DataCleanManager.getTotalCacheSize(this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.tv_clean_cache)
    public void onClick() {
        DataCleanManager.clearAllCache(this);
        Toast.makeText(this, "缓存已清理", Toast.LENGTH_SHORT).show();
        tvCleanCache.setText("0.0Byte");
    }

}
