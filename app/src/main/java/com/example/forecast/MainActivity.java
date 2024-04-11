package com.example.forecast;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View; // Import statement for View class
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextCity;
    private Button buttonFetch;
    private TextView textViewCurrentTemp;
    private TextView textViewMaxTemp;
    private TextView textViewMinTemp;
    private TextView textViewHumidity;
    private TextView textViewSkyCondition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCity = findViewById(R.id.editTextCity);
        buttonFetch = findViewById(R.id.buttonFetch);
        textViewCurrentTemp = findViewById(R.id.textViewCurrentTemp);
        textViewMaxTemp = findViewById(R.id.textViewMaxTemp);
        textViewMinTemp = findViewById(R.id.textViewMinTemp);
        textViewHumidity = findViewById(R.id.textViewHumidity);
        textViewSkyCondition = findViewById(R.id.textViewSkyCondition);

        buttonFetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchWeatherData(editTextCity.getText().toString());
            }
        });
    }

    private void fetchWeatherData(String cityName) {
        // Your implementation to fetch weather data goes here
    }
}
