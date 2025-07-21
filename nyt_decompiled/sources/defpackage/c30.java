package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c30 implements pl9 {
    private static m80 b(String str, BarcodeFormat barcodeFormat, int i, int i2, Charset charset, int i3, int i4) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return c(y02.d(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
    }

    private static m80 c(b30 b30Var, int i, int i2) {
        m80 a = b30Var.a();
        if (a == null) {
            throw new IllegalStateException();
        }
        int f = a.f();
        int e = a.e();
        int max = Math.max(i, f);
        int max2 = Math.max(i2, e);
        int min = Math.min(max / f, max2 / e);
        int i3 = (max - (f * min)) / 2;
        int i4 = (max2 - (e * min)) / 2;
        m80 m80Var = new m80(max, max2);
        int i5 = 0;
        while (i5 < e) {
            int i6 = 0;
            int i7 = i3;
            while (i6 < f) {
                if (a.d(i6, i5)) {
                    m80Var.h(i7, i4, min, min);
                }
                i6++;
                i7 += min;
            }
            i5++;
            i4 += min;
        }
        return m80Var;
    }

    @Override // defpackage.pl9
    public m80 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i3 = 0;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType)) {
                charset = Charset.forName(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
            r0 = map.containsKey(encodeHintType2) ? Integer.parseInt(map.get(encodeHintType2).toString()) : 33;
            EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
            if (map.containsKey(encodeHintType3)) {
                i3 = Integer.parseInt(map.get(encodeHintType3).toString());
            }
        }
        return b(str, barcodeFormat, i, i2, charset, r0, i3);
    }
}
