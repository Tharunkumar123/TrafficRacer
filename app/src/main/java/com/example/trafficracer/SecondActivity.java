package com.example.trafficracer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import java.util.zip.Inflater;

public class SecondActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
//    ArrayList<DataItems> dataItems;

//    String[] tabTitles = {
//            "Tab 1",
//            "Tab 2"
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_activity);
        viewPager = findViewById(R.id.view_pager);

        tabLayout = findViewById(R.id.tabs);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar action = getSupportActionBar();
        action.setHomeAsUpIndicator(R.drawable.ic_action_menu);
        action.setDisplayHomeAsUpEnabled(true);


        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.white));
        tabLayout.setupWithViewPager(viewPager);

        drawerLayout = findViewById(R.id.drawer);

        final NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }

        int[] imgResId = {
                R.drawable.ic_action_inbox,
                R.drawable.ic_action_notification
        };

        for (int i = 0; i < imgResId.length; i++) {

            tabLayout.getTabAt(i).setIcon(imgResId[i]);


        }
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                tab.getIcon().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);
                switch (tab.getPosition()) {
                    case 0:
                        toolbar.setTitle("Inbox");
                        break;
                    case 1:
                        toolbar.setTitle("Notifications");
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#345499"), PorterDuff.Mode.SRC_IN);


            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Go to OnBoarding Screen", Snackbar.LENGTH_LONG)
                        .setAction("Ok", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
                            }
                        })
                        .setActionTextColor(getResources().getColor(R.color.blue))
                        .show();
            }
        });


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                Intent i=new Intent(SecondActivity.this,ThirdActivity.class);
                int id = menuItem.getItemId();
                switch (id) {
                    case R.id.nav_home:

                        startActivity(i);
                        break;
                    case R.id.nav_messages:
                        startActivity(i);
                        break;
                    case R.id.nav_friends:
                        startActivity(i);
                        break;
                    case R.id.nav_discussion:
                        startActivity(i);
                        break;
                    case R.id.login_item:
                        startActivity(new Intent(SecondActivity.this,LoginPage.class));
                        break;

                }
                drawerLayout.closeDrawers();
                return false;
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            case R.id.nav_home:


                break;
            case R.id.nav_messages:

                break;
            case R.id.nav_friends:

                break;
            case R.id.nav_discussion:

                break;

        }
        return super.onOptionsItemSelected(item);

    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        menuItem.setChecked(true);
                        drawerLayout.closeDrawers();
                        return true;
                    }
                });
    }

    public class ViewPagerAdapter extends FragmentPagerAdapter {
        private Fragment[] childFragments;


        public ViewPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
            childFragments = new Fragment[]{
                    new ChildFragment(),
                    new ChildFragment1(),

            };
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return childFragments[position];

        }

        @Override
        public int getCount() {
            return childFragments.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {

            return null;
        }


    }
}
