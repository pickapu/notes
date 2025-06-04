package com.picka.notes.data.di;

import com.picka.notes.data.local.LocalDataSource;
import com.picka.notes.data.local.NoteDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideLocalDataSourceFactory implements Factory<LocalDataSource> {
  private final Provider<NoteDao> daoProvider;

  public DatabaseModule_ProvideLocalDataSourceFactory(Provider<NoteDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public LocalDataSource get() {
    return provideLocalDataSource(daoProvider.get());
  }

  public static DatabaseModule_ProvideLocalDataSourceFactory create(Provider<NoteDao> daoProvider) {
    return new DatabaseModule_ProvideLocalDataSourceFactory(daoProvider);
  }

  public static LocalDataSource provideLocalDataSource(NoteDao dao) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideLocalDataSource(dao));
  }
}
