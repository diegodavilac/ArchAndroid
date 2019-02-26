package com.diegodavc.archandroid.home;


import com.bluelinelabs.conductor.Controller;
import com.diegodavc.archandroid.R;
import com.diegodavc.archandroid.base.BaseActivity;
import com.diegodavc.archandroid.trending.TrendingReposController;

public class MainActivity extends BaseActivity {

    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected Controller initialScreen() {
        return new TrendingReposController();
    }
}
