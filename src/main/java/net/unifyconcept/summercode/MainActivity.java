package net.unifyconcept.summercode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView; int a =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.textView);
    }
    public void toast_click(View view){
     Toast.makeText(MainActivity.this,"General focus",Toast.LENGTH_LONG).show();
    }
    public void count_click(View view){
        textView.setText("" +a);
        a++;
    }
}
