package cz.uhk.fivethings.tabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static cz.uhk.fivethings.common.TabsConstants.*;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case BRAZIL_PAGE: return "Brazil";
            case BURKINA_FASO_PAGE: return "Burkina Faso";
            case NEPAL_PAGE: return "Nepal";
            case KIRIBATI_PAGE: return "Kiribati";
            case VATICAN_PAGE: return "Vatican";
            case TRINIDAD_PAGE: return "Trinidad and Tobago";
        }
        return "Default";
    }
}
