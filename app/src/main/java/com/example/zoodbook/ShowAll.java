package com.example.zoodbook;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zoodbook.ui.adapters.HistorialShowAllAdapter;
import com.example.zoodbook.ui.mdoels.HistorialSellerModel;

import java.util.ArrayList;

import static com.example.zoodbook.ui.adapters.HistorialShowAllAdapter.SPAN_COUNT_ONE;
import static com.example.zoodbook.ui.adapters.HistorialShowAllAdapter.SPAN_COUNT_TWO;

public class ShowAll extends AppCompatActivity {
    HistorialShowAllAdapter historialShowAllAdapter;
    ArrayList<HistorialSellerModel> historialSelleritems;
    GridLayoutManager gridLayoutManager;
    RecyclerView book_recyclerView;
    ImageView changelayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        changelayout = findViewById(R.id.changeview);
        book_recyclerView = findViewById(R.id.rc_show_all);
        Bundle bundle = getIntent().getExtras();


        assert bundle != null;
        historialSelleritems = (ArrayList<HistorialSellerModel>) bundle.getSerializable("data");
        if (historialSelleritems != null) {
            gridLayoutManager = new GridLayoutManager(ShowAll.this, SPAN_COUNT_ONE,
                    GridLayoutManager.VERTICAL, false);
            historialShowAllAdapter = new HistorialShowAllAdapter(historialSelleritems,
                    ShowAll.this, gridLayoutManager);


            book_recyclerView.setLayoutManager(gridLayoutManager);
            book_recyclerView.setAdapter(historialShowAllAdapter);
        }


    }

    public void ChangeLayout(View view) {
        switchLayout();
        if (gridLayoutManager.getSpanCount() == SPAN_COUNT_TWO) {
            changelayout.setImageResource(R.drawable.ic_menu_list);
        } else {
            changelayout.setImageResource(R.drawable.ic_menu_grid);
        }
    }

	/*@Override
	public boolean onOptionsItemSelected(@NonNull MenuItem item) {
		if (item.getItemId() == R.id.changeview) {
			switchLayout();

			//switchIcon(item);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}*/

    private void switchLayout() {

        if (gridLayoutManager.getSpanCount() == SPAN_COUNT_ONE) {
            gridLayoutManager.setSpanCount(SPAN_COUNT_TWO);
        } else {
            gridLayoutManager.setSpanCount(SPAN_COUNT_ONE);
        }
        historialShowAllAdapter.notifyItemRangeChanged(0, historialShowAllAdapter.getItemCount());
    }


    public void GoBack(View view) {
        finish();
    }
}