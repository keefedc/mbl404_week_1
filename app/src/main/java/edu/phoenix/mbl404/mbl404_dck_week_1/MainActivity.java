package edu.phoenix.mbl404.mbl404_dck_week_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Layout Items.

    private Button executeButton;
    private EditText name, email;

    //Program entry point.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Initialize first layout.

        setContentView(R.layout.activity_main);

        //Bind action bar to variable and bind program Icon to the bar (pure visual/marketing).

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.drawable.sisyphus);

        //Bind java variable layout items to layout xml items.

        name = (EditText) findViewById(R.id.ma_name);
        email = (EditText) findViewById(R.id.ma_email);
        executeButton = (Button) findViewById(R.id.ma_button_execute);

        //Call function to initialize on click listener.

        executePhoenix();
    }

    /*
    executePhoenix creates on click listener and defines the operations to be taken when the
    executeButton is pressed.  After creating a new intent it binds the text (in string form) from
    the two fields into a key-data construct that will be passed to the new Activity.
     */
    private void executePhoenix() {
        executeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent newPhoenix = new Intent(MainActivity.this, PhoenixActivity.class);
                newPhoenix.putExtra("name", name.getText().toString());
                newPhoenix.putExtra("email", email.getText().toString());
                startActivity(newPhoenix);
                }
            }
        );
    }
}
