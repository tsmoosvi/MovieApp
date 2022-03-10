package com.example.movieapp

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.movieapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root

    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        changeStarColor()
//        binding.star1.setOnClickListener{
//            binding.star1.setBackgroundResource(R.color.black)
//        }

    }
    fun changeStarColor(){

        var buttonList = arrayListOf(binding.star1,binding.star2,binding.star3,
            binding.star4,binding.star5,binding.star6,
            binding.star7,binding.star8,binding.star9,
            binding.star10,binding.star11,binding.star12)   //wher should I put this button list????
        for (button in buttonList){
            button.setOnClickListener{
                button.setBackgroundResource(R.color.yellow)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.profile ->{
                goToProfileFragmint()
                true
            }
            R.id.favorit ->{
                 goToFavoriteFragmint()
                 true
            }
            R.id.comingSoon->{
                goToComingSoonFragmint()
                true
            }
            else ->return super.onOptionsItemSelected(item)
        }

    }
    private fun goToProfileFragmint() {
        findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
    }
    private fun goToFavoriteFragmint() {
        findNavController().navigate(R.id.action_homeFragment_to_favoriteFragment)
    }

    private fun goToComingSoonFragmint() {
        findNavController().navigate(R.id.action_homeFragment_to_comingSoonFragment)
    }




}