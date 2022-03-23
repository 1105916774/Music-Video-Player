package cn.itcast.project;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Integer.parseInt;

public class video_Activity extends AppCompatActivity implements View.OnClickListener {
    private VideoView videoView;
    private MediaController controller;
    ImageView iv_play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        videoView=findViewById(R.id.videoview);
        iv_play=findViewById(R.id.bt_play);
        Intent intent=getIntent();
        String position=intent.getStringExtra("position");

        //*获取视频列数id
        int i=parseInt(position);
        String url="android.resource://" + getPackageName() + "/raw/" + "video" + i;

        //拼出在资源文件夹下的视频文件路径String字符串
//        String url="android.resource://"+getPackageName()+"/"+R.raw.video1;

        //字符串解析成Uri
        Uri uri=Uri.parse(url);
        //设置videoview的播放资源
        videoView.setVideoURI(uri);
        //VideoView绑定控制器

        controller=new MediaController(this);
        videoView.setMediaController(controller);
        iv_play.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.bt_play:
                play();
                break;
        }
    }
    private void play(){
        if(videoView!=null && videoView.isPlaying()){
            iv_play.setImageResource(android.R.drawable.ic_media_play);
            videoView.pause();
            return;
        }
        videoView.start();
        iv_play.setImageResource(android.R.drawable.ic_media_pause);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                iv_play.setImageResource(android.R.drawable.ic_media_play);
            }
        });
    }
}
