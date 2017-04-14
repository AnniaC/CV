package com.sda.a.cichosz.cv;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);


        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);


        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        final NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.openDrawer, R.string.close_drawer);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                drawerLayout.closeDrawer(Gravity.START);

                switch (item.getItemId()) {
                    case R.id.navigationphone:
                        Intent phoneintent = new Intent(Intent.ACTION_DIAL);
                        phoneintent.setData(Uri.parse("tel:793036323"));
                       startActivity(phoneintent);
                        break;

                    case R.id.navigationMail:

                        Intent mailIntent = new Intent(Intent.ACTION_SEND);
                        mailIntent.setType("text/plain");
                        mailIntent.putExtra(Intent.EXTRA_EMAIL, "anna.cichosz@gmail.com");
                        mailIntent.putExtra(Intent.EXTRA_SUBJECT, "temat");
                        mailIntent.putExtra(Intent.EXTRA_TEXT, "TREŚĆ");
                       startActivity(Intent.createChooser(mailIntent, "wyślij"));
                        break;

                    case R.id.navigationadress:
                        Intent adressIntent = new Intent(Intent.ACTION_VIEW);
                        adressIntent.setType(("text/plain"));
                        adressIntent.putExtra(Intent.EXTRA_TEXT,"Wrocław");
                        startActivity(Intent.createChooser(adressIntent,"hoho"));
                        break;

                    case R.id.navigationgit:
                        Intent gitIntent = new Intent(Intent.ACTION_VIEW);
                        gitIntent.setData(Uri.parse("https://github.com/"));
                        startActivity(gitIntent);
                        break;
                }
                return false;


            }

        });
    }

}
