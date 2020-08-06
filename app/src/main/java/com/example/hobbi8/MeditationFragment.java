package com.example.hobbi8;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MeditationFragment extends Fragment implements View.OnClickListener{

    private ImageButton meditation1;
    private ImageButton meditation2;
    private ImageButton meditation3;
    private ImageButton meditation4;


    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.hobbies_meditation, container, false);

        meditation1 = view.findViewById(R.id.Meditation1);
        meditation1.setClickable(true);
        meditation1.setOnClickListener(this);

        meditation2 = view.findViewById(R.id.Meditation2);
        meditation2.setClickable(true);
        meditation2.setOnClickListener(this);

        meditation3 = view.findViewById(R.id.Meditation3);
        meditation3.setClickable(true);
        meditation3.setOnClickListener(this);

        meditation4 = view.findViewById(R.id.Meditation4);
        meditation4.setClickable(true);
        meditation4.setOnClickListener(this);

        return view;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Meditation1:
                Intent intent1 = new Intent(v.getContext(), Card1.class);
                startActivity(intent1);
                break;
            case R.id.Meditation2:
                Intent intent2 = new Intent(v.getContext(), Card2.class);
                startActivity(intent2);
                break;
            case R.id.Meditation3:
                Intent intent3 = new Intent(v.getContext(), Card3.class);
                startActivity(intent3);
                break;
            case R.id.Meditation4:
                Uri uri = Uri.parse("https://bit.ly/hobbi8app");
                Intent intent4 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent4);
                break;

        }
    }
}

