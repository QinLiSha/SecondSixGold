package com.lisa.administrator.sixgold.activity.home;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.mine.AboutUsActivity;
import com.lisa.administrator.sixgold.activity.mine.CouponActivity;
import com.lisa.administrator.sixgold.activity.mine.FreightChargeActivity;
import com.lisa.administrator.sixgold.activity.mine.MyInformationActivity;
import com.lisa.administrator.sixgold.activity.mine.MyOrderNewActivity;
import com.lisa.administrator.sixgold.activity.mine.MyStoreActivity;
import com.lisa.administrator.sixgold.activity.mine.SettingActivity;
import com.lisa.administrator.sixgold.activity.mine.ShareToFriendActivity;
import com.lisa.administrator.sixgold.activity.mine.WalletActivity;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MineActivity extends MyBaseActivity {
    @BindView(R.id.iv_my_head_image)
    ImageView ivMyHeadImage;
    @BindView(R.id.iv_to_authenticate)
    ImageView ivToAuthenticate;
    @BindView(R.id.tv_to_authenticate)
    TextView tvToAuthenticate;
    @BindView(R.id.iv_to_authenticate_details)
    ImageView ivToAuthenticateDetails;
    @BindView(R.id.tv_my_name)
    TextView tvMyName;
    @BindView(R.id.tv_vip)
    TextView tvVip;
    @BindView(R.id.tv_trust_proint)
    TextView tvTrustProint;
    @BindView(R.id.star_1)
    ImageView star1;
    @BindView(R.id.star_2)
    ImageView star2;
    @BindView(R.id.star_3)
    ImageView star3;
    @BindView(R.id.star_4)
    ImageView star4;
    @BindView(R.id.star_5)
    ImageView star5;
    @BindView(R.id.ll_my_information_right)
    LinearLayout llMyInformationRight;
    @BindView(R.id.ll_my_information)
    LinearLayout llMyInformation;
    @BindView(R.id.iv_get_money)
    ImageView ivGetMoney;
    @BindView(R.id.tv_get_money)
    TextView tvGetMoney;
    @BindView(R.id.ll_get_money)
    LinearLayout llGetMoney;
    @BindView(R.id.iv_my_order)
    ImageView ivMyOrder;
    @BindView(R.id.tv_my_order)
    TextView tvMyOrder;
    @BindView(R.id.ll_my_order)
    LinearLayout llMyOrder;
    @BindView(R.id.iv_coupon)
    ImageView ivCoupon;
    @BindView(R.id.tv_coupon)
    TextView tvCoupon;
    @BindView(R.id.ll_coupon)
    LinearLayout llCoupon;
    @BindView(R.id.tv_share_to_friends)
    TextView tvShareToFriends;
    @BindView(R.id.iv_share_to_friends_details)
    ImageView ivShareToFriendsDetails;
    @BindView(R.id.iv_share_to_friends)
    ImageView ivShareToFriends;
    @BindView(R.id.rl_share_to_friends)
    RelativeLayout rlShareToFriends;
    @BindView(R.id.iv_contact_customer_service)
    ImageView ivContactCustomerService;
    @BindView(R.id.tv_contact_customer_service)
    TextView tvContactCustomerService;
    @BindView(R.id.iv_contact_customer_service_details)
    ImageView ivContactCustomerServiceDetails;
    @BindView(R.id.rl_contact_customer_service)
    RelativeLayout rlContactCustomerService;
    @BindView(R.id.iv_my_collection)
    ImageView ivMyCollection;
    @BindView(R.id.iv_my_collection_details)
    ImageView ivMyCollectionDetails;
    @BindView(R.id.rl_my_collection)
    RelativeLayout rlMyCollection;

    @BindView(R.id.tv_my_collection)
    TextView tvMyCollection;
    @BindView(R.id.tv_about_us)
    TextView tvAboutUs;
    @BindView(R.id.iv_about_us_details)
    ImageView ivAboutUsDetails;
    @BindView(R.id.iv_about_us)
    ImageView ivAboutUs;
    @BindView(R.id.rl_about_us)
    RelativeLayout rlAboutUs;
    @BindView(R.id.iv_my_store)
    ImageView ivMyStore;
    @BindView(R.id.tv_my_store)
    TextView tvMyStore;
    @BindView(R.id.iv_my_store_details)
    ImageView ivMyStoreDetails;
    @BindView(R.id.rl_my_store)
    RelativeLayout rlMyStore;
    @BindView(R.id.tv_insurance)
    TextView tvInsurance;
    @BindView(R.id.iv_insurance_details)
    ImageView ivInsuranceDetails;
    @BindView(R.id.iv_insurance)
    ImageView ivInsurance;
    @BindView(R.id.rl_insurance)
    RelativeLayout rlInsurance;
    @BindView(R.id.tv_counter)
    TextView tvCounter;
    @BindView(R.id.iv_counter_details)
    ImageView ivCounterDetails;
    @BindView(R.id.iv_counter)
    ImageView ivCounter;
    @BindView(R.id.rl_counter)
    RelativeLayout rlCounter;
    @BindView(R.id.iv_nearby_service)
    ImageView ivNearbyService;
    @BindView(R.id.tv_nearby_service)
    TextView tvNearbyService;
    @BindView(R.id.iv_nearby_service_details)
    ImageView ivNearbyServiceDetails;
    @BindView(R.id.rl_nearby_service)
    RelativeLayout rlNearbyService;
    @BindView(R.id.iv_game)
    ImageView ivGame;
    @BindView(R.id.tv_game)
    TextView tvGame;
    @BindView(R.id.iv_game_details)
    ImageView ivGameDetails;
    @BindView(R.id.rl_game)
    RelativeLayout rlGame;
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
    @BindView(R.id.iv_mine_left_back)
    ImageView ivMineLeftBack;
    @BindView(R.id.iv_mine_notice)
    ImageView ivMineNotice;
    @BindView(R.id.iv_mine_setting)
    ImageView ivMineSetting;
    @BindView(R.id.activity_mine)
    LinearLayout activityMine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iv_mine_left_back, R.id.iv_mine_notice, R.id.iv_mine_setting, R.id.iv_my_head_image, R.id.iv_to_authenticate,
            R.id.tv_to_authenticate, R.id.iv_to_authenticate_details, R.id.tv_my_name, R.id.tv_vip, R.id.tv_trust_proint,
            R.id.star_1, R.id.star_2, R.id.star_3, R.id.star_4, R.id.star_5, R.id.ll_my_information_right, R.id.ll_my_information,
            R.id.iv_get_money, R.id.tv_get_money, R.id.ll_get_money, R.id.iv_my_order, R.id.tv_my_order, R.id.ll_my_order,
            R.id.iv_coupon, R.id.tv_coupon, R.id.ll_coupon, R.id.tv_share_to_friends, R.id.iv_share_to_friends_details,
            R.id.iv_share_to_friends, R.id.rl_share_to_friends, R.id.iv_contact_customer_service, R.id.tv_contact_customer_service,
            R.id.iv_contact_customer_service_details, R.id.rl_contact_customer_service, R.id.iv_my_collection, R.id.tv_my_collection,
            R.id.iv_my_collection_details, R.id.rl_my_collection, R.id.tv_about_us, R.id.iv_about_us_details, R.id.iv_about_us,
            R.id.rl_about_us, R.id.iv_my_store, R.id.tv_my_store, R.id.iv_my_store_details, R.id.rl_my_store, R.id.tv_insurance,
            R.id.iv_insurance_details, R.id.iv_insurance, R.id.rl_insurance, R.id.tv_counter, R.id.iv_counter_details, R.id.iv_counter,
            R.id.rl_counter, R.id.iv_nearby_service, R.id.tv_nearby_service, R.id.iv_nearby_service_details, R.id.rl_nearby_service,
            R.id.iv_game, R.id.tv_game, R.id.iv_game_details, R.id.rl_game, R.id.scrollView_mine, R.id.iv_home_homepage, R.id.tv_home_homepage,
            R.id.ll_home_homepage, R.id.iv_car_type, R.id.tv_car_type, R.id.ll_car_type, R.id.iv_home_I, R.id.tv_home_I, R.id.ll_home_I,
            R.id.iv_home_mail_list, R.id.tv_home_mail_list, R.id.ll_home_mail_list, R.id.ll_home_bottom_item})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_mine_left_back:
                break;
            case R.id.iv_mine_notice:
                break;
            case R.id.iv_mine_setting:
                openActivity(SettingActivity.class);
                break;
            case R.id.iv_my_head_image:
            case R.id.iv_to_authenticate:
            case R.id.tv_to_authenticate:
            case R.id.iv_to_authenticate_details:
            case R.id.tv_my_name:
            case R.id.tv_vip:
            case R.id.tv_trust_proint:
            case R.id.star_1:
            case R.id.star_2:
            case R.id.star_3:
            case R.id.star_4:
            case R.id.star_5:
            case R.id.ll_my_information_right:
            case R.id.ll_my_information:
                openActivity(MyInformationActivity.class);
                break;
            case R.id.iv_get_money:
            case R.id.tv_get_money:
            case R.id.ll_get_money:
                openActivity(WalletActivity.class);
                break;
            case R.id.iv_my_order:
            case R.id.tv_my_order:
            case R.id.ll_my_order:
                openActivity(MyOrderNewActivity.class);
                break;
            case R.id.iv_coupon:
            case R.id.tv_coupon:
            case R.id.ll_coupon:
                openActivity(CouponActivity.class);
                break;
            case R.id.tv_share_to_friends:
            case R.id.iv_share_to_friends_details:
            case R.id.iv_share_to_friends:
            case R.id.rl_share_to_friends:
                openActivity(ShareToFriendActivity.class);
                break;
            case R.id.iv_contact_customer_service:
            case R.id.tv_contact_customer_service:
            case R.id.iv_contact_customer_service_details:
            case R.id.rl_contact_customer_service:
                //拨打客服电话
                dialByPhoneNumber(18635284597l);
                break;
            case R.id.iv_my_collection:
            case R.id.tv_my_collection:
            case R.id.iv_my_collection_details:
            case R.id.rl_my_collection:
                // TODO: 2017/2/8 收藏 
                break;
            case R.id.tv_about_us:
            case R.id.iv_about_us_details:
            case R.id.iv_about_us:
            case R.id.rl_about_us:
                openActivity(AboutUsActivity.class);
                break;
            case R.id.iv_my_store:
            case R.id.tv_my_store:
            case R.id.iv_my_store_details:
            case R.id.rl_my_store:
                openActivity(MyStoreActivity.class);
                break;
            case R.id.tv_insurance:
            case R.id.iv_insurance_details:
            case R.id.iv_insurance:
            case R.id.rl_insurance:
                // TODO: 2017/2/8 保险 
                break;
            case R.id.tv_counter:
            case R.id.iv_counter_details:
            case R.id.iv_counter:
            case R.id.rl_counter:
                // TODO: 2017/2/8 运费计算
                openActivity(FreightChargeActivity.class);
                break;
            case R.id.iv_nearby_service:
            case R.id.tv_nearby_service:
            case R.id.iv_nearby_service_details:
            case R.id.rl_nearby_service:
                // TODO: 2017/2/8 附近服务 
                break;
            case R.id.iv_game:
            case R.id.tv_game:
            case R.id.iv_game_details:
            case R.id.rl_game:
                // TODO: 2017/2/8 游戏
                break;
            case R.id.iv_home_homepage:
            case R.id.tv_home_homepage:
            case R.id.ll_home_homepage:
                finish();
                openActivity(NewHomeActivity.class);
                break;
            case R.id.iv_car_type:
            case R.id.tv_car_type:
            case R.id.ll_car_type:
                finish();
                openActivity(CarTypeActivity.class);
                break;
            case R.id.iv_home_I:
            case R.id.tv_home_I:
            case R.id.ll_home_I:
//                openActivity(LoginActivity.class);
                break;
            case R.id.iv_home_mail_list:
            case R.id.tv_home_mail_list:
            case R.id.ll_home_mail_list:
                finish();
                openActivity(MailListActivity.class);
                break;
            case R.id.ll_home_bottom_item:
                break;

        }
    }


/**
 openActivity(MyInformationActivity.class);

 openActivity(WalletActivity.class);

 openActivity(CouponActivity.class);
 //
 // TODO: 2017/1/21 直接拨打客服电话
 dialByPhoneNumber(15873715569l);
 // TODO: 2017/1/21 直接拨打客服电话
 Intent intent = new Intent(Intent.ACTION_DIAL);
 Uri data = Uri.parse("tel:" + "13673717763");
 intent.setData(data);
 startActivity(intent);

 openActivity(MessagesActivity.class);
 openActivity(ShareToFriendActivity.class);
 openActivity(MyStoreActivity.class);
 // TODO: 2017/1/21 我收藏的一些东西
 openActivity(MyOrderActivity.class);

 openActivity(AboutUsActivity.class);

 openActivity(SettingActivity.class);
 break;
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
 */
}
