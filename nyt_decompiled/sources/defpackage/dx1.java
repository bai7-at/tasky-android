package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class dx1 extends wv8 {
    @Override // defpackage.gh5, defpackage.pl9
    public m80 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // defpackage.gh5
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + vv8.b(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!vv8.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        boolean[] zArr = new boolean[67];
        int b = gh5.b(zArr, 0, vv8.a, true);
        for (int i = 0; i <= 3; i++) {
            b += gh5.b(zArr, b, vv8.d[Character.digit(str.charAt(i), 10)], false);
        }
        int b2 = b + gh5.b(zArr, b, vv8.b, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            b2 += gh5.b(zArr, b2, vv8.d[Character.digit(str.charAt(i2), 10)], true);
        }
        gh5.b(zArr, b2, vv8.a, true);
        return zArr;
    }
}
