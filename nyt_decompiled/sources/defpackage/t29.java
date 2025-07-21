package defpackage;

import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class t29 {
    private static final long a(String str, int i, int i2) {
        long j;
        long j2 = 0;
        do {
            if (str.charAt(i) != '-') {
                j2 *= 16;
                char charAt = str.charAt(i);
                if (charAt != '0') {
                    if (charAt == '1') {
                        j = 1;
                    } else if (charAt == '2') {
                        j = 2;
                    } else if (charAt == '3') {
                        j = 3;
                    } else if (charAt == '4') {
                        j = 4;
                    } else if (charAt == '5') {
                        j = 5;
                    } else if (charAt == '6') {
                        j = 6;
                    } else if (charAt == '7') {
                        j = 7;
                    } else if (charAt == '8') {
                        j = 8;
                    } else if (charAt == '9') {
                        j = 9;
                    } else if (charAt == 'a' || charAt == 'A') {
                        j = 10;
                    } else if (charAt == 'b' || charAt == 'B') {
                        j = 11;
                    } else if (charAt == 'c' || charAt == 'C') {
                        j = 12;
                    } else if (charAt == 'd' || charAt == 'D') {
                        j = 13;
                    } else if (charAt == 'e' || charAt == 'E') {
                        j = 14;
                    } else {
                        if (charAt != 'f' && charAt != 'F') {
                            throw new IllegalArgumentException("Invalid UUID string, encountered non-hexadecimal digit `" + str.charAt(i) + "` at index " + i + " in: " + str);
                        }
                        j = 15;
                    }
                    j2 += j;
                }
            } else if (i != 8 && i != 13 && i != 18 && i != 23) {
                throw new IllegalArgumentException(("Invalid UUID string, encountered dash at index " + i + " but it can occur only at 8, 13, 18, or 23: " + str).toString());
            }
            i++;
        } while (i < i2);
        return j2;
    }

    public static final UUID b(String str) {
        zq3.h(str, "string");
        if (str.length() == 36) {
            return new UUID(a(str, 0, 19), a(str, 19, 36));
        }
        throw new IllegalArgumentException("Invalid UUID string, expected exactly 36 characters but got " + str.length() + ": " + str);
    }
}
