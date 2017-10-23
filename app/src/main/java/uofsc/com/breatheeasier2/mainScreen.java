package uofsc.com.breatheeasier2;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class mainScreen extends Fragment implements View.OnClickListener {
    private AppCompatButton btnExercise, btnMindfulness, btnDaily, btnCommunities;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main_screen,container,false);
        initViews(view);
        return view;
    }

    private void initViews(View view){

        btnExercise = (AppCompatButton)view.findViewById(R.id.btnExercise);
        btnCommunities = (AppCompatButton)view.findViewById(R.id.btnCommunities);
        btnDaily = (AppCompatButton)view.findViewById(R.id.btnDaily);
        btnMindfulness = (AppCompatButton)view.findViewById(R.id.btnMindfulness);


        btnExercise.setOnClickListener(this);
        btnCommunities.setOnClickListener(this);
        btnDaily.setOnClickListener(this);
        btnMindfulness.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnExercise:
                goToExercise();
                break;
            case R.id.btnCommunities:
                goToCommunities();
                break;
            case R.id.btnDaily:
                goToDaily();
                break;
            case R.id.btnMindfulness:
                goToTraining();
                break;
        }

    }
    private void goToCommunities() {
        Intent intent = new Intent(mainScreen.this.getActivity(), communitiesActivity.class);
        startActivity(intent);

    }

    private void goToDaily() {
        Intent intent = new Intent(mainScreen.this.getActivity(), dailyActivity.class);
        startActivity(intent);
    }

    private void goToTraining() {
        Intent intent = new Intent(mainScreen.this.getActivity(), trainingActivity.class);
        startActivity(intent);
    }

    private void goToExercise() {
        Intent intent = new Intent(mainScreen.this.getActivity(), exercisesActivity.class);
        startActivity(intent);
    }
}
