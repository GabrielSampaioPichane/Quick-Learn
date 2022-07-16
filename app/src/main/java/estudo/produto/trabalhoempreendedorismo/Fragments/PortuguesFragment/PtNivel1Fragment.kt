package estudo.produto.trabalhoempreendedorismo.Fragments.PortuguesFragment

import android.net.MailTo.parse
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import estudo.produto.trabalhoempreendedorismo.R
import estudo.produto.trabalhoempreendedorismo.databinding.FragmentPtNivel1Binding
import java.net.HttpCookie.parse
import java.net.URL
import java.util.logging.Level.parse


class PtNivel1Fragment : Fragment() {
    private lateinit var binding : FragmentPtNivel1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentPtNivel1Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        binding.btVideoPt1.setOnClickListener {

            obras()

               URL("https://www.youtube.com/results?search_query=aulas+basicas+de+portugues")

        }


    }

  private fun obras(){

      Toast.makeText(activity,"ESTAMOS EM OBRAS! VOLTE MAIS TARDE!", Toast.LENGTH_SHORT).show()


  }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {return binding.root}


}