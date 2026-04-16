package kr.ac.kopo.layouttest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearRed, linearBlue;
    Button btnRed, btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main12);

        linearRed = findViewById(R.id.linear_red);
        linearRed = findViewById(R.id.linear_blue);

        btnRed = findViewById(R.id.btn_red);
        btnBlue = findViewById(R.id.btn_blue);

        btnRed.setOnClickListener(btnListener);
        btnBlue.setOnClickListener(btnListener);

//        LinearLayout linear = new LinearLayout(this);
//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT);
//        linear.setOrientation(LinearLayout.VERTICAL);
//        linear.setBackgroundColor(Color.GREEN);
//
//        Button btn = new Button(this);
//        btn.setText("코드로 작성한 버튼");
//        btn.setBackgroundColor(Color.MAGENTA);
//        linear.addView(btn);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "코드로 작성한 버튼이 클릭됩니다.", Toast.LENGTH_SHORT).show();
//            }
//        });

//        setContentView(linear, params);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            linearRed.setVisibility(View.INVISIBLE);
            linearBlue.setVisibility(View.INVISIBLE);
            Button btnEvent = (Button) v;
            if(btnEvent == btnRed)
            {
                linearRed.setVisibility(View.VISIBLE);
            } else {
                linearBlue.setVisibility(View.VISIBLE);
            }
        }
    };
}