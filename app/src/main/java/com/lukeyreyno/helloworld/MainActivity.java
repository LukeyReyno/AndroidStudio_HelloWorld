package com.lukeyreyno.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.Button;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void submit(View v) {
        ConstraintLayout mainLayout = findViewById(R.id.mainLayout);

        TextView helloTxt = findViewById(R.id.helloWorldText);
        TextView firstNameText = findViewById(R.id.textViewFirstName);
        TextView lastNameText = findViewById(R.id.textViewLastName);
        TextView emailText = findViewById(R.id.textViewEmail);

        EditText firstNameInput = findViewById(R.id.editTextPersonName);
        EditText lastNameInput = findViewById(R.id.editTextPersonLastName);
        EditText emailInput = findViewById(R.id.editTextPersonEmail);

        helloTxt.setText("Hello, " + firstNameInput.getText().toString() + lastNameInput.getText().toString());
        firstNameText.setText("First Name: " + firstNameInput.getText().toString());
        lastNameText.setText("Last Name: " + lastNameInput.getText().toString());
        emailText.setText("Email: " + emailInput.getText().toString());

        mainLayout.setBackgroundColor(0xFFFFCC);

        v.setEnabled(false); //turns off button used to click
        Button submitBtn = (Button) v;
        submitBtn.setBackgroundColor(0xFFCCCC);
        submitBtn.setText("Disabled");
    }

    @SuppressLint("SetTextI18n")
    public void reset(View v) {
        ConstraintLayout mainLayout = findViewById(R.id.mainLayout);
        Button submitButton = findViewById(R.id.submitBtn);

        TextView helloTxt = findViewById(R.id.helloWorldText);
        TextView firstNameText = findViewById(R.id.textViewFirstName);
        TextView lastNameText = findViewById(R.id.textViewLastName);
        TextView emailText = findViewById(R.id.textViewEmail);

        helloTxt.setText("Hello World!");
        firstNameText.setText("First Name");
        lastNameText.setText("Last Name");
        emailText.setText("Email");

        mainLayout.setBackgroundColor(0xFFFFFF);

        submitButton.setEnabled(true); //turns on button used to submit
    }
}