package com.example.anb.androidgridlayout;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        //setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
//        setSingleOneTimeForAllEvent(mainGrid);
    }

    private void setSingleOneTimeForAllEvent(GridLayout mainGrid) {
        //Loop all child item of main grid
        for (int i=0;i<mainGrid.getChildCount();i++){
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,OneForAllIntentActivity.class);
                intent.putExtra("info","This is activity from card item index "+finalI);
                startActivity(intent);
                }
            });
        }
    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of main grid
        for (int i=0;i<mainGrid.getChildCount();i++){
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1){
                        //Change Background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(MainActivity.this, "State : True", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        //Change Background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(MainActivity.this, "State : False", Toast.LENGTH_SHORT).show();

                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of main grid
        for (int i=0;i<mainGrid.getChildCount();i++){
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI == 0){
                        Intent intent = new Intent(MainActivity.this,ActivityOne.class);
                        startActivity(intent);
                    } else if (finalI == 1){
                        Intent intent = new Intent(MainActivity.this,ActivityTwo.class);
                        startActivity(intent);
                    } else if (finalI == 2){
                        Intent intent = new Intent(MainActivity.this,ActivityThree.class);
                        startActivity(intent);
                    } else if (finalI == 3){
                        Intent intent = new Intent(MainActivity.this,ActivityFour.class);
                        startActivity(intent);
                    } else if (finalI == 4){
                        Intent intent = new Intent(MainActivity.this,ActivityFive.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Please set Activity for this card item", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
