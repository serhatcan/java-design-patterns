package Adapter2.ImageViewerFactory;

import Adapter2.ImageViewer.ImageViewer;
import Adapter2.ImageViewer.WindowsImageViewer;
import Adapter2.Presenter.Presenter;
import Adapter2.Presenter.WindowsPresenterAdapter;
import Adapter2.Windows.WindowsDisplayer;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public class WindowsImageViewerFactory implements ImageViewerFactory {

    private WindowsDisplayer windowsDisplayer;

    public WindowsImageViewerFactory(WindowsDisplayer windowsDisplayer) {
        this.windowsDisplayer = windowsDisplayer;
    }

    public ImageViewer create() {
        Presenter presenter = new WindowsPresenterAdapter(windowsDisplayer);
        ImageViewer imageViewer = new WindowsImageViewer(presenter);
        return imageViewer;
    }
}
