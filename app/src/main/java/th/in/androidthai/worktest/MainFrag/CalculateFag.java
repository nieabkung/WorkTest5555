package th.in.androidthai.worktest.MainFrag;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import th.in.androidthai.worktest.MainActivity;
import th.in.androidthai.worktest.R;

/**
 * Created by home on 2/13/2018.
 */

public class CalculateFag extends android.support.v4.app.Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



//        CreatToolbar
//        Toolbar toolbar = getView().findViewById(R.id.toolbarMainCal);
//        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
//
//        ((MainActivity)getActivity()).getSupportActionBar()
//                .setTitle("Calculate");
//
//        ((MainActivity)getActivity()).getSupportActionBar()
//                .setDisplayHomeAsUpEnabled(true);


    }





    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calculate, container, false);

    }
}
