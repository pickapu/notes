package com.picka.notes.presentation.addedit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.picka.notes.databinding.FragmentAddEditNoteBinding
import com.picka.notes.domain.model.Note
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class AddEditNoteFragment : Fragment() {

    private var _binding: FragmentAddEditNoteBinding? = null
    private val binding get() = _binding!!
    private val viewModel: AddEditNoteViewModel by viewModels()
    private val args: AddEditNoteFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentAddEditNoteBinding.inflate(inflater, container, false).also {
        _binding = it
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (args.noteId != 0) {
            viewModel.loadNote(args.noteId)
            viewLifecycleOwner.lifecycleScope.launch {
                viewModel.currentNote.collectLatest { note ->
                    note?.let {
                        binding.etTitle.setText(it.title)
                        binding.etContent.setText(it.content)
                    }
                }
            }
        }

        binding.btnSave.setOnClickListener {
            val title = binding.etTitle.text.toString()
            val content = binding.etContent.text.toString()
            val timestamp = System.currentTimeMillis()

            val note = Note(
                id = args.noteId,
                title = title,
                content = content,
                timestamp = timestamp
            )
            viewModel.saveNote(note)
            requireActivity().onBackPressed()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
