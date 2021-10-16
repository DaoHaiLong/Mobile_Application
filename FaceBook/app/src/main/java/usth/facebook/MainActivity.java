package usth.facebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;
import android.net.Uri;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    public static final String mess="Android";
    private TabLayout tabLayout;
    private VideoView videoView;
    private MediaController mediaController;
    private int position = 0;
    private int[] tabIcons = {
            R.drawable.ic_tab_newfeedhome,
            R.drawable.ic_tab_profile,
            R.drawable.ic_tab_watch,
            R.drawable.ic_tab_notification,
            R.drawable.ic_tab_menu
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PagerAdapter adapter = new HomePageAdapterFacebook(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setOffscreenPageLimit(5);
        pager.setAdapter(adapter);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);
        createTabIcons();

        /** Facebook view.1 */
//        VideoView videoView = findViewById(R.id.View_video);
//        String videopath ="android.resource://" + getPackageName() + "/" + R.raw.video1;
//        Uri uri = Uri.parse(videopath);
//        videoView.setVideoURI(uri);
//
//        MediaController mediaController = new MediaController(this);
//        videoView.setMediaController(mediaController);
//        mediaController.setAnchorView(videoView);
//
//        /** Facebook view.2 */
//        VideoView videoView2 = findViewById(R.id.View_video2);
//        String videopath2 ="android.resource://" + getPackageName() + "/" + R.raw.video2;
//        Uri uri2 = Uri.parse(videopath2);
//        videoView2.setVideoURI(uri2);
//
//        MediaController mediaController2 = new MediaController(this);
//        videoView2.setMediaController(mediaController2);
//        mediaController.setAnchorView(videoView2);

//        /** Facebook view.3 */
//        VideoView videoView3 = findViewById(R.id.View_video3);
//        String videopath3 ="android.resource://" + getPackageName() + "/" + R.raw.video3;
//        Uri uri3 = Uri.parse(videopath3);
//        videoView3.setVideoURI(uri3);
//
//        MediaController mediaController3 = new MediaController(this);
//        videoView.setMediaController(mediaController3);
//        mediaController.setAnchorView(videoView3);
//
//        /** Facebook view.4 */
//        VideoView videoView4 = findViewById(R.id.View_video4);
//        String videopath4 ="android.resource://" + getPackageName() + "/" + R.raw.video4;
//        Uri uri4 = Uri.parse(videopath4);
//        videoView4.setVideoURI(uri4);
//
//        MediaController mediaController4 = new MediaController(this);
//        videoView.setMediaController(mediaController4);
//        mediaController.setAnchorView(videoView4);

//        Notification

    }


    private void createTabIcons() {

        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        // Print Log
        Log.i(mess,"onStart");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        // Print Log
        Log.i(mess,"onStop");
    }

    /** Called just before the activity is destroyed. */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Print Log
        Log.i(mess,"onDestroy");
    }
    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        // Print Log
        Log.i(mess,"onPause");
    }
    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        // Print Log
        Log.i(mess,"onResume");      }


    /** Called just before the activity is restarted. */
    @Override
    protected void onRestart() {
        super.onRestart();
        // Print Log
        Log.i(mess,"onRestart");
    }
}