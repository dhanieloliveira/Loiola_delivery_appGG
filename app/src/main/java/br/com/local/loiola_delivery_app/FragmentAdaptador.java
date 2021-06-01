package br.com.local.loiola_delivery_app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import org.jetbrains.annotations.NotNull;

public class FragmentAdaptador extends FragmentStateAdapter {
    public FragmentAdaptador(@NonNull @NotNull FragmentManager fragmentManager, @NonNull @NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){

            case 1:
                return new SegundoFragmento();
            case 2:
                return new TerceiroFragmento();

        }
        return new PrimeiroFragmento();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
