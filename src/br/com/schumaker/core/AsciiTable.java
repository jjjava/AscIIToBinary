package br.com.schumaker.core;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hudsonschumaker
 */
public class AsciiTable {

    private static final AsciiTable instance = new AsciiTable();
    private Map asciiCode;

    private AsciiTable() {
        asciiCode = new HashMap<>();
        asciiCode.put(" ", 32);
        asciiCode.put("A", 65);
        asciiCode.put("B", 66);
        asciiCode.put("C", 67);
        asciiCode.put("D", 68);
        asciiCode.put("E", 69);
        asciiCode.put("F", 70);
        asciiCode.put("G", 71);
        asciiCode.put("H", 72);
        asciiCode.put("I", 73);
        asciiCode.put("J", 74);
        asciiCode.put("K", 75);
        asciiCode.put("L", 76);
        asciiCode.put("M", 77);
        asciiCode.put("N", 78);
        asciiCode.put("O", 79);
        asciiCode.put("P", 80);
        asciiCode.put("Q", 81);
        asciiCode.put("R", 82);
        asciiCode.put("S", 83);
        asciiCode.put("T", 84);
        asciiCode.put("U", 85);
        asciiCode.put("V", 86);
        asciiCode.put("W", 87);
        asciiCode.put("X", 88);
        asciiCode.put("Y", 89);
        asciiCode.put("Z", 90);
        asciiCode.put("a", 65 + 32);
        asciiCode.put("b", 66 + 32);
        asciiCode.put("c", 67 + 32);
        asciiCode.put("d", 68 + 32);
        asciiCode.put("e", 69 + 32);
        asciiCode.put("f", 70 + 32);
        asciiCode.put("g", 71 + 32);
        asciiCode.put("h", 72 + 32);
        asciiCode.put("i", 73 + 32);
        asciiCode.put("j", 74 + 32);
        asciiCode.put("k", 75 + 32);
        asciiCode.put("l", 76 + 32);
        asciiCode.put("m", 77 + 32);
        asciiCode.put("n", 78 + 32);
        asciiCode.put("o", 79 + 32);
        asciiCode.put("p", 80 + 32);
        asciiCode.put("q", 81 + 32);
        asciiCode.put("r", 82 + 32);
        asciiCode.put("s", 83 + 32);
        asciiCode.put("t", 84 + 32);
        asciiCode.put("u", 85 + 32);
        asciiCode.put("v", 86 + 32);
        asciiCode.put("w", 87 + 32);
        asciiCode.put("x", 88 + 32);
        asciiCode.put("y", 89 + 32);
        asciiCode.put("z", 90 + 32);
    }

    public int getAsciiCode(String letter) {
        if (asciiCode.containsKey(letter)) {
            return (int) asciiCode.get(letter);
        } else {
            return 32;
        }
    }

    public String getChar(int code) {
        for (Object key : asciiCode.keySet()) {
            int value = (int) asciiCode.get(key);
            if (value == code) {
                return (String) key;
            }
        }
        return "";
    }

    public static AsciiTable getInstance() {
        return instance;
    }
}
