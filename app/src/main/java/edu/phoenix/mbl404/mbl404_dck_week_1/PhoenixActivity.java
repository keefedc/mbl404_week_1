package edu.phoenix.mbl404.mbl404_dck_week_1;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class PhoenixActivity extends AppCompatActivity {

    //Activity variables.

    private String name, email;

    //Layout items.

    private TextView textName, textEmail;

    //Activity entry point.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Initialize activity layout.

        setContentView(R.layout.phoenix_activity);

        //Call function to retrieve and parse intent from parent activity.

        getIncomingIntent();

        //Bind java variable layout items to layout xml items.  Set text to activity variables.

        textName = (TextView) findViewById(R.id.pho_name);
        textName.setText(name);
        textEmail = (TextView) findViewById(R.id.pho_email);
        textEmail.setText(email);
    }

    //onOptionsItemSelected populates the "previous" arrow in the activity bar.

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

    /*
    getIncomingIntent sets the activity variables by calling the getIntent function and the
    associated key values that were defined in the parent activity.
     */

    private void getIncomingIntent(){
        this.name = getIntent().getStringExtra("name");
        this.email = getIntent().getStringExtra("email");
    }

}
