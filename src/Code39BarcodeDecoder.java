

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.oned.Code39Reader;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Collections;

public class Code39BarcodeDecoder {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.nextLine().trim();
            BufferedImage image = ImageIO.read(new File(fileName));
            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

            Reader reader = new Code39Reader();
            Hashtable<DecodeHintType, Object> hints = new Hashtable<>();
            hints.put(DecodeHintType.POSSIBLE_FORMATS, Collections.singletonList(BarcodeFormat.CODE_39));

            Result result = reader.decode(bitmap, hints);
            System.out.println(result.getText());
        } catch (Exception e) {
            System.out.println("");
        }
    }
}
//javac -cp "lib/*" -d bin src/Code39BarcodeDecoder.java
//echo "test img/barcode.png" | java -cp "lib/*;bin" Code39BarcodeDecoder-- if you are in windows
//echo "test img/barcode.png" | java -cp "lib/*:bin" Code39BarcodeDecoder-- if you are in mac or linux

