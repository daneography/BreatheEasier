package uofsc.com.breatheeasier2;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class trainingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.training_toolbar);
        setSupportActionBar(toolbar);


        //up button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        initFrag();
    }

    private void initFrag() {
        Fragment fragment;
        fragment = new trainingMainFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.training_layout, fragment);
        ft.commit();
    }
}
