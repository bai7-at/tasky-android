package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes3.dex */
public final class om5 implements pl9 {
    private static m80 b(byte[][] bArr, int i) {
        int i2 = i * 2;
        m80 m80Var = new m80(bArr[0].length + i2, bArr.length + i2);
        m80Var.b();
        int e = (m80Var.e() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    m80Var.g(i4 + i, e);
                }
            }
            i3++;
            e--;
        }
        return m80Var;
    }

    private static m80 c(lm5 lm5Var, String str, int i, int i2, int i3, int i4) {
        boolean z;
        lm5Var.e(str, i);
        byte[][] b = lm5Var.f().b(1, 4);
        if ((i3 > i2) != (b[0].length < b.length)) {
            b = d(b);
            z = true;
        } else {
            z = false;
        }
        int length = i2 / b[0].length;
        int length2 = i3 / b.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return b(b, i4);
        }
        byte[][] b2 = lm5Var.f().b(length, length << 2);
        if (z) {
            b2 = d(b2);
        }
        return b(b2, i4);
    }

    private static byte[][] d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    @Override // defpackage.pl9
    public m80 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
        }
        lm5 lm5Var = new lm5();
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
            if (map.containsKey(encodeHintType)) {
                lm5Var.h(Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
            if (map.containsKey(encodeHintType2)) {
                lm5Var.i(Compaction.valueOf(map.get(encodeHintType2).toString()));
            }
            EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
            if (map.containsKey(encodeHintType3)) {
                lh4.a(map.get(encodeHintType3));
                throw null;
            }
            EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
            r6 = map.containsKey(encodeHintType4) ? Integer.parseInt(map.get(encodeHintType4).toString()) : 30;
            EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
            r8 = map.containsKey(encodeHintType5) ? Integer.parseInt(map.get(encodeHintType5).toString()) : 2;
            EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType6)) {
                lm5Var.j(Charset.forName(map.get(encodeHintType6).toString()));
            }
        }
        return c(lm5Var, str, r8, i, i2, r6);
    }
}
