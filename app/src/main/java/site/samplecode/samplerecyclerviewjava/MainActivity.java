package site.samplecode.samplerecyclerviewjava;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ModelDataMain> modelDataMains;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modelDataMains = new ArrayList<>();
        populateArrayList(modelDataMains);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerMainAdapter.RecyclerViewClickListener listener = new RecyclerMainAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                int indexItem = modelDataMains.get(position).getId();
                switch (indexItem) {
                    case 1:
                        Toast.makeText(MainActivity.this, "Clicked on item one by position: " + position + " and id: " + modelDataMains.get(position).getId(), Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Clicked on item two by position: " + position + " and id: " + modelDataMains.get(position).getId(), Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Clicked on item three by position: " + position + " and id: " + modelDataMains.get(position).getId(), Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, "Clicked on item four by position: " + position + " and id: " + modelDataMains.get(position).getId(), Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(MainActivity.this, "Clicked on item five by position: " + position + " and id: " + modelDataMains.get(position).getId(), Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Undefined item", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };

        RecyclerMainAdapter recyclerMainAdapter = new RecyclerMainAdapter(modelDataMains, listener);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerMainAdapter);
    }


    private void populateArrayList(List<ModelDataMain> dataMain) {

        dataMain.clear();
        int index = 4;
        int[] icons = {R.drawable.icon_1,R.drawable.icon_2,R.drawable.icon_3,R.drawable.icon_4,R.drawable.icon_5};

        for (int i=0; i<=index; i++) {
            dataMain.add(new ModelDataMain());
            dataMain.get(i).setId(i);
            dataMain.get(i).setTitle("item "+i+" of recyclerView");

            Drawable drawable = getDrawable(icons[i]);
            dataMain.get(i).setImage(drawable);
        }
    }
}
