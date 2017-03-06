package com.lisa.administrator.sixgold.activity.home;

import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.activity.LoginActivity;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MailListActivity extends MyBaseActivity {

    ArrayList<Map<String, String>> mList;
    Map<String, String> contacts;
    ListView mListView;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_list);
        ButterKnife.bind(this);
        initActionBarTwoImg(-1, "通讯录", -1, null);
        initview();
        getContacts();
        initdata();
        setlistner();
    }

    private void setlistner() {
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View view, int position,
                                    long arg3) {
                final Map<String, String> mcontacter;
                mcontacter = mList.get(position);
                AlertDialog.Builder builder = new AlertDialog.Builder(MailListActivity.this);
                builder.setTitle("当前联系人：" + mcontacter.get("name")).setMessage("号码：" + mcontacter.get("phoneNumber")).setNegativeButton("取消", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub

                    }
                }).
                        setPositiveButton("拨打电话", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                String phoneNumber = mcontacter.get("phoneNumber");
                                Intent intent = new Intent(Intent.ACTION_CALL);
                                intent.setData(Uri.parse("tel:" + phoneNumber));
//                                intent.setData(Uri.parse("tel:" + mcontacter.get("phoneNumber")));
                                try {
                                    startActivity(intent); // 调用需要的权限可能被用户拒绝，所以这时调用该方法会出现异常，就应该要try catch。
                                } catch (Exception e) {
                                    showToast("您还没有开启拨打电话的权限");
                                }
                            }
                        });
                builder.create().show();
            }
        });
    }

    private void initdata() {
        contactAdapter cAdapter = new contactAdapter(MailListActivity.this, mList);
        mListView.setAdapter(cAdapter);
    }

    private void initview() {
        mListView = (ListView) findViewById(R.id.listView1);
        mList = new ArrayList<Map<String, String>>();
        contacts = new HashMap<String, String>();
    }

    public void getContacts() {
        ContentResolver resolver = getContentResolver();
        final String[] PROJECTION = new String[]{
                ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Photo.PHOTO_ID, ContactsContract.CommonDataKinds.Phone.CONTACT_ID};
        Cursor c = resolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, PROJECTION, null, null, null);
        System.out.println(c == null);
        if (c != null) {
            while (c.moveToNext()) {
                contacts = new HashMap<String, String>();
                String phoneNumber = c.getString(c.getColumnIndex((ContactsContract.CommonDataKinds.Phone.NUMBER)));
                if (TextUtils.isEmpty(phoneNumber))
                    continue;
                String Name = c.getString(c.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
                String pId = c.getLong(c.getColumnIndex(ContactsContract.CommonDataKinds.Phone.PHOTO_ID)) + "";
                String cId = c.getLong(c.getColumnIndex(ContactsContract.CommonDataKinds.Phone.CONTACT_ID)) + "";
                contacts.put("name", Name);
                //	System.out.println(contacts.get("name"));
                contacts.put("phoneNumber", phoneNumber);
                contacts.put("pId", pId);
                contacts.put("cId", cId);
                mList.add(contacts);
            }
            System.out.println(mList.get(0).get("name") + "23232323232323");
            c.close();
        }
    }

    @OnClick({R.id.iv_home_homepage, R.id.tv_home_homepage, R.id.ll_home_homepage, R.id.iv_car_type, R.id.tv_car_type, R.id.ll_car_type, R.id.iv_home_I, R.id.tv_home_I, R.id.ll_home_I, R.id.iv_home_mail_list, R.id.tv_home_mail_list, R.id.ll_home_mail_list})
    public void onClick(View view) {
        switch (view.getId()) {
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
                finish();
                openActivity(LoginActivity.class);
                break;
            case R.id.iv_home_mail_list:
            case R.id.tv_home_mail_list:
            case R.id.ll_home_mail_list:
//                openActivity(MailListActivity.class);
                break;
        }
    }

    class contactAdapter extends BaseAdapter {

        Context context;
        ArrayList<Map<String, String>> theList;

        public contactAdapter(Context context,
                              ArrayList<Map<String, String>> theList) {
            super();
            this.context = context;
            this.theList = theList;
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return theList.size();
        }

        @Override
        public Object getItem(int arg0) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public long getItemId(int arg0) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup arg2) {
            if (theList.size() != 0) {
                view = View.inflate(MailListActivity.this, R.layout.layout_address_mails_item, null);
                Map<String, String> theContacer;
                theContacer = theList.get(position);
                String name = (String) theContacer.get("name");
                System.out.println(name);
                String phoneNumber = theContacer.get("phoneNumber");
                long pid = Long.parseLong(theContacer.get("pId"));
                long cid = Long.parseLong(theContacer.get("cId"));
                Bitmap pBitmap;
                if (pid > 0) {
                    /*为存在联系人图片的位置增加图片*/
                    Uri uri = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, cid);
                    InputStream input = ContactsContract.Contacts.openContactPhotoInputStream(context.getContentResolver(), uri);
                    pBitmap = BitmapFactory.decodeStream(input);

                } else {
                    pBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.iv_my_head_image);
                }
                ImageView photo;
                photo = (ImageView) view.findViewById(R.id.imageView1);
                photo.setImageBitmap(pBitmap);
                //StringBuilder sb=new StringBuilder();
                //sb.append("姓名：     ").append(name).append("\n").append("电话号码：").append(phoneNumber).append("\n").append(""+cid);
                TextView mTextView = (TextView) view.findViewById(R.id.textView2);
                mTextView.setText(name);
                TextView sTextView = (TextView) view.findViewById(R.id.textView3);
                sTextView.setText(phoneNumber);
//                TextView tTextView = (TextView) view.findViewById(R.id.textView4);
//                tTextView.setText("id:" + "" + cid);
                return view;
            }
            return null;
        }

    }
}
