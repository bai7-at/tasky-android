package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.util.Map;

/* loaded from: classes3.dex */
public final class m91 implements pl9 {
    private static m80 b(of0 of0Var, int i, int i2) {
        m80 m80Var;
        int e = of0Var.e();
        int d = of0Var.d();
        int max = Math.max(i, e);
        int max2 = Math.max(i2, d);
        int min = Math.min(max / e, max2 / d);
        int i3 = (max - (e * min)) / 2;
        int i4 = (max2 - (d * min)) / 2;
        if (i2 < d || i < e) {
            m80Var = new m80(e, d);
            i3 = 0;
            i4 = 0;
        } else {
            m80Var = new m80(i, i2);
        }
        m80Var.b();
        int i5 = 0;
        while (i5 < d) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < e) {
                if (of0Var.b(i7, i5) == 1) {
                    m80Var.h(i6, i4, min, min);
                }
                i7++;
                i6 += min;
            }
            i5++;
            i4 += min;
        }
        return m80Var;
    }

    private static m80 c(ui1 ui1Var, jd8 jd8Var, int i, int i2) {
        int h = jd8Var.h();
        int g = jd8Var.g();
        of0 of0Var = new of0(jd8Var.j(), jd8Var.i());
        int i3 = 0;
        for (int i4 = 0; i4 < g; i4++) {
            if (i4 % jd8Var.e == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < jd8Var.j(); i6++) {
                    of0Var.g(i5, i3, i6 % 2 == 0);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < h; i8++) {
                if (i8 % jd8Var.d == 0) {
                    of0Var.g(i7, i3, true);
                    i7++;
                }
                of0Var.g(i7, i3, ui1Var.e(i8, i4));
                int i9 = i7 + 1;
                int i10 = jd8Var.d;
                if (i8 % i10 == i10 - 1) {
                    of0Var.g(i9, i3, i4 % 2 == 0);
                    i7 += 2;
                } else {
                    i7 = i9;
                }
            }
            int i11 = i3 + 1;
            int i12 = jd8Var.e;
            if (i4 % i12 == i12 - 1) {
                int i13 = 0;
                for (int i14 = 0; i14 < jd8Var.j(); i14++) {
                    of0Var.g(i13, i11, true);
                    i13++;
                }
                i3 += 2;
            } else {
                i3 = i11;
            }
        }
        return b(of0Var, i, i2);
    }

    @Override // defpackage.pl9
    public m80 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        if (map != null) {
            SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            if (symbolShapeHint2 != null) {
                symbolShapeHint = symbolShapeHint2;
            }
            lh4.a(map.get(EncodeHintType.MIN_SIZE));
            lh4.a(map.get(EncodeHintType.MAX_SIZE));
        }
        String b = c83.b(str, symbolShapeHint, null, null);
        jd8 l = jd8.l(b.length(), symbolShapeHint, null, null, true);
        ui1 ui1Var = new ui1(r22.c(b, l), l.h(), l.g());
        ui1Var.h();
        return c(ui1Var, l, i, i2);
    }
}
