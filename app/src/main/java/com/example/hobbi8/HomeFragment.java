package com.example.hobbi8;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.Nullable;

public class HomeFragment extends Fragment implements View.OnClickListener{

    private Button yoga;
    private Button reading;
    private Button photography;
    private Button meditation;
    private Button dancing;
    private Button cooking;

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);


        yoga = view.findViewById(R.id.button2);
        yoga.setClickable(true);
        yoga.setOnClickListener(this);

        photography = view.findViewById(R.id.button4);
        photography.setClickable(true);
        photography.setOnClickListener(this);

        meditation = view.findViewById(R.id.button5);
        meditation.setClickable(true);
        meditation.setOnClickListener(this);

        reading = view.findViewById(R.id.button3);
        reading.setClickable(true);
        reading.setOnClickListener(this);

        dancing = view.findViewById(R.id.button6);
        dancing.setClickable(true);
        dancing.setOnClickListener(this);

        cooking = view.findViewById(R.id.button7);
        cooking.setClickable(true);
        cooking.setOnClickListener(this);

        return view;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new YogaFragment()).commit();
                break;
            case R.id.button4:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new PhotographyFragment()).commit();
                break;
            case R.id.button5:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new MeditationFragment()).commit();
                break;
            case R.id.button3:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ReadingFragment()).commit();
                break;
            case R.id.button6:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new DancingFragment()).commit();
                break;
            case R.id.button7:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new CookingFragment()).commit();
                break;
        }
    }
}
