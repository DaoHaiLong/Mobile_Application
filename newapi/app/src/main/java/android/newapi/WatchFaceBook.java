package android.newapi;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.newapi.ButtonComment.ButtonCommentFragmentWatch;
import android.newapi.ButtonComment.ButtonCommentFragmentWatch2;
import android.newapi.ButtonComment.ButtonCommentFragmentWatch3;
import android.newapi.ButtonComment.ButtonCommentFragmentWatch4;
import android.newapi.FullScreenWatch.Fullscreen_video1;
import android.newapi.FullScreenWatch.Fullscreen_video2;
import android.newapi.FullScreenWatch.Fullscreen_video3;
import android.newapi.FullScreenWatch.Fullscreen_video4;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WatchFaceBook#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WatchFaceBook extends Fragment  implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private VideoView videoView, videoView2,videoView3,videoView4;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WatchFaceBook() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static WatchFaceBook newInstance() {
        WatchFaceBook fragment = new WatchFaceBook();
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

        View view= inflater.inflate(R.layout.fragment_watch_face_book, container, false);
        /** Face Watch 1 */
        videoView = (VideoView) view.findViewById(R.id.video_view);
        Uri video = Uri.parse("https://cdn-cf-east.streamable.com/video/mp4/tu840h.mp4?Expires=1636519140&Signature=jGaDM4P66v35WR55T6NcdFfj3z7WvYoRSLJietznvYEyvIgNKqHT0CcdzBps5EFFiBvjupmS3ryiJ1kce3eysAxTZAnuz~Tu00sI8oJKbqYwSZiFLoNjSIdifC3MTyaRjrEJbmOq35zjxyPigY6BbbF6oYSO5kdfTDeXNOUO7Ej4lOcKksTASOlxwGPNLE7rYqX0RQtA-q-ewhCLreAjFhfpHUr-miJRDwM88Ub-a5AZX43ayzK~4fuxV75cuIMU48S59-NiOEZ1lWYm-DZ54C481oB97ICYV4kXJ~cyDFKygnyMrnc8hbNA3qFwJvec0XQ~gdQZjFnl8Zg7N89U1Q__&Key-Pair-Id=APKAIEYUVEN4EVB2OKEQ");
        videoView.setVideoURI(video);

        MediaController mediaController = new MediaController(getActivity());
        videoView.setMediaController(mediaController);
        mediaController.setPadding(0, 0, 0, 0);
        mediaController.setAnchorView(videoView);

        /** Face Watch 2 */
        videoView2 = (VideoView) view.findViewById(R.id.video_view2);
        Uri video2 = Uri.parse("https://cdn-cf-east.streamable.com/video/mp4/cx3p8x.mp4?Expires=1636519200&Signature=CccoANsRsKT00QU2bOt5TvzY2jJF2JkdUaQ0ipZYgGp8~zVnIxj1pEaMI7L4RU1sJv9vWc0tMORBfuWJFmgpRQjjBmUOHE-tf6WZuogzPYTE1NDcw5OgVPxbOPBDNCZVwli7O1Z~4SxH1NzCEe6CGimtf-h-p-C4QvAlGELXi3agxsoXrH~AJ6JlFD-aAeuHXvXd6hFmntng2hj1lZA6bHLPxvMrWISVOJSyRndJ2zdeNP0wPGp~YughyCFEvqWMIkQ2dqK3fXBjhRx66zWAZis80yWK6JwfASy~yT3YA6tDJgWjMT3bdECkOfZzVU0Yx4pF~tSsezvYNhj0tw3DGQ__&Key-Pair-Id=APKAIEYUVEN4EVB2OKEQ");
        videoView2.setVideoURI(video2);

        MediaController mediaController2 = new MediaController(getActivity());
        videoView2.setMediaController(mediaController2);
        mediaController2.setAnchorView(videoView2);
        /** Face Watch 3 */
        videoView3 = (VideoView) view.findViewById(R.id.video_view3);
        Uri video3 = Uri.parse("https://cdn-cf-east.streamable.com/video/mp4/ye0gj2.mp4?Expires=1636640940&Signature=L2eNV0HS6ZCHO5~UNIi0ZNEBuOHGpRpYdGxef1ySsyBF8mhBkEd1PD3YqnLjwt-BpkQ9eijovPSY5T~HORVKLo3S39HP-~eNBvJRyQYLRoGY2QodH1dKo2Ny8JlkKL9HNz3~daVvYTAvU6LmMXU2M5v~IcWyRBbFQ940PJk29kmwPfqCtRL3wcrr9YEKjatK5vJou46SiTCOOdo9AXgH5ZlxETNcvs0ffomQUQrfhuePDidaoJZSrHd8Y8SrA0L6zY7O8L8WOq8u0VJDuZo3D4dbpSPSUUdIwdfuGvLQVtzBJTaGDEXx52Qj4Rz-HcavJc-Lecz79CyUFzqRIV8dsA__&Key-Pair-Id=APKAIEYUVEN4EVB2OKEQ");
        videoView3.setVideoURI(video3);

        MediaController mediaController3 = new MediaController(getActivity());
        videoView3.setMediaController(mediaController3);
        mediaController2.setAnchorView(videoView3);
        /** Face Watch 4 */
        videoView4 = (VideoView) view.findViewById(R.id.video_view4);
        Uri video4 = Uri.parse("https://cdn-cf-east.streamable.com/video/mp4/xt3mf4.mp4?Expires=1636641000&Signature=jl7~AX9hiswc3IIUhJlui4u~4rXYUy6ehuuvo-ONsbSNZv3bHz7qWD3m8RggmE4GFQlhoML4fdIEtSk6B0yayeLs6oWSbVYGYq-F8SSJADALObbYft8bSdKWeUEpKiWdcmp~AlI9FL2pXbNKmUO1WqIhTUqmUK88-C9PbGBu4tyK7oqtpFrDzIniUh-3tr0iQV2IvwvAGw~OuGH37zmuRCMlYApK2jxu4jSCWEL~oJSyHXLgrGdrQkoI4jb0CYN4NvP~rY89zSrkfgQUwO6e~w363cXrlXkvHuaf5Sfno32qHXMlLpOwWMHT7eO8W30kM7~pU8dXEOq0CkRRUCXV8A__&Key-Pair-Id=APKAIEYUVEN4EVB2OKEQ");
        videoView4.setVideoURI(video4);

        MediaController mediaController4 = new MediaController(getActivity());
        videoView4.setMediaController(mediaController4);
        mediaController4.setAnchorView(videoView4);


        /**Comment button**/
        Button butw=(Button) view.findViewById(R.id.butwatch2);
        Button butw1=(Button) view.findViewById(R.id.butwatch5);
        Button butw2=(Button) view.findViewById(R.id.butwatch8);
        Button butw3=(Button) view.findViewById(R.id.butwatch11);

//        Background button like
        Button but=(Button) view.findViewById(R.id.butwatch1);
        Button but1=(Button) view.findViewById(R.id.butwatch4);
        Button but2=(Button) view.findViewById(R.id.butwatch7);
        Button but3=(Button) view.findViewById(R.id.butwatch10);
        but.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    but.setBackgroundColor(Color.BLUE);
                }
                else if (event.getAction()==MotionEvent.ACTION_UP){
                    but.setBackgroundColor(0xE8E8E8);
                }
                return false;
            }
        });
        but1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    but1.setBackgroundColor(Color.BLUE);
                }
                else if (event.getAction()==MotionEvent.ACTION_UP){
                    but1.setBackgroundColor(0xE8E8E8);
                }
                return false;
            }
        });
        but2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    but2.setBackgroundColor(Color.BLUE);
                }
                else if (event.getAction()==MotionEvent.ACTION_UP){
                    but2.setBackgroundColor(0xE8E8E8);
                }
                return false;
            }
        });
        but3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    but3.setBackgroundColor(Color.BLUE);
                }
                else if (event.getAction()==MotionEvent.ACTION_UP){
                    but3.setBackgroundColor(0xE8E8E8);
                }
                return false;
            }
        });

        butw.setOnClickListener( this);
        butw1.setOnClickListener(this);
        butw2.setOnClickListener(this);
        butw3.setOnClickListener(this);


        Button but4=(Button) view.findViewById(R.id.full1);
        Button but5=(Button) view.findViewById(R.id.full2);
        Button but6=(Button) view.findViewById(R.id.full3);
        Button but7=(Button) view.findViewById(R.id.full4);

        but4.setOnClickListener(this);
        but5.setOnClickListener(this);
        but6.setOnClickListener(this);
        but7.setOnClickListener(this);


        return view;
    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.butwatch2:
                doClickButtonWatch();
                break;
            case R.id.butwatch5:
                doClickButtonWatch1();
                break;
            case R.id.butwatch8:
                doClickButtonWatch2();
                break;
            case R.id.butwatch11:
                doClickButtonWatch3();
                break;
            case R.id.full1:
                doClickButton4();
                break;
            case R.id.full2:
                doClickButton5();
                break;
            case R.id.full3:
                doClickButton6();
                break;
            case R.id.full4:
                doClickButton7();
                break;

        }
    }
    private void doClickButtonWatch() {
        Intent inte = new Intent(getActivity(), ButtonCommentFragmentWatch.class);
        startActivity(inte);
    }
    private void doClickButtonWatch1() {
        Intent inte1 = new Intent(getActivity(), ButtonCommentFragmentWatch2.class);
        startActivity(inte1);
    }
    private void doClickButtonWatch2() {
        Intent inte2 = new Intent(getActivity(), ButtonCommentFragmentWatch3.class);
        startActivity(inte2);
    }
    private void doClickButtonWatch3() {
        Intent inte3 = new Intent(getActivity(), ButtonCommentFragmentWatch4.class);
        startActivity(inte3);
    }
    private void doClickButton4() {
        Intent intent = new Intent(getActivity(), Fullscreen_video1.class);
        startActivity(intent);
    }
    private void doClickButton5() {
        Intent intent = new Intent(getActivity(), Fullscreen_video2.class);
        startActivity(intent);
    }
    private void doClickButton6() {
        Intent intent = new Intent(getActivity(), Fullscreen_video3.class);
        startActivity(intent);
    }
    private void doClickButton7() {
        Intent intent = new Intent(getActivity(), Fullscreen_video4.class);
        startActivity(intent);
    }

}