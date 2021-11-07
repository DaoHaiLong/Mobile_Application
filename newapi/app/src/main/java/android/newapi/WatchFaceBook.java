package android.newapi;

import android.content.Intent;
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
        Uri video3 = Uri.parse("https://cdn-cf-east.streamable.com/video/mp4/ye0gj2.mp4?Expires=1636296420&Signature=do~eG33BAu1vXhUj5KVkKi6IHJPLD1XNd9FIq3Ywzahyd074TH-gLtv08~S1jYywteuHoFa3~p0M0-stnXJ2OkW1PncysKIG5FeSZPoL9llOuCf3aqZm0nj42MvvZvk8U-1PM05xvIGxN7R7wzFiNHTc854xun-Q0p7sOh8k~EyEcgWZdGRiMZB-gHHmk0e2bxFWOA6BZ2bhhLD4HqW2QQ2kfK4nySLgctVrVXgsRSWqEgsHnpFNiTXNxh6OMv2e8Lp931nUZF4npYHqH3UWb~h03kqtFcatUc7XE4quksYPqQKMejgF0akMMlhfU34UWiAWFUjczFo5g65oXZU09w__&Key-Pair-Id=APKAIEYUVEN4EVB2OKEQ");
        videoView3.setVideoURI(video3);

        MediaController mediaController3 = new MediaController(getActivity());
        videoView3.setMediaController(mediaController3);
        mediaController2.setAnchorView(videoView3);
        /** Face Watch 4 */
        videoView4 = (VideoView) view.findViewById(R.id.video_view4);
        Uri video4 = Uri.parse("https://cdn-cf-east.streamable.com/video/mp4/xt3mf4.mp4?Expires=1636296480&Signature=Fk9QcafyUTFGU1oa5jbv888VOEULZm03Il3lKo5~k0AdAe~ILb5RoWvsYG5b9OZiPJdf6a63fXuRSH5ZPwOy3DvBN0U2-6uxSa-XL6RzuD2bdvve7YlnHw5wkA1M3K7fe7s91Tg2szLf4~U8FPtbwxarYsjZcneC5o8lW6FcEni8egwCJgxj79NLUJ6XmeuU0tFP~Mk4xykWg3bh2tlrdQtB1n3kEkG3nEadG4W8O8SrDH6282chspialCc79T~5nUyI1GRs06bXGVXYzjoHBOAFzvbpjQ5lwXS-wN8k8zZNxT6VnmSo57KLRr7jdNtwIbDA03ZwVbymk1av3C~zxA__&Key-Pair-Id=APKAIEYUVEN4EVB2OKEQ");
        videoView4.setVideoURI(video4);

        MediaController mediaController4 = new MediaController(getActivity());
        videoView4.setMediaController(mediaController4);
        mediaController4.setAnchorView(videoView4);


        /**Comment button**/
        Button butw=(Button) view.findViewById(R.id.butwatch2);
        Button butw1=(Button) view.findViewById(R.id.butwatch5);
        Button butw2=(Button) view.findViewById(R.id.butwatch8);
        Button butw3=(Button) view.findViewById(R.id.butwatch11);

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