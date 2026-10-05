package pe.edu.instituto.ponce.modaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pe.edu.instituto.ponce.modaapp.databinding.ActivityCatalogoBinding

class CatalogoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCatalogoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCatalogoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCarrito.setOnClickListener {
            startActivity(Intent(this, CarritoActivity::class.java))
        }
    }
}