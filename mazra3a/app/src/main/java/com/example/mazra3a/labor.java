package com.example.mazra3a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class labor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labor);

        TabLayout tabLayout= findViewById(R.id.tab_bar_labor);
        TabItem tab_new_labor=findViewById(R.id.tab_new_labor);
        TabItem tab_update_labor=findViewById(R.id.tab_update_labor);
        TabItem tab_delete_labor=findViewById(R.id.tab_delete_labor);
        ViewPager view_pager4=findViewById(R.id.view_pager4);

        pager_adapter4 pager_adapter4=new pager_adapter4(getSupportFragmentManager(),tabLayout.getTabCount());
        view_pager4.setAdapter(pager_adapter4);

        view_pager4.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                view_pager4.setCurrentItem(tab.getPosition());
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