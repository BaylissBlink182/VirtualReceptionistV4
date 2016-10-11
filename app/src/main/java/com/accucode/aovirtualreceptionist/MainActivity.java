package com.accucode.aovirtualreceptionist;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    ViewPager viewpager;
    Button btnTransfer;
    private static final String BUTTON_TEXT = "Call Google Sheets API";
    private static final String PREF_ACCOUNT_NAME = "accountName";
//    private static final String[] SCOPES = { SheetsScopes.SPREADSHEETS_READONLY };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTransfer=(Button)findViewById(R.id.btnTransfer);
        btnTransfer.setBackgroundColor(Color.TRANSPARENT);
        btnTransfer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent myIntent = new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(myIntent);
            }
        });
//        viewpager = (ViewPager) findViewById(R.id.pager);
//        PagerAdapter padapter = new PagerAdapter(getSupportFragmentManager());
//        viewpager.setAdapter(padapter);
    }

}