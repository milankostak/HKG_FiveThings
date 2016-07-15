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
        Button btnNepal = (Button) findViewById(R.id.btnNepal);
        btnNepal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showNepal();
            }
        });
        Button btnKiribati = (Button) findViewById(R.id.btnKiribati);
        btnKiribati.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showKiribati();
            }
        });
        Button btnVatican = (Button) findViewById(R.id.btnVatican);
        btnVatican.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showVatican();
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

    private void showNepal() {
        Intent i = new Intent(getApplicationContext(), NepalScreen.class);
        startActivity(i);
    }

    private void showKiribati() {
        Intent i = new Intent(getApplicationContext(), KiribatiScreen.class);
        startActivity(i);
    }

    private void showVatican() {
        Intent i = new Intent(getApplicationContext(), VaticanScreen.class);
        startActivity(i);
    }

}
