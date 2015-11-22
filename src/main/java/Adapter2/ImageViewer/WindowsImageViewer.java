package Adapter2.ImageViewer;

import Adapter2.Image.Image;
import Adapter2.Presenter.Presenter;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public class WindowsImageViewer extends ImageViewer {

    private String windowsSpecificVariable;

    public WindowsImageViewer(Presenter presenter) {
        super(presenter);
    }

    @Override
    public void display(Image image) {
        super.presenter.display(image);
    }
}
