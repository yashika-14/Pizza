package com.example.dell.pizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spin1;
    Spinner spin2;
    Spinner spin3;
    Spinner spin4;
    Spinner spin5;
    Spinner spin6;
    Spinner spin7;
    Spinner spin8;
    Spinner spin9;
    Spinner spin10;
    String data1[] = {"Cheese", "Onion" ,"Tomato" , "Brinjal"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin1 = (Spinner)findViewById(R.id.spin1);
        spin2 = (Spinner)findViewById(R.id.spin2);
        spin3 = (Spinner)findViewById(R.id.spin3);
        spin4 = (Spinner)findViewById(R.id.spin4);
        spin5 = (Spinner)findViewById(R.id.spin5);
        spin6 = (Spinner)findViewById(R.id.spin6);
        spin7 = (Spinner)findViewById(R.id.spin7);
        spin8 = (Spinner)findViewById(R.id.spin8);
        spin9 = (Spinner)findViewById(R.id.spin9);
        spin10 = (Spinner)findViewById(R.id.spin10);


        ArrayAdapter adapter1 = new ArrayAdapter(MainActivity.this , android.R.layout.simple_spinner_dropdown_item,data1);

        spin1.setAdapter(adapter1);
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter1View, View view, int position, long id) {

                switch (position) {
                    case 1:
                        Toast.makeText(MainActivity.this, "Null", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Onion", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Tomato", Toast.LENGTH_SHORT).show();
                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });
        spin2.setAdapter(adapter1);
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter1View, View view, int position, long id) {

                switch (position) {
                    case 1:
                        Toast.makeText(MainActivity.this, "Null", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Onion", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Tomato", Toast.LENGTH_SHORT).show();
                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

        spin3.setAdapter(adapter1);
        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter1View, View view, int position, long id) {

                switch (position) {
                    case 1:
                        Toast.makeText(MainActivity.this, "Null", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Onion", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Tomato", Toast.LENGTH_SHORT).show();
                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

        spin4.setAdapter(adapter1);
        spin4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter1View, View view, int position, long id) {

                switch (position) {
                    case 1:
                        Toast.makeText(MainActivity.this, "Null", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Onion", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Tomato", Toast.LENGTH_SHORT).show();
                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

        spin5.setAdapter(adapter1);
        spin5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter1View, View view, int position, long id) {

                switch (position) {
                    case 1:
                        Toast.makeText(MainActivity.this, "Null", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Onion", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Tomato", Toast.LENGTH_SHORT).show();
                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

        spin6.setAdapter(adapter1);
        spin6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter1View, View view, int position, long id) {

                switch (position) {
                    case 1:
                        Toast.makeText(MainActivity.this, "Null", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Onion", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Tomato", Toast.LENGTH_SHORT).show();
                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });
        spin7.setAdapter(adapter1);
        spin7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter1View, View view, int position, long id) {

                switch (position) {
                    case 1:
                        Toast.makeText(MainActivity.this, "Null", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Onion", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Tomato", Toast.LENGTH_SHORT).show();
                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });
        spin8.setAdapter(adapter1);
        spin8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter1View, View view, int position, long id) {

                switch (position) {
                    case 1:
                        Toast.makeText(MainActivity.this, "Null", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Onion", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Tomato", Toast.LENGTH_SHORT).show();
                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });
        spin9.setAdapter(adapter1);
        spin9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter1View, View view, int position, long id) {

                switch (position) {
                    case 1:
                        Toast.makeText(MainActivity.this, "Null", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Onion", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Tomato", Toast.LENGTH_SHORT).show();
                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });
        spin10.setAdapter(adapter1);
        spin10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter1View, View view, int position, long id) {

                switch (position) {
                    case 1:
                        Toast.makeText(MainActivity.this, "Null", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Onion", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Tomato", Toast.LENGTH_SHORT).show();
                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

    }

}

