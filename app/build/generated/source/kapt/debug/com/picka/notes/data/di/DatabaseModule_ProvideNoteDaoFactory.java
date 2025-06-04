package com.picka.notes.data.di;

import com.picka.notes.data.local.NoteDao;
import com.picka.notes.data.local.NoteDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideNoteDaoFactory implements Factory<NoteDao> {
  private final Provider<NoteDatabase> dbProvider;

  public DatabaseModule_ProvideNoteDaoFactory(Provider<NoteDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public NoteDao get() {
    return provideNoteDao(dbProvider.get());
  }

  public static DatabaseModule_ProvideNoteDaoFactory create(Provider<NoteDatabase> dbProvider) {
    return new DatabaseModule_ProvideNoteDaoFactory(dbProvider);
  }

  public static NoteDao provideNoteDao(NoteDatabase db) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideNoteDao(db));
  }
}
