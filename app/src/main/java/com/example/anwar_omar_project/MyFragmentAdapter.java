package com.example.anwar_omar_project;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyFragmentAdapter extends FragmentStateAdapter {



    public MyFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();

            case 1:
                return new ZoraaFragment();

            case 2:
                return new MathafBagdadyFragment();

            case 3:
                return new KshlaFragment();

            case 4:
                return new KadimiyFragment();

            default:
                return null;
        }
    }
    @Override
    public int getItemCount() {
        return 5;
    }
}
