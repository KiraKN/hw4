package com.kirakn.hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.kirakn.hw4.BusTicket;


public class MainActivity extends AppCompatActivity {

    private EditText userIdEditText;
    private EditText departureTimeEditText;
    private EditText arrivalTimeEditText;
    private EditText seatNumberEditText;
    private EditText ticketPriceEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userIdEditText = findViewById(R.id.userIdEditText);
        departureTimeEditText = findViewById(R.id.departureTimeEditText);
        arrivalTimeEditText = findViewById(R.id.arrivalTimeEditText);
        seatNumberEditText = findViewById(R.id.seatNumberEditText);
        ticketPriceEditText = findViewById(R.id.ticketPriceEditText);

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Получение данных из полей ввода
                int userId = Integer.parseInt(userIdEditText.getText().toString());
                String departureTime = departureTimeEditText.getText().toString();
                String arrivalTime = arrivalTimeEditText.getText().toString();
                int seatNumber = Integer.parseInt(seatNumberEditText.getText().toString());
                double ticketPrice = Double.parseDouble(ticketPriceEditText.getText().toString());

                // Создание объекта BusTicket
                BusTicket busTicket = new BusTicket(userId, departureTime, arrivalTime, seatNumber, ticketPrice);

                // Передача объекта в SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("busTicket", busTicket);
                startActivity(intent);
            }
        });
    }
}
