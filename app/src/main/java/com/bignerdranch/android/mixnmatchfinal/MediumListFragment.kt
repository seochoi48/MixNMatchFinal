package com.bignerdranch.android.mixnmatchfinal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MediumListFragment : Fragment(){

    private lateinit var mediumRecyclerView: RecyclerView

    private val mediumListViewModel: BookListViewModel by lazy {
        ViewModelProviders.of(this).get(BookListViewModel::class.java)
    }

    companion object {
        fun newInstance(): MediumListFragment {
            return MediumListFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_medium_list, container, false)

        mediumRecyclerView = view.findViewById(R.id.medium_recycler_view) as RecyclerView
        mediumRecyclerView.layoutManager = LinearLayoutManager(context)

        return view
    }

    private inner class MediumHolder  (view: View) :RecyclerView.ViewHolder(view) {

        val titleTextView: TextView = itemView.findViewById(R.id.medium_title)
        val descriptionTextView: TextView = itemView.findViewById(R.id.medium_description)
        val rateButton: Button = itemView.findViewById(R.id.rate_button)
        val confirmButton: Button = itemView.findViewById(R.id.confirm_button)
    }


}