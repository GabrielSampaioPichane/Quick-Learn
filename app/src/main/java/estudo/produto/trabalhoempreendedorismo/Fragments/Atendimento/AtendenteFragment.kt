package estudo.produto.trabalhoempreendedorismo.Fragments.Atendimento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import estudo.produto.trabalhoempreendedorismo.R
import estudo.produto.trabalhoempreendedorismo.databinding.FragmentAtendenteBinding


class AtendenteFragment : Fragment() {

    private lateinit var binding : FragmentAtendenteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentAtendenteBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        return binding.root
    }


}