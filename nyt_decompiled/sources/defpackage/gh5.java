package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class gh5 implements pl9 {
    protected static int b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    private static m80 e(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        m80 m80Var = new m80(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                m80Var.h(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return m80Var;
    }

    @Override // defpackage.pl9
    public m80 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        int d = d();
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType)) {
                d = Integer.parseInt(map.get(encodeHintType).toString());
            }
        }
        return e(c(str), i, i2, d);
    }

    public abstract boolean[] c(String str);

    public int d() {
        return 10;
    }
}
