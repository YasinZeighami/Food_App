package ir.dailycoding.foody.ui.fragments.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.todkars.shimmer.ShimmerRecyclerView
import ir.dailycoding.foody.databinding.FragmentRecipesBinding


class RecipesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
       val binding = FragmentRecipesBinding.inflate(inflater,container,false)



        binding.recyclerView.showShimmer()

        return binding.root
    }



}