package android.newapi.FullScreenWatch;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.newapi.R;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

public class Fullscreen_video2 extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_video2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        videoView = findViewById(R.id.fullscreen2);
        Uri video = Uri.parse("https://cdn-cf-east.streamable.com/video/mp4/cx3p8x.mp4?Expires=1636519200&Signature=CccoANsRsKT00QU2bOt5TvzY2jJF2JkdUaQ0ipZYgGp8~zVnIxj1pEaMI7L4RU1sJv9vWc0tMORBfuWJFmgpRQjjBmUOHE-tf6WZuogzPYTE1NDcw5OgVPxbOPBDNCZVwli7O1Z~4SxH1NzCEe6CGimtf-h-p-C4QvAlGELXi3agxsoXrH~AJ6JlFD-aAeuHXvXd6hFmntng2hj1lZA6bHLPxvMrWISVOJSyRndJ2zdeNP0wPGp~YughyCFEvqWMIkQ2dqK3fXBjhRx66zWAZis80yWK6JwfASy~yT3YA6tDJgWjMT3bdECkOfZzVU0Yx4pF~tSsezvYNhj0tw3DGQ__&Key-Pair-Id=APKAIEYUVEN4EVB2OKEQ");
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