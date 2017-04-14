package com.sda.a.cichosz.cv;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sda.a.cichosz.cv.Fragments.FirstFragment;
import com.sda.a.cichosz.cv.Fragments.FourthFragment;
import com.sda.a.cichosz.cv.Fragments.SecondFragment;
import com.sda.a.cichosz.cv.Fragments.ThirdFragment;

/**
 * Created by RENT on 2017-04-11.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FirstFragment.newInstance();
            case 1:
                return SecondFragment.newInstance();
            case 2:
                return ThirdFragment.newInstance();
            case 3:
                return FourthFragment.newInstance();

        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Doświadczenie zawodowe";

            case 1:
                return "Edukacja";

            case 2:
                return "Umiejętności";

            case 3:
                return "Inne";
        }
        return "";
    }
}
