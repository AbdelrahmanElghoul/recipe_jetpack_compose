package com.example.kcompose

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class RecipeListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recipe, container, false)
        view.findViewById<ComposeView>(R.id.compose_view).setContent {

            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .border(BorderStroke(1.dp, Color.Black))
                    .padding(15.dp)
                    .background(Color(0xFF9EAAF3))
            ) {
                Text(
                    text = "Recipe List Fragment",
                    style = TextStyle(

                        fontSize = 21.sp
                    ),
                    modifier = Modifier.padding(20.dp)
                )
                Spacer(
                    modifier = Modifier.padding(20.dp)
                ) 

                Button(
                    onClick = {
                        findNavController().navigate(R.id.view_recipe)
                    }
                ) {
                    Text(text = "to Recipe List")
                }
//                CircularProgressIndicator(
//
//                )
//
//                AndroidView(factory = {
//                    HorizontalDottedProgress(requireContext())
//                })
            }


        }

        return view
    }
}