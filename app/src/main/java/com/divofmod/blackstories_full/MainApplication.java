package com.divofmod.blackstories_full;

import android.app.Application;
import android.content.Context;

import com.divofmod.blackstories_full.helper.LocaleHelper;

public class MainApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base, base.getResources().getConfiguration().locale.getCountry().toLowerCase()));
    }
}
