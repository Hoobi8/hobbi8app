package com.example.hobbi8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.Nullable;

public class AccountFragment extends Fragment implements View.OnClickListener{

    private Button rate2;

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_account, container, false);


        rate2 = view.findViewById(R.id.btnrate2);
        rate2.setClickable(true);
        rate2.setOnClickListener(this);

        return view;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnrate2:
                Toast.makeText(getContext(), "Thanks for rating us", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
