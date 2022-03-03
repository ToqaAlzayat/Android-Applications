package com.example.mazra3a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.mazra3a.databinding.ActivityFarmBinding;
import com.example.mazra3a.databinding.ActivityRegistrationBinding;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class farm extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm);




        TabLayout tabLayout= findViewById(R.id.tab_bar_farm);
        TabItem tab_new_farm=findViewById(R.id.tab_new_farm);
        TabItem tab_update_farm=findViewById(R.id.tab_update_farm);
        TabItem tab_delete_farm=findViewById(R.id.tab_delete_farm);
        ViewPager view_pager2=findViewById(R.id.view_pager2);

        pager_adapter2 pager_adapter2=new pager_adapter2(getSupportFragmentManager(),tabLayout.getTabCount());
        view_pager2.setAdapter(pager_adapter2);

        view_pager2.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
       tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                view_pager2.setCurrentItem(tab.getPosition());
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