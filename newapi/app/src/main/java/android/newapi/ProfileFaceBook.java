package android.newapi;

import android.content.Intent;
import android.graphics.Color;
import android.newapi.ButtonComment.ButttomComment_2;
import android.newapi.ButtonComment.ButttomComment_5;
import android.newapi.ImageDetail.Imagedetail_2;
import android.newapi.ImageDetail.Imagedetail_4;
import android.newapi.ImageDetail.Imagedetail_5;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFaceBook#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFaceBook extends Fragment implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFaceBook() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ProfileFaceBook newInstance() {
        ProfileFaceBook fragment = new ProfileFaceBook();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

         View view= inflater.inflate(R.layout.fragment_profile_face_book, container, false);
        Button pro1=view.findViewById(R.id.buttonproflie1);
        Button pro2=view.findViewById(R.id.buttonproflie2);
        Button pro3=view.findViewById(R.id.buttonproflie4);
        Button pro4=view.findViewById(R.id.buttonproflie5);
        pro2.setOnClickListener(this);
        pro4.setOnClickListener(this);

        pro1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    pro1.setBackgroundColor(Color.BLUE);
                }
                else if (event.getAction()==MotionEvent.ACTION_UP){
                    pro1.setBackgroundColor(0xE8E8E8);
                }
                return false;
            }
        });
        pro3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    pro3.setBackgroundColor(Color.BLUE);
                }
                else if (event.getAction()==MotionEvent.ACTION_UP){
                    pro3.setBackgroundColor(0xE8E8E8);
                }
                return false;
            }
        });

//        call image
        ImageView imageView=view.findViewById(R.id.kimdong);
        ImageView imageView1=view.findViewById(R.id.imag4);
        imageView.setOnClickListener(this);
        imageView1.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonproflie2:
                Intent intent=new Intent(getActivity(), ButttomComment_2.class);
                startActivity(intent);
                break;
            case R.id.buttonproflie5:
                Intent intent1=new Intent(getActivity(), ButttomComment_5.class);
                startActivity(intent1);
                break;
            case R.id.kimdong:
                Intent intent2=new Intent(getActivity(), Imagedetail_5.class);
                startActivity(intent2);
                break;
            case R.id.imag4:
                Intent intent3=new Intent(getActivity(), Imagedetail_4.class);
                startActivity(intent3);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}