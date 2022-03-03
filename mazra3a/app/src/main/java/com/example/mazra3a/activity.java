package com.example.mazra3a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);

        TabLayout tabLayout= findViewById(R.id.tab_bar_activity);
        TabItem tab_new_activity=findViewById(R.id.tab_new_activity);
        TabItem tab_update_activity=findViewById(R.id.tab_update_activity);
        TabItem tab_delete_activity=findViewById(R.id.tab_delete_activity);
        ViewPager view_pager3=findViewById(R.id.view_pager3);

        pager_adapter3 pager_adapter3=new pager_adapter3(getSupportFragmentManager(),tabLayout.getTabCount());
        view_pager3.setAdapter(pager_adapter3);

        view_pager3.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                view_pager3.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}