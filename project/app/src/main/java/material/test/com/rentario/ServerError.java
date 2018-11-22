package material.test.com.rentario;

import android.content.DialogInterface;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ServerError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_error);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // yourMethod();
                showDialog();
            }
        }, 2000);   //5 seconds

    }

    private void showDialog()
    {
        AlertDialog.Builder altdial = new AlertDialog.Builder(ServerError.this);
        altdial.setMessage("Do you want to quit the app ???").setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
        AlertDialog alert = altdial.create();
        alert.setTitle("No connection to Server");
        alert.show();
    }
}
