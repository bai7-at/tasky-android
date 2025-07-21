package defpackage;

import android.graphics.ColorSpace;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.c;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.function.DoubleUnaryOperator;

/* loaded from: classes.dex */
final class mo0 {
    public static final mo0 a = new mo0();

    private mo0() {
    }

    public static final ColorSpace e(c cVar) {
        ColorSpace.Rgb rgb;
        e eVar = e.a;
        if (zq3.c(cVar, eVar.w())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (zq3.c(cVar, eVar.e())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (zq3.c(cVar, eVar.f())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (zq3.c(cVar, eVar.g())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (zq3.c(cVar, eVar.h())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (zq3.c(cVar, eVar.i())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (zq3.c(cVar, eVar.j())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (zq3.c(cVar, eVar.k())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (zq3.c(cVar, eVar.m())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (zq3.c(cVar, eVar.n())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (zq3.c(cVar, eVar.o())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (zq3.c(cVar, eVar.p())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (zq3.c(cVar, eVar.q())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (zq3.c(cVar, eVar.r())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (zq3.c(cVar, eVar.u())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (zq3.c(cVar, eVar.v())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(cVar instanceof Rgb)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Rgb rgb2 = (Rgb) cVar;
        float[] c = rgb2.N().c();
        tq8 L = rgb2.L();
        ColorSpace.Rgb.TransferParameters transferParameters = L != null ? new ColorSpace.Rgb.TransferParameters(L.a(), L.b(), L.c(), L.d(), L.e(), L.f(), L.g()) : null;
        if (transferParameters != null) {
            rgb = new ColorSpace.Rgb(cVar.f(), rgb2.K(), c, transferParameters);
        } else {
            String f = cVar.f();
            float[] K = rgb2.K();
            final ss2 H = rgb2.H();
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: io0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d) {
                    double f2;
                    f2 = mo0.f(ss2.this, d);
                    return f2;
                }
            };
            final ss2 D = rgb2.D();
            rgb = new ColorSpace.Rgb(f, K, c, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: jo0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d) {
                    double g;
                    g = mo0.g(ss2.this, d);
                    return g;
                }
            }, cVar.d(0), cVar.c(0));
        }
        return rgb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double f(ss2 ss2Var, double d) {
        return ((Number) ss2Var.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double g(ss2 ss2Var, double d) {
        return ((Number) ss2Var.invoke(Double.valueOf(d))).doubleValue();
    }

    public static final c h(final ColorSpace colorSpace) {
        eg9 eg9Var;
        tq8 tq8Var;
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return e.a.w();
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return e.a.e();
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return e.a.f();
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return e.a.g();
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return e.a.h();
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return e.a.i();
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return e.a.j();
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return e.a.k();
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return e.a.m();
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return e.a.n();
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return e.a.o();
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return e.a.p();
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return e.a.q();
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return e.a.r();
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return e.a.u();
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return e.a.v();
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return e.a.w();
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        eg9 eg9Var2 = rgb.getWhitePoint().length == 3 ? new eg9(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1], rgb.getWhitePoint()[2]) : new eg9(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
        if (transferParameters != null) {
            eg9Var = eg9Var2;
            tq8Var = new tq8(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f);
        } else {
            eg9Var = eg9Var2;
            tq8Var = null;
        }
        return new Rgb(rgb.getName(), rgb.getPrimaries(), eg9Var, rgb.getTransform(), new st1() { // from class: ko0
            @Override // defpackage.st1
            public final double a(double d) {
                double i;
                i = mo0.i(colorSpace, d);
                return i;
            }
        }, new st1() { // from class: lo0
            @Override // defpackage.st1
            public final double a(double d) {
                double j;
                j = mo0.j(colorSpace, d);
                return j;
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), tq8Var, rgb.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double i(ColorSpace colorSpace, double d) {
        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j(ColorSpace colorSpace, double d) {
        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d);
    }
}
