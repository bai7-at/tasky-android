package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class cx1 extends wv8 {
    @Override // defpackage.gh5, defpackage.pl9
    public m80 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // defpackage.gh5
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + vv8.b(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!vv8.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i = bx1.f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b = gh5.b(zArr, 0, vv8.a, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            b += gh5.b(zArr, b, vv8.e[digit], false);
        }
        int b2 = b + gh5.b(zArr, b, vv8.b, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            b2 += gh5.b(zArr, b2, vv8.d[Character.digit(str.charAt(i3), 10)], true);
        }
        gh5.b(zArr, b2, vv8.a, true);
        return zArr;
    }
}
