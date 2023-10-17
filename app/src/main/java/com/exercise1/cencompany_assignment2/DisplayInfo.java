package com.exercise1.cencompany_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);


        TextView answerFullName=findViewById(R.id.answer_fullName);
        TextView answerAddress=findViewById(R.id.answer_address);
        TextView answerCity=findViewById(R.id.answer_city);
        TextView answerPhoneNumber=findViewById(R.id.answer_phoneNumber);
        TextView answerCreditCardNumber=findViewById(R.id.answer_creditCardNumber);
        TextView answerCardType=findViewById(R.id.answer_cardType);
        TextView answerCVV=findViewById(R.id.answer_cvv);

        Intent intent=getIntent();
        String fullName = intent.getStringExtra("full_name");
        String address = intent.getStringExtra("address");
        String city = intent.getStringExtra("city");
        String phoneNumber = intent.getStringExtra("phone_number");
        String creditCardNumber = intent.getStringExtra("credit_card_number");
        String cardType = intent.getStringExtra("card_type");
        String cvv = intent.getStringExtra("cvv");

        answerFullName.setText(fullName);
        answerAddress.setText(address);
        answerCity.setText(city);
        answerPhoneNumber.setText(phoneNumber);
        answerCreditCardNumber.setText(creditCardNumber);
        answerCardType.setText(cardType);
        answerCVV.setText(cvv);

    }
}