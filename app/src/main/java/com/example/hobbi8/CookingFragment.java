package com.example.hobbi8;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CookingFragment extends Fragment implements View.OnClickListener{

    private ImageButton cooking1;
    private ImageButton cooking2;
    private ImageButton cooking3;
    private ImageButton cooking4;

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.hobbies_cooking, container, false);

        cooking1 = view.findViewById(R.id.Cooking1);
        cooking1.setClickable(true);
        cooking1.setOnClickListener(this);

        cooking2 = view.findViewById(R.id.Cooking2);
        cooking2.setClickable(true);
        cooking2.setOnClickListener(this);

        cooking3 = view.findViewById(R.id.Cooking3);
        cooking3.setClickable(true);
        cooking3.setOnClickListener(this);

        cooking4 = view.findViewById(R.id.Cooking4);
        cooking4.setClickable(true);
        cooking4.setOnClickListener(this);
        return view;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Cooking1:
                Intent intent1 = new Intent(v.getContext(), Card1.class);
                startActivity(intent1);
                break;
            case R.id.Cooking2:
                Intent intent2 = new Intent(v.getContext(), Card2.class);
                startActivity(intent2);
                break;
            case R.id.Cooking3:
                Intent intent3 = new Intent(v.getContext(), Card3.class);
                startActivity(intent3);
                break;
            case R.id.Cooking4:
                Uri uri = Uri.parse("https://bit.ly/hobbi8app");
                Intent intent4 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent4);
                break;

        }
    }
}

