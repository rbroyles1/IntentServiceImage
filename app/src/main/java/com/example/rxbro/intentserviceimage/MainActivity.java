package com.example.rxbro.intentserviceimage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends Activity {
    public final String IMAGE_URL_1 = "http://t2.gstatic.com/images?q=tbn:ANd9GcSL0o05J2kX0aNGBTrHUiOOOJ7Js7vehTd2KTelY9PVP1JJXaiZ_A";
    public final String IMAGE_URL_2 = "http://www.hdwallpapersbest.com/wp-content/uploads/2012/12/android-wallpaper.jpg";
    public final String IMAGE_URL_3 = "http://t2.gstatic.com/images?q=tbn:ANd9GcR-ku_J_IfvDGT9Ck6OUFZyJgocRihcRWiBMKBGR6WS79i4Wbfy";
    public static final String KEY_URL = "image_url";
    public static final String KEY_NAME = "file_name";
    public static final String file_1 = "file_1.jpg";
    public static final String file_2 = "file_2.jpg";
    public static final String file_3 = "file_3.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, MyQueue.class);
        intent.putExtra(KEY_URL, IMAGE_URL_1);
        intent.putExtra(KEY_NAME, file_1);
        startService(intent);
        intent = new Intent(this, MyQueue.class);
        intent.putExtra(KEY_URL, IMAGE_URL_2);
        intent.putExtra(KEY_NAME, file_2);
        startService(intent);
        intent = new Intent(this, MyQueue.class);
        intent.putExtra(KEY_URL, IMAGE_URL_3);
        intent.putExtra(KEY_NAME, file_3);
        startService(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
