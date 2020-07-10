package davidb.example.whrungsrechner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClick(View view){

    Log.i("info","button wurde gedrückt");

    EditText geld = findViewById(R.id.betrag);

    String geldInEuro=geld.getText().toString();

    double euroDouble= Double.parseDouble(geldInEuro);

    double euroInRon = Math.round((euroDouble*4.81)*100)/100;

    String ergebnis =String.valueOf(euroInRon);

    Toast.makeText(this, "€"+ euroDouble + " sind in RON: "+ ergebnis, Toast.LENGTH_LONG).show();

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
