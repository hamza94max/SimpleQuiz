package school.alihamz.assignment2.Fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_see_answer.*
import school.alihamz.assignment2.R


class SeeAnswerFragment : Fragment(R.layout.fragment_see_answer) {

    private val args: SeeAnswerFragmentArgs by navArgs()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        seeanswerText.text = args.result.toString()


    }
}