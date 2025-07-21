package com.caverock.androidsvg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.caverock.androidsvg.CSSParser;
import com.comscore.streaming.WindowState;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.j77;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class SVG {
    private static boolean g = true;
    private d0 a = null;
    private String b = "";
    private String c = "";
    private float d = 96.0f;
    private CSSParser.n e = new CSSParser.n();
    private Map f = new HashMap();

    enum GradientSpread {
        pad,
        reflect,
        repeat
    }

    static class Style implements Cloneable {
        Boolean B;
        c H;
        String L;
        String M;
        String N;
        Boolean Q;
        Boolean S;
        m0 X;
        Float Y;
        String Z;
        long a = 0;
        m0 b;
        FillRule c;
        Float d;
        m0 e;
        FillRule e0;
        Float f;
        String f0;
        o g;
        m0 g0;
        LineCap h;
        Float h0;
        LineJoin i;
        m0 i0;
        Float j;
        Float j0;
        o[] k;
        VectorEffect k0;
        o l;
        RenderQuality l0;
        Float m;
        f n;
        List r;
        o s;
        Integer t;
        FontStyle u;
        TextDecoration w;
        TextDirection x;
        TextAnchor y;

        public enum FillRule {
            NonZero,
            EvenOdd
        }

        public enum FontStyle {
            Normal,
            Italic,
            Oblique
        }

        public enum LineCap {
            Butt,
            Round,
            Square
        }

        public enum LineJoin {
            Miter,
            Round,
            Bevel
        }

        public enum RenderQuality {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum TextAnchor {
            Start,
            Middle,
            End
        }

        public enum TextDecoration {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum TextDirection {
            LTR,
            RTL
        }

        public enum VectorEffect {
            None,
            NonScalingStroke
        }

        Style() {
        }

        static Style a() {
            Style style = new Style();
            style.a = -1L;
            f fVar = f.b;
            style.b = fVar;
            FillRule fillRule = FillRule.NonZero;
            style.c = fillRule;
            Float valueOf = Float.valueOf(1.0f);
            style.d = valueOf;
            style.e = null;
            style.f = valueOf;
            style.g = new o(1.0f);
            style.h = LineCap.Butt;
            style.i = LineJoin.Miter;
            style.j = Float.valueOf(4.0f);
            style.k = null;
            style.l = new o(0.0f);
            style.m = valueOf;
            style.n = fVar;
            style.r = null;
            style.s = new o(12.0f, Unit.pt);
            style.t = Integer.valueOf(WindowState.NORMAL);
            style.u = FontStyle.Normal;
            style.w = TextDecoration.None;
            style.x = TextDirection.LTR;
            style.y = TextAnchor.Start;
            Boolean bool = Boolean.TRUE;
            style.B = bool;
            style.H = null;
            style.L = null;
            style.M = null;
            style.N = null;
            style.Q = bool;
            style.S = bool;
            style.X = fVar;
            style.Y = valueOf;
            style.Z = null;
            style.e0 = fillRule;
            style.f0 = null;
            style.g0 = null;
            style.h0 = valueOf;
            style.i0 = null;
            style.j0 = valueOf;
            style.k0 = VectorEffect.None;
            style.l0 = RenderQuality.auto;
            return style;
        }

        void b(boolean z) {
            Boolean bool = Boolean.TRUE;
            this.Q = bool;
            if (!z) {
                bool = Boolean.FALSE;
            }
            this.B = bool;
            this.H = null;
            this.Z = null;
            this.m = Float.valueOf(1.0f);
            this.X = f.b;
            this.Y = Float.valueOf(1.0f);
            this.f0 = null;
            this.g0 = null;
            this.h0 = Float.valueOf(1.0f);
            this.i0 = null;
            this.j0 = Float.valueOf(1.0f);
            this.k0 = VectorEffect.None;
        }

        protected Object clone() {
            Style style = (Style) super.clone();
            o[] oVarArr = this.k;
            if (oVarArr != null) {
                style.k = (o[]) oVarArr.clone();
            }
            return style;
        }
    }

    enum Unit {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Unit.values().length];
            a = iArr;
            try {
                iArr[Unit.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Unit.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Unit.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Unit.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Unit.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Unit.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[Unit.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[Unit.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[Unit.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static class a0 extends k {
        o o;
        o p;
        o q;
        o r;
        o s;
        o t;

        a0() {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "rect";
        }
    }

    static class a1 extends l0 implements v0 {
        String c;
        private z0 d;

        a1(String str) {
            this.c = str;
        }

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 d() {
            return this.d;
        }

        public String toString() {
            return "TextChild: '" + this.c + "'";
        }
    }

    static class b0 extends j0 implements h0 {
        b0() {
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public void g(l0 l0Var) {
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public List getChildren() {
            return Collections.emptyList();
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "solidColor";
        }
    }

    static class b1 extends l {
        String p;
        o q;
        o r;
        o s;
        o t;

        b1() {
        }

        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        String m() {
            return "use";
        }
    }

    static class c {
        o a;
        o b;
        o c;
        o d;

        c(o oVar, o oVar2, o oVar3, o oVar4) {
            this.a = oVar;
            this.b = oVar2;
            this.c = oVar3;
            this.d = oVar4;
        }
    }

    static class c0 extends j0 implements h0 {
        Float h;

        c0() {
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public void g(l0 l0Var) {
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public List getChildren() {
            return Collections.emptyList();
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "stop";
        }
    }

    static class c1 extends p0 implements s {
        c1() {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "view";
        }
    }

    static class d extends k {
        o o;
        o p;
        o q;

        d() {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "circle";
        }
    }

    static class d0 extends p0 {
        o q;
        o r;
        o s;
        o t;
        public String u;

        d0() {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "svg";
        }
    }

    static class e extends l implements s {
        Boolean p;

        e() {
        }

        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        String m() {
            return "clipPath";
        }
    }

    interface e0 {
        Set a();

        String b();

        void c(Set set);

        void e(Set set);

        void f(Set set);

        Set getRequiredFeatures();

        void h(Set set);

        void i(String str);

        Set k();

        Set l();
    }

    static class f extends m0 {
        static final f b = new f(-16777216);
        static final f c = new f(0);
        int a;

        f(int i) {
            this.a = i;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.a));
        }
    }

    static abstract class f0 extends i0 implements h0, e0 {
        List i = new ArrayList();
        Set j = null;
        String k = null;
        Set l = null;
        Set m = null;
        Set n = null;

        f0() {
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set a() {
            return null;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public String b() {
            return this.k;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void c(Set set) {
            this.n = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void e(Set set) {
            this.j = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void f(Set set) {
            this.l = set;
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public void g(l0 l0Var) {
            this.i.add(l0Var);
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public List getChildren() {
            return this.i;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set getRequiredFeatures() {
            return this.j;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void h(Set set) {
            this.m = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void i(String str) {
            this.k = str;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set k() {
            return this.m;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set l() {
            return this.n;
        }
    }

    static class g extends m0 {
        private static g a = new g();

        private g() {
        }

        static g a() {
            return a;
        }
    }

    static abstract class g0 extends i0 implements e0 {
        Set i = null;
        String j = null;
        Set k = null;
        Set l = null;
        Set m = null;

        g0() {
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set a() {
            return this.k;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public String b() {
            return this.j;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void c(Set set) {
            this.m = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void e(Set set) {
            this.i = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void f(Set set) {
            this.k = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set getRequiredFeatures() {
            return this.i;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void h(Set set) {
            this.l = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void i(String str) {
            this.j = str;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set k() {
            return this.l;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set l() {
            return this.m;
        }
    }

    static class h extends l implements s {
        h() {
        }

        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        String m() {
            return "defs";
        }
    }

    interface h0 {
        void g(l0 l0Var);

        List getChildren();
    }

    static class i extends k {
        o o;
        o p;
        o q;
        o r;

        i() {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "ellipse";
        }
    }

    static abstract class i0 extends j0 {
        b h = null;

        i0() {
        }
    }

    static abstract class j extends j0 implements h0 {
        List h = new ArrayList();
        Boolean i;
        Matrix j;
        GradientSpread k;
        String l;

        j() {
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public void g(l0 l0Var) {
            if (l0Var instanceof c0) {
                this.h.add(l0Var);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + l0Var + " elements.");
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public List getChildren() {
            return this.h;
        }
    }

    static abstract class j0 extends l0 {
        String c = null;
        Boolean d = null;
        Style e = null;
        Style f = null;
        List g = null;

        j0() {
        }

        public String toString() {
            return m();
        }
    }

    static abstract class k extends g0 implements m {
        Matrix n;

        k() {
        }

        @Override // com.caverock.androidsvg.SVG.m
        public void j(Matrix matrix) {
            this.n = matrix;
        }
    }

    static class k0 extends j {
        o m;
        o n;
        o o;
        o p;

        k0() {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "linearGradient";
        }
    }

    static class l extends f0 implements m {
        Matrix o;

        l() {
        }

        @Override // com.caverock.androidsvg.SVG.m
        public void j(Matrix matrix) {
            this.o = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "group";
        }
    }

    static class l0 {
        SVG a;
        h0 b;

        l0() {
        }

        abstract String m();
    }

    interface m {
        void j(Matrix matrix);
    }

    static abstract class m0 implements Cloneable {
        m0() {
        }
    }

    static class n extends n0 implements m {
        String p;
        o q;
        o r;
        o s;
        o t;
        Matrix u;

        n() {
        }

        @Override // com.caverock.androidsvg.SVG.m
        public void j(Matrix matrix) {
            this.u = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return AssetConstants.IMAGE_TYPE;
        }
    }

    static abstract class n0 extends f0 {
        PreserveAspectRatio o = null;

        n0() {
        }
    }

    static class o0 extends j {
        o m;
        o n;
        o o;
        o p;
        o q;

        o0() {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "radialGradient";
        }
    }

    static class p extends k {
        o o;
        o p;
        o q;
        o r;

        p() {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "line";
        }
    }

    static abstract class p0 extends n0 {
        b p;

        p0() {
        }
    }

    static class q extends p0 implements s {
        boolean q;
        o r;
        o s;
        o t;
        o u;
        Float v;

        q() {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "marker";
        }
    }

    static class q0 extends l {
        q0() {
        }

        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        String m() {
            return "switch";
        }
    }

    static class r extends f0 implements s {
        Boolean o;
        Boolean p;
        o q;
        o r;
        o s;
        o t;

        r() {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "mask";
        }
    }

    static class r0 extends p0 implements s {
        r0() {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "symbol";
        }
    }

    interface s {
    }

    static class s0 extends w0 implements v0 {
        String o;
        private z0 p;

        s0() {
        }

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 d() {
            return this.p;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "tref";
        }

        public void n(z0 z0Var) {
            this.p = z0Var;
        }
    }

    static class t extends m0 {
        String a;
        m0 b;

        t(String str, m0 m0Var) {
            this.a = str;
            this.b = m0Var;
        }

        public String toString() {
            return this.a + " " + this.b;
        }
    }

    static class t0 extends y0 implements v0 {
        private z0 s;

        t0() {
        }

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 d() {
            return this.s;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "tspan";
        }

        public void n(z0 z0Var) {
            this.s = z0Var;
        }
    }

    static class u extends k {
        v o;
        Float p;

        u() {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "path";
        }
    }

    static class u0 extends y0 implements z0, m {
        Matrix s;

        u0() {
        }

        @Override // com.caverock.androidsvg.SVG.m
        public void j(Matrix matrix) {
            this.s = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "text";
        }
    }

    static class v implements w {
        private int b = 0;
        private int d = 0;
        private byte[] a = new byte[8];
        private float[] c = new float[16];

        v() {
        }

        private void c(byte b) {
            int i = this.b;
            byte[] bArr = this.a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.a = bArr2;
            }
            byte[] bArr3 = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            bArr3[i2] = b;
        }

        private void d(int i) {
            float[] fArr = this.c;
            if (fArr.length < this.d + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.c = fArr2;
            }
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void a(float f, float f2, float f3, float f4) {
            c((byte) 3);
            d(4);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            this.d = i + 4;
            fArr[i4] = f4;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            c((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
            d(5);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            this.d = i + 5;
            fArr[i5] = f5;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void close() {
            c((byte) 8);
        }

        void e(w wVar) {
            int i = 0;
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b = this.a[i2];
                if (b == 0) {
                    float[] fArr = this.c;
                    int i3 = i + 1;
                    float f = fArr[i];
                    i += 2;
                    wVar.r(f, fArr[i3]);
                } else if (b == 1) {
                    float[] fArr2 = this.c;
                    int i4 = i + 1;
                    float f2 = fArr2[i];
                    i += 2;
                    wVar.t(f2, fArr2[i4]);
                } else if (b == 2) {
                    float[] fArr3 = this.c;
                    float f3 = fArr3[i];
                    float f4 = fArr3[i + 1];
                    float f5 = fArr3[i + 2];
                    float f6 = fArr3[i + 3];
                    int i5 = i + 5;
                    float f7 = fArr3[i + 4];
                    i += 6;
                    wVar.s(f3, f4, f5, f6, f7, fArr3[i5]);
                } else if (b == 3) {
                    float[] fArr4 = this.c;
                    float f8 = fArr4[i];
                    float f9 = fArr4[i + 1];
                    int i6 = i + 3;
                    float f10 = fArr4[i + 2];
                    i += 4;
                    wVar.a(f8, f9, f10, fArr4[i6]);
                } else if (b != 8) {
                    boolean z = (b & 2) != 0;
                    boolean z2 = (b & 1) != 0;
                    float[] fArr5 = this.c;
                    float f11 = fArr5[i];
                    float f12 = fArr5[i + 1];
                    float f13 = fArr5[i + 2];
                    int i7 = i + 4;
                    float f14 = fArr5[i + 3];
                    i += 5;
                    wVar.b(f11, f12, f13, z, z2, f14, fArr5[i7]);
                } else {
                    wVar.close();
                }
            }
        }

        boolean f() {
            return this.b == 0;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void r(float f, float f2) {
            c((byte) 0);
            d(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void s(float f, float f2, float f3, float f4, float f5, float f6) {
            c((byte) 2);
            d(6);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            int i6 = i + 5;
            this.d = i6;
            fArr[i5] = f5;
            this.d = i + 6;
            fArr[i6] = f6;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void t(float f, float f2) {
            c((byte) 1);
            d(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }
    }

    interface v0 {
        z0 d();
    }

    interface w {
        void a(float f, float f2, float f3, float f4);

        void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void close();

        void r(float f, float f2);

        void s(float f, float f2, float f3, float f4, float f5, float f6);

        void t(float f, float f2);
    }

    static abstract class w0 extends f0 {
        w0() {
        }

        @Override // com.caverock.androidsvg.SVG.f0, com.caverock.androidsvg.SVG.h0
        public void g(l0 l0Var) {
            if (l0Var instanceof v0) {
                this.i.add(l0Var);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + l0Var + " elements.");
        }
    }

    static class x extends p0 implements s {
        Boolean q;
        Boolean r;
        Matrix s;
        o t;
        o u;
        o v;
        o w;
        String x;

        x() {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "pattern";
        }
    }

    static class x0 extends w0 implements v0 {
        String o;
        o p;
        private z0 q;

        x0() {
        }

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 d() {
            return this.q;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "textPath";
        }

        public void n(z0 z0Var) {
            this.q = z0Var;
        }
    }

    static class y extends k {
        float[] o;

        y() {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        String m() {
            return "polyline";
        }
    }

    static abstract class y0 extends w0 {
        List o;
        List p;
        List q;
        List r;

        y0() {
        }
    }

    static class z extends y {
        z() {
        }

        @Override // com.caverock.androidsvg.SVG.y, com.caverock.androidsvg.SVG.l0
        String m() {
            return "polygon";
        }
    }

    interface z0 {
    }

    SVG() {
    }

    private String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    private b e(float f2) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        float f3;
        Unit unit5;
        d0 d0Var = this.a;
        o oVar = d0Var.s;
        o oVar2 = d0Var.t;
        if (oVar == null || oVar.h() || (unit = oVar.b) == (unit2 = Unit.percent) || unit == (unit3 = Unit.em) || unit == (unit4 = Unit.ex)) {
            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float b2 = oVar.b(f2);
        if (oVar2 == null) {
            b bVar = this.a.p;
            f3 = bVar != null ? (bVar.d * b2) / bVar.c : b2;
        } else {
            if (oVar2.h() || (unit5 = oVar2.b) == unit2 || unit5 == unit3 || unit5 == unit4) {
                return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f3 = oVar2.b(f2);
        }
        return new b(0.0f, 0.0f, b2, f3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private j0 i(h0 h0Var, String str) {
        j0 i2;
        j0 j0Var = (j0) h0Var;
        if (str.equals(j0Var.c)) {
            return j0Var;
        }
        for (Object obj : h0Var.getChildren()) {
            if (obj instanceof j0) {
                j0 j0Var2 = (j0) obj;
                if (str.equals(j0Var2.c)) {
                    return j0Var2;
                }
                if ((obj instanceof h0) && (i2 = i((h0) obj, str)) != null) {
                    return i2;
                }
            }
        }
        return null;
    }

    static j77 k() {
        return null;
    }

    public static SVG l(InputStream inputStream) {
        return new SVGParser().z(inputStream, g);
    }

    void a(CSSParser.n nVar) {
        this.e.b(nVar);
    }

    void b() {
        this.e.e(CSSParser.Source.RenderOptions);
    }

    List d() {
        return this.e.c();
    }

    public float f() {
        if (this.a != null) {
            return e(this.d).d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        d0 d0Var = this.a;
        if (d0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        b bVar = d0Var.p;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public float h() {
        if (this.a != null) {
            return e(this.d).c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    j0 j(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.a.c)) {
            return this.a;
        }
        if (this.f.containsKey(str)) {
            return (j0) this.f.get(str);
        }
        j0 i2 = i(this.a, str);
        this.f.put(str, i2);
        return i2;
    }

    d0 m() {
        return this.a;
    }

    boolean n() {
        return !this.e.d();
    }

    public void o(Canvas canvas, com.caverock.androidsvg.c cVar) {
        if (cVar == null) {
            cVar = new com.caverock.androidsvg.c();
        }
        if (!cVar.g()) {
            cVar.h(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new com.caverock.androidsvg.d(canvas, this.d).G0(this, cVar);
    }

    l0 p(String str) {
        if (str == null) {
            return null;
        }
        String c2 = c(str);
        if (c2.length() <= 1 || !c2.startsWith("#")) {
            return null;
        }
        return j(c2.substring(1));
    }

    void q(String str) {
        this.c = str;
    }

    public void r(String str) {
        d0 d0Var = this.a;
        if (d0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        d0Var.t = SVGParser.o0(str);
    }

    public void s(float f2, float f3, float f4, float f5) {
        d0 d0Var = this.a;
        if (d0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        d0Var.p = new b(f2, f3, f4, f5);
    }

    public void t(String str) {
        d0 d0Var = this.a;
        if (d0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        d0Var.s = SVGParser.o0(str);
    }

    void u(d0 d0Var) {
        this.a = d0Var;
    }

    void v(String str) {
        this.b = str;
    }

    static class o implements Cloneable {
        float a;
        Unit b;

        o(float f, Unit unit) {
            this.a = f;
            this.b = unit;
        }

        float a() {
            return this.a;
        }

        float b(float f) {
            int i = a.a[this.b.ordinal()];
            if (i == 1) {
                return this.a;
            }
            switch (i) {
                case 4:
                    return this.a * f;
                case 5:
                    return (this.a * f) / 2.54f;
                case 6:
                    return (this.a * f) / 25.4f;
                case 7:
                    return (this.a * f) / 72.0f;
                case 8:
                    return (this.a * f) / 6.0f;
                default:
                    return this.a;
            }
        }

        float c(com.caverock.androidsvg.d dVar) {
            float sqrt;
            if (this.b != Unit.percent) {
                return e(dVar);
            }
            b S = dVar.S();
            if (S == null) {
                return this.a;
            }
            float f = S.c;
            if (f == S.d) {
                sqrt = this.a * f;
            } else {
                sqrt = this.a * ((float) (Math.sqrt((f * f) + (r6 * r6)) / 1.414213562373095d));
            }
            return sqrt / 100.0f;
        }

        float d(com.caverock.androidsvg.d dVar, float f) {
            return this.b == Unit.percent ? (this.a * f) / 100.0f : e(dVar);
        }

        float e(com.caverock.androidsvg.d dVar) {
            switch (a.a[this.b.ordinal()]) {
                case 9:
                    b S = dVar.S();
                    if (S != null) {
                        break;
                    } else {
                        break;
                    }
            }
            return this.a;
        }

        float f(com.caverock.androidsvg.d dVar) {
            if (this.b != Unit.percent) {
                return e(dVar);
            }
            b S = dVar.S();
            return S == null ? this.a : (this.a * S.d) / 100.0f;
        }

        boolean g() {
            return this.a < 0.0f;
        }

        boolean h() {
            return this.a == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.a) + this.b;
        }

        o(float f) {
            this.a = f;
            this.b = Unit.px;
        }
    }

    static class b {
        float a;
        float b;
        float c;
        float d;

        b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        static b a(float f, float f2, float f3, float f4) {
            return new b(f, f2, f3 - f, f4 - f2);
        }

        float b() {
            return this.a + this.c;
        }

        float c() {
            return this.b + this.d;
        }

        RectF d() {
            return new RectF(this.a, this.b, b(), c());
        }

        void e(b bVar) {
            float f = bVar.a;
            if (f < this.a) {
                this.a = f;
            }
            float f2 = bVar.b;
            if (f2 < this.b) {
                this.b = f2;
            }
            if (bVar.b() > b()) {
                this.c = bVar.b() - this.a;
            }
            if (bVar.c() > c()) {
                this.d = bVar.c() - this.b;
            }
        }

        public String toString() {
            return "[" + this.a + " " + this.b + " " + this.c + " " + this.d + "]";
        }

        b(b bVar) {
            this.a = bVar.a;
            this.b = bVar.b;
            this.c = bVar.c;
            this.d = bVar.d;
        }
    }
}
