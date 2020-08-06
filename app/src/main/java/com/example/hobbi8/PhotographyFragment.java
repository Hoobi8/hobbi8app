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

public class PhotographyFragment extends Fragment implements View.OnClickListener{

    private ImageButton photography1;
    private ImageButton photography2;
    private ImageButton photography3;
    private ImageButton photography4;

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.hobbies_photography, container, false);

        photography1 = view.findViewById(R.id.Photography1);
        photography1.setClickable(true);
        photography1.setOnClickListener(this);

        photography2 = view.findViewById(R.id.Photography2);
        photography2.setClickable(true);
        photography2.setOnClickListener(this);

        photography3 = view.findViewById(R.id.Photography3);
        photography3.setClickable(true);
        photography3.setOnClickListener(this);

        photography4 = view.findViewById(R.id.Photography4);
        photography4.setClickable(true);
        photography4.setOnClickListener(this);

        return view;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Photography1:
                Intent intent1 = new Intent(v.getContext(), Card1.class);
                startActivity(intent1);
                break;
            case R.id.Photography2:
                Intent intent2 = new Intent(v.getContext(), Card2.class);
                startActivity(intent2);
                break;
            case R.id.Photography3:
                Intent intent3 = new Intent(v.getContext(), Card3.class);
                startActivity(intent3);
                break;
            case R.id.Photography4:
                Uri uri = Uri.parse("https://bit.ly/hobbi8app");
                Intent intent4 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent4);
                break;

        }
    }
}

