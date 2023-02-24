package uz.itschool.buyurtmaberish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBox , checkBox1 , checkBox2 ,checkBox3;
    private Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = (CheckBox)  findViewById(R.id.checkBox);
        checkBox1 = (CheckBox)  findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox)  findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)  findViewById(R.id.checkBox3);

        button = (Button)  findViewById(R.id.button);
    }

    public void  buyurtmaBerish(){
        checkBox = (CheckBox)  findViewById(R.id.checkBox);
        checkBox1 = (CheckBox)  findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox)  findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)  findViewById(R.id.checkBox3);

        button = (Button)  findViewById(R.id.button);


        StringBuilder natija = new StringBuilder();
    }
}