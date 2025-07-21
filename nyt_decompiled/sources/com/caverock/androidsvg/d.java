package com.caverock.androidsvg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.util.Log;
import com.amazonaws.services.s3.internal.Constants;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* loaded from: classes2.dex */
class d {
    private static HashSet i;
    private Canvas a;
    private float b;
    private SVG c;
    private h d;
    private Stack e;
    private Stack f;
    private Stack g;
    private CSSParser.m h = null;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[SVG.Style.LineJoin.values().length];
            c = iArr;
            try {
                iArr[SVG.Style.LineJoin.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[SVG.Style.LineJoin.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[SVG.Style.LineJoin.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SVG.Style.LineCap.values().length];
            b = iArr2;
            try {
                iArr2[SVG.Style.LineCap.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[SVG.Style.LineCap.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[SVG.Style.LineCap.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreserveAspectRatio.Alignment.values().length];
            a = iArr3;
            try {
                iArr3[PreserveAspectRatio.Alignment.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[PreserveAspectRatio.Alignment.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[PreserveAspectRatio.Alignment.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[PreserveAspectRatio.Alignment.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[PreserveAspectRatio.Alignment.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[PreserveAspectRatio.Alignment.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[PreserveAspectRatio.Alignment.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[PreserveAspectRatio.Alignment.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private class b implements SVG.w {
        private float b;
        private float c;
        private boolean h;
        private List a = new ArrayList();
        private c d = null;
        private boolean e = false;
        private boolean f = true;
        private int g = -1;

        b(SVG.v vVar) {
            if (vVar == null) {
                return;
            }
            vVar.e(this);
            if (this.h) {
                this.d.b((c) this.a.get(this.g));
                this.a.set(this.g, this.d);
                this.h = false;
            }
            c cVar = this.d;
            if (cVar != null) {
                this.a.add(cVar);
            }
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void a(float f, float f2, float f3, float f4) {
            this.d.a(f, f2);
            this.a.add(this.d);
            this.d = d.this.new c(f3, f4, f3 - f, f4 - f2);
            this.h = false;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.e = true;
            this.f = false;
            c cVar = this.d;
            d.h(cVar.a, cVar.b, f, f2, f3, z, z2, f4, f5, this);
            this.f = true;
            this.h = false;
        }

        List c() {
            return this.a;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void close() {
            this.a.add(this.d);
            t(this.b, this.c);
            this.h = true;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void r(float f, float f2) {
            if (this.h) {
                this.d.b((c) this.a.get(this.g));
                this.a.set(this.g, this.d);
                this.h = false;
            }
            c cVar = this.d;
            if (cVar != null) {
                this.a.add(cVar);
            }
            this.b = f;
            this.c = f2;
            this.d = d.this.new c(f, f2, 0.0f, 0.0f);
            this.g = this.a.size();
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void s(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.f || this.e) {
                this.d.a(f, f2);
                this.a.add(this.d);
                this.e = false;
            }
            this.d = d.this.new c(f5, f6, f5 - f3, f6 - f4);
            this.h = false;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void t(float f, float f2) {
            this.d.a(f, f2);
            this.a.add(this.d);
            d dVar = d.this;
            c cVar = this.d;
            this.d = dVar.new c(f, f2, f - cVar.a, f2 - cVar.b);
            this.h = false;
        }
    }

    private class c {
        float a;
        float b;
        float c;
        float d;
        boolean e = false;

        c(float f, float f2, float f3, float f4) {
            this.c = 0.0f;
            this.d = 0.0f;
            this.a = f;
            this.b = f2;
            double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (sqrt != 0.0d) {
                this.c = (float) (f3 / sqrt);
                this.d = (float) (f4 / sqrt);
            }
        }

        void a(float f, float f2) {
            float f3 = f - this.a;
            float f4 = f2 - this.b;
            double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (sqrt != 0.0d) {
                f3 = (float) (f3 / sqrt);
                f4 = (float) (f4 / sqrt);
            }
            float f5 = this.c;
            if (f3 != (-f5) || f4 != (-this.d)) {
                this.c = f5 + f3;
                this.d += f4;
            } else {
                this.e = true;
                this.c = -f4;
                this.d = f3;
            }
        }

        void b(c cVar) {
            float f = cVar.c;
            float f2 = this.c;
            if (f == (-f2)) {
                float f3 = cVar.d;
                if (f3 == (-this.d)) {
                    this.e = true;
                    this.c = -f3;
                    this.d = cVar.c;
                    return;
                }
            }
            this.c = f2 + f;
            this.d += cVar.d;
        }

        public String toString() {
            return "(" + this.a + "," + this.b + " " + this.c + "," + this.d + ")";
        }
    }

    /* renamed from: com.caverock.androidsvg.d$d, reason: collision with other inner class name */
    private class C0152d implements SVG.w {
        Path a = new Path();
        float b;
        float c;

        C0152d(SVG.v vVar) {
            if (vVar == null) {
                return;
            }
            vVar.e(this);
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void a(float f, float f2, float f3, float f4) {
            this.a.quadTo(f, f2, f3, f4);
            this.b = f3;
            this.c = f4;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            d.h(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
            this.b = f4;
            this.c = f5;
        }

        Path c() {
            return this.a;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void close() {
            this.a.close();
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void r(float f, float f2) {
            this.a.moveTo(f, f2);
            this.b = f;
            this.c = f2;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void s(float f, float f2, float f3, float f4, float f5, float f6) {
            this.a.cubicTo(f, f2, f3, f4, f5, f6);
            this.b = f5;
            this.c = f6;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void t(float f, float f2) {
            this.a.lineTo(f, f2);
            this.b = f;
            this.c = f2;
        }
    }

    private class e extends f {
        private Path e;

        e(Path path, float f, float f2) {
            super(f, f2);
            this.e = path;
        }

        @Override // com.caverock.androidsvg.d.f, com.caverock.androidsvg.d.j
        public void b(String str) {
            if (d.this.Y0()) {
                if (d.this.d.b) {
                    d.this.a.drawTextOnPath(str, this.e, this.b, this.c, d.this.d.d);
                }
                if (d.this.d.c) {
                    d.this.a.drawTextOnPath(str, this.e, this.b, this.c, d.this.d.e);
                }
            }
            this.b += d.this.d.d.measureText(str);
        }
    }

    private class f extends j {
        float b;
        float c;

        f(float f, float f2) {
            super(d.this, null);
            this.b = f;
            this.c = f2;
        }

        @Override // com.caverock.androidsvg.d.j
        public void b(String str) {
            d.y("TextSequence render", new Object[0]);
            if (d.this.Y0()) {
                if (d.this.d.b) {
                    d.this.a.drawText(str, this.b, this.c, d.this.d.d);
                }
                if (d.this.d.c) {
                    d.this.a.drawText(str, this.b, this.c, d.this.d.e);
                }
            }
            this.b += d.this.d.d.measureText(str);
        }
    }

    private class g extends j {
        float b;
        float c;
        Path d;

        g(float f, float f2, Path path) {
            super(d.this, null);
            this.b = f;
            this.c = f2;
            this.d = path;
        }

        @Override // com.caverock.androidsvg.d.j
        public boolean a(SVG.w0 w0Var) {
            if (!(w0Var instanceof SVG.x0)) {
                return true;
            }
            d.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // com.caverock.androidsvg.d.j
        public void b(String str) {
            if (d.this.Y0()) {
                Path path = new Path();
                d.this.d.d.getTextPath(str, 0, str.length(), this.b, this.c, path);
                this.d.addPath(path);
            }
            this.b += d.this.d.d.measureText(str);
        }
    }

    private class i extends j {
        float b;
        float c;
        RectF d;

        i(float f, float f2) {
            super(d.this, null);
            this.d = new RectF();
            this.b = f;
            this.c = f2;
        }

        @Override // com.caverock.androidsvg.d.j
        public boolean a(SVG.w0 w0Var) {
            if (!(w0Var instanceof SVG.x0)) {
                return true;
            }
            SVG.x0 x0Var = (SVG.x0) w0Var;
            SVG.l0 p = w0Var.a.p(x0Var.o);
            if (p == null) {
                d.F("TextPath path reference '%s' not found", x0Var.o);
                return false;
            }
            SVG.u uVar = (SVG.u) p;
            Path c = d.this.new C0152d(uVar.o).c();
            Matrix matrix = uVar.n;
            if (matrix != null) {
                c.transform(matrix);
            }
            RectF rectF = new RectF();
            c.computeBounds(rectF, true);
            this.d.union(rectF);
            return false;
        }

        @Override // com.caverock.androidsvg.d.j
        public void b(String str) {
            if (d.this.Y0()) {
                Rect rect = new Rect();
                d.this.d.d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.b, this.c);
                this.d.union(rectF);
            }
            this.b += d.this.d.d.measureText(str);
        }
    }

    private abstract class j {
        private j() {
        }

        public boolean a(SVG.w0 w0Var) {
            return true;
        }

        public abstract void b(String str);

        /* synthetic */ j(d dVar, a aVar) {
            this();
        }
    }

    d(Canvas canvas, float f2) {
        this.a = canvas;
        this.b = f2;
    }

    private boolean A() {
        Boolean bool = this.d.a.Q;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void A0(SVG.l0 l0Var) {
        if (l0Var instanceof SVG.s) {
            return;
        }
        S0();
        u(l0Var);
        if (l0Var instanceof SVG.d0) {
            x0((SVG.d0) l0Var);
        } else if (l0Var instanceof SVG.b1) {
            E0((SVG.b1) l0Var);
        } else if (l0Var instanceof SVG.q0) {
            B0((SVG.q0) l0Var);
        } else if (l0Var instanceof SVG.l) {
            q0((SVG.l) l0Var);
        } else if (l0Var instanceof SVG.n) {
            r0((SVG.n) l0Var);
        } else if (l0Var instanceof SVG.u) {
            t0((SVG.u) l0Var);
        } else if (l0Var instanceof SVG.a0) {
            w0((SVG.a0) l0Var);
        } else if (l0Var instanceof SVG.d) {
            o0((SVG.d) l0Var);
        } else if (l0Var instanceof SVG.i) {
            p0((SVG.i) l0Var);
        } else if (l0Var instanceof SVG.p) {
            s0((SVG.p) l0Var);
        } else if (l0Var instanceof SVG.z) {
            v0((SVG.z) l0Var);
        } else if (l0Var instanceof SVG.y) {
            u0((SVG.y) l0Var);
        } else if (l0Var instanceof SVG.u0) {
            D0((SVG.u0) l0Var);
        }
        R0();
    }

    private void B(SVG.i0 i0Var, Path path) {
        SVG.m0 m0Var = this.d.a.b;
        if (m0Var instanceof SVG.t) {
            SVG.l0 p = this.c.p(((SVG.t) m0Var).a);
            if (p instanceof SVG.x) {
                L(i0Var, path, (SVG.x) p);
                return;
            }
        }
        this.a.drawPath(path, this.d.d);
    }

    private void B0(SVG.q0 q0Var) {
        y("Switch render", new Object[0]);
        W0(this.d, q0Var);
        if (A()) {
            Matrix matrix = q0Var.o;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            p(q0Var);
            boolean m0 = m0();
            K0(q0Var);
            if (m0) {
                j0(q0Var);
            }
            U0(q0Var);
        }
    }

    private void C(Path path) {
        h hVar = this.d;
        if (hVar.a.k0 != SVG.Style.VectorEffect.NonScalingStroke) {
            this.a.drawPath(path, hVar.e);
            return;
        }
        Matrix matrix = this.a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.a.setMatrix(new Matrix());
        Shader shader = this.d.e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.a.drawPath(path2, this.d.e);
        this.a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private void C0(SVG.r0 r0Var, SVG.b bVar) {
        y("Symbol render", new Object[0]);
        if (bVar.c == 0.0f || bVar.d == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = r0Var.o;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.e;
        }
        W0(this.d, r0Var);
        h hVar = this.d;
        hVar.f = bVar;
        if (!hVar.a.B.booleanValue()) {
            SVG.b bVar2 = this.d.f;
            O0(bVar2.a, bVar2.b, bVar2.c, bVar2.d);
        }
        SVG.b bVar3 = r0Var.p;
        if (bVar3 != null) {
            this.a.concat(o(this.d.f, bVar3, preserveAspectRatio));
            this.d.g = r0Var.p;
        } else {
            Canvas canvas = this.a;
            SVG.b bVar4 = this.d.f;
            canvas.translate(bVar4.a, bVar4.b);
        }
        boolean m0 = m0();
        F0(r0Var, true);
        if (m0) {
            j0(r0Var);
        }
        U0(r0Var);
    }

    private float D(float f2, float f3, float f4, float f5) {
        return (f2 * f4) + (f3 * f5);
    }

    private void D0(SVG.u0 u0Var) {
        y("Text render", new Object[0]);
        W0(this.d, u0Var);
        if (A()) {
            Matrix matrix = u0Var.s;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            List list = u0Var.o;
            float f2 = 0.0f;
            float e2 = (list == null || list.size() == 0) ? 0.0f : ((SVG.o) u0Var.o.get(0)).e(this);
            List list2 = u0Var.p;
            float f3 = (list2 == null || list2.size() == 0) ? 0.0f : ((SVG.o) u0Var.p.get(0)).f(this);
            List list3 = u0Var.q;
            float e3 = (list3 == null || list3.size() == 0) ? 0.0f : ((SVG.o) u0Var.q.get(0)).e(this);
            List list4 = u0Var.r;
            if (list4 != null && list4.size() != 0) {
                f2 = ((SVG.o) u0Var.r.get(0)).f(this);
            }
            SVG.Style.TextAnchor O = O();
            if (O != SVG.Style.TextAnchor.Start) {
                float n = n(u0Var);
                if (O == SVG.Style.TextAnchor.Middle) {
                    n /= 2.0f;
                }
                e2 -= n;
            }
            if (u0Var.h == null) {
                i iVar = new i(e2, f3);
                E(u0Var, iVar);
                RectF rectF = iVar.d;
                u0Var.h = new SVG.b(rectF.left, rectF.top, rectF.width(), iVar.d.height());
            }
            U0(u0Var);
            r(u0Var);
            p(u0Var);
            boolean m0 = m0();
            E(u0Var, new f(e2 + e3, f3 + f2));
            if (m0) {
                j0(u0Var);
            }
        }
    }

    private void E(SVG.w0 w0Var, j jVar) {
        if (A()) {
            Iterator it2 = w0Var.i.iterator();
            boolean z = true;
            while (it2.hasNext()) {
                SVG.l0 l0Var = (SVG.l0) it2.next();
                if (l0Var instanceof SVG.a1) {
                    jVar.b(T0(((SVG.a1) l0Var).c, z, !it2.hasNext()));
                } else {
                    l0(l0Var, jVar);
                }
                z = false;
            }
        }
    }

    private void E0(SVG.b1 b1Var) {
        y("Use render", new Object[0]);
        SVG.o oVar = b1Var.s;
        if (oVar == null || !oVar.h()) {
            SVG.o oVar2 = b1Var.t;
            if (oVar2 == null || !oVar2.h()) {
                W0(this.d, b1Var);
                if (A()) {
                    SVG.l0 p = b1Var.a.p(b1Var.p);
                    if (p == null) {
                        F("Use reference '%s' not found", b1Var.p);
                        return;
                    }
                    Matrix matrix = b1Var.o;
                    if (matrix != null) {
                        this.a.concat(matrix);
                    }
                    SVG.o oVar3 = b1Var.q;
                    float e2 = oVar3 != null ? oVar3.e(this) : 0.0f;
                    SVG.o oVar4 = b1Var.r;
                    this.a.translate(e2, oVar4 != null ? oVar4.f(this) : 0.0f);
                    p(b1Var);
                    boolean m0 = m0();
                    i0(b1Var);
                    if (p instanceof SVG.d0) {
                        SVG.b f0 = f0(null, null, b1Var.s, b1Var.t);
                        S0();
                        y0((SVG.d0) p, f0);
                        R0();
                    } else if (p instanceof SVG.r0) {
                        SVG.o oVar5 = b1Var.s;
                        if (oVar5 == null) {
                            oVar5 = new SVG.o(100.0f, SVG.Unit.percent);
                        }
                        SVG.o oVar6 = b1Var.t;
                        if (oVar6 == null) {
                            oVar6 = new SVG.o(100.0f, SVG.Unit.percent);
                        }
                        SVG.b f02 = f0(null, null, oVar5, oVar6);
                        S0();
                        C0((SVG.r0) p, f02);
                        R0();
                    } else {
                        A0(p);
                    }
                    h0();
                    if (m0) {
                        j0(b1Var);
                    }
                    U0(b1Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void F0(SVG.h0 h0Var, boolean z) {
        if (z) {
            i0(h0Var);
        }
        Iterator it2 = h0Var.getChildren().iterator();
        while (it2.hasNext()) {
            A0((SVG.l0) it2.next());
        }
        if (z) {
            h0();
        }
    }

    private void G(SVG.w0 w0Var, StringBuilder sb) {
        Iterator it2 = w0Var.i.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            SVG.l0 l0Var = (SVG.l0) it2.next();
            if (l0Var instanceof SVG.w0) {
                G((SVG.w0) l0Var, sb);
            } else if (l0Var instanceof SVG.a1) {
                sb.append(T0(((SVG.a1) l0Var).c, z, !it2.hasNext()));
            }
            z = false;
        }
    }

    private void H(SVG.j jVar, String str) {
        SVG.l0 p = jVar.a.p(str);
        if (p == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(p instanceof SVG.j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (p == jVar) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVG.j jVar2 = (SVG.j) p;
        if (jVar.i == null) {
            jVar.i = jVar2.i;
        }
        if (jVar.j == null) {
            jVar.j = jVar2.j;
        }
        if (jVar.k == null) {
            jVar.k = jVar2.k;
        }
        if (jVar.h.isEmpty()) {
            jVar.h = jVar2.h;
        }
        try {
            if (jVar instanceof SVG.k0) {
                I((SVG.k0) jVar, (SVG.k0) p);
            } else {
                J((SVG.o0) jVar, (SVG.o0) p);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = jVar2.l;
        if (str2 != null) {
            H(jVar, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void H0(com.caverock.androidsvg.SVG.q r12, com.caverock.androidsvg.d.c r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.d.H0(com.caverock.androidsvg.SVG$q, com.caverock.androidsvg.d$c):void");
    }

    private void I(SVG.k0 k0Var, SVG.k0 k0Var2) {
        if (k0Var.m == null) {
            k0Var.m = k0Var2.m;
        }
        if (k0Var.n == null) {
            k0Var.n = k0Var2.n;
        }
        if (k0Var.o == null) {
            k0Var.o = k0Var2.o;
        }
        if (k0Var.p == null) {
            k0Var.p = k0Var2.p;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void I0(com.caverock.androidsvg.SVG.k r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.d.I0(com.caverock.androidsvg.SVG$k):void");
    }

    private void J(SVG.o0 o0Var, SVG.o0 o0Var2) {
        if (o0Var.m == null) {
            o0Var.m = o0Var2.m;
        }
        if (o0Var.n == null) {
            o0Var.n = o0Var2.n;
        }
        if (o0Var.o == null) {
            o0Var.o = o0Var2.o;
        }
        if (o0Var.p == null) {
            o0Var.p = o0Var2.p;
        }
        if (o0Var.q == null) {
            o0Var.q = o0Var2.q;
        }
    }

    private void J0(SVG.r rVar, SVG.i0 i0Var, SVG.b bVar) {
        float f2;
        float f3;
        y("Mask render", new Object[0]);
        Boolean bool = rVar.o;
        if (bool == null || !bool.booleanValue()) {
            SVG.o oVar = rVar.s;
            float d = oVar != null ? oVar.d(this, 1.0f) : 1.2f;
            SVG.o oVar2 = rVar.t;
            float d2 = oVar2 != null ? oVar2.d(this, 1.0f) : 1.2f;
            f2 = d * bVar.c;
            f3 = d2 * bVar.d;
        } else {
            SVG.o oVar3 = rVar.s;
            f2 = oVar3 != null ? oVar3.e(this) : bVar.c;
            SVG.o oVar4 = rVar.t;
            f3 = oVar4 != null ? oVar4.f(this) : bVar.d;
        }
        if (f2 == 0.0f || f3 == 0.0f) {
            return;
        }
        S0();
        h M = M(rVar);
        this.d = M;
        M.a.m = Float.valueOf(1.0f);
        boolean m0 = m0();
        this.a.save();
        Boolean bool2 = rVar.p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.a.translate(bVar.a, bVar.b);
            this.a.scale(bVar.c, bVar.d);
        }
        F0(rVar, false);
        this.a.restore();
        if (m0) {
            k0(i0Var, bVar);
        }
        R0();
    }

    private void K(SVG.x xVar, String str) {
        SVG.l0 p = xVar.a.p(str);
        if (p == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(p instanceof SVG.x)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (p == xVar) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVG.x xVar2 = (SVG.x) p;
        if (xVar.q == null) {
            xVar.q = xVar2.q;
        }
        if (xVar.r == null) {
            xVar.r = xVar2.r;
        }
        if (xVar.s == null) {
            xVar.s = xVar2.s;
        }
        if (xVar.t == null) {
            xVar.t = xVar2.t;
        }
        if (xVar.u == null) {
            xVar.u = xVar2.u;
        }
        if (xVar.v == null) {
            xVar.v = xVar2.v;
        }
        if (xVar.w == null) {
            xVar.w = xVar2.w;
        }
        if (xVar.i.isEmpty()) {
            xVar.i = xVar2.i;
        }
        if (xVar.p == null) {
            xVar.p = xVar2.p;
        }
        if (xVar.o == null) {
            xVar.o = xVar2.o;
        }
        String str2 = xVar2.x;
        if (str2 != null) {
            K(xVar, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K0(SVG.q0 q0Var) {
        Set a2;
        String language = Locale.getDefault().getLanguage();
        SVG.k();
        for (SVG.l0 l0Var : q0Var.getChildren()) {
            if (l0Var instanceof SVG.e0) {
                SVG.e0 e0Var = (SVG.e0) l0Var;
                if (e0Var.b() == null && ((a2 = e0Var.a()) == null || (!a2.isEmpty() && a2.contains(language)))) {
                    Set requiredFeatures = e0Var.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (i == null) {
                            V();
                        }
                        if (!requiredFeatures.isEmpty() && i.containsAll(requiredFeatures)) {
                        }
                    }
                    Set k2 = e0Var.k();
                    if (k2 != null) {
                        k2.isEmpty();
                    } else {
                        Set l = e0Var.l();
                        if (l == null) {
                            A0(l0Var);
                            return;
                        }
                        l.isEmpty();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f6 A[LOOP:3: B:67:0x01f0->B:69:0x01f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void L(com.caverock.androidsvg.SVG.i0 r20, android.graphics.Path r21, com.caverock.androidsvg.SVG.x r22) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.d.L(com.caverock.androidsvg.SVG$i0, android.graphics.Path, com.caverock.androidsvg.SVG$x):void");
    }

    private void L0(SVG.x0 x0Var) {
        y("TextPath render", new Object[0]);
        W0(this.d, x0Var);
        if (A() && Y0()) {
            SVG.l0 p = x0Var.a.p(x0Var.o);
            if (p == null) {
                F("TextPath reference '%s' not found", x0Var.o);
                return;
            }
            SVG.u uVar = (SVG.u) p;
            Path c2 = new C0152d(uVar.o).c();
            Matrix matrix = uVar.n;
            if (matrix != null) {
                c2.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(c2, false);
            SVG.o oVar = x0Var.p;
            float d = oVar != null ? oVar.d(this, pathMeasure.getLength()) : 0.0f;
            SVG.Style.TextAnchor O = O();
            if (O != SVG.Style.TextAnchor.Start) {
                float n = n(x0Var);
                if (O == SVG.Style.TextAnchor.Middle) {
                    n /= 2.0f;
                }
                d -= n;
            }
            r((SVG.i0) x0Var.d());
            boolean m0 = m0();
            E(x0Var, new e(c2, d, 0.0f));
            if (m0) {
                j0(x0Var);
            }
        }
    }

    private h M(SVG.l0 l0Var) {
        h hVar = new h();
        V0(hVar, SVG.Style.a());
        return N(l0Var, hVar);
    }

    private boolean M0() {
        return this.d.a.m.floatValue() < 1.0f || this.d.a.f0 != null;
    }

    private h N(SVG.l0 l0Var, h hVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (l0Var instanceof SVG.j0) {
                arrayList.add(0, (SVG.j0) l0Var);
            }
            Object obj = l0Var.b;
            if (obj == null) {
                break;
            }
            l0Var = (SVG.l0) obj;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            W0(hVar, (SVG.j0) it2.next());
        }
        h hVar2 = this.d;
        hVar.g = hVar2.g;
        hVar.f = hVar2.f;
        return hVar;
    }

    private void N0() {
        this.d = new h();
        this.e = new Stack();
        V0(this.d, SVG.Style.a());
        h hVar = this.d;
        hVar.f = null;
        hVar.h = false;
        this.e.push(new h(hVar));
        this.g = new Stack();
        this.f = new Stack();
    }

    private SVG.Style.TextAnchor O() {
        SVG.Style.TextAnchor textAnchor;
        SVG.Style style = this.d.a;
        if (style.x == SVG.Style.TextDirection.LTR || (textAnchor = style.y) == SVG.Style.TextAnchor.Middle) {
            return style.y;
        }
        SVG.Style.TextAnchor textAnchor2 = SVG.Style.TextAnchor.Start;
        return textAnchor == textAnchor2 ? SVG.Style.TextAnchor.End : textAnchor2;
    }

    private void O0(float f2, float f3, float f4, float f5) {
        float f6 = f4 + f2;
        float f7 = f5 + f3;
        SVG.c cVar = this.d.a.H;
        if (cVar != null) {
            f2 += cVar.d.e(this);
            f3 += this.d.a.H.a.f(this);
            f6 -= this.d.a.H.b.e(this);
            f7 -= this.d.a.H.c.f(this);
        }
        this.a.clipRect(f2, f3, f6, f7);
    }

    private Path.FillType P() {
        SVG.Style.FillRule fillRule = this.d.a.e0;
        return (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void P0(h hVar, boolean z, SVG.m0 m0Var) {
        int i2;
        SVG.Style style = hVar.a;
        float floatValue = (z ? style.d : style.f).floatValue();
        if (m0Var instanceof SVG.f) {
            i2 = ((SVG.f) m0Var).a;
        } else if (!(m0Var instanceof SVG.g)) {
            return;
        } else {
            i2 = hVar.a.n.a;
        }
        int x = x(i2, floatValue);
        if (z) {
            hVar.d.setColor(x);
        } else {
            hVar.e.setColor(x);
        }
    }

    private void Q0(boolean z, SVG.b0 b0Var) {
        if (z) {
            if (W(b0Var.e, 2147483648L)) {
                h hVar = this.d;
                SVG.Style style = hVar.a;
                SVG.m0 m0Var = b0Var.e.g0;
                style.b = m0Var;
                hVar.b = m0Var != null;
            }
            if (W(b0Var.e, 4294967296L)) {
                this.d.a.d = b0Var.e.h0;
            }
            if (W(b0Var.e, 6442450944L)) {
                h hVar2 = this.d;
                P0(hVar2, z, hVar2.a.b);
                return;
            }
            return;
        }
        if (W(b0Var.e, 2147483648L)) {
            h hVar3 = this.d;
            SVG.Style style2 = hVar3.a;
            SVG.m0 m0Var2 = b0Var.e.g0;
            style2.e = m0Var2;
            hVar3.c = m0Var2 != null;
        }
        if (W(b0Var.e, 4294967296L)) {
            this.d.a.f = b0Var.e.h0;
        }
        if (W(b0Var.e, 6442450944L)) {
            h hVar4 = this.d;
            P0(hVar4, z, hVar4.a.e);
        }
    }

    private void R0() {
        this.a.restore();
        this.d = (h) this.e.pop();
    }

    private void S0() {
        this.a.save();
        this.e.push(this.d);
        this.d = new h(this.d);
    }

    private String T0(String str, boolean z, boolean z2) {
        if (this.d.h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    private Path.FillType U() {
        SVG.Style.FillRule fillRule = this.d.a.c;
        return (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void U0(SVG.i0 i0Var) {
        if (i0Var.b == null || i0Var.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.g.peek()).invert(matrix)) {
            SVG.b bVar = i0Var.h;
            float f2 = bVar.a;
            float f3 = bVar.b;
            float b2 = bVar.b();
            SVG.b bVar2 = i0Var.h;
            float f4 = bVar2.b;
            float b3 = bVar2.b();
            float c2 = i0Var.h.c();
            SVG.b bVar3 = i0Var.h;
            float[] fArr = {f2, f3, b2, f4, b3, c2, bVar3.a, bVar3.c()};
            matrix.preConcat(this.a.getMatrix());
            matrix.mapPoints(fArr);
            float f5 = fArr[0];
            float f6 = fArr[1];
            RectF rectF = new RectF(f5, f6, f5, f6);
            for (int i2 = 2; i2 <= 6; i2 += 2) {
                float f7 = fArr[i2];
                if (f7 < rectF.left) {
                    rectF.left = f7;
                }
                if (f7 > rectF.right) {
                    rectF.right = f7;
                }
                float f8 = fArr[i2 + 1];
                if (f8 < rectF.top) {
                    rectF.top = f8;
                }
                if (f8 > rectF.bottom) {
                    rectF.bottom = f8;
                }
            }
            SVG.i0 i0Var2 = (SVG.i0) this.f.peek();
            SVG.b bVar4 = i0Var2.h;
            if (bVar4 == null) {
                i0Var2.h = SVG.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                bVar4.e(SVG.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private static synchronized void V() {
        synchronized (d.class) {
            HashSet hashSet = new HashSet();
            i = hashSet;
            hashSet.add("Structure");
            i.add("BasicStructure");
            i.add("ConditionalProcessing");
            i.add("Image");
            i.add("Style");
            i.add("ViewportAttribute");
            i.add("Shape");
            i.add("BasicText");
            i.add("PaintAttribute");
            i.add("BasicPaintAttribute");
            i.add("OpacityAttribute");
            i.add("BasicGraphicsAttribute");
            i.add("Marker");
            i.add("Gradient");
            i.add("Pattern");
            i.add("Clip");
            i.add("BasicClip");
            i.add("Mask");
            i.add("View");
        }
    }

    private void V0(h hVar, SVG.Style style) {
        if (W(style, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            hVar.a.n = style.n;
        }
        if (W(style, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            hVar.a.m = style.m;
        }
        if (W(style, 1L)) {
            hVar.a.b = style.b;
            SVG.m0 m0Var = style.b;
            hVar.b = (m0Var == null || m0Var == SVG.f.c) ? false : true;
        }
        if (W(style, 4L)) {
            hVar.a.d = style.d;
        }
        if (W(style, 6149L)) {
            P0(hVar, true, hVar.a.b);
        }
        if (W(style, 2L)) {
            hVar.a.c = style.c;
        }
        if (W(style, 8L)) {
            hVar.a.e = style.e;
            SVG.m0 m0Var2 = style.e;
            hVar.c = (m0Var2 == null || m0Var2 == SVG.f.c) ? false : true;
        }
        if (W(style, 16L)) {
            hVar.a.f = style.f;
        }
        if (W(style, 6168L)) {
            P0(hVar, false, hVar.a.e);
        }
        if (W(style, 34359738368L)) {
            hVar.a.k0 = style.k0;
        }
        if (W(style, 32L)) {
            SVG.Style style2 = hVar.a;
            SVG.o oVar = style.g;
            style2.g = oVar;
            hVar.e.setStrokeWidth(oVar.c(this));
        }
        if (W(style, 64L)) {
            hVar.a.h = style.h;
            int i2 = a.b[style.h.ordinal()];
            if (i2 == 1) {
                hVar.e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i2 == 2) {
                hVar.e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i2 == 3) {
                hVar.e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(style, 128L)) {
            hVar.a.i = style.i;
            int i3 = a.c[style.i.ordinal()];
            if (i3 == 1) {
                hVar.e.setStrokeJoin(Paint.Join.MITER);
            } else if (i3 == 2) {
                hVar.e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i3 == 3) {
                hVar.e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(style, 256L)) {
            hVar.a.j = style.j;
            hVar.e.setStrokeMiter(style.j.floatValue());
        }
        if (W(style, 512L)) {
            hVar.a.k = style.k;
        }
        if (W(style, 1024L)) {
            hVar.a.l = style.l;
        }
        Typeface typeface = null;
        if (W(style, 1536L)) {
            SVG.o[] oVarArr = hVar.a.k;
            if (oVarArr == null) {
                hVar.e.setPathEffect(null);
            } else {
                int length = oVarArr.length;
                int i4 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i4];
                float f2 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    float c2 = hVar.a.k[i5 % length].c(this);
                    fArr[i5] = c2;
                    f2 += c2;
                }
                if (f2 == 0.0f) {
                    hVar.e.setPathEffect(null);
                } else {
                    float c3 = hVar.a.l.c(this);
                    if (c3 < 0.0f) {
                        c3 = (c3 % f2) + f2;
                    }
                    hVar.e.setPathEffect(new DashPathEffect(fArr, c3));
                }
            }
        }
        if (W(style, 16384L)) {
            float Q = Q();
            hVar.a.s = style.s;
            hVar.d.setTextSize(style.s.d(this, Q));
            hVar.e.setTextSize(style.s.d(this, Q));
        }
        if (W(style, PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            hVar.a.r = style.r;
        }
        if (W(style, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            if (style.t.intValue() == -1 && hVar.a.t.intValue() > 100) {
                SVG.Style style3 = hVar.a;
                style3.t = Integer.valueOf(style3.t.intValue() - 100);
            } else if (style.t.intValue() != 1 || hVar.a.t.intValue() >= 900) {
                hVar.a.t = style.t;
            } else {
                SVG.Style style4 = hVar.a;
                style4.t = Integer.valueOf(style4.t.intValue() + 100);
            }
        }
        if (W(style, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
            hVar.a.u = style.u;
        }
        if (W(style, 106496L)) {
            if (hVar.a.r != null && this.c != null) {
                SVG.k();
                for (String str : hVar.a.r) {
                    SVG.Style style5 = hVar.a;
                    typeface = t(str, style5.t, style5.u);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                SVG.Style style6 = hVar.a;
                typeface = t("serif", style6.t, style6.u);
            }
            hVar.d.setTypeface(typeface);
            hVar.e.setTypeface(typeface);
        }
        if (W(style, PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            hVar.a.w = style.w;
            Paint paint = hVar.d;
            SVG.Style.TextDecoration textDecoration = style.w;
            SVG.Style.TextDecoration textDecoration2 = SVG.Style.TextDecoration.LineThrough;
            paint.setStrikeThruText(textDecoration == textDecoration2);
            Paint paint2 = hVar.d;
            SVG.Style.TextDecoration textDecoration3 = style.w;
            SVG.Style.TextDecoration textDecoration4 = SVG.Style.TextDecoration.Underline;
            paint2.setUnderlineText(textDecoration3 == textDecoration4);
            hVar.e.setStrikeThruText(style.w == textDecoration2);
            hVar.e.setUnderlineText(style.w == textDecoration4);
        }
        if (W(style, 68719476736L)) {
            hVar.a.x = style.x;
        }
        if (W(style, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            hVar.a.y = style.y;
        }
        if (W(style, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            hVar.a.B = style.B;
        }
        if (W(style, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)) {
            hVar.a.L = style.L;
        }
        if (W(style, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED)) {
            hVar.a.M = style.M;
        }
        if (W(style, 8388608L)) {
            hVar.a.N = style.N;
        }
        if (W(style, 16777216L)) {
            hVar.a.Q = style.Q;
        }
        if (W(style, 33554432L)) {
            hVar.a.S = style.S;
        }
        if (W(style, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            hVar.a.H = style.H;
        }
        if (W(style, 268435456L)) {
            hVar.a.Z = style.Z;
        }
        if (W(style, 536870912L)) {
            hVar.a.e0 = style.e0;
        }
        if (W(style, Constants.GB)) {
            hVar.a.f0 = style.f0;
        }
        if (W(style, 67108864L)) {
            hVar.a.X = style.X;
        }
        if (W(style, 134217728L)) {
            hVar.a.Y = style.Y;
        }
        if (W(style, 8589934592L)) {
            hVar.a.i0 = style.i0;
        }
        if (W(style, 17179869184L)) {
            hVar.a.j0 = style.j0;
        }
        if (W(style, 137438953472L)) {
            hVar.a.l0 = style.l0;
        }
    }

    private boolean W(SVG.Style style, long j2) {
        return (style.a & j2) != 0;
    }

    private void W0(h hVar, SVG.j0 j0Var) {
        hVar.a.b(j0Var.b == null);
        SVG.Style style = j0Var.e;
        if (style != null) {
            V0(hVar, style);
        }
        if (this.c.n()) {
            for (CSSParser.l lVar : this.c.d()) {
                if (CSSParser.l(this.h, lVar.a, j0Var)) {
                    V0(hVar, lVar.b);
                }
            }
        }
        SVG.Style style2 = j0Var.f;
        if (style2 != null) {
            V0(hVar, style2);
        }
    }

    private void X(boolean z, SVG.b bVar, SVG.k0 k0Var) {
        float f2;
        float d;
        float f3;
        float f4;
        String str = k0Var.l;
        if (str != null) {
            H(k0Var, str);
        }
        Boolean bool = k0Var.i;
        int i2 = 0;
        boolean z2 = bool != null && bool.booleanValue();
        h hVar = this.d;
        Paint paint = z ? hVar.d : hVar.e;
        if (z2) {
            SVG.b S = S();
            SVG.o oVar = k0Var.m;
            float e2 = oVar != null ? oVar.e(this) : 0.0f;
            SVG.o oVar2 = k0Var.n;
            float f5 = oVar2 != null ? oVar2.f(this) : 0.0f;
            SVG.o oVar3 = k0Var.o;
            float e3 = oVar3 != null ? oVar3.e(this) : S.c;
            SVG.o oVar4 = k0Var.p;
            f4 = e3;
            f2 = e2;
            f3 = f5;
            d = oVar4 != null ? oVar4.f(this) : 0.0f;
        } else {
            SVG.o oVar5 = k0Var.m;
            float d2 = oVar5 != null ? oVar5.d(this, 1.0f) : 0.0f;
            SVG.o oVar6 = k0Var.n;
            float d3 = oVar6 != null ? oVar6.d(this, 1.0f) : 0.0f;
            SVG.o oVar7 = k0Var.o;
            float d4 = oVar7 != null ? oVar7.d(this, 1.0f) : 1.0f;
            SVG.o oVar8 = k0Var.p;
            f2 = d2;
            d = oVar8 != null ? oVar8.d(this, 1.0f) : 0.0f;
            f3 = d3;
            f4 = d4;
        }
        S0();
        this.d = M(k0Var);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(bVar.a, bVar.b);
            matrix.preScale(bVar.c, bVar.d);
        }
        Matrix matrix2 = k0Var.j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = k0Var.h.size();
        if (size == 0) {
            R0();
            if (z) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it2 = k0Var.h.iterator();
        float f6 = -1.0f;
        while (it2.hasNext()) {
            SVG.c0 c0Var = (SVG.c0) ((SVG.l0) it2.next());
            Float f7 = c0Var.h;
            float floatValue = f7 != null ? f7.floatValue() : 0.0f;
            if (i2 == 0 || floatValue >= f6) {
                fArr[i2] = floatValue;
                f6 = floatValue;
            } else {
                fArr[i2] = f6;
            }
            S0();
            W0(this.d, c0Var);
            SVG.Style style = this.d.a;
            SVG.f fVar = (SVG.f) style.X;
            if (fVar == null) {
                fVar = SVG.f.b;
            }
            iArr[i2] = x(fVar.a, style.Y.floatValue());
            i2++;
            R0();
        }
        if ((f2 == f4 && f3 == d) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = k0Var.k;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        LinearGradient linearGradient = new LinearGradient(f2, f3, f4, d, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.d.a.d.floatValue()));
    }

    private void X0() {
        int i2;
        SVG.Style style = this.d.a;
        SVG.m0 m0Var = style.i0;
        if (m0Var instanceof SVG.f) {
            i2 = ((SVG.f) m0Var).a;
        } else if (!(m0Var instanceof SVG.g)) {
            return;
        } else {
            i2 = style.n.a;
        }
        Float f2 = style.j0;
        if (f2 != null) {
            i2 = x(i2, f2.floatValue());
        }
        this.a.drawColor(i2);
    }

    private Path Y(SVG.d dVar) {
        SVG.o oVar = dVar.o;
        float e2 = oVar != null ? oVar.e(this) : 0.0f;
        SVG.o oVar2 = dVar.p;
        float f2 = oVar2 != null ? oVar2.f(this) : 0.0f;
        float c2 = dVar.q.c(this);
        float f3 = e2 - c2;
        float f4 = f2 - c2;
        float f5 = e2 + c2;
        float f6 = f2 + c2;
        if (dVar.h == null) {
            float f7 = 2.0f * c2;
            dVar.h = new SVG.b(f3, f4, f7, f7);
        }
        float f8 = c2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(e2, f4);
        float f9 = e2 + f8;
        float f10 = f2 - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f2 + f8;
        path.cubicTo(f5, f11, f9, f6, e2, f6);
        float f12 = e2 - f8;
        path.cubicTo(f12, f6, f3, f11, f3, f2);
        path.cubicTo(f3, f10, f12, f4, e2, f4);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Y0() {
        Boolean bool = this.d.a.S;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private Path Z(SVG.i iVar) {
        SVG.o oVar = iVar.o;
        float e2 = oVar != null ? oVar.e(this) : 0.0f;
        SVG.o oVar2 = iVar.p;
        float f2 = oVar2 != null ? oVar2.f(this) : 0.0f;
        float e3 = iVar.q.e(this);
        float f3 = iVar.r.f(this);
        float f4 = e2 - e3;
        float f5 = f2 - f3;
        float f6 = e2 + e3;
        float f7 = f2 + f3;
        if (iVar.h == null) {
            iVar.h = new SVG.b(f4, f5, e3 * 2.0f, 2.0f * f3);
        }
        float f8 = e3 * 0.5522848f;
        float f9 = f3 * 0.5522848f;
        Path path = new Path();
        path.moveTo(e2, f5);
        float f10 = e2 + f8;
        float f11 = f2 - f9;
        path.cubicTo(f10, f5, f6, f11, f6, f2);
        float f12 = f9 + f2;
        path.cubicTo(f6, f12, f10, f7, e2, f7);
        float f13 = e2 - f8;
        path.cubicTo(f13, f7, f4, f12, f4, f2);
        path.cubicTo(f4, f11, f13, f5, e2, f5);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private Path a0(SVG.p pVar) {
        SVG.o oVar = pVar.o;
        float e2 = oVar == null ? 0.0f : oVar.e(this);
        SVG.o oVar2 = pVar.p;
        float f2 = oVar2 == null ? 0.0f : oVar2.f(this);
        SVG.o oVar3 = pVar.q;
        float e3 = oVar3 == null ? 0.0f : oVar3.e(this);
        SVG.o oVar4 = pVar.r;
        float f3 = oVar4 != null ? oVar4.f(this) : 0.0f;
        if (pVar.h == null) {
            pVar.h = new SVG.b(Math.min(e2, e3), Math.min(f2, f3), Math.abs(e3 - e2), Math.abs(f3 - f2));
        }
        Path path = new Path();
        path.moveTo(e2, f2);
        path.lineTo(e3, f3);
        return path;
    }

    private Path b0(SVG.y yVar) {
        Path path = new Path();
        float[] fArr = yVar.o;
        path.moveTo(fArr[0], fArr[1]);
        int i2 = 2;
        while (true) {
            float[] fArr2 = yVar.o;
            if (i2 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i2], fArr2[i2 + 1]);
            i2 += 2;
        }
        if (yVar instanceof SVG.z) {
            path.close();
        }
        if (yVar.h == null) {
            yVar.h = m(path);
        }
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Path c0(com.caverock.androidsvg.SVG.a0 r23) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.d.c0(com.caverock.androidsvg.SVG$a0):android.graphics.Path");
    }

    private Path d0(SVG.u0 u0Var) {
        List list = u0Var.o;
        float f2 = 0.0f;
        float e2 = (list == null || list.size() == 0) ? 0.0f : ((SVG.o) u0Var.o.get(0)).e(this);
        List list2 = u0Var.p;
        float f3 = (list2 == null || list2.size() == 0) ? 0.0f : ((SVG.o) u0Var.p.get(0)).f(this);
        List list3 = u0Var.q;
        float e3 = (list3 == null || list3.size() == 0) ? 0.0f : ((SVG.o) u0Var.q.get(0)).e(this);
        List list4 = u0Var.r;
        if (list4 != null && list4.size() != 0) {
            f2 = ((SVG.o) u0Var.r.get(0)).f(this);
        }
        if (this.d.a.y != SVG.Style.TextAnchor.Start) {
            float n = n(u0Var);
            if (this.d.a.y == SVG.Style.TextAnchor.Middle) {
                n /= 2.0f;
            }
            e2 -= n;
        }
        if (u0Var.h == null) {
            i iVar = new i(e2, f3);
            E(u0Var, iVar);
            RectF rectF = iVar.d;
            u0Var.h = new SVG.b(rectF.left, rectF.top, rectF.width(), iVar.d.height());
        }
        Path path = new Path();
        E(u0Var, new g(e2 + e3, f3 + f2, path));
        return path;
    }

    private void e0(boolean z, SVG.b bVar, SVG.o0 o0Var) {
        float f2;
        float d;
        float f3;
        String str = o0Var.l;
        if (str != null) {
            H(o0Var, str);
        }
        Boolean bool = o0Var.i;
        int i2 = 0;
        boolean z2 = bool != null && bool.booleanValue();
        h hVar = this.d;
        Paint paint = z ? hVar.d : hVar.e;
        if (z2) {
            SVG.o oVar = new SVG.o(50.0f, SVG.Unit.percent);
            SVG.o oVar2 = o0Var.m;
            float e2 = oVar2 != null ? oVar2.e(this) : oVar.e(this);
            SVG.o oVar3 = o0Var.n;
            float f4 = oVar3 != null ? oVar3.f(this) : oVar.f(this);
            SVG.o oVar4 = o0Var.o;
            d = oVar4 != null ? oVar4.c(this) : oVar.c(this);
            f2 = e2;
            f3 = f4;
        } else {
            SVG.o oVar5 = o0Var.m;
            float d2 = oVar5 != null ? oVar5.d(this, 1.0f) : 0.5f;
            SVG.o oVar6 = o0Var.n;
            float d3 = oVar6 != null ? oVar6.d(this, 1.0f) : 0.5f;
            SVG.o oVar7 = o0Var.o;
            f2 = d2;
            d = oVar7 != null ? oVar7.d(this, 1.0f) : 0.5f;
            f3 = d3;
        }
        S0();
        this.d = M(o0Var);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(bVar.a, bVar.b);
            matrix.preScale(bVar.c, bVar.d);
        }
        Matrix matrix2 = o0Var.j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = o0Var.h.size();
        if (size == 0) {
            R0();
            if (z) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it2 = o0Var.h.iterator();
        float f5 = -1.0f;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SVG.c0 c0Var = (SVG.c0) ((SVG.l0) it2.next());
            Float f6 = c0Var.h;
            float floatValue = f6 != null ? f6.floatValue() : 0.0f;
            if (i2 == 0 || floatValue >= f5) {
                fArr[i2] = floatValue;
                f5 = floatValue;
            } else {
                fArr[i2] = f5;
            }
            S0();
            W0(this.d, c0Var);
            SVG.Style style = this.d.a;
            SVG.f fVar = (SVG.f) style.X;
            if (fVar == null) {
                fVar = SVG.f.b;
            }
            iArr[i2] = x(fVar.a, style.Y.floatValue());
            i2++;
            R0();
        }
        if (d == 0.0f || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = o0Var.k;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        RadialGradient radialGradient = new RadialGradient(f2, f3, d, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.d.a.d.floatValue()));
    }

    private SVG.b f0(SVG.o oVar, SVG.o oVar2, SVG.o oVar3, SVG.o oVar4) {
        float e2 = oVar != null ? oVar.e(this) : 0.0f;
        float f2 = oVar2 != null ? oVar2.f(this) : 0.0f;
        SVG.b S = S();
        return new SVG.b(e2, f2, oVar3 != null ? oVar3.e(this) : S.c, oVar4 != null ? oVar4.f(this) : S.d);
    }

    private Path g0(SVG.i0 i0Var, boolean z) {
        Path d0;
        Path j2;
        this.e.push(this.d);
        h hVar = new h(this.d);
        this.d = hVar;
        W0(hVar, i0Var);
        if (!A() || !Y0()) {
            this.d = (h) this.e.pop();
            return null;
        }
        if (i0Var instanceof SVG.b1) {
            if (!z) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG.b1 b1Var = (SVG.b1) i0Var;
            SVG.l0 p = i0Var.a.p(b1Var.p);
            if (p == null) {
                F("Use reference '%s' not found", b1Var.p);
                this.d = (h) this.e.pop();
                return null;
            }
            if (!(p instanceof SVG.i0)) {
                this.d = (h) this.e.pop();
                return null;
            }
            d0 = g0((SVG.i0) p, false);
            if (d0 == null) {
                return null;
            }
            if (b1Var.h == null) {
                b1Var.h = m(d0);
            }
            Matrix matrix = b1Var.o;
            if (matrix != null) {
                d0.transform(matrix);
            }
        } else if (i0Var instanceof SVG.k) {
            SVG.k kVar = (SVG.k) i0Var;
            if (i0Var instanceof SVG.u) {
                d0 = new C0152d(((SVG.u) i0Var).o).c();
                if (i0Var.h == null) {
                    i0Var.h = m(d0);
                }
            } else {
                d0 = i0Var instanceof SVG.a0 ? c0((SVG.a0) i0Var) : i0Var instanceof SVG.d ? Y((SVG.d) i0Var) : i0Var instanceof SVG.i ? Z((SVG.i) i0Var) : i0Var instanceof SVG.y ? b0((SVG.y) i0Var) : null;
            }
            if (d0 == null) {
                return null;
            }
            if (kVar.h == null) {
                kVar.h = m(d0);
            }
            Matrix matrix2 = kVar.n;
            if (matrix2 != null) {
                d0.transform(matrix2);
            }
            d0.setFillType(P());
        } else {
            if (!(i0Var instanceof SVG.u0)) {
                F("Invalid %s element found in clipPath definition", i0Var.m());
                return null;
            }
            SVG.u0 u0Var = (SVG.u0) i0Var;
            d0 = d0(u0Var);
            if (d0 == null) {
                return null;
            }
            Matrix matrix3 = u0Var.s;
            if (matrix3 != null) {
                d0.transform(matrix3);
            }
            d0.setFillType(P());
        }
        if (this.d.a.Z != null && (j2 = j(i0Var, i0Var.h)) != null) {
            d0.op(j2, Path.Op.INTERSECT);
        }
        this.d = (h) this.e.pop();
        return d0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, float f7, float f8, SVG.w wVar) {
        float f9;
        SVG.w wVar2;
        if (f2 == f7 && f3 == f8) {
            return;
        }
        if (f4 == 0.0f) {
            f9 = f7;
            wVar2 = wVar;
        } else {
            if (f5 != 0.0f) {
                float abs = Math.abs(f4);
                float abs2 = Math.abs(f5);
                double radians = Math.toRadians(f6 % 360.0d);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d = (f2 - f7) / 2.0d;
                double d2 = (f3 - f8) / 2.0d;
                double d3 = (cos * d) + (sin * d2);
                double d4 = ((-sin) * d) + (d2 * cos);
                double d5 = abs * abs;
                double d6 = abs2 * abs2;
                double d7 = d3 * d3;
                double d8 = d4 * d4;
                double d9 = (d7 / d5) + (d8 / d6);
                if (d9 > 0.99999d) {
                    double sqrt = Math.sqrt(d9) * 1.00001d;
                    abs = (float) (abs * sqrt);
                    abs2 = (float) (sqrt * abs2);
                    d5 = abs * abs;
                    d6 = abs2 * abs2;
                }
                double d10 = z == z2 ? -1.0d : 1.0d;
                double d11 = d5 * d6;
                double d12 = d5 * d8;
                double d13 = d6 * d7;
                double d14 = ((d11 - d12) - d13) / (d12 + d13);
                if (d14 < 0.0d) {
                    d14 = 0.0d;
                }
                double sqrt2 = d10 * Math.sqrt(d14);
                double d15 = abs;
                double d16 = abs2;
                double d17 = ((d15 * d4) / d16) * sqrt2;
                float f10 = abs;
                float f11 = abs2;
                double d18 = sqrt2 * (-((d16 * d3) / d15));
                double d19 = ((f2 + f7) / 2.0d) + ((cos * d17) - (sin * d18));
                double d20 = ((f3 + f8) / 2.0d) + (sin * d17) + (cos * d18);
                double d21 = (d3 - d17) / d15;
                double d22 = (d4 - d18) / d16;
                double d23 = ((-d3) - d17) / d15;
                double d24 = ((-d4) - d18) / d16;
                double d25 = (d21 * d21) + (d22 * d22);
                double acos = (d22 < 0.0d ? -1.0d : 1.0d) * Math.acos(d21 / Math.sqrt(d25));
                double v = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * v(((d21 * d23) + (d22 * d24)) / Math.sqrt(d25 * ((d23 * d23) + (d24 * d24))));
                if (!z2 && v > 0.0d) {
                    v -= 6.283185307179586d;
                } else if (z2 && v < 0.0d) {
                    v += 6.283185307179586d;
                }
                float[] i2 = i(acos % 6.283185307179586d, v % 6.283185307179586d);
                Matrix matrix = new Matrix();
                matrix.postScale(f10, f11);
                matrix.postRotate(f6);
                matrix.postTranslate((float) d19, (float) d20);
                matrix.mapPoints(i2);
                i2[i2.length - 2] = f7;
                i2[i2.length - 1] = f8;
                for (int i3 = 0; i3 < i2.length; i3 += 6) {
                    wVar.s(i2[i3], i2[i3 + 1], i2[i3 + 2], i2[i3 + 3], i2[i3 + 4], i2[i3 + 5]);
                }
                return;
            }
            wVar2 = wVar;
            f9 = f7;
        }
        wVar2.t(f9, f8);
    }

    private void h0() {
        this.f.pop();
        this.g.pop();
    }

    private static float[] i(double d, double d2) {
        int ceil = (int) Math.ceil((Math.abs(d2) * 2.0d) / 3.141592653589793d);
        double d3 = d2 / ceil;
        double d4 = d3 / 2.0d;
        double sin = (Math.sin(d4) * 1.3333333333333333d) / (Math.cos(d4) + 1.0d);
        float[] fArr = new float[ceil * 6];
        int i2 = 0;
        int i3 = 0;
        while (i2 < ceil) {
            double d5 = d + (i2 * d3);
            double cos = Math.cos(d5);
            double sin2 = Math.sin(d5);
            double d6 = d3;
            fArr[i3] = (float) (cos - (sin * sin2));
            fArr[i3 + 1] = (float) (sin2 + (cos * sin));
            double d7 = d5 + d6;
            double cos2 = Math.cos(d7);
            double sin3 = Math.sin(d7);
            fArr[i3 + 2] = (float) ((sin * sin3) + cos2);
            fArr[i3 + 3] = (float) (sin3 - (sin * cos2));
            int i4 = i3 + 5;
            fArr[i3 + 4] = (float) cos2;
            i3 += 6;
            fArr[i4] = (float) sin3;
            i2++;
            d3 = d6;
        }
        return fArr;
    }

    private void i0(SVG.h0 h0Var) {
        this.f.push(h0Var);
        this.g.push(this.a.getMatrix());
    }

    private Path j(SVG.i0 i0Var, SVG.b bVar) {
        Path g0;
        SVG.l0 p = i0Var.a.p(this.d.a.Z);
        if (p == null) {
            F("ClipPath reference '%s' not found", this.d.a.Z);
            return null;
        }
        SVG.e eVar = (SVG.e) p;
        this.e.push(this.d);
        this.d = M(eVar);
        Boolean bool = eVar.p;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(bVar.a, bVar.b);
            matrix.preScale(bVar.c, bVar.d);
        }
        Matrix matrix2 = eVar.o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVG.l0 l0Var : eVar.i) {
            if ((l0Var instanceof SVG.i0) && (g0 = g0((SVG.i0) l0Var, true)) != null) {
                path.op(g0, Path.Op.UNION);
            }
        }
        if (this.d.a.Z != null) {
            if (eVar.h == null) {
                eVar.h = m(path);
            }
            Path j2 = j(eVar, eVar.h);
            if (j2 != null) {
                path.op(j2, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.d = (h) this.e.pop();
        return path;
    }

    private void j0(SVG.i0 i0Var) {
        k0(i0Var, i0Var.h);
    }

    private List k(SVG.p pVar) {
        SVG.o oVar = pVar.o;
        float e2 = oVar != null ? oVar.e(this) : 0.0f;
        SVG.o oVar2 = pVar.p;
        float f2 = oVar2 != null ? oVar2.f(this) : 0.0f;
        SVG.o oVar3 = pVar.q;
        float e3 = oVar3 != null ? oVar3.e(this) : 0.0f;
        SVG.o oVar4 = pVar.r;
        float f3 = oVar4 != null ? oVar4.f(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f4 = e3 - e2;
        float f5 = f3 - f2;
        arrayList.add(new c(e2, f2, f4, f5));
        arrayList.add(new c(e3, f3, f4, f5));
        return arrayList;
    }

    private void k0(SVG.i0 i0Var, SVG.b bVar) {
        if (this.d.a.f0 != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.a.saveLayer(null, paint2, 31);
            SVG.r rVar = (SVG.r) this.c.p(this.d.a.f0);
            J0(rVar, i0Var, bVar);
            this.a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.a.saveLayer(null, paint3, 31);
            J0(rVar, i0Var, bVar);
            this.a.restore();
            this.a.restore();
        }
        R0();
    }

    private List l(SVG.y yVar) {
        int length = yVar.o.length;
        int i2 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = yVar.o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i2 < length) {
            float[] fArr2 = yVar.o;
            float f4 = fArr2[i2];
            float f5 = fArr2[i2 + 1];
            cVar.a(f4, f5);
            arrayList.add(cVar);
            i2 += 2;
            cVar = new c(f4, f5, f4 - cVar.a, f5 - cVar.b);
            f3 = f5;
            f2 = f4;
        }
        if (yVar instanceof SVG.z) {
            float[] fArr3 = yVar.o;
            float f6 = fArr3[0];
            if (f2 != f6) {
                float f7 = fArr3[1];
                if (f3 != f7) {
                    cVar.a(f6, f7);
                    arrayList.add(cVar);
                    c cVar2 = new c(f6, f7, f6 - cVar.a, f7 - cVar.b);
                    cVar2.b((c) arrayList.get(0));
                    arrayList.add(cVar2);
                    arrayList.set(0, cVar2);
                }
            }
        } else {
            arrayList.add(cVar);
        }
        return arrayList;
    }

    private void l0(SVG.l0 l0Var, j jVar) {
        float f2;
        float f3;
        float f4;
        SVG.Style.TextAnchor O;
        if (jVar.a((SVG.w0) l0Var)) {
            if (l0Var instanceof SVG.x0) {
                S0();
                L0((SVG.x0) l0Var);
                R0();
                return;
            }
            if (!(l0Var instanceof SVG.t0)) {
                if (l0Var instanceof SVG.s0) {
                    S0();
                    SVG.s0 s0Var = (SVG.s0) l0Var;
                    W0(this.d, s0Var);
                    if (A()) {
                        r((SVG.i0) s0Var.d());
                        SVG.l0 p = l0Var.a.p(s0Var.o);
                        if (p == null || !(p instanceof SVG.w0)) {
                            F("Tref reference '%s' not found", s0Var.o);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            G((SVG.w0) p, sb);
                            if (sb.length() > 0) {
                                jVar.b(sb.toString());
                            }
                        }
                    }
                    R0();
                    return;
                }
                return;
            }
            y("TSpan render", new Object[0]);
            S0();
            SVG.t0 t0Var = (SVG.t0) l0Var;
            W0(this.d, t0Var);
            if (A()) {
                List list = t0Var.o;
                boolean z = list != null && list.size() > 0;
                boolean z2 = jVar instanceof f;
                float f5 = 0.0f;
                if (z2) {
                    float e2 = !z ? ((f) jVar).b : ((SVG.o) t0Var.o.get(0)).e(this);
                    List list2 = t0Var.p;
                    f3 = (list2 == null || list2.size() == 0) ? ((f) jVar).c : ((SVG.o) t0Var.p.get(0)).f(this);
                    List list3 = t0Var.q;
                    f4 = (list3 == null || list3.size() == 0) ? 0.0f : ((SVG.o) t0Var.q.get(0)).e(this);
                    List list4 = t0Var.r;
                    if (list4 != null && list4.size() != 0) {
                        f5 = ((SVG.o) t0Var.r.get(0)).f(this);
                    }
                    f2 = f5;
                    f5 = e2;
                } else {
                    f2 = 0.0f;
                    f3 = 0.0f;
                    f4 = 0.0f;
                }
                if (z && (O = O()) != SVG.Style.TextAnchor.Start) {
                    float n = n(t0Var);
                    if (O == SVG.Style.TextAnchor.Middle) {
                        n /= 2.0f;
                    }
                    f5 -= n;
                }
                r((SVG.i0) t0Var.d());
                if (z2) {
                    f fVar = (f) jVar;
                    fVar.b = f5 + f4;
                    fVar.c = f3 + f2;
                }
                boolean m0 = m0();
                E(t0Var, jVar);
                if (m0) {
                    j0(t0Var);
                }
            }
            R0();
        }
    }

    private SVG.b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private boolean m0() {
        SVG.l0 p;
        if (!M0()) {
            return false;
        }
        this.a.saveLayerAlpha(null, w(this.d.a.m.floatValue()), 31);
        this.e.push(this.d);
        h hVar = new h(this.d);
        this.d = hVar;
        String str = hVar.a.f0;
        if (str != null && ((p = this.c.p(str)) == null || !(p instanceof SVG.r))) {
            F("Mask reference '%s' not found", this.d.a.f0);
            this.d.a.f0 = null;
        }
        return true;
    }

    private float n(SVG.w0 w0Var) {
        k kVar = new k(this, null);
        E(w0Var, kVar);
        return kVar.b;
    }

    private c n0(c cVar, c cVar2, c cVar3) {
        float D = D(cVar2.c, cVar2.d, cVar2.a - cVar.a, cVar2.b - cVar.b);
        if (D == 0.0f) {
            D = D(cVar2.c, cVar2.d, cVar3.a - cVar2.a, cVar3.b - cVar2.b);
        }
        if (D > 0.0f) {
            return cVar2;
        }
        if (D == 0.0f && (cVar2.c > 0.0f || cVar2.d >= 0.0f)) {
            return cVar2;
        }
        cVar2.c = -cVar2.c;
        cVar2.d = -cVar2.d;
        return cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r11 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Matrix o(com.caverock.androidsvg.SVG.b r9, com.caverock.androidsvg.SVG.b r10, com.caverock.androidsvg.PreserveAspectRatio r11) {
        /*
            r8 = this;
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            if (r11 == 0) goto L9d
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r0 = r11.a()
            if (r0 != 0) goto Lf
            goto L9d
        Lf:
            float r0 = r9.c
            float r1 = r10.c
            float r0 = r0 / r1
            float r1 = r9.d
            float r2 = r10.d
            float r1 = r1 / r2
            float r2 = r10.a
            float r2 = -r2
            float r3 = r10.b
            float r3 = -r3
            com.caverock.androidsvg.PreserveAspectRatio r4 = com.caverock.androidsvg.PreserveAspectRatio.d
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L35
            float r10 = r9.a
            float r9 = r9.b
            r8.preTranslate(r10, r9)
            r8.preScale(r0, r1)
            r8.preTranslate(r2, r3)
            return r8
        L35:
            com.caverock.androidsvg.PreserveAspectRatio$Scale r4 = r11.b()
            com.caverock.androidsvg.PreserveAspectRatio$Scale r5 = com.caverock.androidsvg.PreserveAspectRatio.Scale.slice
            if (r4 != r5) goto L42
            float r0 = java.lang.Math.max(r0, r1)
            goto L46
        L42:
            float r0 = java.lang.Math.min(r0, r1)
        L46:
            float r1 = r9.c
            float r1 = r1 / r0
            float r4 = r9.d
            float r4 = r4 / r0
            int[] r5 = com.caverock.androidsvg.d.a.a
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r6 = r11.a()
            int r6 = r6.ordinal()
            r6 = r5[r6]
            r7 = 1073741824(0x40000000, float:2.0)
            switch(r6) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r6 = r10.c
            float r6 = r6 - r1
        L61:
            float r2 = r2 - r6
            goto L68
        L63:
            float r6 = r10.c
            float r6 = r6 - r1
            float r6 = r6 / r7
            goto L61
        L68:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r11 = r11.a()
            int r11 = r11.ordinal()
            r11 = r5[r11]
            r1 = 2
            if (r11 == r1) goto L8b
            r1 = 3
            if (r11 == r1) goto L86
            r1 = 5
            if (r11 == r1) goto L8b
            r1 = 6
            if (r11 == r1) goto L86
            r1 = 7
            if (r11 == r1) goto L8b
            r1 = 8
            if (r11 == r1) goto L86
            goto L90
        L86:
            float r10 = r10.d
            float r10 = r10 - r4
        L89:
            float r3 = r3 - r10
            goto L90
        L8b:
            float r10 = r10.d
            float r10 = r10 - r4
            float r10 = r10 / r7
            goto L89
        L90:
            float r10 = r9.a
            float r9 = r9.b
            r8.preTranslate(r10, r9)
            r8.preScale(r0, r0)
            r8.preTranslate(r2, r3)
        L9d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.d.o(com.caverock.androidsvg.SVG$b, com.caverock.androidsvg.SVG$b, com.caverock.androidsvg.PreserveAspectRatio):android.graphics.Matrix");
    }

    private void o0(SVG.d dVar) {
        y("Circle render", new Object[0]);
        SVG.o oVar = dVar.q;
        if (oVar == null || oVar.h()) {
            return;
        }
        W0(this.d, dVar);
        if (A() && Y0()) {
            Matrix matrix = dVar.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path Y = Y(dVar);
            U0(dVar);
            r(dVar);
            p(dVar);
            boolean m0 = m0();
            if (this.d.b) {
                B(dVar, Y);
            }
            if (this.d.c) {
                C(Y);
            }
            if (m0) {
                j0(dVar);
            }
        }
    }

    private void p(SVG.i0 i0Var) {
        q(i0Var, i0Var.h);
    }

    private void p0(SVG.i iVar) {
        y("Ellipse render", new Object[0]);
        SVG.o oVar = iVar.q;
        if (oVar == null || iVar.r == null || oVar.h() || iVar.r.h()) {
            return;
        }
        W0(this.d, iVar);
        if (A() && Y0()) {
            Matrix matrix = iVar.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path Z = Z(iVar);
            U0(iVar);
            r(iVar);
            p(iVar);
            boolean m0 = m0();
            if (this.d.b) {
                B(iVar, Z);
            }
            if (this.d.c) {
                C(Z);
            }
            if (m0) {
                j0(iVar);
            }
        }
    }

    private void q(SVG.i0 i0Var, SVG.b bVar) {
        Path j2;
        if (this.d.a.Z == null || (j2 = j(i0Var, bVar)) == null) {
            return;
        }
        this.a.clipPath(j2);
    }

    private void q0(SVG.l lVar) {
        y("Group render", new Object[0]);
        W0(this.d, lVar);
        if (A()) {
            Matrix matrix = lVar.o;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            p(lVar);
            boolean m0 = m0();
            F0(lVar, true);
            if (m0) {
                j0(lVar);
            }
            U0(lVar);
        }
    }

    private void r(SVG.i0 i0Var) {
        SVG.m0 m0Var = this.d.a.b;
        if (m0Var instanceof SVG.t) {
            z(true, i0Var.h, (SVG.t) m0Var);
        }
        SVG.m0 m0Var2 = this.d.a.e;
        if (m0Var2 instanceof SVG.t) {
            z(false, i0Var.h, (SVG.t) m0Var2);
        }
    }

    private void r0(SVG.n nVar) {
        SVG.o oVar;
        String str;
        y("Image render", new Object[0]);
        SVG.o oVar2 = nVar.s;
        if (oVar2 == null || oVar2.h() || (oVar = nVar.t) == null || oVar.h() || (str = nVar.p) == null) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = nVar.o;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.e;
        }
        Bitmap s = s(str);
        if (s == null) {
            SVG.k();
            return;
        }
        SVG.b bVar = new SVG.b(0.0f, 0.0f, s.getWidth(), s.getHeight());
        W0(this.d, nVar);
        if (A() && Y0()) {
            Matrix matrix = nVar.u;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            SVG.o oVar3 = nVar.q;
            float e2 = oVar3 != null ? oVar3.e(this) : 0.0f;
            SVG.o oVar4 = nVar.r;
            this.d.f = new SVG.b(e2, oVar4 != null ? oVar4.f(this) : 0.0f, nVar.s.e(this), nVar.t.e(this));
            if (!this.d.a.B.booleanValue()) {
                SVG.b bVar2 = this.d.f;
                O0(bVar2.a, bVar2.b, bVar2.c, bVar2.d);
            }
            nVar.h = this.d.f;
            U0(nVar);
            p(nVar);
            boolean m0 = m0();
            X0();
            this.a.save();
            this.a.concat(o(this.d.f, bVar, preserveAspectRatio));
            this.a.drawBitmap(s, 0.0f, 0.0f, new Paint(this.d.a.l0 != SVG.Style.RenderQuality.optimizeSpeed ? 2 : 0));
            this.a.restore();
            if (m0) {
                j0(nVar);
            }
        }
    }

    private Bitmap s(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e2) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e2);
            return null;
        }
    }

    private void s0(SVG.p pVar) {
        y("Line render", new Object[0]);
        W0(this.d, pVar);
        if (A() && Y0() && this.d.c) {
            Matrix matrix = pVar.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path a0 = a0(pVar);
            U0(pVar);
            r(pVar);
            p(pVar);
            boolean m0 = m0();
            C(a0);
            I0(pVar);
            if (m0) {
                j0(pVar);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r5.equals("fantasy") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Typeface t(java.lang.String r5, java.lang.Integer r6, com.caverock.androidsvg.SVG.Style.FontStyle r7) {
        /*
            r4 = this;
            r4 = 2
            r0 = 3
            com.caverock.androidsvg.SVG$Style$FontStyle r1 = com.caverock.androidsvg.SVG.Style.FontStyle.Italic
            r2 = 0
            r3 = 1
            if (r7 != r1) goto La
            r7 = r3
            goto Lb
        La:
            r7 = r2
        Lb:
            int r6 = r6.intValue()
            r1 = 500(0x1f4, float:7.0E-43)
            if (r6 <= r1) goto L19
            if (r7 == 0) goto L17
            r6 = r0
            goto L1e
        L17:
            r6 = r3
            goto L1e
        L19:
            if (r7 == 0) goto L1d
            r6 = r4
            goto L1e
        L1d:
            r6 = r2
        L1e:
            r5.hashCode()
            r7 = -1
            int r1 = r5.hashCode()
            switch(r1) {
                case -1536685117: goto L55;
                case -1431958525: goto L4a;
                case -1081737434: goto L41;
                case 109326717: goto L36;
                case 1126973893: goto L2b;
                default: goto L29;
            }
        L29:
            r4 = r7
            goto L5f
        L2b:
            java.lang.String r4 = "cursive"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L34
            goto L29
        L34:
            r4 = 4
            goto L5f
        L36:
            java.lang.String r4 = "serif"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L3f
            goto L29
        L3f:
            r4 = r0
            goto L5f
        L41:
            java.lang.String r0 = "fantasy"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5f
            goto L29
        L4a:
            java.lang.String r4 = "monospace"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L53
            goto L29
        L53:
            r4 = r3
            goto L5f
        L55:
            java.lang.String r4 = "sans-serif"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L5e
            goto L29
        L5e:
            r4 = r2
        L5f:
            switch(r4) {
                case 0: goto L80;
                case 1: goto L79;
                case 2: goto L72;
                case 3: goto L6b;
                case 4: goto L64;
                default: goto L62;
            }
        L62:
            r4 = 0
            goto L86
        L64:
            android.graphics.Typeface r4 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r6)
            goto L86
        L6b:
            android.graphics.Typeface r4 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r6)
            goto L86
        L72:
            android.graphics.Typeface r4 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r6)
            goto L86
        L79:
            android.graphics.Typeface r4 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r6)
            goto L86
        L80:
            android.graphics.Typeface r4 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r6)
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.d.t(java.lang.String, java.lang.Integer, com.caverock.androidsvg.SVG$Style$FontStyle):android.graphics.Typeface");
    }

    private void t0(SVG.u uVar) {
        y("Path render", new Object[0]);
        if (uVar.o == null) {
            return;
        }
        W0(this.d, uVar);
        if (A() && Y0()) {
            h hVar = this.d;
            if (hVar.c || hVar.b) {
                Matrix matrix = uVar.n;
                if (matrix != null) {
                    this.a.concat(matrix);
                }
                Path c2 = new C0152d(uVar.o).c();
                if (uVar.h == null) {
                    uVar.h = m(c2);
                }
                U0(uVar);
                r(uVar);
                p(uVar);
                boolean m0 = m0();
                if (this.d.b) {
                    c2.setFillType(U());
                    B(uVar, c2);
                }
                if (this.d.c) {
                    C(c2);
                }
                I0(uVar);
                if (m0) {
                    j0(uVar);
                }
            }
        }
    }

    private void u(SVG.l0 l0Var) {
        Boolean bool;
        if ((l0Var instanceof SVG.j0) && (bool = ((SVG.j0) l0Var).d) != null) {
            this.d.h = bool.booleanValue();
        }
    }

    private void u0(SVG.y yVar) {
        y("PolyLine render", new Object[0]);
        W0(this.d, yVar);
        if (A() && Y0()) {
            h hVar = this.d;
            if (hVar.c || hVar.b) {
                Matrix matrix = yVar.n;
                if (matrix != null) {
                    this.a.concat(matrix);
                }
                if (yVar.o.length < 2) {
                    return;
                }
                Path b0 = b0(yVar);
                U0(yVar);
                b0.setFillType(U());
                r(yVar);
                p(yVar);
                boolean m0 = m0();
                if (this.d.b) {
                    B(yVar, b0);
                }
                if (this.d.c) {
                    C(b0);
                }
                I0(yVar);
                if (m0) {
                    j0(yVar);
                }
            }
        }
    }

    private static double v(double d) {
        if (d < -1.0d) {
            return 3.141592653589793d;
        }
        if (d > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d);
    }

    private void v0(SVG.z zVar) {
        y("Polygon render", new Object[0]);
        W0(this.d, zVar);
        if (A() && Y0()) {
            h hVar = this.d;
            if (hVar.c || hVar.b) {
                Matrix matrix = zVar.n;
                if (matrix != null) {
                    this.a.concat(matrix);
                }
                if (zVar.o.length < 2) {
                    return;
                }
                Path b0 = b0(zVar);
                U0(zVar);
                r(zVar);
                p(zVar);
                boolean m0 = m0();
                if (this.d.b) {
                    B(zVar, b0);
                }
                if (this.d.c) {
                    C(b0);
                }
                I0(zVar);
                if (m0) {
                    j0(zVar);
                }
            }
        }
    }

    private static int w(float f2) {
        int i2 = (int) (f2 * 256.0f);
        if (i2 < 0) {
            return 0;
        }
        if (i2 > 255) {
            return 255;
        }
        return i2;
    }

    private void w0(SVG.a0 a0Var) {
        y("Rect render", new Object[0]);
        SVG.o oVar = a0Var.q;
        if (oVar == null || a0Var.r == null || oVar.h() || a0Var.r.h()) {
            return;
        }
        W0(this.d, a0Var);
        if (A() && Y0()) {
            Matrix matrix = a0Var.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path c0 = c0(a0Var);
            U0(a0Var);
            r(a0Var);
            p(a0Var);
            boolean m0 = m0();
            if (this.d.b) {
                B(a0Var, c0);
            }
            if (this.d.c) {
                C(c0);
            }
            if (m0) {
                j0(a0Var);
            }
        }
    }

    private static int x(int i2, float f2) {
        int i3 = 255;
        int round = Math.round(((i2 >> 24) & 255) * f2);
        if (round < 0) {
            i3 = 0;
        } else if (round <= 255) {
            i3 = round;
        }
        return (i2 & 16777215) | (i3 << 24);
    }

    private void x0(SVG.d0 d0Var) {
        z0(d0Var, f0(d0Var.q, d0Var.r, d0Var.s, d0Var.t), d0Var.p, d0Var.o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(String str, Object... objArr) {
    }

    private void y0(SVG.d0 d0Var, SVG.b bVar) {
        z0(d0Var, bVar, d0Var.p, d0Var.o);
    }

    private void z(boolean z, SVG.b bVar, SVG.t tVar) {
        SVG.l0 p = this.c.p(tVar.a);
        if (p == null) {
            F("%s reference '%s' not found", z ? "Fill" : "Stroke", tVar.a);
            SVG.m0 m0Var = tVar.b;
            if (m0Var != null) {
                P0(this.d, z, m0Var);
                return;
            } else if (z) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        if (p instanceof SVG.k0) {
            X(z, bVar, (SVG.k0) p);
        } else if (p instanceof SVG.o0) {
            e0(z, bVar, (SVG.o0) p);
        } else if (p instanceof SVG.b0) {
            Q0(z, (SVG.b0) p);
        }
    }

    private void z0(SVG.d0 d0Var, SVG.b bVar, SVG.b bVar2, PreserveAspectRatio preserveAspectRatio) {
        y("Svg render", new Object[0]);
        if (bVar.c == 0.0f || bVar.d == 0.0f) {
            return;
        }
        if (preserveAspectRatio == null && (preserveAspectRatio = d0Var.o) == null) {
            preserveAspectRatio = PreserveAspectRatio.e;
        }
        W0(this.d, d0Var);
        if (A()) {
            h hVar = this.d;
            hVar.f = bVar;
            if (!hVar.a.B.booleanValue()) {
                SVG.b bVar3 = this.d.f;
                O0(bVar3.a, bVar3.b, bVar3.c, bVar3.d);
            }
            q(d0Var, this.d.f);
            if (bVar2 != null) {
                this.a.concat(o(this.d.f, bVar2, preserveAspectRatio));
                this.d.g = d0Var.p;
            } else {
                Canvas canvas = this.a;
                SVG.b bVar4 = this.d.f;
                canvas.translate(bVar4.a, bVar4.b);
            }
            boolean m0 = m0();
            X0();
            F0(d0Var, true);
            if (m0) {
                j0(d0Var);
            }
            U0(d0Var);
        }
    }

    void G0(SVG svg, com.caverock.androidsvg.c cVar) {
        SVG.b bVar;
        PreserveAspectRatio preserveAspectRatio;
        if (cVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.c = svg;
        SVG.d0 m = svg.m();
        if (m == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (cVar.e()) {
            SVG.j0 j2 = this.c.j(cVar.e);
            if (j2 == null || !(j2 instanceof SVG.c1)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", cVar.e));
                return;
            }
            SVG.c1 c1Var = (SVG.c1) j2;
            bVar = c1Var.p;
            if (bVar == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", cVar.e));
                return;
            }
            preserveAspectRatio = c1Var.o;
        } else {
            bVar = cVar.f() ? cVar.d : m.p;
            preserveAspectRatio = cVar.c() ? cVar.b : m.o;
        }
        if (cVar.b()) {
            svg.a(cVar.a);
        }
        if (cVar.d()) {
            CSSParser.m mVar = new CSSParser.m();
            this.h = mVar;
            mVar.a = svg.j(cVar.c);
        }
        N0();
        u(m);
        S0();
        SVG.b bVar2 = new SVG.b(cVar.f);
        SVG.o oVar = m.s;
        if (oVar != null) {
            bVar2.c = oVar.d(this, bVar2.c);
        }
        SVG.o oVar2 = m.t;
        if (oVar2 != null) {
            bVar2.d = oVar2.d(this, bVar2.d);
        }
        z0(m, bVar2, bVar, preserveAspectRatio);
        R0();
        if (cVar.b()) {
            svg.b();
        }
    }

    float Q() {
        return this.d.d.getTextSize();
    }

    float R() {
        return this.d.d.getTextSize() / 2.0f;
    }

    SVG.b S() {
        h hVar = this.d;
        SVG.b bVar = hVar.g;
        return bVar != null ? bVar : hVar.f;
    }

    float T() {
        return this.b;
    }

    private class k extends j {
        float b;

        private k() {
            super(d.this, null);
            this.b = 0.0f;
        }

        @Override // com.caverock.androidsvg.d.j
        public void b(String str) {
            this.b += d.this.d.d.measureText(str);
        }

        /* synthetic */ k(d dVar, a aVar) {
            this();
        }
    }

    private class h {
        SVG.Style a;
        boolean b;
        boolean c;
        Paint d;
        Paint e;
        SVG.b f;
        SVG.b g;
        boolean h;

        h() {
            Paint paint = new Paint();
            this.d = paint;
            paint.setFlags(193);
            this.d.setHinting(0);
            this.d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.e = paint3;
            paint3.setFlags(193);
            this.e.setHinting(0);
            this.e.setStyle(Paint.Style.STROKE);
            this.e.setTypeface(typeface);
            this.a = SVG.Style.a();
        }

        h(h hVar) {
            this.b = hVar.b;
            this.c = hVar.c;
            this.d = new Paint(hVar.d);
            this.e = new Paint(hVar.e);
            SVG.b bVar = hVar.f;
            if (bVar != null) {
                this.f = new SVG.b(bVar);
            }
            SVG.b bVar2 = hVar.g;
            if (bVar2 != null) {
                this.g = new SVG.b(bVar2);
            }
            this.h = hVar.h;
            try {
                this.a = (SVG.Style) hVar.a.clone();
            } catch (CloneNotSupportedException e) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
                this.a = SVG.Style.a();
            }
        }
    }
}
