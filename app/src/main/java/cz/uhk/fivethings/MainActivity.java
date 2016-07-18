package cz.uhk.fivethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static cz.uhk.fivethings.common.TabsConstants.*;

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
                // openActivity(BrazilScreen.class);
                openActivity(TabsThings.class, BRAZIL_PAGE);
            }
        });
        Button btnBurkina = (Button) findViewById(R.id.btnBurkinaFaso);
        btnBurkina.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // openActivity(BurkinaFasoScreen.class);
                openActivity(TabsThings.class, BURKINA_FASO_PAGE);
            }
        });
        Button btnNepal = (Button) findViewById(R.id.btnNepal);
        btnNepal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // openActivity(NepalScreen.class);
                openActivity(TabsThings.class, NEPAL_PAGE);
            }
        });
        Button btnKiribati = (Button) findViewById(R.id.btnKiribati);
        btnKiribati.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // openActivity(KiribatiScreen.class);
                openActivity(TabsThings.class, KIRIBATI_PAGE);
            }
        });
        Button btnVatican = (Button) findViewById(R.id.btnVatican);
        btnVatican.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // openActivity(VaticanScreen.class);
                openActivity(TabsThings.class, VATICAN_PAGE);

            }
        });
    }

    private void openActivity(Class clazz, int param) {
        Intent i = new Intent(getApplicationContext(), clazz);
        i.putExtra(TABS_PARAMETER, param);
        startActivity(i);
    }

    private void openActivity(Class clazz) {
        Intent i = new Intent(getApplicationContext(), clazz);
        startActivity(i);
    }

}
