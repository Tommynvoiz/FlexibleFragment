package com.app.tomas.flexiblefragment;

import android.app.Fragment;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tomas on 5/25/2015.
 */
public class FragmentB extends Fragment {

    TextView text;
    ImageView image;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b,container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        text= (TextView) getActivity().findViewById(R.id.textView);
        image= (ImageView) getActivity().findViewById(R.id.imageView);

    }

    public void changeData(int i){

        Resources res= getResources();
        String[] description = res.getStringArray(R.array.description);

        final TypedArray testArrayIcon = getResources().obtainTypedArray(R.array.description);
        image.setImageResource(testArrayIcon.getResourceId(i,-1));
    }
}
