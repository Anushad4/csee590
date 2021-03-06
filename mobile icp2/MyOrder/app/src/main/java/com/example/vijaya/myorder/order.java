package com.example.vijaya.myorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

/**
 * Created by gangi on 7/1/2018.
 */

// Create Order Summary
public class order extends AppCompatActivity {

    TextView summaryText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        summaryText = findViewById(R.id.summaryText);
        summaryText.setText(Html.fromHtml("<u>Your Order Summary</u><br/><br/>"));
        if(getIntent() != null){
            summaryText.append(getIntent().getStringExtra("orderSummary"));
        }else{
            summaryText.setText("You have no orders !!");
        }
        summaryText.append(Html.fromHtml("<br/>"));
        summaryText.setVisibility(View.VISIBLE);
    }
}
