package com.example.iorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    int Quantity = 0;
    Button paymenybtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paymenybtn = findViewById(R.id.payment_btn);
        paymenybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Payment.class);
                startActivity(intent);
            }
        });




    }






        /*Method for plus button*/
    public void Increment (View view) {
       Quantity = Quantity + 1;
        display(Quantity);


        /*Method for minus button*/
    }    public void Decrement  (View view) {
        Quantity = Quantity - 1;
        display(Quantity);

    }
      /*Method for submit button*/
        public void submitOrder(View view) {
       displayPrice (Quantity *5);

        }
        /*This displays quantity*/

        private void display (int number) {
            TextView QuantityTextView = (TextView) findViewById(R.id.Quantity_text_view);
            QuantityTextView.setText("" + number);
        }

            /*This displays quantity values*/

            private void displayPrice ( int number){
                TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
                priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
            }



}


