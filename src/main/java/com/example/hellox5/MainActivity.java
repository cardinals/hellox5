package com.example.hellox5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.graphics.PixelFormat;
import android.os.Handler;
import android.os.Message;
import com.example.hellox5.utils.X5WebView;
import com.tencent.smtt.sdk.CookieSyncManager;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebSettings.LayoutAlgorithm;
import com.tencent.smtt.utils.TbsLog;

public class MainActivity extends AppCompatActivity {

    private X5WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFormat(PixelFormat.TRANSLUCENT);

        try {
            if (Integer.parseInt(android.os.Build.VERSION.SDK) >= 11) {
                getWindow()
                        .setFlags(
                                android.view.WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED,
                                android.view.WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED);
            }
        } catch (Exception e) {
        }

        setContentView(R.layout.activity_main);
        mWebView = (X5WebView)findViewById(R.id.webView);

        mWebView.loadUrl("https://threejs.org/examples/#webgl_animation_cloth");
//        mWebView.loadUrl("http://192.168.70.33:8222/");
    }
}