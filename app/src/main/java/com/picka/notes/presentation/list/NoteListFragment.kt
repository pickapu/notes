package com.picka.notes.presentation.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.picka.notes.databinding.FragmentNoteListBinding
import com.picka.notes.presentation.adapter.NoteAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class NoteListFragment : Fragment() {

    private var _binding: FragmentNoteListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: NoteListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentNoteListBinding.inflate(inflater, container, false).also {
        _binding = it
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = NoteAdapter(
            onItemClick = { note ->
                val action = NoteListFragmentDirections.actionNoteListToAddEdit(note.id)
                findNavController().navigate(action)
            },
            onDeleteClick = { note ->
                viewModel.onDeleteNoteClicked(note)
            }
        )
        binding.recyclerView.adapter = adapter

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.noteList.collectLatest { notes ->
                adapter.submitList(notes)
            }
        }

        binding.fabAddNote.setOnClickListener {
            findNavController().navigate(
                NoteListFragmentDirections.actionNoteListToAddEdit(0)
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
