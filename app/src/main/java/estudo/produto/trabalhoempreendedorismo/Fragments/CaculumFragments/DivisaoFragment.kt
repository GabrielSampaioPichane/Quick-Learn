package estudo.produto.trabalhoempreendedorismo.Fragments.CaculumFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import estudo.produto.trabalhoempreendedorismo.R
import estudo.produto.trabalhoempreendedorismo.databinding.FragmentDivisaoBinding

class DivisaoFragment : Fragment() {

    private lateinit var binding : FragmentDivisaoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentDivisaoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        navNetExer()

    }

    private fun navNetExer() {

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {return binding.root}

}