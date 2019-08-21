package site.samplecode.samplerecyclerviewjava;

import android.graphics.drawable.Drawable;

class ModelDataMain {
    private int id;
    private String title;
    private Drawable image;

    ModelDataMain() {
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    Drawable getImage() {
        return image;
    }

    void setImage(Drawable image) {
        this.image = image;
    }
}
