package com.example.hp.projet_vente_achat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Traitement_Oblier_mdp_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traitement__oblier_mdp_);
    }




    /****************************methode du Button Suivant dans l'activité Traitement_Oblier_mdp_Activity******************************/

    public void B_suivant(View view) {

/***********************************Recuperation des TextView et EditText dans la page XML ****************************************/


        TextView Res = (TextView) findViewById(R.id.Resultat_mdp);
        TextView Retour = (TextView) findViewById(R.id.Retour);
        EditText N_T = (EditText) findViewById(R.id.N_Tel);
        EditText code = (EditText) findViewById(R.id.code);


/**********************************Test pour le code  saisie de la part de  l'utilisateur ************************************/


        if (Integer.parseInt(code.getText().toString()) == 1234) {

            Res.setText("votre mdp est : "+"Admin2018");
            Retour.setText("Retour");

        }else{

            Res.setText("verifier donnée suivant");
            Retour.setText("Retour");

        }


        }



    /**********************************************Retour à l'activité login et mot de passe******************************************/


    public void Retour(View view) {

        Intent myIntent=new Intent(this,Login_Mdp_Activity.class);
        startActivity(myIntent);

    }

}
