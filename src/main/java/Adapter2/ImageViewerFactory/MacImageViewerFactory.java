package Adapter2.ImageViewerFactory;

import Adapter2.ImageViewer.ImageViewer;
import Adapter2.ImageViewer.WindowsImageViewer;
import Adapter2.Presenter.Presenter;
import Adapter2.Presenter.WindowsPresenterAdapter;
import Adapter2.Windows.WindowsDisplayer;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public class MacImageViewerFactory implements ImageViewerFactory {

    // private MacDisplayer macDisplayer;

    /*public MacImageViewerFactory(MacDisplayer macDisplayer) {
        this.macDisplayer = macDisplayer;
    }*/

    public MacImageViewerFactory() {

    }

    public ImageViewer create() {
        /*Presenter presenter = new WindowsPresenterAdapter(windowsDisplayer);
        ImageViewer imageViewer = new WindowsImageViewer(presenter);
        return imageViewer;*/
        return  null;
    }
}
