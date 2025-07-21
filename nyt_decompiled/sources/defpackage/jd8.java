package defpackage;

import com.comscore.streaming.ContentType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;

/* loaded from: classes3.dex */
public class jd8 {
    static final jd8[] i;
    private static jd8[] j;
    private final boolean a;
    private final int b;
    private final int c;
    public final int d;
    public final int e;
    private final int f;
    private final int g;
    private final int h;

    static {
        jd8[] jd8VarArr = {new jd8(false, 3, 5, 8, 8, 1), new jd8(false, 5, 7, 10, 10, 1), new jd8(true, 5, 7, 16, 6, 1), new jd8(false, 8, 10, 12, 12, 1), new jd8(true, 10, 11, 14, 6, 2), new jd8(false, 12, 12, 14, 14, 1), new jd8(true, 16, 14, 24, 10, 1), new jd8(false, 18, 14, 16, 16, 1), new jd8(false, 22, 18, 18, 18, 1), new jd8(true, 22, 18, 16, 10, 2), new jd8(false, 30, 20, 20, 20, 1), new jd8(true, 32, 24, 16, 14, 2), new jd8(false, 36, 24, 22, 22, 1), new jd8(false, 44, 28, 24, 24, 1), new jd8(true, 49, 28, 22, 14, 2), new jd8(false, 62, 36, 14, 14, 4), new jd8(false, 86, 42, 16, 16, 4), new jd8(false, 114, 48, 18, 18, 4), new jd8(false, 144, 56, 20, 20, 4), new jd8(false, 174, 68, 22, 22, 4), new jd8(false, 204, 84, 24, 24, 4, 102, 42), new jd8(false, 280, ContentType.LONG_FORM_ON_DEMAND, 14, 14, 16, 140, 56), new jd8(false, 368, 144, 16, 16, 16, 92, 36), new jd8(false, 456, 192, 18, 18, 16, 114, 48), new jd8(false, 576, 224, 20, 20, 16, 144, 56), new jd8(false, 696, 272, 22, 22, 16, 174, 68), new jd8(false, 816, 336, 24, 24, 16, 136, 56), new jd8(false, 1050, 408, 18, 18, 36, 175, 68), new jd8(false, 1304, 496, 20, 20, 36, 163, 62), new l91()};
        i = jd8VarArr;
        j = jd8VarArr;
    }

    public jd8(boolean z, int i2, int i3, int i4, int i5, int i6) {
        this(z, i2, i3, i4, i5, i6, i2, i3);
    }

    private int e() {
        int i2 = this.f;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 4) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i3;
    }

    private int k() {
        int i2 = this.f;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public static jd8 l(int i2, SymbolShapeHint symbolShapeHint, pq1 pq1Var, pq1 pq1Var2, boolean z) {
        for (jd8 jd8Var : j) {
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && jd8Var.a) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || jd8Var.a) && i2 <= jd8Var.b)) {
                return jd8Var;
            }
        }
        if (z) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i2)));
        }
        return null;
    }

    public final int a() {
        return this.b;
    }

    public int b(int i2) {
        return this.g;
    }

    public final int c() {
        return this.c;
    }

    public final int d(int i2) {
        return this.h;
    }

    public int f() {
        return this.b / this.g;
    }

    public final int g() {
        return k() * this.e;
    }

    public final int h() {
        return e() * this.d;
    }

    public final int i() {
        return g() + (k() << 1);
    }

    public final int j() {
        return h() + (e() << 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.d);
        sb.append('x');
        sb.append(this.e);
        sb.append(", symbol size ");
        sb.append(j());
        sb.append('x');
        sb.append(i());
        sb.append(", symbol data size ");
        sb.append(h());
        sb.append('x');
        sb.append(g());
        sb.append(", codewords ");
        sb.append(this.b);
        sb.append('+');
        sb.append(this.c);
        return sb.toString();
    }

    jd8(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = z;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }
}
