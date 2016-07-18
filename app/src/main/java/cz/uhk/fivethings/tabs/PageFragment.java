package cz.uhk.fivethings.tabs;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cz.uhk.fivethings.R;

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
            case 1: rootView = inflater.inflate(R.layout.brazil_layout, container, false);
                break;
            case 2: rootView = inflater.inflate(R.layout.burkina_faso_layout, container, false);
                break;
            case 3: rootView = inflater.inflate(R.layout.nepal_layout, container, false);
                break;
            case 4: rootView = inflater.inflate(R.layout.kiribati_layout, container, false);
                break;
            case 5: rootView = inflater.inflate(R.layout.vatican_layout, container, false);
                break;
        }

        return rootView;
    }
}
