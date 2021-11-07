package android.newapi.FullScreenWatch;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.newapi.R;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

public class Fullscreen_video4 extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_video4);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        videoView = findViewById(R.id.fullscreen4);
        Uri video = Uri.parse("https://cdn-cf-east.streamable.com/video/mp4/xt3mf4.mp4?Expires=1636296480&Signature=Fk9QcafyUTFGU1oa5jbv888VOEULZm03Il3lKo5~k0AdAe~ILb5RoWvsYG5b9OZiPJdf6a63fXuRSH5ZPwOy3DvBN0U2-6uxSa-XL6RzuD2bdvve7YlnHw5wkA1M3K7fe7s91Tg2szLf4~U8FPtbwxarYsjZcneC5o8lW6FcEni8egwCJgxj79NLUJ6XmeuU0tFP~Mk4xykWg3bh2tlrdQtB1n3kEkG3nEadG4W8O8SrDH6282chspialCc79T~5nUyI1GRs06bXGVXYzjoHBOAFzvbpjQ5lwXS-wN8k8zZNxT6VnmSo57KLRr7jdNtwIbDA03ZwVbymk1av3C~zxA__&Key-Pair-Id=APKAIEYUVEN4EVB2OKEQ");
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