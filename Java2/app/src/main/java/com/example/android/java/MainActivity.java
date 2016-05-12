package com.example.android.java;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.java.R;

import java.text.NumberFormat;
/**
 * metoda koja prikazuje naruđbu naručene kave.
 */
public class MainActivity extends ActionBarActivity {
    int kolicina = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * metoda se poziva pritiskom na dugme.
     */
    public void submitOrders(View view) {

        int cijena1 = racunanjeCijene();
        String porukaCijene = "Cijena: " + cijena1 + "kn";
        displayMessage(porukaCijene);

    }

    /**
     * metoda koja prikazuje količinu na ekranu.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }



    /**
     * Računanje cijene naruđbe .
     *
     * @param kolicina je broj naručenih kava
     */



    private int racunanjeCijene() {
        int cijena1 = kolicina * 6;
        return cijena1;

    }

    /**
     * metoda koja prikazuje cijenu na ekranu.
     */


    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /**
     * metoda za dugme plus.
     */
    public void increment(View view) {
        kolicina = kolicina + 1;
        display(kolicina);
    }

    /**
     * metoda za dugme minus.
     */
    public void decrement(View view) {
        kolicina = kolicina - 1;
        display(kolicina);
    }

}