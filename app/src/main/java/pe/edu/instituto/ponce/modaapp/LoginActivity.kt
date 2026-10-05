package pe.edu.instituto.ponce.modaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import pe.edu.instituto.ponce.modaapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Botón Ingresar
        binding.btnIngresar.setOnClickListener {

            val usuario = binding.etUsuario.text.toString().trim()
            val clave = binding.etClave.text.toString().trim()

            // Limpiar errores anteriores
            binding.tilUsuario.error = null
            binding.tilClave.error = null

            // Validar usuario
            if (usuario.isEmpty()) {
                binding.tilUsuario.error = "Campo obligatorio"
                return@setOnClickListener
            }

            // Validar contraseña
            if (clave.isEmpty()) {
                binding.tilClave.error = "Campo obligatorio"
                return@setOnClickListener
            }

            // Credenciales del Sprint 1
            if (usuario == "admin" && clave == "1234") {

                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
                finish()

            } else {
                Toast.makeText(
                    this,
                    "Credenciales incorrectas",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        // Botón Ver catálogo como cliente
        binding.btnVerCatalogo.setOnClickListener {
            val intent = Intent(this, CatalogoActivity::class.java)
            startActivity(intent)
        }
    }
}