package com.example.palomera.practica004;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText texto;
    CheckBox chbold,italic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     texto=(EditText)findViewById(R.id.textInputLayout);
     chbold=(CheckBox)findViewById(R.id.chbold);
     italic=(CheckBox)findViewById(R.id.chitalic);

     ////////// VALORES DEL CHECK BOLD

     chbold.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             if(chbold.isChecked())
                {
                texto.setTypeface(null, Typeface.BOLD);
                 }
              else
             {
                 texto.setTypeface(null,Typeface.NORMAL);
             }
         }
     });
////////////////////////////////////////////////////////////////////////
        //  VALORES DEL CHECK ITALIC
     italic.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view)
         {
          if (italic.isChecked())
          {

              texto.setTypeface(null,Typeface.ITALIC);
          }

          else
          {

              texto.setTypeface(null, Typeface.NORMAL);
          }

         }
     });



    }

    //eventos del check


}
