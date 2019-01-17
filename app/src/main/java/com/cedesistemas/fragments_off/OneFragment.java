package com.cedesistemas.fragments_off;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class OneFragment extends Fragment {

    private TextView fragmentOne;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        loadView(view);
        return view;
    }

    private void loadView(View view) {
        fragmentOne = view.findViewById(R.id.fragmentOne);
        fragmentOne.setText("Fragmento uno");
    }
}
