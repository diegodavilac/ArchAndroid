package com.diegodavc.archandroid.di;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import com.bluelinelabs.conductor.Controller;
import com.diegodavc.archandroid.base.BaseActivity;

public class Injector {

    private Injector(){

    }

    public static void inject(Activity activity){
        ActivityInjector.get(activity).inject(activity);
    }

    public static void clearComponent(Activity activity) {
        ActivityInjector.get(activity).clear(activity);
    }

    public static void inject(Controller controller){
        ScreenInjector.get(controller.getActivity()).inject(controller);
    }

    public static void clearComponent(Controller controller){
        ScreenInjector.get(controller.getActivity()).clear(controller);
    }
}
