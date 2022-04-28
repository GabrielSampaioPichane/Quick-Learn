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

        binding.btSoma.setOnClickListener { navTo(R.id.action_mainMatematicaFragment_to_somaFragment) }

        binding.btSubtracao.setOnClickListener { navTo(R.id.action_mainMatematicaFragment_to_subtracaoFragment) }

        binding.btMultiplicacao.setOnClickListener { navTo(R.id.action_mainMatematicaFragment_to_multiplicacaoFragment) }

        binding.btDivisO.setOnClickListener { navTo(R.id.action_mainMatematicaFragment_to_divisaoFragment) }

        binding.btRaiz.setOnClickListener { navTo(R.id.action_mainMatematicaFragment_to_raizFragment) }

        binding.btPotencia.setOnClickListener { navTo(R.id.action_mainMatematicaFragment_to_porenciaFragment) }

        binding.btBhaskara.setOnClickListener { navTo(R.id.action_mainMatematicaFragment_to_baskaraFragment) }

        binding.btMinMaxMult.setOnClickListener { navTo(R.id.action_mainMatematicaFragment_to_minimoMaximoMultFragment) }

        binding.btFracao.setOnClickListener { navTo(R.id.action_mainMatematicaFragment_to_frasaoFragment) }

        binding.btDistributiva.setOnClickListener { navTo(R.id.action_mainMatematicaFragment_to_distributivaFragment) }

        binding.btExerciciosGerais.setOnClickListener { navTo(R.id.action_mainMatematicaFragment_to_exerciciosGeraisCalculumFragment) }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View{
            return binding.root
    }


}