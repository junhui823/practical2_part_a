package com.example.practical_2_part_a;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this,"Chee Jun Hui 19WMD03012",Toast.LENGTH_SHORT);

        toast.show();
    }

    public void countUp(View view){
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void resetCount(View view){
        mCount=0;
        mShowCount.setText(String.valueOf(mCount));
        if(mShowCount !=null) {
            mShowCount.setText(Integer.toString(mCount));
            int number = mCount % 2;
            if (number ==0){
                view.setBackgroundColor(Color.GREEN);
            }
            else
                view.setBackgroundColor(Color.RED);
            findViewById(R.id.button_zero).setBackgroundColor(Color.RED);
        }
    };
}