package com.dic.kimxeang.checkboxclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private CheckBox cb_kp, cb_kep, cb_kps, cb_btb, cb_pl, cb_sr,
            cb_kpt, cb_kpc, cb_pv, cb_svayr, cb_takeo, cb_kpspeu,
            cb_st, cb_modol, cb_pvh, cb_rtn, cb_kk, cb_odor, cb_bmc;
    private EditText edtName;
    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    int selectedId;
    String checkbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = (EditText) findViewById(R.id.edt_Name);
        radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);

        cb_kps=(CheckBox)findViewById(R.id.edt_kps);
        cb_kp = (CheckBox) findViewById(R.id.edt_kompot);
        cb_kep = (CheckBox) findViewById(R.id.edt_kep);
        cb_pvh = (CheckBox) findViewById(R.id.edt_phv);
        cb_rtn = (CheckBox) findViewById(R.id.edt_ratanak);
        cb_odor = (CheckBox) findViewById(R.id.edt_odor);
        cb_st = (CheckBox) findViewById(R.id.edt_stengtreng);
        cb_modol = (CheckBox) findViewById(R.id.edt_mondol);
        cb_kk = (CheckBox) findViewById(R.id.edt_kohkong);
        cb_btb = (CheckBox) findViewById(R.id.edt_btb);
        cb_pl = (CheckBox) findViewById(R.id.edt_peilen);
        cb_bmc = (CheckBox) findViewById(R.id.edt_bmc);
        cb_svayr = (CheckBox) findViewById(R.id.edt_svayrieng);
        cb_kpc = (CheckBox) findViewById(R.id.edt_kpc);
        cb_kpt = (CheckBox) findViewById(R.id.edt_kpt);
        cb_sr = (CheckBox) findViewById(R.id.edt_sr);
        cb_pv = (CheckBox) findViewById(R.id.edt_pv);
        cb_takeo = (CheckBox) findViewById(R.id.edt_takeo);
        cb_kpspeu = (CheckBox) findViewById(R.id.edt_kps);
    }

    public void clickShow(View view) {
        selectedId = radioSexGroup.getCheckedRadioButtonId();
        radioSexButton = (RadioButton) findViewById(selectedId);

        String name = edtName.getText().toString() + "\n" + radioSexButton.getText();

        if (cb_kp.isChecked() == true) {
            checkbox = cb_kp.getText().toString();
        } else if (cb_kep.isChecked() == true) {
            checkbox = cb_kep.getText().toString();
        } else if (cb_pvh.isChecked() == true) {
            checkbox = cb_pvh.getText().toString();
        } else if (cb_rtn.isChecked() == true) {
            checkbox = cb_rtn.getText().toString();
        } else if (cb_odor.isChecked() == true) {
            checkbox = cb_odor.getText().toString();
        } else if (cb_modol.isChecked() == true) {
            checkbox = cb_modol.getText().toString();
        } else if (cb_st.isChecked() == true) {
            checkbox = cb_st.getText().toString();
        } else if (cb_modol.isChecked() == true) {
            checkbox = cb_modol.getText().toString();
        } else if (cb_kk.isChecked() == true) {
            checkbox = cb_kk.getText().toString();
        } else if (cb_btb.isChecked() == true) {
            checkbox = cb_btb.getText().toString();
        } else if (cb_pl.isChecked() == true) {
            checkbox = cb_pl.getText().toString();
        } else if (cb_bmc.isChecked() == true) {
            checkbox = cb_bmc.getText().toString();
        } else if (cb_svayr.isChecked() == true) {
            checkbox = cb_svayr.getText().toString();
        } else if (cb_kpc.isChecked() == true) {
            checkbox = cb_kpc.getText().toString();
        } else if (cb_kpt.isChecked() == true) {
            checkbox = cb_kpt.getText().toString();
        } else if (cb_sr.isChecked() == true) {
            checkbox = cb_sr.getText().toString();
        } else if (cb_takeo.isChecked() == true) {
            checkbox = cb_takeo.getText().toString();
        } else if (cb_kpspeu.isChecked() == true) {
            checkbox = cb_kpspeu.getText().toString();
        } else if (cb_kps.isChecked() == true) {
        checkbox = cb_kps.getText().toString();

            Toast.makeText(MainActivity.this, name + "\n" + checkbox, Toast.LENGTH_SHORT).show();

        }
    }
}
