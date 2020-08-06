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

public class YogaFragment extends Fragment implements View.OnClickListener{

    private ImageButton yoga1;
    private ImageButton yoga2;
    private ImageButton yoga3;
    private ImageButton yoga4;

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.hobbies_yoga, container, false);

        yoga1 = view.findViewById(R.id.Yoga1);
        yoga1.setClickable(true);
        yoga1.setOnClickListener(this);

        yoga2 = view.findViewById(R.id.Yoga2);
        yoga2.setClickable(true);
        yoga2.setOnClickListener(this);

        yoga3 = view.findViewById(R.id.Yoga3);
        yoga3.setClickable(true);
        yoga3.setOnClickListener(this);

        yoga4 = view.findViewById(R.id.Yoga4);
        yoga4.setClickable(true);
        yoga4.setOnClickListener(this);



        return view;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Yoga1:
                Intent intent1 = new Intent(v.getContext(), Card1.class);
                startActivity(intent1);
                break;
            case R.id.Yoga2:
                Intent intent2 = new Intent(v.getContext(), Card2.class);
                startActivity(intent2);
                break;
            case R.id.Yoga3:
                Intent intent3 = new Intent(v.getContext(), Card3.class);
                startActivity(intent3);
                break;
            case R.id.Yoga4:
                Uri uri = Uri.parse("https://bit.ly/hobbi8app");
                Intent intent4 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent4);
                break;

        }
    }
}

