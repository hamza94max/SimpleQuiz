package school.alihamz.assignment2.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_wrong_answer.*
import school.alihamz.assignment2.R


class WrongAnswerFragment : Fragment(R.layout.fragment_wrong_answer) {

    private val args: WrongAnswerFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        seeAnswerbtn.setOnClickListener {
            val action =
                WrongAnswerFragmentDirections.actionWrongAnswerFragmentToSeeAnswerFragment(args.result)
            findNavController().navigate(action)
        }

        tryagainbtn.setOnClickListener {
            Toast.makeText(context, "try again ", Toast.LENGTH_LONG).show()
        }


    }


}