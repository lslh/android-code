package com.example.luohao_pc.slider;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
/*  android:max="100"
android:progress="30"
        表示最大刻度为100，进度为30
        android:secondaryProgress="60"
        表示第二刻度，一般用在流媒体播放视频中，第一段表示播放进度，第二段表示下载进度*/
public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{
    // 与“系统默认SeekBar”对应的TextView
    private TextView text1;
    // 与“自定义SeekBar”对应的TextView
    private TextView text2;
    // “系统默认SeekBar”
    private SeekBar bar1;
    // “自定义SeekBar”
    private SeekBar bar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bar1 =(SeekBar)findViewById(R.id.seekbar1);
        bar2 =(SeekBar)findViewById(R.id.seekbar2);
        text1=(TextView)findViewById(R.id.textview1);
        text2=(TextView)findViewById(R.id.textview2);


    }

    @Override// 当滑动滑竿的时候会触发的事件
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if(seekBar.getId() == R.id.seekbar1){
            text1.setText("seekbar1的当前数值是： " + progress);

        }else{
            text2.setText("seekbar2的当前数值是： " + progress);
        }
    }

    @Override    //表示从哪里开始拖动
    public void onStartTrackingTouch(SeekBar seekBar) {
        if(seekBar.getId() == R.id.seekbar1){
            text1.setText("seekBar1开始拖动");
        }else {
            text1.setText("seekBar2开始拖动");
        }
    }

    @Override  //表示从哪里结束拖动
    public void onStopTrackingTouch(SeekBar seekBar) {
        if(seekBar.getId() == R.id.seekbar1){
            text1.setText("seekBar1停止拖动");
        }else {
            text1.setText("seekBar2停止拖动");
        }
    }



}
