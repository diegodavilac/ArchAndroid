package com.diegodavc.archandroid.home;

import com.diegodavc.archandroid.di.ActivityScope;
import com.diegodavc.archandroid.ui.NavigationModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@ActivityScope
@Subcomponent(modules = {
        MainScreenBindingModule.class,
        NavigationModule.class,
})
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{
        @Override
        public void seedInstance(MainActivity instance) {

        }
    }
}
