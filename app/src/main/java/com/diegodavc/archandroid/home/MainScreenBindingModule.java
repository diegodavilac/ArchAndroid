package com.diegodavc.archandroid.home;

import com.bluelinelabs.conductor.Controller;
import com.diegodavc.archandroid.di.ControllerKey;
import com.diegodavc.archandroid.trending.TrendingReposComponent;
import com.diegodavc.archandroid.trending.TrendingReposController;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        TrendingReposComponent.class,
})
public abstract class MainScreenBindingModule {
    @Binds
    @IntoMap
    @ControllerKey(TrendingReposController.class)
    abstract AndroidInjector.Factory<? extends Controller> bindTrendingReposInjector(TrendingReposComponent.Builder builder);
}
