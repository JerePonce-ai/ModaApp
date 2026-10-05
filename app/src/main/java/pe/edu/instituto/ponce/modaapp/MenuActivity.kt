package pe.edu.instituto.ponce.modaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pe.edu.instituto.ponce.modaapp.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ropa
        binding.btnRopa.setOnClickListener {
            startActivity(Intent(this, RopaActivity::class.java))
        }

        // Pedidos
        binding.btnPedidos.setOnClickListener {
            startActivity(Intent(this, PedidosActivity::class.java))
        }

        // Clientes
        binding.btnClientes.setOnClickListener {
            startActivity(Intent(this, ClientesActivity::class.java))
        }

        // Reportes
        binding.btnReportes.setOnClickListener {
            startActivity(Intent(this, ReportesActivity::class.java))
        }

        // Salir (Cerrar sesión)
        binding.btnSalir.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            startActivity(intent)
        }
    }
}