package com.bdsoftwaresolution.watchtolearn.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.bdsoftwaresolution.watchtolearn.Activities.CompeleteProfileActivity;
import com.bdsoftwaresolution.watchtolearn.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {


    public SignUpFragment() {
        // Required empty public constructor
    }

    private Button signup;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        casting(view);
        onClickListener();


        return view;

    }

    private void onClickListener() {
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CompeleteProfileActivity.class));
            }
        });
    }

    private void casting(View view) {
        signup = view.findViewById(R.id.signUpBtn);
    }

}
