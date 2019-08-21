package site.samplecode.samplerecyclerviewjava;

import android.graphics.drawable.Drawable;

public class ModelDataMain {
    private int id;
    private String title;
    private Drawable image;

    public ModelDataMain() {
    }

    public ModelDataMain(int id, String title, Drawable image) {
        this.id = id;
        this.title = title;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
