package net.unifyconcept.summercode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Olabode Qudus on 9/28/2018.
 */

public class OrderingActivity extends AppCompatActivity {
    TextView textView; int a=1;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ordering_app);
        textView = findViewById(R.id.textView2);
    }
    public void toast_coffee(View view){
        textView.setText("" +a);
        a++;
    }
}
