package com.hassanwasfy.ultimatesolutions.di;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class ContextModule {
    @Provides
    public static Context provideApplicationContext(@ApplicationContext Context context) {
        return context;
    }
}
