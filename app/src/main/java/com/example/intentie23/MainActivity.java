package com.example.intentie23;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends Activity
        implements View.OnClickListener {
    TextView tvName;
    Button btnName;
    /** Called when the activity is first
     created. */
    @Override
    public void onCreate(Bundle
                                 savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        tvName = (TextView)
                findViewById(R.id.tvName);
        btnName = (Button)
                findViewById(R.id.btnName);
        btnName.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,
                Intent2.class);
        startActivityForResult(intent, 111);
    }
    @Override
    protected void onActivityResult(int
                                            requestCode, int resultCode, Intent data) {
        if (data == null) {return;}
        String name =
                data.getStringExtra("name");
        tvName.setText("The entered name: " + name);
    }
}