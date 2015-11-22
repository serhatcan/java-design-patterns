import Adapter2.Image.BmlImage;
import Adapter2.Image.JpegImage;
import Adapter2.ImageViewer.ImageViewer;
import Adapter2.ImageViewerFactory.ImageViewerFactory;
import Adapter2.ImageViewerFactory.WindowsImageViewerFactory;
import Adapter2.Windows.WindowsDisplayer;
import org.junit.Test;

/**
 * Created by Serhat CAN on 22.11.2015.
 *
 * We are dealing with image and image formats.
 * The structure of an image format defines the way the image is stored.
 * The representation of a format concerns with the way an image is displayed.
 * For a given format, the structure remains the same across operating systems,
 * whereas the way in which the image is displayed may vary between operating systems.
 *
 * For example, the structure of a BMP file remains unchanged in all operating systems,
 * but the mechanism used by the Windows operating system to display a BMP file is different
 * from the one used by Macintosh operating systems to display the same file.
 *
 * On the other hand, for a given operating system, the representation can remain unchanged
 * across different image formats. For example, Windows can display an image represented
 * as a Bitmap object, without having to know about its source format which can be a BMP, a JPEG or a PCX.
 * In short, the representation and the structure of an image format are two different aspects and
 * they should be allowed to vary independently based on the other factors like operating system, hardware etc.
 *
 * You are going to design an Image viewer application to view BML files on Windows. Make the design
 * flexible so that it can easily be extended to view other image formats like JPEG on Windows or
 * view BMP images on other operating systems.
 */
public class Adapter2PatternTest {

    @Test
    public void windowsClientTest() {
        WindowsDisplayer windowsDisplayer = new WindowsDisplayer(); // windows displayer already present in the system
        ImageViewerFactory imageViewerFactory = new WindowsImageViewerFactory(windowsDisplayer);
        ImageViewer imageViewer = imageViewerFactory.create();

        imageViewer.display(new JpegImage("Jpeg1", "path1"));
        imageViewer.display(new JpegImage("Jpeg2", "path2"));
        imageViewer.display(new BmlImage("Bml1", "path3"));


    }

}
