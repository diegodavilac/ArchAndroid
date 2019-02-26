package com.diegodavc.archandroid.base;

import com.diegodavc.archandroid.data.RepoServiceModule;
import com.diegodavc.archandroid.networking.ServiceModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        ActivityBindingModule.class,
        ServiceModule.class,
        RepoServiceModule.class,
})
public interface ApplicationComponent {

    void inject(MyApplication myApplication);
}
