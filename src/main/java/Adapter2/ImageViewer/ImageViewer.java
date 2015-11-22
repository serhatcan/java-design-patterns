package Adapter2.ImageViewer;

import Adapter2.Image.Image;
import Adapter2.Presenter.Presenter;

import java.util.List;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public abstract class ImageViewer {

    protected List<Image> images;

    protected Presenter presenter;

    public ImageViewer(Presenter presenter) {
        this.presenter = presenter;
    }

    public void addImage(Image image) {
        images.add(image);
    }

    public void removeImage(int index) {
        images.remove(index);
    }

    public Image getImage(int index) {
        return images.get(index);
    }

    public abstract void display(Image image);

}
