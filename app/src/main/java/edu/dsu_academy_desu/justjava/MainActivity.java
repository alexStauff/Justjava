package edu.dsu_academy_desu.justjava;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity
{
    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *This method creates an order summary by creating and displaying a name along with
     * the quantity and the price ( quantity * 5 ) plus a thank you!
     */

    public String createOrderSummary(int number)
    {
        String name = "Name: Kaptain Kunal";
        String num = "Quantity: " + number ;
        int price = number * 5 ;
        String message="Total: $" + price + "\nThank You!";
        String endMessage= name + "\n" + num + "\n" + message;
        return endMessage;
    }

    /**
     * This method is called when the plus button is clicked.
     */

    public void increment(View view)
    {
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */

    public void decrement(View view)
    {
        quantity = quantity - 1;
        display(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View view)
    {
        displayMessage(createOrderSummary(quantity));

    }

    /**
     * This method displays the given quantity value on the screen.
     */

    private void display(int number)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price value on the screen.
     * @param number: the quantity of coffee
     */

    private void displayPrice(int number)
    {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the order summary
     * @param mess: the overall message to be displayed under order summary
     */

    private void displayMessage(String mess)
    {
        TextView messTextView = (TextView) findViewById(R.id.mess_text_view);
        messTextView.setText(mess);
    }
}