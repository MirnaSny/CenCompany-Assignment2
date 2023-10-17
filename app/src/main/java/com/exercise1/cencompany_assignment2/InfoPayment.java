package com.exercise1.cencompany_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InfoPayment extends AppCompatActivity {
    EditText fullName;
    EditText address;
    EditText city;
    EditText phoneNumber;
    EditText creditCard;
    EditText cardType;
    EditText cvv;
    Button confirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_payment);

        fullName=findViewById(R.id.full_name);
        address=findViewById(R.id.address);
        city=findViewById(R.id.city);
        phoneNumber=findViewById(R.id.phone);
        creditCard=findViewById(R.id.text_credit);
        cardType=findViewById(R.id.text_cardtype);
        cvv=findViewById(R.id.text_cvv);
        confirm = findViewById(R.id.confirm);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),DisplayInfo.class);
                intent.putExtra("full_name",fullName.getText().toString());
                intent.putExtra("address",address.getText().toString());
                intent.putExtra("city",city.getText().toString());
                intent.putExtra("phone_number",phoneNumber.getText().toString());
                intent.putExtra("credit_card_number",creditCard.getText().toString());
                intent.putExtra("card_type",cardType.getText().toString());
                intent.putExtra("cvv",cvv.getText().toString());
                startActivity(intent);
            }
        });

    }
}