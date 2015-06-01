package br.com.schumaker.core;

/**
 *
 * @author hudsonschumaker
 */
public class Translation {

    public static String asciiToBinaryString(int asciiCode) {
        return Integer.toBinaryString(asciiCode);
    }

    public static String binaryToAsciiString(String binaryCode) {
        return "" + Integer.parseInt(binaryCode, 2);
    }
    
    public static String asciiToChar(int asciiCode){
        return AsciiTable.getInstance().getChar(asciiCode);
    }
    
     public static String asciiToChar(String asciiCode){
        return AsciiTable.getInstance().getChar(Integer.parseInt(asciiCode));
    }
    
}
