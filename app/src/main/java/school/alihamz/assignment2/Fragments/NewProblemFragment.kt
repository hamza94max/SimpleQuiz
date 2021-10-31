package school.alihamz.assignment2.Fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_new_problem.*
import school.alihamz.assignment2.R


class NewProblemFragment : Fragment(R.layout.fragment_new_problem) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        submit_answer.setOnClickListener {
            Log.i("tag", "done !")
        }
    }
}