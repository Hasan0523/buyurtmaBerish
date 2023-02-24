package uz.itschool.buyurtmaberish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBox, checkBox1, checkBox2, checkBox3, checkBox4;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);

        button = (Button) findViewById(R.id.button);
        buyurtmaBerish();
    }

    public void buyurtmaBerish() {
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder natija = new StringBuilder();
                natija.append("\nTanlangan taomlar:");
                int jami = 0;

                if (checkBox.isChecked()) {
                    natija.append(" \nHamburger 15 000 so'm ");
                    jami += 15000;
                }

                if (checkBox1.isChecked()) {
                    natija.append("\nSandwich 10 000 so'm");
                    jami += 10000;
                }
                if (checkBox2.isChecked()) {
                    natija.append("\nHotdog5 000");
                    jami += 5000;
                }
                if (checkBox3.isChecked()) {
                    natija.append("\nCoca_cola 3 000 so'm");
                    jami += 3000;
                }
                if (checkBox4.isChecked()) {
                    natija.append("\nSharbat  2 000 so'm ");
                    jami += 2000;
                }
                natija.append("\nUmumiy to'lov:" + jami + "so'm");

                Toast.makeText(MainActivity.this, natija.toString(), Toast.LENGTH_LONG).show();

            }
        })
    }
}

