package checkbox.sederhana;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox rendang, ayamPop, ayamGulai;
    private String menusatu, menudua, menutiga;
    private Button order;
    private TextView pilihan1, pilihan2, pilihan3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rendang = findViewById(R.id.rendang);
        ayamPop = findViewById(R.id.ayamPop);
        ayamGulai = findViewById(R.id.ayamGulai);
        pilihan1 = findViewById(R.id.menu1);
        pilihan2 = findViewById(R.id.menu2);
        pilihan3 = findViewById(R.id.menu3);
        order = findViewById(R.id.order);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rendang.isChecked()){
                    menusatu = "Rendang";
                }
                else if (!rendang.isChecked()){
                    menusatu = " ";
                }
                if (ayamPop.isChecked()){
                    menudua = "Ayam Pop";
                }
                else if (!ayamPop.isChecked()){
                    menudua = " ";
                }
                if (ayamGulai.isChecked()){
                    menutiga = "Ayam Gulai";
                }
                else if (!ayamGulai.isChecked()){
                    menutiga = " ";
                }

                if (!rendang.isChecked() && !ayamPop.isChecked() && !ayamGulai.isChecked()){
                    Toast.makeText(getApplicationContext(), "Tidak ada menu makanan yang dipesan", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Pesanan Terkirim", Toast.LENGTH_SHORT).show();
                    pilihan1.setText("Menu 1: "+menusatu);
                    pilihan2.setText("Menu 2: "+menudua);
                    pilihan3.setText("Menu 3: "+menutiga);
                }
            }
        });
    }
}