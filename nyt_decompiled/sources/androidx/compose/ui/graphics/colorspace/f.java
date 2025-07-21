package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.b;
import androidx.compose.ui.graphics.colorspace.i;
import defpackage.eg9;
import defpackage.hf3;
import defpackage.wk2;
import defpackage.wn0;
import defpackage.zq3;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class f {
    public static final a g;
    private static final f h;
    private static final f i;
    private static final f j;
    private final c a;
    private final c b;
    private final c c;
    private final c d;
    private final int e;
    private final float[] f;

    public static final class a {

        /* renamed from: androidx.compose.ui.graphics.colorspace.f$a$a, reason: collision with other inner class name */
        public static final class C0058a extends f {
            C0058a(c cVar, int i) {
                super(cVar, cVar, i, null);
            }

            @Override // androidx.compose.ui.graphics.colorspace.f
            public long e(float f, float f2, float f3, float f4) {
                return wn0.a(f, f2, f3, f4, d());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(c cVar, c cVar2, int i) {
            if (!i.e(i, i.a.a())) {
                return null;
            }
            long e = cVar.e();
            b.a aVar = androidx.compose.ui.graphics.colorspace.b.a;
            boolean e2 = androidx.compose.ui.graphics.colorspace.b.e(e, aVar.b());
            boolean e3 = androidx.compose.ui.graphics.colorspace.b.e(cVar2.e(), aVar.b());
            if (e2 && e3) {
                return null;
            }
            if (!e2 && !e3) {
                return null;
            }
            if (!e2) {
                cVar = cVar2;
            }
            zq3.f(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) cVar;
            float[] c = e2 ? rgb.N().c() : hf3.a.c();
            float[] c2 = e3 ? rgb.N().c() : hf3.a.c();
            return new float[]{c[0] / c2[0], c[1] / c2[1], c[2] / c2[2]};
        }

        public final f c() {
            return f.j;
        }

        public final f d() {
            return f.h;
        }

        public final f e() {
            return f.i;
        }

        public final f f(c cVar) {
            return new C0058a(cVar, i.a.c());
        }

        private a() {
        }
    }

    public static final class b extends f {
        private final Rgb k;
        private final Rgb l;
        private final float[] m;

        public /* synthetic */ b(Rgb rgb, Rgb rgb2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i);
        }

        private final float[] f(Rgb rgb, Rgb rgb2, int i) {
            if (d.f(rgb.N(), rgb2.N())) {
                return d.k(rgb2.G(), rgb.M());
            }
            float[] M = rgb.M();
            float[] G = rgb2.G();
            float[] c = rgb.N().c();
            float[] c2 = rgb2.N().c();
            eg9 N = rgb.N();
            hf3 hf3Var = hf3.a;
            if (!d.f(N, hf3Var.b())) {
                float[] b = androidx.compose.ui.graphics.colorspace.a.b.a().b();
                float[] c3 = hf3Var.c();
                float[] copyOf = Arrays.copyOf(c3, c3.length);
                zq3.g(copyOf, "copyOf(this, size)");
                M = d.k(d.e(b, c, copyOf), rgb.M());
            }
            if (!d.f(rgb2.N(), hf3Var.b())) {
                float[] b2 = androidx.compose.ui.graphics.colorspace.a.b.a().b();
                float[] c4 = hf3Var.c();
                float[] copyOf2 = Arrays.copyOf(c4, c4.length);
                zq3.g(copyOf2, "copyOf(this, size)");
                G = d.j(d.k(d.e(b2, c2, copyOf2), rgb2.M()));
            }
            if (i.e(i, i.a.a())) {
                M = d.l(new float[]{c[0] / c2[0], c[1] / c2[1], c[2] / c2[2]}, M);
            }
            return d.k(G, M);
        }

        @Override // androidx.compose.ui.graphics.colorspace.f
        public long e(float f, float f2, float f3, float f4) {
            float a = (float) this.k.E().a(f);
            float a2 = (float) this.k.E().a(f2);
            float a3 = (float) this.k.E().a(f3);
            return wn0.a((float) this.l.I().a(d.n(this.m, a, a2, a3)), (float) this.l.I().a(d.o(this.m, a, a2, a3)), (float) this.l.I().a(d.p(this.m, a, a2, a3)), f4, this.l);
        }

        private b(Rgb rgb, Rgb rgb2, int i) {
            super(rgb, rgb2, rgb, rgb2, i, null, null);
            this.k = rgb;
            this.l = rgb2;
            this.m = f(rgb, rgb2, i);
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        a aVar = new a(defaultConstructorMarker);
        g = aVar;
        e eVar = e.a;
        h = aVar.f(eVar.w());
        Rgb w = eVar.w();
        c t = eVar.t();
        i.a aVar2 = i.a;
        i = new f(w, t, aVar2.b(), defaultConstructorMarker);
        j = new f(eVar.t(), eVar.w(), aVar2.b(), defaultConstructorMarker);
    }

    public /* synthetic */ f(c cVar, c cVar2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, i2);
    }

    public final c d() {
        return this.b;
    }

    public long e(float f, float f2, float f3, float f4) {
        long h2 = this.c.h(f, f2, f3);
        wk2 wk2Var = wk2.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (h2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (h2 & 4294967295L));
        float i2 = this.c.i(f, f2, f3);
        float[] fArr = this.f;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            i2 *= fArr[2];
        }
        float f5 = intBitsToFloat2;
        float f6 = intBitsToFloat;
        return this.d.j(f6, f5, i2, f4, this.b);
    }

    public /* synthetic */ f(c cVar, c cVar2, c cVar3, c cVar4, int i2, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, cVar3, cVar4, i2, fArr);
    }

    private f(c cVar, c cVar2, c cVar3, c cVar4, int i2, float[] fArr) {
        this.a = cVar;
        this.b = cVar2;
        this.c = cVar3;
        this.d = cVar4;
        this.e = i2;
        this.f = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private f(androidx.compose.ui.graphics.colorspace.c r13, androidx.compose.ui.graphics.colorspace.c r14, int r15) {
        /*
            r12 = this;
            long r0 = r13.e()
            androidx.compose.ui.graphics.colorspace.b$a r2 = androidx.compose.ui.graphics.colorspace.b.a
            long r3 = r2.b()
            boolean r0 = androidx.compose.ui.graphics.colorspace.b.e(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L1e
            hf3 r0 = defpackage.hf3.a
            eg9 r0 = r0.b()
            androidx.compose.ui.graphics.colorspace.c r0 = androidx.compose.ui.graphics.colorspace.d.d(r13, r0, r3, r1, r3)
            r7 = r0
            goto L1f
        L1e:
            r7 = r13
        L1f:
            long r4 = r14.e()
            long r8 = r2.b()
            boolean r0 = androidx.compose.ui.graphics.colorspace.b.e(r4, r8)
            if (r0 == 0) goto L39
            hf3 r0 = defpackage.hf3.a
            eg9 r0 = r0.b()
            androidx.compose.ui.graphics.colorspace.c r0 = androidx.compose.ui.graphics.colorspace.d.d(r14, r0, r3, r1, r3)
            r8 = r0
            goto L3a
        L39:
            r8 = r14
        L3a:
            androidx.compose.ui.graphics.colorspace.f$a r0 = androidx.compose.ui.graphics.colorspace.f.g
            float[] r10 = androidx.compose.ui.graphics.colorspace.f.a.a(r0, r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.f.<init>(androidx.compose.ui.graphics.colorspace.c, androidx.compose.ui.graphics.colorspace.c, int):void");
    }
}
