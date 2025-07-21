package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

/* loaded from: classes3.dex */
public final class eb6 implements pl9 {
    private static m80 b(db6 db6Var, int i, int i2, int i3) {
        of0 a = db6Var.a();
        if (a == null) {
            throw new IllegalStateException();
        }
        int e = a.e();
        int d = a.d();
        int i4 = i3 << 1;
        int i5 = e + i4;
        int i6 = i4 + d;
        int max = Math.max(i, i5);
        int max2 = Math.max(i2, i6);
        int min = Math.min(max / i5, max2 / i6);
        int i7 = (max - (e * min)) / 2;
        int i8 = (max2 - (d * min)) / 2;
        m80 m80Var = new m80(max, max2);
        int i9 = 0;
        while (i9 < d) {
            int i10 = 0;
            int i11 = i7;
            while (i10 < e) {
                if (a.b(i10, i9) == 1) {
                    m80Var.h(i11, i8, min, min);
                }
                i10++;
                i11 += min;
            }
            i9++;
            i8 += min;
        }
        return m80Var;
    }

    @Override // defpackage.pl9
    public m80 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.L;
        int i3 = 4;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
            if (map.containsKey(encodeHintType)) {
                errorCorrectionLevel = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType2)) {
                i3 = Integer.parseInt(map.get(encodeHintType2).toString());
            }
        }
        return b(a12.n(str, errorCorrectionLevel, map), i, i2, i3);
    }
}
