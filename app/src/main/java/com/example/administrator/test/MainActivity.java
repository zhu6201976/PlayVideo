package com.example.administrator.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;


/**
 * 使用VideoView播放视频，三行代码搞定，非常简单
 * 2017年12月11日17:37:30
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vv = (VideoView) findViewById(R.id.vv);
        vv.setVideoPath("http://10.0.2.2:8080/oppo.mp4");
        vv.start();

    }

}
