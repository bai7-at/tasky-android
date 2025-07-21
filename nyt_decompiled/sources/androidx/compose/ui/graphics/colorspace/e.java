package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.e;
import defpackage.eg9;
import defpackage.hf3;
import defpackage.st1;
import defpackage.tq8;

/* loaded from: classes.dex */
public final class e {
    public static final e a = new e();
    private static final float[] b;
    private static final float[] c;
    private static final tq8 d;
    private static final tq8 e;
    private static final Rgb f;
    private static final Rgb g;
    private static final Rgb h;
    private static final Rgb i;
    private static final Rgb j;
    private static final Rgb k;
    private static final Rgb l;
    private static final Rgb m;
    private static final Rgb n;
    private static final Rgb o;
    private static final Rgb p;
    private static final Rgb q;
    private static final Rgb r;
    private static final Rgb s;
    private static final c t;
    private static final c u;
    private static final Rgb v;
    private static final c w;
    private static final c[] x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        c = fArr2;
        tq8 tq8Var = new tq8(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        d = tq8Var;
        tq8 tq8Var2 = new tq8(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        e = tq8Var2;
        hf3 hf3Var = hf3.a;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, hf3Var.e(), tq8Var, 0);
        f = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, hf3Var.e(), 1.0d, 0.0f, 1.0f, 1);
        g = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, hf3Var.e(), null, new st1() { // from class: no0
            @Override // defpackage.st1
            public final double a(double d2) {
                double c2;
                c2 = e.c(d2);
                return c2;
            }
        }, new st1() { // from class: oo0
            @Override // defpackage.st1
            public final double a(double d2) {
                double d3;
                d3 = e.d(d2);
                return d3;
            }
        }, -0.799f, 2.399f, tq8Var, 2);
        h = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, hf3Var.e(), 1.0d, -0.5f, 7.499f, 3);
        i = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, hf3Var.e(), new tq8(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        j = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, hf3Var.e(), new tq8(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        k = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new eg9(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        l = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, hf3Var.e(), tq8Var, 7);
        m = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, hf3Var.a(), new tq8(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        n = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, hf3Var.e(), new tq8(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        o = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, hf3Var.e(), 2.2d, 0.0f, 1.0f, 10);
        p = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, hf3Var.b(), new tq8(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        q = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, hf3Var.d(), 1.0d, -65504.0f, 65504.0f, 12);
        r = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, hf3Var.d(), 1.0d, -65504.0f, 65504.0f, 13);
        s = rgb14;
        j jVar = new j("Generic XYZ", 14);
        t = jVar;
        g gVar = new g("Generic L*a*b*", 15);
        u = gVar;
        Rgb rgb15 = new Rgb("None", fArr, hf3Var.e(), tq8Var2, 16);
        v = rgb15;
        h hVar = new h("Oklab", 17);
        w = hVar;
        x = new c[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, jVar, gVar, rgb15, hVar};
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double c(double d2) {
        return d.a(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double d(double d2) {
        return d.b(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final Rgb e() {
        return r;
    }

    public final Rgb f() {
        return s;
    }

    public final Rgb g() {
        return p;
    }

    public final Rgb h() {
        return k;
    }

    public final Rgb i() {
        return j;
    }

    public final c j() {
        return u;
    }

    public final c k() {
        return t;
    }

    public final c[] l() {
        return x;
    }

    public final Rgb m() {
        return l;
    }

    public final Rgb n() {
        return m;
    }

    public final Rgb o() {
        return h;
    }

    public final Rgb p() {
        return i;
    }

    public final Rgb q() {
        return g;
    }

    public final Rgb r() {
        return n;
    }

    public final float[] s() {
        return c;
    }

    public final c t() {
        return w;
    }

    public final Rgb u() {
        return q;
    }

    public final Rgb v() {
        return o;
    }

    public final Rgb w() {
        return f;
    }

    public final float[] x() {
        return b;
    }

    public final Rgb y() {
        return v;
    }
}
