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

public class DancingFragment extends Fragment implements View.OnClickListener{

    private ImageButton dancing1;
    private ImageButton dancing2;
    private ImageButton dancing3;
    private ImageButton dancing4;

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.hobbies_dancing, container, false);

        dancing1 = view.findViewById(R.id.Dancing1);
        dancing1.setClickable(true);
        dancing1.setOnClickListener(this);

        dancing2 = view.findViewById(R.id.Dancing2);
        dancing2.setClickable(true);
        dancing2.setOnClickListener(this);

        dancing3 = view.findViewById(R.id.Dancing3);
        dancing3.setClickable(true);
        dancing3.setOnClickListener(this);

        dancing4 = view.findViewById(R.id.Dancing4);
        dancing4.setClickable(true);
        dancing4.setOnClickListener(this);

        return view;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Dancing1:
                Intent intent1 = new Intent(v.getContext(), Card1.class);
                startActivity(intent1);
                break;
            case R.id.Dancing2:
                Intent intent2 = new Intent(v.getContext(), Card2.class);
                startActivity(intent2);
                break;
            case R.id.Dancing3:
                Intent intent3 = new Intent(v.getContext(), Card3.class);
                startActivity(intent3);
                break;
            case R.id.Dancing4:
                Uri uri = Uri.parse("https://bit.ly/hobbi8app");
                Intent intent4 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent4);
                break;

        }
    }
}

