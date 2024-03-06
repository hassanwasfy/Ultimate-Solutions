package com.hassanwasfy.ultimatesolutions.di;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import com.hassanwasfy.ultimatesolutions.BuildConfig;
import com.hassanwasfy.ultimatesolutions.data.service.ApiService;
import com.hassanwasfy.ultimatesolutions.data.utils.HeaderInterceptor;

import javax.inject.Singleton;

@Module
@InstallIn(SingletonComponent.class)
public class NetworkModule {

    @Provides
    @Singleton
    public HeaderInterceptor provideHeaderInterceptor() {
        return new HeaderInterceptor();
    }


    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient(HeaderInterceptor headerInterceptor) {
        return new OkHttpClient.Builder()
                .addInterceptor(headerInterceptor)
                .build();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    public ApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }
}
