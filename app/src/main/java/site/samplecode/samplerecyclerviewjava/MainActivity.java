package site.samplecode.samplerecyclerviewjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        RecyclerMainAdapter recyclerMainAdapter = new RecyclerMainAdapter(MainActivity.this, modelDataMains, listener);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerMainAdapter);
    }


    private void populateArrayList(List<ModelDataMain> dataMain) {

        dataMain.clear();
        dataMain.add(new ModelDataMain());
        dataMain.get(0).setId(1);
        dataMain.get(0).setTitle("item one of recyclerView");
        dataMain.get(0).setImage(getDrawable(R.drawable.icon_1));

        dataMain.add(new ModelDataMain());
        dataMain.get(1).setId(2);
        dataMain.get(1).setTitle("item two of recyclerView");
        dataMain.get(1).setImage(getDrawable(R.drawable.icon_2));

        dataMain.add(new ModelDataMain());
        dataMain.get(2).setId(3);
        dataMain.get(2).setTitle("item three of recyclerView");
        dataMain.get(2).setImage(getDrawable(R.drawable.icon_3));

        dataMain.add(new ModelDataMain());
        dataMain.get(3).setId(4);
        dataMain.get(3).setTitle("item four of recyclerView");
        dataMain.get(3).setImage(getDrawable(R.drawable.icon_4));

        dataMain.add(new ModelDataMain());
        dataMain.get(4).setId(5);
        dataMain.get(4).setTitle("item five of recyclerView");
        dataMain.get(4).setImage(getDrawable(R.drawable.icon_5));

    }
}
