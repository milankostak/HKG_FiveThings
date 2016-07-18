package cz.uhk.fivethings.tabs;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cz.uhk.fivethings.R;
import static cz.uhk.fivethings.common.TabsConstants.*;

public class PageFragment extends Fragment {
    private static final String ARG_PAGE_NUMBER = "page_number";

    public PageFragment() {
    }

    public static PageFragment newInstance(int page) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE_NUMBER, page);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = null;

        switch (getArguments().getInt(ARG_PAGE_NUMBER, -1)) {
            case BRAZIL_PAGE: rootView = inflater.inflate(R.layout.brazil_layout, container, false);
                break;
            case BURKINA_FASO_PAGE: rootView = inflater.inflate(R.layout.burkina_faso_layout, container, false);
                break;
            case NEPAL_PAGE: rootView = inflater.inflate(R.layout.nepal_layout, container, false);
                break;
            case KIRIBATI_PAGE: rootView = inflater.inflate(R.layout.kiribati_layout, container, false);
                break;
            case VATICAN_PAGE: rootView = inflater.inflate(R.layout.vatican_layout, container, false);
                break;
        }

        return rootView;
    }
}
