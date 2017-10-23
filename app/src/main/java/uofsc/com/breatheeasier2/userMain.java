package uofsc.com.breatheeasier2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class userMain extends AppCompatActivity {

    private SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);
        pref = getPreferences(0);
        initFragment();
    }

    private void initFragment(){
        if(pref.getBoolean(constant.IS_LOGGED_IN,false)){
            Intent intent = new Intent(this, NavigationActivity.class);
            startActivity(intent);
        }else {
            Fragment fragment;
            fragment = new LoginFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.userMain_Layout,fragment);
            ft.commit();

        }

    }

}

