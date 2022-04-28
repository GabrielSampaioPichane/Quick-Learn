package estudo.produto.trabalhoempreendedorismo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import estudo.produto.trabalhoempreendedorismo.R
import estudo.produto.trabalhoempreendedorismo.databinding.FragmentLogoInitialBinding
import estudo.produto.trabalhoempreendedorismo.navTo
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class LogoInitialFragment : Fragment() {

 private lateinit var binding : FragmentLogoInitialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentLogoInitialBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

       lifecycleScope.launch { trasActHomeFrag() }

    }

    private suspend fun trasActHomeFrag() {

        delay(1700)

        navTo(R.id.action_logoInitialFragment_to_mainFragment)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {return binding.root}


}