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
        Uri video = Uri.parse("https://cdn-cf-east.streamable.com/video/mp4/ye0gj2.mp4?Expires=1636640940&Signature=L2eNV0HS6ZCHO5~UNIi0ZNEBuOHGpRpYdGxef1ySsyBF8mhBkEd1PD3YqnLjwt-BpkQ9eijovPSY5T~HORVKLo3S39HP-~eNBvJRyQYLRoGY2QodH1dKo2Ny8JlkKL9HNz3~daVvYTAvU6LmMXU2M5v~IcWyRBbFQ940PJk29kmwPfqCtRL3wcrr9YEKjatK5vJou46SiTCOOdo9AXgH5ZlxETNcvs0ffomQUQrfhuePDidaoJZSrHd8Y8SrA0L6zY7O8L8WOq8u0VJDuZo3D4dbpSPSUUdIwdfuGvLQVtzBJTaGDEXx52Qj4Rz-HcavJc-Lecz79CyUFzqRIV8dsA__&Key-Pair-Id=APKAIEYUVEN4EVB2OKEQ");
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