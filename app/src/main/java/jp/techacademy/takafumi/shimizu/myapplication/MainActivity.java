package jp.techacademy.takafumi.shimizu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText;
    EditText MEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);



        mEditText = (EditText) findViewById(R.id.editText1);
        MEditText = (EditText) findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button1) {


            String v1 = mEditText.getText().toString();       //this will get a string
            int v2 = Integer.parseInt(v1);

            String V1 = MEditText.getText().toString();       //this will get a string
            int V2 = Integer.parseInt(V1);

            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("VALUE1", v2);
            intent.putExtra("VALUE2", V2);
            startActivity(intent);

        }else if(v.getId() == R.id.button2){

            String v1 = mEditText.getText().toString();       //this will get a string
            int v2 = Integer.parseInt(v1);

            String V1 = MEditText.getText().toString();       //this will get a string
            int V2 = Integer.parseInt(V1);

            Intent intent = new Intent(this, ThirdActivity.class);
            intent.putExtra("VALUE1", v2);
            intent.putExtra("VALUE2", V2);
            startActivity(intent);

        }else if(v.getId() == R.id.button3){

            String v1 = mEditText.getText().toString();       //this will get a string
            int v2 = Integer.parseInt(v1);

            String V1 = MEditText.getText().toString();       //this will get a string
            int V2 = Integer.parseInt(V1);

            Intent intent = new Intent(this, ForthActivity.class);
            intent.putExtra("VALUE1", v2);
            intent.putExtra("VALUE2", V2);
            startActivity(intent);

        }else if(v.getId() == R.id.button4){

            String v1 = mEditText.getText().toString();       //this will get a string
            int v2 = Integer.parseInt(v1);

            String V1 = MEditText.getText().toString();       //this will get a string
            int V2 = Integer.parseInt(V1);

            Intent intent = new Intent(this, FifthActivity.class);
            intent.putExtra("VALUE1", v2);
            intent.putExtra("VALUE2", V2);
            startActivity(intent);

        }
    }

}