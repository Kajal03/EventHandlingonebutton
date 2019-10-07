package com.example.tushar.eventhandlingonebutton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button A = (Button) findViewById(R.id.button);

        A.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        TextView B = (TextView) findViewById(R.id.textView);
                        B.setText("Bye Bye!!");
                        TextView A = (TextView) findViewById(R.id.textView);
                        A.setText("Tata!!");
                    }
                }
        );
    }

    @Override
    protected void onStart() {
        super.onStart();
        TextView B = (TextView) findViewById(R.id.textView);
        B.setText("Hello !");
        B.setText("Hey!!");
    }
}
