package Adapter2.ImageViewer;

import Adapter2.Image.Image;
import Adapter2.Presenter.Presenter;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public class MacImageViewer extends ImageViewer {

    private String macSpecificVariable;

    public MacImageViewer(Presenter presenter) {
        super(presenter);
    }

    @Override
    public void display(Image image) {
        super.presenter.display(image);
    }
}
