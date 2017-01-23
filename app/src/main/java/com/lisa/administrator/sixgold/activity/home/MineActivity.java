package com.lisa.administrator.sixgold.activity.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.LoginActivity;
import com.lisa.administrator.sixgold.activity.MyOrderActivity;
import com.lisa.administrator.sixgold.activity.mine.AboutUsActivity;
import com.lisa.administrator.sixgold.activity.mine.CouponActivity;
import com.lisa.administrator.sixgold.activity.mine.MessagesActivity;
import com.lisa.administrator.sixgold.activity.mine.MyInformationActivity;
import com.lisa.administrator.sixgold.activity.mine.MyStoreActivity;
import com.lisa.administrator.sixgold.activity.mine.SettingActivity;
import com.lisa.administrator.sixgold.activity.mine.ShareToFriendActivity;
import com.lisa.administrator.sixgold.activity.mine.WalletActivity;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MineActivity extends MyBaseActivity {

    @BindView(R.id.iv_to_authenticate)
    ImageView ivToAuthenticate;
    @BindView(R.id.tv_to_authenticate)
    TextView tvToAuthenticate;
    @BindView(R.id.iv_to_authenticate_details)
    ImageView ivToAuthenticateDetails;
    @BindView(R.id.iv_my_head_image)
    ImageView ivMyHeadImage;
    @BindView(R.id.tv_my_name)
    TextView tvMyName;
    @BindView(R.id.iv_vip)
    ImageView ivVip;
    @BindView(R.id.tv_vip)
    TextView tvVip;
    @BindView(R.id.ll_my_information)
    LinearLayout llMyInformation;
    @BindView(R.id.iv_wallet)
    ImageView ivWallet;
    @BindView(R.id.tv_wallet)
    TextView tvWallet;
    @BindView(R.id.ll_wallet)
    LinearLayout llWallet;
    @BindView(R.id.iv_wallet_money)
    ImageView ivWalletMoney;
    @BindView(R.id.tv_wallet_money)
    TextView tvWalletMoney;
    @BindView(R.id.ll_wallet_money)
    LinearLayout llWalletMoney;
    @BindView(R.id.iv_wallet_coupon)
    ImageView ivWalletCoupon;
    @BindView(R.id.tv_ll_wallet_coupon)
    TextView tvLlWalletCoupon;
    @BindView(R.id.ll_wallet_coupon)
    LinearLayout llWalletCoupon;
    @BindView(R.id.iv_mine)
    ImageView ivMine;
    @BindView(R.id.tv_mine)
    TextView tvMine;
    @BindView(R.id.ll_mine)
    LinearLayout llMine;
    @BindView(R.id.iv_custom_service)
    ImageView ivCustomService;
    @BindView(R.id.tv_custom_service)
    TextView tvCustomService;
    @BindView(R.id.ll_mine_custom_service)
    LinearLayout llMineCustomService;
    @BindView(R.id.iv_mine_message)
    ImageView ivMineMessage;
    @BindView(R.id.tv_mine_message)
    TextView tvMineMessage;
    @BindView(R.id.ll_mine_message)
    LinearLayout llMineMessage;
    @BindView(R.id.iv_mine_share)
    ImageView ivMineShare;
    @BindView(R.id.tv_mine_share)
    TextView tvMineShare;
    @BindView(R.id.ll_mine_share)
    LinearLayout llMineShare;
    @BindView(R.id.iv_mine_store)
    ImageView ivMineStore;
    @BindView(R.id.tv_mine_store)
    TextView tvMineStore;
    @BindView(R.id.ll_mine_store)
    LinearLayout llMineStore;
    @BindView(R.id.iv_mine_star)
    ImageView ivMineStar;
    @BindView(R.id.tv_mine_star)
    TextView tvMineStar;
    @BindView(R.id.ll_mine_star)
    LinearLayout llMineStar;
    @BindView(R.id.iv_mine_order)
    ImageView ivMineOrder;
    @BindView(R.id.tv_mine_order)
    TextView tvMineOrder;
    @BindView(R.id.ll_mine_order)
    LinearLayout llMineOrder;
    @BindView(R.id.iv_mine_about_us)
    ImageView ivMineAboutUs;
    @BindView(R.id.tv_mine_about_us)
    TextView tvMineAboutUs;
    @BindView(R.id.ll_mine_about_us)
    LinearLayout llMineAboutUs;
    @BindView(R.id.iv_mine_setting)
    ImageView ivMineSetting;
    @BindView(R.id.tv_mine_setting)
    TextView tvMineSetting;
    @BindView(R.id.ll_mine_setting)
    LinearLayout llMineSetting;
    @BindView(R.id.iv_mine_honesty)
    ImageView ivMineHonesty;
    @BindView(R.id.tv_mine_honesty)
    TextView tvMineHonesty;
    @BindView(R.id.ll_mine_honesty)
    LinearLayout llMineHonesty;
    @BindView(R.id.iv_tools)
    ImageView ivTools;
    @BindView(R.id.tv_tools)
    TextView tvTools;
    @BindView(R.id.ll_tools)
    LinearLayout llTools;
    @BindView(R.id.iv_tools_insurance)
    ImageView ivToolsInsurance;
    @BindView(R.id.tv_tools_insurance)
    TextView tvToolsInsurance;
    @BindView(R.id.ll_tools_insurance)
    LinearLayout llToolsInsurance;
    @BindView(R.id.iv_tools_counter)
    ImageView ivToolsCounter;
    @BindView(R.id.tv_tools_counter)
    TextView tvToolsCounter;
    @BindView(R.id.ll_tools_counter)
    LinearLayout llToolsCounter;
    @BindView(R.id.iv_tools_nearby_service)
    ImageView ivToolsNearbyService;
    @BindView(R.id.tv_tools_nearby_service)
    TextView tvToolsNearbyService;
    @BindView(R.id.ll_tools_nearby_service)
    LinearLayout llToolsNearbyService;
    @BindView(R.id.iv_tools_games)
    ImageView ivToolsGames;
    @BindView(R.id.tv_tools_games)
    TextView tvToolsGames;
    @BindView(R.id.ll_tools_games)
    LinearLayout llToolsGames;
    @BindView(R.id.scrollView_mine)
    ScrollView scrollViewMine;
    @BindView(R.id.iv_home_homepage)
    ImageView ivHomeHomepage;
    @BindView(R.id.tv_home_homepage)
    TextView tvHomeHomepage;
    @BindView(R.id.ll_home_homepage)
    LinearLayout llHomeHomepage;
    @BindView(R.id.iv_car_type)
    ImageView ivCarType;
    @BindView(R.id.tv_car_type)
    TextView tvCarType;
    @BindView(R.id.ll_car_type)
    LinearLayout llCarType;
    @BindView(R.id.iv_home_I)
    ImageView ivHomeI;
    @BindView(R.id.tv_home_I)
    TextView tvHomeI;
    @BindView(R.id.ll_home_I)
    LinearLayout llHomeI;
    @BindView(R.id.iv_home_mail_list)
    ImageView ivHomeMailList;
    @BindView(R.id.tv_home_mail_list)
    TextView tvHomeMailList;
    @BindView(R.id.ll_home_mail_list)
    LinearLayout llHomeMailList;
    @BindView(R.id.ll_home_bottom_item)
    LinearLayout llHomeBottomItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        ButterKnife.bind(this);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "我的", -1, null);

    }

    @OnClick({R.id.iv_to_authenticate, R.id.tv_to_authenticate, R.id.iv_to_authenticate_details, R.id.iv_my_head_image, R.id.tv_my_name, R.id.iv_vip, R.id.tv_vip, R.id.ll_my_information, R.id.iv_wallet, R.id.tv_wallet, R.id.ll_wallet, R.id.iv_wallet_money, R.id.tv_wallet_money, R.id.ll_wallet_money, R.id.iv_wallet_coupon, R.id.tv_ll_wallet_coupon, R.id.ll_wallet_coupon, R.id.iv_mine, R.id.tv_mine, R.id.ll_mine, R.id.iv_custom_service, R.id.tv_custom_service, R.id.ll_mine_custom_service, R.id.iv_mine_message, R.id.tv_mine_message, R.id.ll_mine_message, R.id.iv_mine_share, R.id.tv_mine_share, R.id.ll_mine_share, R.id.iv_mine_store, R.id.tv_mine_store, R.id.ll_mine_store, R.id.iv_mine_star, R.id.tv_mine_star, R.id.ll_mine_star, R.id.iv_mine_order, R.id.tv_mine_order, R.id.ll_mine_order, R.id.iv_mine_about_us, R.id.tv_mine_about_us, R.id.ll_mine_about_us, R.id.iv_mine_setting, R.id.tv_mine_setting, R.id.ll_mine_setting, R.id.iv_mine_honesty, R.id.tv_mine_honesty, R.id.ll_mine_honesty, R.id.iv_tools, R.id.tv_tools, R.id.ll_tools, R.id.iv_tools_insurance, R.id.tv_tools_insurance, R.id.ll_tools_insurance, R.id.iv_tools_counter, R.id.tv_tools_counter, R.id.ll_tools_counter, R.id.iv_tools_nearby_service, R.id.tv_tools_nearby_service, R.id.ll_tools_nearby_service, R.id.iv_tools_games, R.id.tv_tools_games, R.id.ll_tools_games, R.id.scrollView_mine, R.id.iv_home_homepage, R.id.tv_home_homepage, R.id.ll_home_homepage, R.id.iv_car_type, R.id.tv_car_type, R.id.ll_car_type, R.id.iv_home_I, R.id.tv_home_I, R.id.ll_home_I, R.id.iv_home_mail_list, R.id.tv_home_mail_list, R.id.ll_home_mail_list, R.id.ll_home_bottom_item})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_to_authenticate:
            case R.id.tv_to_authenticate:
            case R.id.iv_to_authenticate_details:
            case R.id.iv_my_head_image:
            case R.id.tv_my_name:
            case R.id.iv_vip:
            case R.id.tv_vip:
            case R.id.ll_my_information:
                openActivity(MyInformationActivity.class);
                break;
//            case R.id.iv_wallet:
//            case R.id.tv_wallet:
//            case R.id.ll_wallet:
//                break;钱包的整个框架
            case R.id.iv_wallet_money:
            case R.id.tv_wallet_money:
            case R.id.ll_wallet_money:
                openActivity(WalletActivity.class);
                break;
            case R.id.iv_wallet_coupon:
            case R.id.tv_ll_wallet_coupon:
            case R.id.ll_wallet_coupon:
                openActivity(CouponActivity.class);
                break;
//            case R.id.iv_mine:
//            case R.id.tv_mine:
//            case R.id.ll_mine:
//                break;我的的整个框架
            case R.id.iv_custom_service:
            case R.id.tv_custom_service:
            case R.id.ll_mine_custom_service:
// TODO: 2017/1/21 直接拨打客服电话
                Intent intent = new Intent(Intent.ACTION_DIAL);
                Uri data = Uri.parse("tel:" + "13673717763");
                intent.setData(data);
                startActivity(intent);
                break;
            case R.id.iv_mine_message:
            case R.id.tv_mine_message:
            case R.id.ll_mine_message:
                openActivity(MessagesActivity.class);
                break;
            case R.id.iv_mine_share:
            case R.id.tv_mine_share:
            case R.id.ll_mine_share:
                openActivity(ShareToFriendActivity.class);
                break;
            case R.id.iv_mine_store:
            case R.id.tv_mine_store:
            case R.id.ll_mine_store:
                openActivity(MyStoreActivity.class);
                break;
            case R.id.iv_mine_star:
            case R.id.tv_mine_star:
            case R.id.ll_mine_star:
                // TODO: 2017/1/21 我收藏的一些东西
                break;
            case R.id.iv_mine_order:
            case R.id.tv_mine_order:
            case R.id.ll_mine_order:
                openActivity(MyOrderActivity.class);
                break;
            case R.id.iv_mine_about_us:
            case R.id.tv_mine_about_us:
            case R.id.ll_mine_about_us:
                openActivity(AboutUsActivity.class);
                break;
            case R.id.iv_mine_setting:
            case R.id.tv_mine_setting:
            case R.id.ll_mine_setting:
                openActivity(SettingActivity.class);
                break;
            case R.id.iv_mine_honesty:
            case R.id.tv_mine_honesty:
            case R.id.ll_mine_honesty:
                // TODO: 2017/1/21 诚信列表
                break;
//            case R.id.iv_tools:
//            case R.id.tv_tools:
//            case R.id.ll_tools:
//                break;推荐工具的大框架
            case R.id.iv_tools_insurance:
            case R.id.tv_tools_insurance:
            case R.id.ll_tools_insurance:
                // TODO: 2017/1/21  保险
                break;
            case R.id.iv_tools_counter:
            case R.id.tv_tools_counter:
            case R.id.ll_tools_counter:
                // TODO: 2017/1/21  计算器
                break;
            case R.id.iv_tools_nearby_service:
            case R.id.tv_tools_nearby_service:
            case R.id.ll_tools_nearby_service:
                // TODO: 2017/1/21  附近的服务
                break;
            case R.id.iv_tools_games:
            case R.id.tv_tools_games:
            case R.id.ll_tools_games:
                // TODO: 2017/1/21  益智小游戏
                break;
//            case R.id.scrollView_mine:
//                break;
            case R.id.iv_home_homepage:
            case R.id.tv_home_homepage:
            case R.id.ll_home_homepage:
                openActivity(NewHomeActivity.class);
                break;
            case R.id.iv_car_type:
            case R.id.tv_car_type:
            case R.id.ll_car_type:
                openActivity(CarTypeActivity.class);
                break;
            case R.id.iv_home_I:
            case R.id.tv_home_I:
            case R.id.ll_home_I:
                openActivity(LoginActivity.class);
                break;
            case R.id.iv_home_mail_list:
            case R.id.tv_home_mail_list:
            case R.id.ll_home_mail_list:
                // TODO: 2017/1/21 通讯录界面
                break;
//            case R.id.ll_home_bottom_item:
//                break;
        }
    }
}
