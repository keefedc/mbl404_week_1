package edu.phoenix.mbl404.mbl404_dck_week_1;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class PhoenixActivity extends AppCompatActivity {

    private String name, email;
    private TextView textName, textEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phoenix_activity);
        getIncomingIntent();
        textName = (TextView) findViewById(R.id.pho_name);
        textName.setText(name);
        textEmail = (TextView) findViewById(R.id.pho_email);
        textEmail.setText(email);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void getIncomingIntent(){
        this.name = getIntent().getStringExtra("name");
        this.email = getIntent().getStringExtra("email");
    }

}
