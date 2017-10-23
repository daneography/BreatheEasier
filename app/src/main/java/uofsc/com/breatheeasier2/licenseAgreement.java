package uofsc.com.breatheeasier2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class licenseAgreement extends AppCompatActivity {

    private PrefManager prefManager;

    private CheckBox cbLicenseAgreement;
    private AppCompatButton btnAgree;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Checking for first time launch
        prefManager = new PrefManager(this);
        if(!prefManager.isFirstTimeLaunch()){
            launchMainMenuActivity();
            finish();
        }

        setContentView(R.layout.activity_license_agreement);


        cbLicenseAgreement = (CheckBox) findViewById(R.id.cbLicenseAgreement);
        btnAgree = (AppCompatButton)findViewById(R.id.btnAgree);


        cbLicenseAgreement.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()){
                    btnAgree.setEnabled(true);
                }else{
                    btnAgree.setEnabled(false);
                }
            }
        });

        btnAgree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchWelcomeActivity();
            }
        });
    }
    private void launchMainMenuActivity(){
        prefManager.setFirstTimeLaunch(false);
        startActivity(new Intent(licenseAgreement.this, NavigationActivity.class));
        finish();
    }
    private void launchWelcomeActivity(){
        prefManager.setFirstTimeLaunch(false);
        startActivity(new Intent(licenseAgreement.this, welcomeActivity.class));
        finish();
    }
}
