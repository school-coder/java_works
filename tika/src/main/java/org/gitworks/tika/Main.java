package org.gitworks.tika;

import org.apache.tika.Tika;

import java.io.File;
import java.io.IOException;

/**
 * Created by NAS on 10/12/2018
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Tika tika = new Tika();
        String detected = tika.detect(new File("C:\\Users\\nas\\Desktop\\document.pptx.pdf"));
        System.out.println(detected);

        detected = tika.detect(new File("C:\\Users\\nas\\Desktop\\document.pdf"));
        System.out.println(detected);

        detected = tika.detect(new File("C:\\Users\\nas\\Desktop\\Desktop\\document.jpg"));
        System.out.println(detected);

    }
}
