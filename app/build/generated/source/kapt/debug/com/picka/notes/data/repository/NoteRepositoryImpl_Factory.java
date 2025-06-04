package com.picka.notes.data.repository;

import com.picka.notes.data.local.LocalDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class NoteRepositoryImpl_Factory implements Factory<NoteRepositoryImpl> {
  private final Provider<LocalDataSource> localDataSourceProvider;

  public NoteRepositoryImpl_Factory(Provider<LocalDataSource> localDataSourceProvider) {
    this.localDataSourceProvider = localDataSourceProvider;
  }

  @Override
  public NoteRepositoryImpl get() {
    return newInstance(localDataSourceProvider.get());
  }

  public static NoteRepositoryImpl_Factory create(
      Provider<LocalDataSource> localDataSourceProvider) {
    return new NoteRepositoryImpl_Factory(localDataSourceProvider);
  }

  public static NoteRepositoryImpl newInstance(LocalDataSource localDataSource) {
    return new NoteRepositoryImpl(localDataSource);
  }
}
