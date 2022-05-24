package estudo.produto.trabalhoempreendedorismo.Fragments.PortuguesFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import estudo.produto.trabalhoempreendedorismo.R
import estudo.produto.trabalhoempreendedorismo.databinding.FragmentPtNivel1Binding
import java.net.URL


class PtNivel1Fragment : Fragment() {
    private lateinit var binding : FragmentPtNivel1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentPtNivel1Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        binding.btVideoPt1.setOnClickListener {

         URL("https://www.youtube.com/results?search_query=aulas+basicas+de+portugues").toURI()

        }

    }




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {return binding.root}


}