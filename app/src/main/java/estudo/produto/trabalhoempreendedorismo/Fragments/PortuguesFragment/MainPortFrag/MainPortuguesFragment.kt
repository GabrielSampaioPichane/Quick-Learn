package estudo.produto.trabalhoempreendedorismo.Fragments.PortuguesFragment.MainPortFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import estudo.produto.trabalhoempreendedorismo.R
import estudo.produto.trabalhoempreendedorismo.databinding.FragmentMainPortuguesBinding
import estudo.produto.trabalhoempreendedorismo.navTo


class MainPortuguesFragment : Fragment() {

    private lateinit var binding : FragmentMainPortuguesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentMainPortuguesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        transActFrag()

    }

    private fun transActFrag() {

        binding.btPt1.setOnClickListener {navTo(R.id.ptNivel1Fragment)}

        binding.btPt2.setOnClickListener {navTo(R.id.ptNivel2Fragment)}

        binding.btPt3.setOnClickListener {navTo(R.id.ptNivel3Fragment)}

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        return binding.root
    }


}