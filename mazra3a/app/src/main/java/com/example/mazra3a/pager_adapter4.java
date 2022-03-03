package com.example.mazra3a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



public class pager_adapter4 extends FragmentPagerAdapter {

    private int tabs_num;
    public pager_adapter4(FragmentManager fm,int tabs_num)
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
                return  new new_labor();

            case 1:
                return new update_labor();

            case 2:
                return new delete_labor();

            default:
                return null;
        }


    }


    @Override
    public int getCount() {
        return tabs_num ;
    }
}
