package com.example.navigationdrawerapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity
{
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    androidx.appcompat.widget.Toolbar toolbar ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = (NavigationView)findViewById(R.id.navmenu);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.menu_calculator :
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent intent_1 = new Intent(getApplicationContext() , CalculatorActivity.class);
                        startActivity(intent_1);
                        break;

                    case R.id.menu_quiz :
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent intent_2 = new Intent(getApplicationContext() , QuizActivity.class);
                        startActivity(intent_2);
                        break;
                }

                return true;
            }
        });
    }
}