package uofsc.com.breatheeasier2;

import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class trainingMainFragment extends Fragment implements View.OnClickListener{
    private AppCompatButton btnWeek1, btnWeek2, btnWeek3, btnWeek4, btnWeek5, btnWeek6, btnWeek7, btnWeek8;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_training_main,container, false);
        initView(view);
        return view;
    }

    private void initView (View view){
        btnWeek1 = (AppCompatButton)view.findViewById(R.id.btnWeek1);
        btnWeek2  = (AppCompatButton)view.findViewById(R.id.btnWeek2);
        btnWeek3 = (AppCompatButton)view.findViewById(R.id.btnWeek3);
        btnWeek4 = (AppCompatButton)view.findViewById(R.id.btnWeek4);
        btnWeek5  = (AppCompatButton)view.findViewById(R.id.btnWeek5);
        btnWeek6 = (AppCompatButton)view.findViewById(R.id.btnWeek6);
        btnWeek7  = (AppCompatButton)view.findViewById(R.id.btnWeek7);
        btnWeek8 = (AppCompatButton)view.findViewById(R.id.btnWeek8);



        btnWeek1.setOnClickListener(this);
        btnWeek2.setOnClickListener(this);
        btnWeek3.setOnClickListener(this);
        btnWeek4.setOnClickListener(this);
        btnWeek5.setOnClickListener(this);
        btnWeek6.setOnClickListener(this);
        btnWeek7.setOnClickListener(this);
        btnWeek8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnWeek1:
                goToWeek1();
                break;
            case R.id.btnWeek2:
                goToWeek2();
                break;
            case R.id.btnWeek3:
                goToWeek3();
                break;
            case R.id.btnWeek4:
                goToWeek4();
                break;
            case R.id.btnWeek5:
                goToWeek5();
                break;
            case R.id.btnWeek6:
                goToWeek6();
                break;
            case R.id.btnWeek7:
                goToWeek7();
                break;
            case R.id.btnWeek8:
                goToWeek8();
                break;
        }

    }
    private void goToWeek1(){
        Toast.makeText(getActivity(),"Week1, coming soon", Toast.LENGTH_SHORT).show();
    }

    private void goToWeek2(){
        Toast.makeText(getActivity(),"Week2, coming soon", Toast.LENGTH_SHORT).show();
    }

    private void goToWeek3(){
        Toast.makeText(getActivity(),"Week3, coming soon", Toast.LENGTH_SHORT).show();
    }

    private void goToWeek4(){
        Toast.makeText(getActivity(),"Week4, coming soon", Toast.LENGTH_SHORT).show();
    }

    private void goToWeek5(){
        Toast.makeText(getActivity(),"Week5, coming soon", Toast.LENGTH_SHORT).show();
    }
    private void goToWeek6(){
        Toast.makeText(getActivity(),"Week6, coming soon", Toast.LENGTH_SHORT).show();
    }
    private void goToWeek7(){
        Toast.makeText(getActivity(),"Week7, coming soon", Toast.LENGTH_SHORT).show();
    }
    private void goToWeek8(){
        Toast.makeText(getActivity(),"Week8, coming soon", Toast.LENGTH_SHORT).show();
    }
            
}
