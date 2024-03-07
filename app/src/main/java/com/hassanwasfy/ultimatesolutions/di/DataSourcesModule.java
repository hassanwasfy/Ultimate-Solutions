package com.hassanwasfy.ultimatesolutions.di;

import com.hassanwasfy.ultimatesolutions.data.source.remote.RemoteDataSource;
import com.hassanwasfy.ultimatesolutions.data.source.remote.RetrofitDataSource;
import com.hassanwasfy.ultimatesolutions.data.source.repository.Repository;
import com.hassanwasfy.ultimatesolutions.data.source.repository.RepositoryImpl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public abstract class DataSourcesModule {

    @Binds
    abstract RemoteDataSource provideDataSources(RetrofitDataSource dataSources);

    @Binds
    abstract Repository provideRepository(RepositoryImpl repository);

}
