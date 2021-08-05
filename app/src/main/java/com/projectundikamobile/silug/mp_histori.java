package com.projectundikamobile.silug;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.mtp.MtpConstants;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ViewPortHandler;

import java.util.ArrayList;

public class mp_histori extends AppCompatActivity{
    private Button back;
    private long backPressedTime;

    private LineChart chart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp_histori);

        chart = (LineChart) findViewById(R.id.chart);
        back = (Button) findViewById(R.id.btn_back_mphistori);
//        chart.setOnChartGestureListener(this);
//        chart.setOnChartValueSelectedListener(this);

        chart.setDragEnabled(false);
        chart.setScaleEnabled(false);

        ArrayList<Entry> ipk = new ArrayList<>();

        ipk.add(new Entry(0, 3.18f));
        ipk.add(new Entry(1, 2.85f));
        ipk.add(new Entry(2, 2.60f));

        ArrayList<Entry> ips = new ArrayList<>();

        ips.add(new Entry(0, 3.18f));
        ips.add(new Entry(1, 2.53f));
        ips.add(new Entry(2, 1.78f));

        LineDataSet IPK = new LineDataSet(ipk, "IPK");
        LineDataSet IPS = new LineDataSet(ips, "IPS");

        IPK.setFillAlpha(110);
        IPS.setFillAlpha(110);

        IPK.setColor(Color.RED);
        IPS.setColor(Color.BLACK);

        IPK.setValueTextSize(10f);
        IPS.setValueTextSize(10f);

        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(IPK);
        dataSets.add(IPS);

        LineData data = new LineData(dataSets);

        chart.setData(data);
        String[] values = new String[] {"191", "192", "201"};
        XAxis xAxis = chart.getXAxis();
        xAxis.setValueFormatter(new MyXAxisValueFormatter(values));
        xAxis.setGranularity(1);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public class MyXAxisValueFormatter implements IAxisValueFormatter {
        private String[] mValues;
        public MyXAxisValueFormatter(String[] values){
            this.mValues = values;
        }

        @Override
        public String getFormattedValue(float value, AxisBase axis) {
            return mValues[(int)value];
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        backPressedTime = System.currentTimeMillis();
    }

}