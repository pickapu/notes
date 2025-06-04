package com.picka.notes.data.di;

import android.content.Context;
import com.picka.notes.data.local.NoteDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideNoteDatabaseFactory implements Factory<NoteDatabase> {
  private final Provider<Context> appContextProvider;

  public DatabaseModule_ProvideNoteDatabaseFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public NoteDatabase get() {
    return provideNoteDatabase(appContextProvider.get());
  }

  public static DatabaseModule_ProvideNoteDatabaseFactory create(
      Provider<Context> appContextProvider) {
    return new DatabaseModule_ProvideNoteDatabaseFactory(appContextProvider);
  }

  public static NoteDatabase provideNoteDatabase(Context appContext) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideNoteDatabase(appContext));
  }
}
