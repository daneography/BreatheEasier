package uofsc.com.breatheeasier2;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.internal.NavigationMenuItemView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class NavigationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //up button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        final ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        initFrag();
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case android.R.id.home:

                FragmentManager fm = getSupportFragmentManager();
                if (fm.getBackStackEntryCount()>0){
                    fm.popBackStack();
                }
                return true;

            case  R.id.action_tutorial:
                // We normally won't show the welcome slider again in real app
                // but this is for testing
                PrefManager prefManager = new PrefManager(getApplicationContext());

                // make first time launch TRUE
                prefManager.setFirstTimeLaunch(true);

                startActivity(new Intent(NavigationActivity.this, welcomeActivity.class));
                finish();
                return true;



            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.navMindfulness) {
            goToTraining();
        } else if (id == R.id.navDaily) {
            goToDaily();
        } else if (id == R.id.navCommunities) {
            goToCommunities();
        } else if (id == R.id.navExercise) {
            goToExercise();
        } else if (id == R.id.navAbout){
            goToAbout();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    private void goToCommunities() {
        Intent intent = new Intent(this, communitiesActivity.class);
        startActivity(intent);

    }

    private void goToDaily() {
        Intent intent = new Intent(this, dailyActivity.class);
        startActivity(intent);
    }

    private void goToTraining() {
        Intent intent = new Intent(this, trainingActivity.class);
        startActivity(intent);
    }

    private void goToExercise() {
        Intent intent = new Intent(this, exercisesActivity.class);
        startActivity(intent);
    }

    private void goToAbout() {
        Intent intent = new Intent(this, aboutActivity.class);
        startActivity(intent);
    }

    private void initFrag() {
        Fragment fragment;
        fragment = new mainScreen();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.constraintLayout, fragment);
        ft.commit();
    }
}

