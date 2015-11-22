package Adapter2.Image;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public class JpegImage implements Image {

    private String name;
    private String path;
    private static final String format = "jpeg";

    public JpegImage() {

    }

    public JpegImage(String name) {
        this.name = name;
    }

    public JpegImage(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return this.name;
    }

    public String getFormat() {
        return format;
    }

    public Byte[] getByteArray() {
        return new Byte[0];
    }

    public void set(Byte[] array) {

    }

    public void set(String path) {
        this.path = path;
    }
}
