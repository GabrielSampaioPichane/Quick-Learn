package estudo.produto.trabalhoempreendedorismo.Fragments.Geografia.MainGeoFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import estudo.produto.trabalhoempreendedorismo.R
import estudo.produto.trabalhoempreendedorismo.databinding.FragmentMainGeografiaBinding
import estudo.produto.trabalhoempreendedorismo.navTo


class MainGeografiaFragment : Fragment() {

    private lateinit var binding : FragmentMainGeografiaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentMainGeografiaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        transActFrag()

    }

    private fun transActFrag() {

        binding.btMapas.setOnClickListener { navTo(R.id.mapasFragment)       }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        return binding.root
    }


}