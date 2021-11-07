package android.newapi.FullScreenWatch;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.newapi.R;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

public class Fullscreen_video3 extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_video3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        videoView = findViewById(R.id.fullscreen3);
        Uri video = Uri.parse("https://cdn-cf-east.streamable.com/video/mp4/ye0gj2.mp4?Expires=1636296420&Signature=do~eG33BAu1vXhUj5KVkKi6IHJPLD1XNd9FIq3Ywzahyd074TH-gLtv08~S1jYywteuHoFa3~p0M0-stnXJ2OkW1PncysKIG5FeSZPoL9llOuCf3aqZm0nj42MvvZvk8U-1PM05xvIGxN7R7wzFiNHTc854xun-Q0p7sOh8k~EyEcgWZdGRiMZB-gHHmk0e2bxFWOA6BZ2bhhLD4HqW2QQ2kfK4nySLgctVrVXgsRSWqEgsHnpFNiTXNxh6OMv2e8Lp931nUZF4npYHqH3UWb~h03kqtFcatUc7XE4quksYPqQKMejgF0akMMlhfU34UWiAWFUjczFo5g65oXZU09w__&Key-Pair-Id=APKAIEYUVEN4EVB2OKEQ");
        videoView.setVideoURI(video);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setPadding(0, 0, 0, 0);
        mediaController.setAnchorView(videoView);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
}