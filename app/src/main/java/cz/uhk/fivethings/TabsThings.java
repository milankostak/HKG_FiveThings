package cz.uhk.fivethings;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPager;

import cz.uhk.fivethings.tabs.TabsPagerAdapter;
import static cz.uhk.fivethings.common.TabsConstants.*;

public class TabsThings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabs_layout);
        TabLayout tabs = initTabs();
        initSelection(tabs);
    }

    private void initSelection(TabLayout tabs) {
        Intent myIntent = getIntent();
        int val = myIntent.getIntExtra(TABS_PARAMETER, 0);
        TabLayout.Tab tab = tabs.getTabAt(val);
        tab.select();
    }

    private TabLayout initTabs() {
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        TabsPagerAdapter adapter = new TabsPagerAdapter(getSupportFragmentManager());

        pager.setAdapter(adapter);
        tabs.setupWithViewPager(pager);
        return tabs;
    }
}
