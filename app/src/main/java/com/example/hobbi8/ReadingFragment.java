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

public class ReadingFragment extends Fragment implements View.OnClickListener{

    private ImageButton reading1;
    private ImageButton reading2;
    private ImageButton reading3;
    private ImageButton reading4;


    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.hobbies_reading, container, false);

        reading1 = view.findViewById(R.id.Reading1);
        reading1.setClickable(true);
        reading1.setOnClickListener(this);

        reading2 = view.findViewById(R.id.Reading2);
        reading2.setClickable(true);
        reading2.setOnClickListener(this);

        reading3 = view.findViewById(R.id.Reading3);
        reading3.setClickable(true);
        reading3.setOnClickListener(this);

        reading4 = view.findViewById(R.id.Reading4);
        reading4.setClickable(true);
        reading4.setOnClickListener(this);

        return view;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Reading1:
                Intent intent1 = new Intent(v.getContext(), Card1.class);
                startActivity(intent1);
                break;
            case R.id.Reading2:
                Intent intent2 = new Intent(v.getContext(), Card2.class);
                startActivity(intent2);
                break;
            case R.id.Reading3:
                Intent intent3 = new Intent(v.getContext(), Card3.class);
                startActivity(intent3);
                break;
            case R.id.Reading4:
                Uri uri = Uri.parse("https://bit.ly/hobbi8app");
                Intent intent4 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent4);
                break;

        }
    }
}

