package com.example.android.quiz;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

        import android.content.Context;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.MotionEvent;
        import android.view.View;
        import android.view.inputmethod.InputMethodManager;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        View view = getCurrentFocus ( );
        if ( view != null && (ev.getAction ( ) == MotionEvent.ACTION_UP || ev.getAction ( ) == MotionEvent.ACTION_MOVE) && view instanceof EditText && !view.getClass ( ).getName ( ).startsWith ( "android.webkit." ) ) {
            int scrcoords[] = new int[2];
            view.getLocationOnScreen ( scrcoords );
            float x = ev.getRawX ( ) + view.getLeft ( ) - scrcoords[0];
            float y = ev.getRawY ( ) + view.getTop ( ) - scrcoords[1];
            if ( x < view.getLeft ( ) || x > view.getRight ( ) || y < view.getTop ( ) || y > view.getBottom ( ) )
                (( InputMethodManager ) this.getSystemService ( Context.INPUT_METHOD_SERVICE )).hideSoftInputFromWindow ( (this.getWindow ( ).getDecorView ( ).getApplicationWindowToken ( )), 0 );
        }
        return super.dispatchTouchEvent ( ev );
    }
    /**
     * This method is called, when the Submit Answers button is clicked
     */
    public void submitAnswers(View view) {
        String name = getName();
        String summaryMessage;
        summaryMessage = createSummary(name, calculateTotalScore());
        Toast.makeText(this, summaryMessage, Toast.LENGTH_LONG).show();
    }

    /**
     * Checks EditText name
     *
     * @return string of the name
     */
    private String getName() {
        EditText name = findViewById ( R.id.name );
        String nameText = name.getText().toString();
        return nameText;
    }

    /**
     * This method creates summary message
     *
     * @param name
     * @return summaryMessage
     */
    private String createSummary(String name, int totalScore) {
        String summaryMessage = "Congratulations, " + name + "!";
        summaryMessage = summaryMessage + "\nYou got " + totalScore + " wright!";
        return summaryMessage;
    }

    /**
     * This method calculates total score
     */
    private int calculateTotalScore() {
        int totalScore = 0;
        /**
         *  This method checks if question 1 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton two_q1 = findViewById ( R.id.two_q1 );
        two_q1.isChecked();
        if (two_q1.isChecked()) {
            totalScore = totalScore + 1;
        }
        /**
         *  This method checks if question 2 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton one_q2 = findViewById ( R.id.one_q2 );
        one_q2.isChecked();
        if (one_q2.isChecked()) {
            totalScore = totalScore + 1;
        }

        /**
         *  This method checks if question 3 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton two_q3 = findViewById ( R.id.two_q3 );
        two_q3.isChecked();
        if (two_q3.isChecked()) {
            totalScore = totalScore + 1;
        }
        /**
         *  This method checks if question 4 right answers are checked and ads 1 point to total score, if it is
         */
        RadioButton four_q4 = findViewById ( R.id.four_q4 );
        four_q4.isChecked();
        if (four_q4.isChecked()) {
            totalScore = totalScore + 1;
        }
        /**
         *  This method checks if question 5 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton three_q5 = findViewById ( R.id.three_q5 );
        three_q5.isChecked();
        if (three_q5.isChecked()) {
            totalScore = totalScore + 1;
        }
        /**
         *  This method checks if question 6 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton one_q6 = findViewById ( R.id.one_q6 );
        one_q6.isChecked();
        if (one_q6.isChecked()) {
            totalScore = totalScore + 1;
        }
        /**
         *  This method checks if question 7 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton two_q7 = findViewById ( R.id.two_q7 );
        two_q7.isChecked();
        if (two_q7.isChecked()) {
            totalScore = totalScore + 1;
        }

        /**
         *  This method checks if question 7 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton three_q8 = findViewById ( R.id.three_q8 );
        three_q8.isChecked();
        if (three_q8.isChecked()) {
            totalScore = totalScore + 1;
        }

        /**
         *  This method checks if question 9 right answers are checked and ads 1 point to total score, if it is
         */
        RadioButton four_q9 = findViewById(R.id.four_q9);
        four_q9.isChecked();
        if (four_q9.isChecked()) {
            totalScore = totalScore + 1;
        }

        /**
         *  This method checks if question 10 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton three_q10 = findViewById ( R.id.three_q10 );
        three_q10.isChecked();
        if (three_q10.isChecked()) {
            totalScore = totalScore + 1;
        }
        return totalScore;
    }

}