package com.example.qyb.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static String TAG="TestGit";
    public static String TAG2="TestGit2";
    public static String TAG3="TestGit3";
    private static String localTag="TestLocalTag";
    public static String remoteTag="TestRemoteTag";
    public static String tempTag="TestTempTag";
    private static String otherTag="otherTag";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
