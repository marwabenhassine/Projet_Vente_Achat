package com.example.hp.projet_vente_achat;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class Traitement_Achat_Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    protected ListView l ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traitement__achat_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

/***************************************************************************************************************************/

/***************************************Appel listView *********************************************************************/

        l = (ListView)findViewById(R.id.listv);

        /*********************************creation ArrayList et HashMap ***********************************************************/


        ArrayList<HashMap<String, String>> listItem = new ArrayList<>();
        HashMap<String, String> map;


/************************recuperation des donner qui est existe dans le page Traitement_Vente_Activity*********************/


        final Bundle b=getIntent().getExtras();
        String Nom=b.getString("Nom1");
        String Prenom=b.getString("Prenom1");
        String N_tel=b.getString("N_tel1");
        String Nom_Produit=b.getString("Nom_Produit1");
        String Desc_Produit=b.getString("Desc_Produit1");
        String Prix=b.getString("Prix1");


/******************************************Remplier Hashmap ****************************************************************/

        map = new HashMap<>();

        map.put("titre", "Voiture");
        map.put("desc", "Voiture symbol");
        map.put("img", String.valueOf(R.drawable.voiture2));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "Pc");
        map.put("desc", "Pc Hp Ram 8G  i5");
        map.put("img", String.valueOf(R.drawable.pc_hp4));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "Ram");
        map.put("desc", "Ram 8G");
        map.put("img", String.valueOf(R.drawable.ram1));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "Clavier");
        map.put("desc", "Clavier modele 2018 bon qualite");
        map.put("img", String.valueOf(R.drawable.clavier1));
        listItem.add(map);

/*********************************Remplier à partier de page Achat ************************************************************/

        map = new HashMap<>();

        map.put("titre", Nom_Produit);
        map.put("desc", Desc_Produit);
        //map.put("img", String.valueOf(R.drawable.voiture3));
        listItem.add(map);


/********************************************Création d'Adapter ***************************************************************/

        //Creation d' Adapter
        SimpleAdapter adapt= new SimpleAdapter(this.getBaseContext(),listItem,R.layout.l2, new String[]{"img","titre","desc"}, new int[]{R.id.img, R.id.titre, R.id.desc});
        l.setAdapter(adapt);


        final Intent myIntent2 = new Intent(this, Information_Produit.class);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                HashMap<String, String> map = (HashMap<String, String>) l.getItemAtPosition(position);


                String  titre1=map.get("titre");
                String  desc1=map.get("desc");

                Bundle b2 = new Bundle();
                b2.putString("titre1",titre1);
                b2.putString("desc1",desc1);

                myIntent2.putExtras(b2);

                startActivity(myIntent2);


            }
        });


/**********************************************************************************************************************************/


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    /****************************************************************************************************************************/

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    /*******************************************************************************************************************************/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.traitement__achat_, menu);
        return true;
    }

    /******************************************************************************************************************************/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override

/********************* pour déplacement entre les pages à partir de Menu ( page Deconnexion, page Vent) ******************/

    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

/*************************************page déconnexion*******************************************************************/

        if (id == R.id.nav_deconnexion) {

            Intent myIntent=new Intent(this,Login_Mdp_Activity.class);

            startActivity(myIntent);
            Toast.makeText(this, "Vous avez déconnecter",Toast.LENGTH_LONG).show();



        }else if (id == R.id.nav_vente) {

/**************************************activité vente ************************************************************************/

            Intent myIntent2=new Intent(this,Traitement_Vente_Activity.class);

            startActivity(myIntent2);
            Toast.makeText(this,"Bienvenue dans la page Vente",Toast.LENGTH_LONG).show();



        }else if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
