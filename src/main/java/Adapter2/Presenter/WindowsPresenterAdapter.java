package Adapter2.Presenter;

import Adapter2.Image.Image;
import Adapter2.Windows.WindowsDisplayer;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public class WindowsPresenterAdapter implements Presenter {

    private WindowsDisplayer windowsDisplayer;

    public WindowsPresenterAdapter(WindowsDisplayer windowsDisplayer) {
        this.windowsDisplayer = windowsDisplayer;
    }

    public void display(Image image) {
        windowsDisplayer.show(image);
    }
}
