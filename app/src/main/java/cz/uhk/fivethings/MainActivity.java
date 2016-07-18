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
                openActivity(BrazilScreen.class);
            }
        });
        Button btnBurkina = (Button) findViewById(R.id.btnBurkinaFaso);
        btnBurkina.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivity(BurkinaFasoScreen.class);
            }
        });
        Button btnNepal = (Button) findViewById(R.id.btnNepal);
        btnNepal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivity(NepalScreen.class);
            }
        });
        Button btnKiribati = (Button) findViewById(R.id.btnKiribati);
        btnKiribati.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivity(KiribatiScreen.class);
            }
        });
        Button btnVatican = (Button) findViewById(R.id.btnVatican);
        btnVatican.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivity(VaticanScreen.class);
            }
        });
        Button btnAnotherThings = (Button) findViewById(R.id.btnAnotherThigs);
        btnAnotherThings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivity(TabTest.class);
            }
        });
    }

    private void openActivity(Class clazz) {
        Intent i = new Intent(getApplicationContext(), clazz);
        startActivity(i);
    }

}
