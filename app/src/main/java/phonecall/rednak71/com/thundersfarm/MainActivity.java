package phonecall.rednak71.com.thundersfarm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private ImageView contactUsButton;
    private ImageView vetButton;
    private ImageButton fb;
    private ImageButton web;
    private ImageButton ferrierButton;
    private ImageButton calendarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_main);

        contactUsButton = (ImageView) findViewById(R.id.contactUsID);

        contactUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ContactActivity.class);

                startActivity(intent);
            }
        });

        vetButton = (ImageView) findViewById(R.id.vetButtonId);
        vetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vetPage = new Intent(MainActivity.this, Veterinarians.class);
                startActivity(vetPage);
            }
        });

        fb = (ImageButton) findViewById(R.id.fbImageButtonID);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webGoTo = new Intent(Intent.ACTION_VIEW);
                webGoTo.setData(Uri.parse("https://www.facebook.com/ThundersFarm"));
                startActivity(webGoTo);
            }
        });

        web = (ImageButton) findViewById(R.id.webButtonID);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent webGoTo = new Intent(Intent.ACTION_VIEW);
                webGoTo.setData(Uri.parse("http://www.thundersfarmllc.com"));
                startActivity(webGoTo);
            }
        });

        ferrierButton =(ImageButton) findViewById(R.id.ferrierButtonID);
        ferrierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openFerrier = new Intent(MainActivity.this, Ferriers.class);
                startActivity(openFerrier);

            }
        });


        calendarButton = (ImageButton) findViewById(R.id.calendarImageButtonId);
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent webGoTo = new Intent(Intent.ACTION_VIEW);
                webGoTo.setData(Uri.parse("https://calendar.google.com/calendar/embed?src=thundersfarmllc%40gmail.com&ctz=America/Chicago"));
                startActivity(webGoTo);
            }
        });



    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
