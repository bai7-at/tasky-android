package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class pb4 {
    private static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    private static byte[] a(int i) {
        if (i > 16) {
            i = 32;
        } else if (i < 16) {
            i = 16;
        }
        return new byte[i];
    }

    private static void b(long j, int i, int i2, byte[] bArr) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) >>> 2;
        Arrays.fill(bArr, i, (i2 - 16) + i + numberOfLeadingZeros, (byte) 48);
        for (int i3 = 0; i3 < 16 - numberOfLeadingZeros; i3++) {
            bArr[((i + i2) - 1) - i3] = a[(int) (15 & j)];
            j >>>= 4;
        }
    }

    public static NumberFormatException c(CharSequence charSequence) {
        return new NumberFormatException(String.format("String value %s exceeds range of unsigned long.", charSequence));
    }

    public static long d(String str) {
        int i;
        if (str == null) {
            throw new NumberFormatException("s can't be null");
        }
        int length = str.length();
        if (length <= 0) {
            throw new NumberFormatException("Empty input string");
        }
        int i2 = 0;
        if (str.charAt(0) == '-') {
            throw new NumberFormatException(String.format("Illegal leading minus sign on unsigned string %s.", str));
        }
        if (length <= 18) {
            return Long.parseLong(str);
        }
        if (length > 20) {
            throw c(str);
        }
        int i3 = 0;
        long j = 0;
        while (true) {
            i = length - 1;
            if (i2 >= i) {
                break;
            }
            int digit = Character.digit(str.charAt(i2), 10);
            i3 |= digit;
            j = (j * 10) + digit;
            i2++;
        }
        int digit2 = Character.digit(str.charAt(i), 10);
        if ((i3 | digit2) < 0) {
            throw new NumberFormatException("Illegal character in " + str);
        }
        if (j > 1844674407370955161L) {
            throw c(str);
        }
        long j2 = j * 10;
        long j3 = digit2 + j2;
        if (j2 >= 0 || j3 < 0) {
            return j3;
        }
        throw c(str);
    }

    public static String e(long j, int i) {
        byte[] a2 = a(i);
        b(j, 0, a2.length, a2);
        return new String(a2, StandardCharsets.US_ASCII);
    }

    public static String f(long j, long j2, int i) {
        if (i <= 16) {
            return e(j2, i);
        }
        byte[] a2 = a(i);
        b(j, 0, 16, a2);
        b(j2, 16, 16, a2);
        return new String(a2, StandardCharsets.US_ASCII);
    }
}
