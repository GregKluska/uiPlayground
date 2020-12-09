package com.gregkluska.playground.presentation.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.gregkluska.playground.presentation.BaseApplication
import com.gregkluska.playground.presentation.theme.AppTheme
import javax.inject.Inject

class AuthFragment : Fragment() {

    @Inject
    lateinit var application: BaseApplication

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                AppTheme (
                    darkTheme = !application.isLight
                ){

                    val scaffoldState = rememberScaffoldState()
                    
                    Scaffold {
                        Column() {
                            Row() {
                                Text(text = "LOOK MA, NO HANDS")
                            }
                        }
                    }
                    
                }
            }
        }
    }

}