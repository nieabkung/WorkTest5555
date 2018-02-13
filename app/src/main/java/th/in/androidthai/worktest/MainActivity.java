package th.in.androidthai.worktest;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import th.in.androidthai.worktest.MainFrag.MainFragment;

public class MainActivity extends AppCompatActivity  {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


 if (savedInstanceState == null) {
     getSupportFragmentManager().beginTransaction()
             .add(R.id.ContentMain, new MainFragment())
             .commit();
 }

        }

    }



