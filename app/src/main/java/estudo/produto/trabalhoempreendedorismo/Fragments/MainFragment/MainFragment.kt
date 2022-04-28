package estudo.produto.trabalhoempreendedorismo.Fragments.MainFragment

import android.os.Build
import android.os.Bundle
import android.util.DisplayMetrics
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import estudo.produto.trabalhoempreendedorismo.MainActivity.MainActivity
import estudo.produto.trabalhoempreendedorismo.R
import estudo.produto.trabalhoempreendedorismo.databinding.FragmentMainBinding
import estudo.produto.trabalhoempreendedorismo.navTo


class MainFragment : Fragment() {

    private lateinit var binding : FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
       binding = FragmentMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        transacFrag()

            }

    private fun transacFrag() {

      binding.btCalculum.setOnClickListener {   navTo(R.id.action_mainFragment_to_mainMatematicaFragment) }

      binding.btPort.setOnClickListener {  navTo(R.id.action_mainFragment_to_mainPortuguesFragment)   }

      binding.btGeo.setOnClickListener{   navTo(R.id.action_mainFragment_to_mainGeografiaFragment)   }

      binding.btAtendimento.setOnClickListener { navTo(R.id.action_mainFragment_to_atendenteFragment) }


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View{return binding.root}
}