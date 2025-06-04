package com.picka.notes.presentation.list;

import com.picka.notes.domain.usecase.DeleteNoteUseCase;
import com.picka.notes.domain.usecase.GetAllNotesUseCase;
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
public final class NoteListViewModel_Factory implements Factory<NoteListViewModel> {
  private final Provider<GetAllNotesUseCase> getAllNotesProvider;

  private final Provider<DeleteNoteUseCase> deleteNoteProvider;

  public NoteListViewModel_Factory(Provider<GetAllNotesUseCase> getAllNotesProvider,
      Provider<DeleteNoteUseCase> deleteNoteProvider) {
    this.getAllNotesProvider = getAllNotesProvider;
    this.deleteNoteProvider = deleteNoteProvider;
  }

  @Override
  public NoteListViewModel get() {
    return newInstance(getAllNotesProvider.get(), deleteNoteProvider.get());
  }

  public static NoteListViewModel_Factory create(Provider<GetAllNotesUseCase> getAllNotesProvider,
      Provider<DeleteNoteUseCase> deleteNoteProvider) {
    return new NoteListViewModel_Factory(getAllNotesProvider, deleteNoteProvider);
  }

  public static NoteListViewModel newInstance(GetAllNotesUseCase getAllNotes,
      DeleteNoteUseCase deleteNote) {
    return new NoteListViewModel(getAllNotes, deleteNote);
  }
}
