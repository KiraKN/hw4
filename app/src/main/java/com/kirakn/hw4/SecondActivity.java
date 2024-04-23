package com.kirakn.hw4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.kirakn.hw4.BusTicket;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView userIdTextView = findViewById(R.id.userIdTextView);
        TextView departureTimeTextView = findViewById(R.id.departureTimeTextView);
        TextView arrivalTimeTextView = findViewById(R.id.arrivalTimeTextView);
        TextView seatNumberTextView = findViewById(R.id.seatNumberTextView);
        TextView ticketPriceTextView = findViewById(R.id.ticketPriceTextView);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("busTicket")) {
            BusTicket busTicket = (BusTicket) intent.getSerializableExtra("busTicket");
            userIdTextView.setText("User ID: " + busTicket.getUserId());
            departureTimeTextView.setText("Departure Time: " + busTicket.getDepartureTime());
            arrivalTimeTextView.setText("Arrival Time: " + busTicket.getArrivalTime());
            seatNumberTextView.setText("Seat Number: " + busTicket.getSeatNumber());
            ticketPriceTextView.setText("Ticket Price: " + busTicket.getTicketPrice());
        }

        Button newOrderButton = findViewById(R.id.newOrderButton);
        newOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newOrderIntent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(newOrderIntent);
            }
        });
    }
}
