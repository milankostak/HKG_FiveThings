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
        Button btnBrazil = (Button) findViewById(R.id.btnBrazil);
        btnBrazil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showBrazil();
            }
        });
        Button btnBurkina = (Button) findViewById(R.id.btnBurkinaFaso);
        btnBurkina.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showBurkinaFaso();
            }
        });
    }

    private void showBrazil() {
        Intent i = new Intent(getApplicationContext(), BrazilScreen.class);
        startActivity(i);
    }

    private void showBurkinaFaso() {
        Intent i = new Intent(getApplicationContext(), BurkinaFasoScreen.class);
        startActivity(i);
    }

}
