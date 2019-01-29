package com.example.cwitstudent.a300cemlab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText makeEditText;
    EditText yearEditText;
    Button button;

//    class RunButtonClickListener implements View.OnClickListener{
//        @Override
//        public void onClick(View v){
//            String make = makeEditText.getText().toString();
//            int year =Integer.parseInt(yearEditText.getText().toString());
//            Vehicle vehicle = new Vehicle(make,year);
//            Toast.makeText(MainActivity.this,vehicle.getMessage(),Toast.LENGTH_LONG).show();
//
//        }
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.makeEditText = findViewById(R.id.editText);
        this.yearEditText = findViewById(R.id.editText2);
        this.button = findViewById(R.id.button);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            String make = makeEditText.getText().toString();
            int year =Integer.parseInt(yearEditText.getText().toString());
            Vehicle vehicle = new Vehicle(make,year);
            Toast.makeText(MainActivity.this,vehicle.getMessage(),Toast.LENGTH_LONG).show();


            }
        });


    }
}
