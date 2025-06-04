package com.picka.notes.presentation.addedit;

import com.picka.notes.domain.usecase.GetNoteByIdUseCase;
import com.picka.notes.domain.usecase.InsertNoteUseCase;
import com.picka.notes.domain.usecase.UpdateNoteUseCase;
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
public final class AddEditNoteViewModel_Factory implements Factory<AddEditNoteViewModel> {
  private final Provider<GetNoteByIdUseCase> getNoteByIdProvider;

  private final Provider<InsertNoteUseCase> insertNoteProvider;

  private final Provider<UpdateNoteUseCase> updateNoteProvider;

  public AddEditNoteViewModel_Factory(Provider<GetNoteByIdUseCase> getNoteByIdProvider,
      Provider<InsertNoteUseCase> insertNoteProvider,
      Provider<UpdateNoteUseCase> updateNoteProvider) {
    this.getNoteByIdProvider = getNoteByIdProvider;
    this.insertNoteProvider = insertNoteProvider;
    this.updateNoteProvider = updateNoteProvider;
  }

  @Override
  public AddEditNoteViewModel get() {
    return newInstance(getNoteByIdProvider.get(), insertNoteProvider.get(), updateNoteProvider.get());
  }

  public static AddEditNoteViewModel_Factory create(
      Provider<GetNoteByIdUseCase> getNoteByIdProvider,
      Provider<InsertNoteUseCase> insertNoteProvider,
      Provider<UpdateNoteUseCase> updateNoteProvider) {
    return new AddEditNoteViewModel_Factory(getNoteByIdProvider, insertNoteProvider, updateNoteProvider);
  }

  public static AddEditNoteViewModel newInstance(GetNoteByIdUseCase getNoteById,
      InsertNoteUseCase insertNote, UpdateNoteUseCase updateNote) {
    return new AddEditNoteViewModel(getNoteById, insertNote, updateNote);
  }
}
