package android.newapi.FullScreenWatch;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.newapi.R;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

public class Fullscreen_video1 extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_video1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        videoView = findViewById(R.id.fullscreen1);
        Uri video = Uri.parse("https://cdn-cf-east.streamable.com/video/mp4/tu840h.mp4?Expires=1636519140&Signature=jGaDM4P66v35WR55T6NcdFfj3z7WvYoRSLJietznvYEyvIgNKqHT0CcdzBps5EFFiBvjupmS3ryiJ1kce3eysAxTZAnuz~Tu00sI8oJKbqYwSZiFLoNjSIdifC3MTyaRjrEJbmOq35zjxyPigY6BbbF6oYSO5kdfTDeXNOUO7Ej4lOcKksTASOlxwGPNLE7rYqX0RQtA-q-ewhCLreAjFhfpHUr-miJRDwM88Ub-a5AZX43ayzK~4fuxV75cuIMU48S59-NiOEZ1lWYm-DZ54C481oB97ICYV4kXJ~cyDFKygnyMrnc8hbNA3qFwJvec0XQ~gdQZjFnl8Zg7N89U1Q__&Key-Pair-Id=APKAIEYUVEN4EVB2OKEQ");
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