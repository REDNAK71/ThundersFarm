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


public class Veterinarians extends AppCompatActivity {

    private Button redechelButton;
    private Button kipperButton;
    private Button appelButton;
    private Button howardButton;
    private Button harderButton;
    private Button paulButton;
    private Button woodford;
    private Button cline;
    private Button king;

    private ImageButton home;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.veterinarians);

        redechelButton = (Button)findViewById(R.id.callRedechelbutton);
        redechelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent callRedechel = new Intent(Intent.ACTION_CALL);
                callRedechel.setData(Uri.parse("tel: 5159890649"));
                startActivity(callRedechel);
            }
        });

        kipperButton = (Button)findViewById(R.id.callKipperButton);
        kipperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callKipper =new Intent(Intent.ACTION_CALL);
                callKipper.setData(Uri.parse("tel: 5159864530"));
                startActivity(callKipper);
            }
        });

        appelButton = (Button)findViewById(R.id.callAppelButton);
        appelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callAppel = new Intent(Intent.ACTION_CALL);
                callAppel.setData(Uri.parse("tel: 5159810082"));
                startActivity(callAppel);
            }
        });

        howardButton = (Button)findViewById(R.id.callHowardButton);
        howardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callHoward =new Intent(Intent.ACTION_CALL);
                callHoward.setData(Uri.parse("tel: 5152941500"));
                startActivity(callHoward);
            }
        });

        harderButton = (Button)findViewById(R.id.callHarderButton);
        harderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callHarder = new Intent(Intent.ACTION_CALL);
                callHarder.setData(Uri.parse("tel: 5152701296"));
                startActivity(callHarder);
            }
        });

        paulButton = (Button)findViewById(R.id.callSponsellerButton);
        paulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callPaul = new Intent(Intent.ACTION_CALL);
                callPaul.setData(Uri.parse("tel: 5152941500"));
                startActivity(callPaul);
            }
        });

        home = (ImageButton) findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHome = new Intent(Veterinarians.this, MainActivity.class);
                startActivity(goHome);

            }
        });

        woodford = (Button) findViewById(R.id.callWoodfordButtonID);
        woodford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callWoodford = new Intent(Intent.ACTION_CALL);
                callWoodford.setData(Uri.parse("tel: 319-560-9899"));
                startActivity(callWoodford);
            }
        });

        cline =(Button)findViewById(R.id.callClineButtonID);
        cline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callCline = new Intent(Intent.ACTION_CALL);
                callCline.setData(Uri.parse("tel: 515-229-4277"));
                startActivity(callCline);

            }
        });


        king = (Button)findViewById(R.id.callKingButtonID);
        king.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callKing = new Intent(Intent.ACTION_CALL);
                callKing.setData(Uri.parse("tel: 641-660-1844"));
                startActivity(callKing);
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_veterinarians, menu);
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
