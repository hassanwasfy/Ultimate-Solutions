package com.hassanwasfy.ultimatesolutions.presentation;

import static androidx.navigation.fragment.FragmentKt.findNavController;

import androidx.annotation.IdRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import com.hassanwasfy.ultimatesolutions.R;
import com.hassanwasfy.ultimatesolutions.databinding.ActivityMainBinding;

import java.util.Objects;

import dagger.hilt.android.AndroidEntryPoint;



@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavController navController = setUpNavController(R.id.nav_host_fragment_activity);
        NavHostFragment navHostFragment = setUpNavHostFragment(R.id.nav_host_fragment_activity);
        //NavigationUI.setupActionBarWithNavController(this, navController);

    }

    private NavController setUpNavController(@IdRes int hostId) {
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(hostId);

        if (navHostFragment != null) {
            return navHostFragment.getNavController();
        } else {
            throw new IllegalStateException("NavHostFragment not found");
        }
    }

    private NavHostFragment setUpNavHostFragment(@IdRes int host_id) {
        return (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(host_id);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}