package com.example.liuqun.picassodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.iv_img);

        //直接加载图片
//        Picasso.with(this).load("http://img0.imgtn.bdimg.com/it/u=3889404733," +
//                "2098147809&fm=21&gp=0.jpg").into(imageView);
//
//        //设置图片大小(宽高)
//        Picasso.with(this).load("http://img0.imgtn.bdimg.com/it/u=3889404733," +
//                "2098147809&fm=21&gp=0.jpg").resize(50,50).into(imageView);

        //设置出错时加载的图片
        Picasso.with(this).load("http://dp.xinshoucun" +
                ".com/uploads/article/2012-05/29_1338201695.jpg").error(R
                .mipmap.ic_launcher).into(imageView);

        //Picasso 还能加载本地图片  load()
    }
}
