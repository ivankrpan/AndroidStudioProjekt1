package com.example.android.kosarka;


import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int rezultatdomaci=0;

    int rezultatgosti=0;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


    }


    /**

     * prikazuje rezultat domaćih.

     */

    public void rezultatDomaci(int rezultat) {

        TextView scoreView = (TextView) findViewById(R.id.domaci_rezultat);

        scoreView.setText(String.valueOf(rezultat));

    }



    /**

     * prikazuje rezultat gostiju.

     */

    public void rezultatGosti(int rezultat) {

        TextView scoreView = (TextView) findViewById(R.id.gosti_rezultat);

        scoreView.setText(String.valueOf(rezultat));

    }



    /**

     * metoda za dugme +3 domaci

     */

    public void plus3domaci(View view) {

        rezultatdomaci=rezultatdomaci+3;

        rezultatDomaci(rezultatdomaci);

    }

    /**

     * metoda za dugme +3 gosti

     */

    public void plus3gosti(View view) {

        rezultatgosti=rezultatgosti+3;

        rezultatGosti(rezultatgosti);

    }

    /**

     * metoda za dugme +2 domaci

     */



    public void plus2domaci(View view) {

        rezultatdomaci=rezultatdomaci+2;

        rezultatDomaci(rezultatdomaci);

    }


    /**

     * metoda za dugme +2 gosti

     */

    public void plus2gosti(View view) {

        rezultatgosti=rezultatgosti+2;

        rezultatGosti(rezultatgosti);

    }


    /**

     * metoda za dugme slobodno bacanje domaci

     */

    public void slobodnobacanjed(View View) {

        rezultatdomaci=rezultatdomaci+1;

        rezultatDomaci(rezultatdomaci);

    }



    /**

     * metoda za dugme slobodno bacanje gosti


     */

    public void slobodnobacanjeg(View View){

        rezultatgosti=rezultatgosti+1;

        rezultatGosti(rezultatgosti);

    }



    /**

     *Reset

     */

    public void reset(View view){

        rezultatgosti=0;

        rezultatdomaci=0;

        rezultatGosti(rezultatgosti);

        rezultatDomaci(rezultatdomaci);

    }

}


