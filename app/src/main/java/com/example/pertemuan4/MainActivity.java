package com.example.pertemuan4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nav = findViewById(R.id.Navigation);
        nav.setOnNavigationItemSelectedListener(this);
        setLayout(new LikeFragment());
    }

    private void setLayout(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer,fragment).commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.itemUp:
                setLayout(new LikeFragment());
                return true;
            case R.id.itemDown:
                setLayout(new DislikeFragment());
                return true;
        }
        return false;
    }
}
