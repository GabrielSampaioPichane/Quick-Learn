package estudo.produto.trabalhoempreendedorismo.Fragments.CaculumFragments.MainMatFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import estudo.produto.trabalhoempreendedorismo.R
import estudo.produto.trabalhoempreendedorismo.databinding.FragmentMainMatematicaBinding
import estudo.produto.trabalhoempreendedorismo.navTo


class MainMatematicaFragment : Fragment() {

    private lateinit var binding : FragmentMainMatematicaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentMainMatematicaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        transActFrag()

    }

    private fun transActFrag() {

        binding.btSoma.setOnClickListener { navTo(R.id.somaFragment) }

        binding.btSubtracao.setOnClickListener { navTo(R.id.subtracaoFragment) }

        binding.btMultiplicacao.setOnClickListener { navTo(R.id.multiplicacaoFragment) }

        binding.btDivisO.setOnClickListener { navTo(R.id.divisaoFragment) }

        binding.btRaiz.setOnClickListener { navTo(R.id.raizFragment) }

        binding.btPotencia.setOnClickListener { navTo(R.id.porenciaFragment) }

        binding.btBhaskara.setOnClickListener { navTo(R.id.baskaraFragment) }

        binding.btMinMaxMult.setOnClickListener { navTo(R.id.minimoMaximoMultFragment) }

        binding.btFracao.setOnClickListener { navTo(R.id.frasaoFragment) }

        binding.btDistributiva.setOnClickListener { navTo(R.id.distributivaFragment) }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View{
            return binding.root
    }


}