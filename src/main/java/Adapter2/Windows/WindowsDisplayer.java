package Adapter2.Windows;

import Adapter2.Image.Image;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public class WindowsDisplayer {

    public WindowsDisplayer() {

    }

    public void show(Image image) {
        System.out.println("Windows: " + image.getName());
    }

}
