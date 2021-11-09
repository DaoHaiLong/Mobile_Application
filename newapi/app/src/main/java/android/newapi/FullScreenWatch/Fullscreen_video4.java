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
        Uri video = Uri.parse("https://cdn-cf-east.streamable.com/video/mp4/xt3mf4.mp4?Expires=1636641000&Signature=jl7~AX9hiswc3IIUhJlui4u~4rXYUy6ehuuvo-ONsbSNZv3bHz7qWD3m8RggmE4GFQlhoML4fdIEtSk6B0yayeLs6oWSbVYGYq-F8SSJADALObbYft8bSdKWeUEpKiWdcmp~AlI9FL2pXbNKmUO1WqIhTUqmUK88-C9PbGBu4tyK7oqtpFrDzIniUh-3tr0iQV2IvwvAGw~OuGH37zmuRCMlYApK2jxu4jSCWEL~oJSyHXLgrGdrQkoI4jb0CYN4NvP~rY89zSrkfgQUwO6e~w363cXrlXkvHuaf5Sfno32qHXMlLpOwWMHT7eO8W30kM7~pU8dXEOq0CkRRUCXV8A__&Key-Pair-Id=APKAIEYUVEN4EVB2OKEQ");
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