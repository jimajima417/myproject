package com.example.layoutsamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * アクティヴィティが開始した時に実行されるメソッド<br>
     *     R.layout.activit_mainはres/layoutフォルダ内のactivity_main.xmlというファイルを表す.
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}