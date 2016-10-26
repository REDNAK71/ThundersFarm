package phonecall.rednak71.com.thundersfarm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class ContactActivity extends AppCompatActivity {

    private ImageButton callSara;
    private ImageButton callNeal;
    private ImageButton callJudith;
    private ImageButton smsSara;
    private ImageButton smsNeal;
    private ImageButton smsJudith;
    private ImageButton emailSara;
    private ImageButton emailJudith;
    private ImageButton emailNeal;
    private ImageButton home;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        callSara = (ImageButton) findViewById(R.id.saraCallButton);
        callSara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callSaraButton = new Intent(Intent.ACTION_CALL);
                callSaraButton.setData(Uri.parse("tel: 5153719127"));
                startActivity(callSaraButton);
            }
        });

        callNeal = (ImageButton) findViewById(R.id.nealCallButton);
        callNeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callNealButton = new Intent(Intent.ACTION_CALL);
                callNealButton.setData(Uri.parse("tel: 5153716333"));
                startActivity(callNealButton);
            }
        });

        callJudith = (ImageButton)findViewById(R.id.judithCallButtonId);
        callJudith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calljudith = new Intent(Intent.ACTION_CALL);
                calljudith.setData(Uri.parse("tel: 5159792093"));
                startActivity(calljudith);
            }
        });

        smsSara =(ImageButton) findViewById(R.id.saraSmsButton);
        smsSara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms: + 5153719127"));
                startActivity(sendIntent);

            }
        });

        smsNeal = (ImageButton) findViewById(R.id.nealSmsButton);
        smsNeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendSmsNeal = new Intent(Intent.ACTION_VIEW);
                sendSmsNeal.setData(Uri.parse("sms: + 5153716333"));
                startActivity(sendSmsNeal);
            }
        });


        smsJudith = (ImageButton) findViewById(R.id.judithSMSButton);
        smsJudith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendSmsJudith = new Intent(Intent.ACTION_VIEW);
                sendSmsJudith.setData(Uri.parse("sms: + 5159792093"));
                startActivity(sendSmsJudith);
            }
        });

        emailSara = (ImageButton) findViewById(R.id.saraEmailButton);
        emailSara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailSara = new Intent(Intent.ACTION_VIEW);
                emailSara.setData(Uri.parse("mailto: + saraetter@gmail.com"));
                startActivity(emailSara);
            }
        });

        emailJudith = (ImageButton)findViewById(R.id.judithEamilButton);
        emailJudith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailJudith = new Intent(Intent.ACTION_VIEW);
                emailJudith.setData(Uri.parse("mailto: + jpim@worldfoodprize.org"));
                startActivity(emailJudith);
            }
        });

        emailNeal = (ImageButton)findViewById(R.id.nealEmailButton);
        emailNeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailNeal = new Intent(Intent.ACTION_VIEW);
                emailNeal.setData(Uri.parse("mailto: nealkyer@gmail.com"));
                startActivity(emailNeal);
            }
        });

        home = (ImageButton) findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHome = new Intent(ContactActivity.this, MainActivity.class);
                startActivity(goHome);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_contact, menu);
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
