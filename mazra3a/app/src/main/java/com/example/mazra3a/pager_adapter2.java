package com.example.mazra3a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



public class pager_adapter2 extends FragmentPagerAdapter {

    private int tabs_num;
    public pager_adapter2(FragmentManager fm,int tabs_num)
    {
        super(fm);
       this.tabs_num=tabs_num;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position)
        {
            case 0:
                return  new new_farm();

            case 1:
                return new update_farm();

            case 2:
                return new delete_farm();

            default:
                return null;
        }


    }


    @Override
    public int getCount() {
        return tabs_num ;
    }
}
