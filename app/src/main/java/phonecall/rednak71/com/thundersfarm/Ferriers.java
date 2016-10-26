package phonecall.rednak71.com.thundersfarm;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Ferriers extends AppCompatActivity {

    private Button randyHoy;
    private Button steveHerold;
    private Button Gean;
    private Button ryanMoore;
    private Button randyHensley;
    private ImageButton home;
    private Button keithBoll;
    private Button danWhite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ferriers);

        randyHoy =  (Button)findViewById(R.id.callHoybutton);
        randyHoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callHoy = new Intent(Intent.ACTION_CALL);
                callHoy.setData(Uri.parse("tel: 5154904593"));
                startActivity(callHoy);
            }
        });

                steveHerold = (Button) findViewById(R.id.callHeroldButtonID);
                steveHerold.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent callHerold = new Intent(Intent.ACTION_CALL);
                        callHerold.setData(Uri.parse("tel: 5152507015"));
                        startActivity(callHerold);
                    }
                });



                        Gean = (Button)findViewById(R.id.callDustinButtonID);
                        Gean.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent callGean = new Intent(Intent.ACTION_CALL);
                                callGean.setData(Uri.parse("tel: 5156641620"));
                                startActivity(callGean);
                            }

                            });

                                ryanMoore = (Button)findViewById(R.id.callMooreButtonID);
                                ryanMoore.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent callMoore = new Intent(Intent.ACTION_CALL);
                                        callMoore.setData(Uri.parse("tel: 5152103250"));
                                        startActivity(callMoore);
                                    }
                                });

        home = (ImageButton) findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHome = new Intent(Ferriers.this, MainActivity.class);
                startActivity(goHome);

            }
        });

        randyHensley = (Button)findViewById(R.id.callHensleyButtonID);
        randyHensley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callHensley = new Intent(Intent.ACTION_CALL);
                callHensley.setData(Uri.parse("tel: 6417455576"));
                startActivity(callHensley);
            }
        });

        keithBoll =  (Button)findViewById(R.id.callBollButton);
        keithBoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callBoll = new Intent(Intent.ACTION_CALL);
                callBoll.setData(Uri.parse("tel: 5152509407"));
                startActivity(callBoll);
            }
        });


        danWhite = (Button) findViewById(R.id.callWhiteButtonID);
        danWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callHerold = new Intent(Intent.ACTION_CALL);
                callHerold.setData(Uri.parse("tel: 5152312425"));
                startActivity(callHerold);
            }
        });









    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ferriers, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
