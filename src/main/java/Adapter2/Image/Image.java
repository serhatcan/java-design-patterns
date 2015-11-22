package Adapter2.Image;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public interface Image {

    String getName();

    String getFormat();

    Byte[] getByteArray();

    void set(Byte[] array);

    void set(String path);
}
