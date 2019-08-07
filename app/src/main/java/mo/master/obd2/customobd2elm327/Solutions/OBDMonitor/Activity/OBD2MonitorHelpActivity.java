package mo.master.obd2.customobd2elm327.Solutions.OBDMonitor.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import mo.master.obd2.customobd2elm327.R;

public class OBD2MonitorHelpActivity extends AppCompatActivity {

    private ListView mOBD2Protocols = null;
    private GridView mOBD2Commands = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obd2_monitor_help);
        mOBD2Protocols = (ListView)findViewById(R.id.obd2_protocol_listView);
        String[] mItems = getResources().getStringArray(R.array.protocols);
        // Create a Adapter for the mOBD2Protocols(ListView) and then bind the datasource
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, R.layout.device_name, mItems);
        //Sets the data behind this mOBD2Protocols(ListView)
        mOBD2Protocols.setAdapter(listAdapter);

        mOBD2Commands = (GridView)findViewById(R.id.obd2_cmd_gridView);
        String[] mCmdItmes = getResources().getStringArray(R.array.OBD2_Commands);
        ArrayAdapter<String> grideAdapter = new ArrayAdapter<String>(this, R.layout.gride_name, mCmdItmes);
        mOBD2Commands.setAdapter(grideAdapter);
    }
}