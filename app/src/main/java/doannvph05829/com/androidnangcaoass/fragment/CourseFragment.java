package doannvph05829.com.androidnangcaoass.fragment;

import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import doannvph05829.com.androidnangcaoass.R;

public class CourseFragment extends Fragment {
    private View statics;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            statics = inflater.inflate( R.layout.coursefragment, container, false );

            return statics;
    }
}
