package com.example.hobbi8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.navigation.NavigationView;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.Nullable;

public class SettingsFragment extends Fragment implements View.OnClickListener{

    private Button account;
    private Button achievements;
    private Button rate;

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_settings, container, false);


        account = view.findViewById(R.id.btnaccount);
        account.setClickable(true);
        account.setOnClickListener(this);

        achievements = view.findViewById(R.id.btnachievements);
        achievements.setClickable(true);
        achievements.setOnClickListener(this);

        rate = view.findViewById(R.id.btnrate);
        rate.setClickable(true);
        rate.setOnClickListener(this);

        return view;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnaccount:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new AccountFragment()).commit();
                break;
            case R.id.btnachievements:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new AchievementsFragment()).commit();
                break;
            case R.id.btnrate:
                Toast.makeText(getContext(), "Thanks for rating us", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
