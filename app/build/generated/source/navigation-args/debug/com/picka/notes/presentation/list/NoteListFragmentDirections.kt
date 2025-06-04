package com.picka.notes.presentation.list

import android.os.Bundle
import androidx.navigation.NavDirections
import com.picka.notes.R
import kotlin.Int

public class NoteListFragmentDirections private constructor() {
  private data class ActionNoteListToAddEdit(
    public val noteId: Int = 0,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_noteList_to_addEdit

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("noteId", this.noteId)
        return result
      }
  }

  public companion object {
    public fun actionNoteListToAddEdit(noteId: Int = 0): NavDirections =
        ActionNoteListToAddEdit(noteId)
  }
}
