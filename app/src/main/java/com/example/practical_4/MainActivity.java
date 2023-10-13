package com.example.practical_4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle button click here
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView.setText("onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        textView.setText("onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        textView.setText("onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        textView.setText("onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textView.setText("onDestroy() called");
    }
}
