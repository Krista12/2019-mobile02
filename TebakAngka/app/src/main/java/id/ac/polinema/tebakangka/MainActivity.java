package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private EditText numberInput;
	int number;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		numberInput = findViewById(R.id.number_input);
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		number = (int) (Math.random()*100);
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		String angka = numberInput.getText().toString();
		int ambil = Integer.parseInt(angka);

		if(ambil == number){
			Toast.makeText(this, "Angka Terlalu Kecil", Toast.LENGTH_SHORT).show();
		}
		else if(ambil < number){
			Toast.makeText(this, "Angka Terlalu Besar", Toast.LENGTH_SHORT).show();
		}
		else if(ambil > number){
			Toast.makeText(this, "Angka Tebakan Benar", Toast.LENGTH_SHORT).show();

		}
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		numberInput.setText("");
		initRandomNumber();

	}
}
