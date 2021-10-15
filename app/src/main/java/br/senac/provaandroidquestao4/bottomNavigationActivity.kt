package br.senac.provaandroidquestao4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import br.senac.provaandroidquestao4.databinding.ActivityBottomNavigationBinding

class bottomNavigationActivity : AppCompatActivity() {

    lateinit var binding: ActivityBottomNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)





        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.menuSettings -> {
                    var frag = SettingsFragment ()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.conFrag, frag).commit()
                }
                R.id.menuUser -> {
                    val frag = UsersFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.conFrag, frag).commit()
                }

            }

            true
        }

    }
}