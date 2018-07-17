package com.example.huangxiaoer.home.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.huangxiaoer.R;
import com.example.huangxiaoer.home.fragment.EvluateFragment;
import com.example.huangxiaoer.home.fragment.FoodFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.iv_fanhui)
    ImageView ivFanhui;
    @BindView(R.id.tl_product)
    TabLayout tlProduct;
    @BindView(R.id.vp_product)
    ViewPager vpProduct;
    private List<String> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);


        ButterKnife.bind(this);
        ivFanhui.setOnClickListener(this);

        initData();
    }

    private void initData() {
        list.add("餐品");
        list.add("评价");

        vpProduct.setAdapter(new MyFrags(getSupportFragmentManager()));
        tlProduct.setupWithViewPager(vpProduct);
        vpProduct.setOffscreenPageLimit(2);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_fanhui:
                finish();
                break;
        }
    }
    class MyFrags extends FragmentPagerAdapter {
        Fragment fragment=null;
        public MyFrags(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0:
                    fragment=new FoodFragment();
                break;
                case 1:
                    fragment=new EvluateFragment();
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {


            return 2;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return list.get(position);
        }
    }
}
