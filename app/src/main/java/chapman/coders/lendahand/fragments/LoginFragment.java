package chapman.coders.lendahand.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import chapman.coders.lendahand.R;

/**
 * Saferides: Created by Tommy Madden on 11/1/2016
 */
public class LoginFragment extends Fragment {
    private EditText emailText;
    private EditText passwordText;

    public LoginFragment() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_login, container, false);
        emailText = (EditText) view.findViewById(R.id.et_email);
        passwordText = (EditText)view.findViewById(R.id.password);
        return view;
    }
}