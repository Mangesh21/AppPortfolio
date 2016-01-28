package appportfolio.mk.com.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnInventoryApp;
    Button btntimetable;
    Button btnshoppingapp;
    Button btntaxibooking;
    Button btnsocialissues;

    final String APP_MESSAGE = "This button will launch ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInventoryApp = (Button) findViewById(R.id.btnInventoryApp);
        btntimetable = (Button) findViewById(R.id.btntimetable);
        btnshoppingapp = (Button) findViewById(R.id.btnshoppingapp);
        btntaxibooking = (Button) findViewById(R.id.btntaxibooking);
        btnsocialissues = (Button) findViewById(R.id.btnsocialissues);

        btnInventoryApp.setOnClickListener(this);
        btntimetable.setOnClickListener(this);
        btnshoppingapp.setOnClickListener(this);
        btntaxibooking.setOnClickListener(this);
        btnsocialissues.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnInventoryApp:
                Toast.makeText(MainActivity.this,  APP_MESSAGE +" Inventory App", Toast.LENGTH_LONG).show();
                break;
            case R.id.btntimetable:
                Toast.makeText(MainActivity.this,  APP_MESSAGE +" Bus Time Table App", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnshoppingapp:
                Toast.makeText(MainActivity.this,  APP_MESSAGE +" Cloth Shopping App", Toast.LENGTH_LONG).show();
                break;
            case R.id.btntaxibooking:
                Toast.makeText(MainActivity.this,  APP_MESSAGE +" Taxi Booking App", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnsocialissues:
                Toast.makeText(MainActivity.this,  APP_MESSAGE +" Social Issues App", Toast.LENGTH_LONG).show();
                break;
        }

    }
}
