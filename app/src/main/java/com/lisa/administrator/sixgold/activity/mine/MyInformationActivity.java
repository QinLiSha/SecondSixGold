package com.lisa.administrator.sixgold.activity.mine;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.setting.MyAddressBookActivity;
import com.lisa.administrator.sixgold.base.MyBaseActivity;
import com.lisa.administrator.sixgold.tools.AvatarImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyInformationActivity extends MyBaseActivity {

    @BindView(R.id.tv_myinformation_headimg)
    TextView tvMyinformationHeadimg;
    @BindView(R.id.iv_myinformation_headimg)
    ImageView ivMyinformationHeadimg;
    @BindView(R.id.iv_myinformation_headimg_details)
    ImageView ivMyinformationHeadimgDetails;
    @BindView(R.id.ll_myinformation_headimg)
    LinearLayout llMyinformationHeadimg;
    @BindView(R.id.rl_myinformation_headimg)
    RelativeLayout rlMyinformationHeadimg;
    @BindView(R.id.tv_myinformation_name)
    TextView tvMyinformationName;
    @BindView(R.id.iv_myinformation_name_details)
    ImageView ivMyinformationNameDetails;
    @BindView(R.id.ll_myinformation_name)
    LinearLayout llMyinformationName;
    @BindView(R.id.tv_myinformation_name_left)
    TextView tvMyinformationNameLeft;
    @BindView(R.id.rl_myinformation_name)
    RelativeLayout rlMyinformationName;
    @BindView(R.id.tv_myinformation_birthday_left)
    TextView tvMyinformationBirthdayLeft;
    @BindView(R.id.tv_myinformation_birthday)
    TextView tvMyinformationBirthday;
    @BindView(R.id.iv_myinformation_birthday_details)
    ImageView ivMyinformationBirthdayDetails;
    @BindView(R.id.ll_myinformation_birthday)
    LinearLayout llMyinformationBirthday;
    @BindView(R.id.tv_myinformation_addaddress)
    TextView tvMyinformationAddaddress;
    @BindView(R.id.iv_myinformation_addaddress_details)
    ImageView ivMyinformationAddaddressDetails;
    @BindView(R.id.ll_myinformation_addaddress)
    LinearLayout llMyinformationAddaddress;
    @BindView(R.id.tv_myinformation_addaddress_left)
    TextView tvMyinformationAddaddressLeft;
    @BindView(R.id.rl_myinformation_addaddress)
    RelativeLayout rlMyinformationAddaddress;
    @BindView(R.id.btn_myinformation_sure)
    Button btnMyinformationSure;
    private AvatarImageView avatarImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_information);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "个人信息", -1, null);
        ImageView back = (ImageView) findViewById(R.id.iv_left_two_img);
        ButterKnife.bind(this);
        avatarImageView = (AvatarImageView) findViewById(R.id.avatarIv);
        avatarImageView.setAfterCropListener(new AvatarImageView.AfterCropListener() {
            @Override
            public void afterCrop(Bitmap photo) {
                Toast.makeText(MyInformationActivity.this, "设置新的头像成功", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //在拍照、选取照片、裁剪Activity结束后，调用的方法
        if (avatarImageView != null) {
            avatarImageView.onActivityResult(requestCode, resultCode, data);
        }
    }

    @OnClick({R.id.tv_myinformation_headimg, R.id.iv_myinformation_headimg, R.id.iv_myinformation_headimg_details, R.id.ll_myinformation_headimg, R.id.rl_myinformation_headimg, R.id.tv_myinformation_name, R.id.iv_myinformation_name_details, R.id.ll_myinformation_name, R.id.tv_myinformation_name_left, R.id.rl_myinformation_name, R.id.tv_myinformation_birthday_left, R.id.tv_myinformation_birthday, R.id.iv_myinformation_birthday_details, R.id.ll_myinformation_birthday, R.id.tv_myinformation_addaddress, R.id.iv_myinformation_addaddress_details, R.id.ll_myinformation_addaddress, R.id.tv_myinformation_addaddress_left, R.id.rl_myinformation_addaddress, R.id.btn_myinformation_sure})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_myinformation_headimg:
            case R.id.iv_myinformation_headimg:
            case R.id.iv_myinformation_headimg_details:
            case R.id.ll_myinformation_headimg:
            case R.id.rl_myinformation_headimg:
                // TODO: 2017/2/11 头像
                break;
            case R.id.tv_myinformation_name:
            case R.id.iv_myinformation_name_details:
            case R.id.ll_myinformation_name:
            case R.id.tv_myinformation_name_left:
            case R.id.rl_myinformation_name:
                // TODO: 2017/2/11 昵称 
                break;
            case R.id.tv_myinformation_birthday_left:
            case R.id.tv_myinformation_birthday:
            case R.id.iv_myinformation_birthday_details:
            case R.id.ll_myinformation_birthday:
                // TODO: 2017/2/11  生日
                break;
            case R.id.tv_myinformation_addaddress:
            case R.id.iv_myinformation_addaddress_details:
            case R.id.ll_myinformation_addaddress:
            case R.id.tv_myinformation_addaddress_left:
            case R.id.rl_myinformation_addaddress:
                // TODO: 2017/2/11  添加地址
                openActivity(MyAddressBookActivity.class);
                break;
            case R.id.btn_myinformation_sure:
                break;
        }
    }
}