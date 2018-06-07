package edu.phoenix.mbl404.mbl404_dck_week_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button executeButton;
    private EditText name, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.ma_name);
        email = (EditText) findViewById(R.id.ma_email);

        executeButton = (Button) findViewById(R.id.ma_button_execute);
        executePhoenix();
    }

    private void executePhoenix() {
        executeButton.setOnClickListener(
                new View.OnClickListener() {
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
