package school.alihamz.assignment2.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import school.alihamz.assignment2.Models.ProblemModel
import school.alihamz.assignment2.databinding.FragmentNewProblemBinding

abstract class NewProblemFragment : Fragment() {

    private var _binding : FragmentNewProblemBinding? = null
    private val binding get() = _binding !!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        _binding = FragmentNewProblemBinding.inflate(layoutInflater, container, false)
        binding.problem.setText("ProblemModel")


        return binding.root
    }
}