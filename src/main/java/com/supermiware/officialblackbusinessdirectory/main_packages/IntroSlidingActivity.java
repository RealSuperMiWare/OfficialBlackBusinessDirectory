package com.supermiware.officialblackbusinessdirectory.main_packages;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.supermiware.officialblackbusinessdirectory.R;
import com.supermiware.officialblackbusinessdirectory.Fragments.slide1Fragment;
import com.supermiware.officialblackbusinessdirectory.Fragments.slide2Fragment;

public class IntroSlidingActivity extends AppCompatActivity {

    //TODO: finished, now make sure you only allow this activity to load when the user doesn't have an account

    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_sliding);

        bottomNav = findViewById(R.id.bottomNav);

        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int itemID = menuItem.getItemId();
                if (itemID == R.id.itemOne) {

                    // TODO: Connect Chat Fragment to the if-statement
                    setTitle("Chat");
                    slide1Fragment slide1Fragment = new slide1Fragment();
                    FragmentManager fragementManger = getSupportFragmentManager();
                    fragementManger.beginTransaction().replace(R.id.fragment, slide1Fragment).commit();

                }
                if (itemID == R.id.itemTwo) {

                    // TODO: Connect Chat Fragment to the if-statement
                    setTitle("Chat");
                    slide2Fragment slide2Fragment = new slide2Fragment();
                    FragmentManager fragementManger = getSupportFragmentManager();
                    fragementManger.beginTransaction().replace(R.id.fragment, slide2Fragment).commit();

                }
                if (itemID == R.id.itemThree) {

                    // TODO: Connect Chat Fragment to the if-statement
                    setTitle("Chat");
                    slide2Fragment slide2Fragment = new slide2Fragment();
                    FragmentManager fragementManger = getSupportFragmentManager();
                    fragementManger.beginTransaction().replace(R.id.fragment, slide2Fragment).commit();

                }
                if (itemID == R.id.itemFour) {

                    // This item selected needs to slide to the reg. activity.
                    Intent toRegActivity = new Intent(IntroSlidingActivity.this, RegisterBizActivity.class);
                    startActivity(toRegActivity);

                }

                return true;
            }

        });
    }
}
