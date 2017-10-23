package uofsc.com.breatheeasier2;

import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import static uofsc.com.breatheeasier2.R.id.toolbar;


public class aboutMainFragment extends Fragment implements View.OnClickListener {
   private AppCompatButton btnProfile, btnTutorial, btnEvidence, btnRef, btnFinDisc, btnContact;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_about_main,container,false);
        initViews(view);
        return view;
    }

    private void initViews (View view){
        btnProfile = (AppCompatButton)view.findViewById(R.id.btnProfile);
        btnTutorial = (AppCompatButton)view.findViewById(R.id.btnTutorial);
        btnEvidence = (AppCompatButton)view.findViewById(R.id.btnEvidence);
        btnRef = (AppCompatButton)view.findViewById(R.id.btnRef);
        btnFinDisc = (AppCompatButton)view.findViewById(R.id.btnFinDisc);
        btnContact = (AppCompatButton)view.findViewById(R.id.btnContact);



        btnProfile.setOnClickListener(this);
        btnTutorial.setOnClickListener(this);
        btnEvidence.setOnClickListener(this);
        btnRef.setOnClickListener(this);
        btnFinDisc.setOnClickListener(this);
        btnContact.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnProfile:
                goToProfile();
                break;
            case R.id.btnTutorial:
                goToTutorial();
                break;
            case R.id.btnEvidence:
                goToEvidence();
                break;
            case R.id.btnRef:
                goToRef();
                break;
            case R.id.btnFinDisc:
                goToFinDisc();
                break;
            case R.id.btnContact:
                goToContact();
                break;
        }

    }
    private void goToProfile(){
        Fragment fragment;
        fragment = new ProfileFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.about_layout, fragment);
        ft.commit();
    }
    private boolean goToTutorial(){
        PrefManager prefManager = new PrefManager(getActivity().getApplicationContext());
        // make first time launch TRUE
        prefManager.setFirstTimeLaunch(true);
        startActivity(new Intent(aboutMainFragment.this.getActivity(), welcomeActivity.class));
        getActivity().finish();
        return true;
    }
    private void goToEvidence(){
        Toast.makeText(getActivity(),"Evidence, coming soon", Toast.LENGTH_SHORT).show();
    }

    private void goToRef(){
        Toast.makeText(getActivity(),"References, coming soon", Toast.LENGTH_SHORT).show();
    }

    private void goToFinDisc(){
        Toast.makeText(getActivity(),"Financial Disclosure, coming soon", Toast.LENGTH_SHORT).show();
    }

    private void goToContact(){
        Toast.makeText(getActivity(),"Contact, coming soon", Toast.LENGTH_SHORT).show();
    }

}
