package cz.uhk.fivethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents() {
        Button buttonA3 = (Button) findViewById(R.id.btn);
        buttonA3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                doSomething();
            }
        });
    }

    private void doSomething() {
        Intent i = new Intent(getApplicationContext(), BrazilScreen.class);
        startActivity(i);
    }

}
