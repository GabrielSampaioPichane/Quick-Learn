package estudo.produto.trabalhoempreendedorismo.Fragments.CaculumFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import estudo.produto.trabalhoempreendedorismo.R
import estudo.produto.trabalhoempreendedorismo.databinding.FragmentFrasaoBinding


class FrasaoFragment : Fragment() {

    private lateinit var binding : FragmentFrasaoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentFrasaoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {return binding.root}


}