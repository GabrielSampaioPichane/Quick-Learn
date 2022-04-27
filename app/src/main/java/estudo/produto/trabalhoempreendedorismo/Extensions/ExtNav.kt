package estudo.produto.trabalhoempreendedorismo

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

fun Fragment.navTo(@IdRes dest : Int) = findNavController().navigate(dest)
