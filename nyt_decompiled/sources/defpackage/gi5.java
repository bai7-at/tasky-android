package defpackage;

import androidx.compose.runtime.RecomposeScopeImpl;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class gi5 {
    private final int a;
    private final int b;

    public static final class a extends gi5 {
        public static final a c = new a();

        private a() {
            super(1, 0, 2, null);
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            tVar.E(ji5Var.b(p.a(0)));
        }

        @Override // defpackage.gi5
        public String e(int i) {
            return p.b(i, p.a(0)) ? "distance" : super.e(i);
        }
    }

    public static final class a0 extends gi5 {
        public static final a0 c = new a0();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private a0() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.a0.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            tVar.i1(ji5Var.a(s.a(0)));
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "data" : super.f(i);
        }
    }

    public static final class b extends gi5 {
        public static final b c = new b();

        private b() {
            super(0, 2, 1, null);
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            dn3 dn3Var = (dn3) ji5Var.a(s.a(1));
            int a = dn3Var != null ? dn3Var.a() : 0;
            ej0 ej0Var = (ej0) ji5Var.a(s.a(0));
            if (a > 0) {
                lnVar = new gd5(lnVar, a);
            }
            ej0Var.b(lnVar, tVar, nv6Var);
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "changes" : s.b(i, s.a(1)) ? "effectiveNodeIndex" : super.f(i);
        }
    }

    public static final class b0 extends gi5 {
        public static final b0 c = new b0();

        private b0() {
            super(0, 2, 1, null);
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            ((gt2) ji5Var.a(s.a(1))).invoke(lnVar.b(), ji5Var.a(s.a(0)));
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "value" : s.b(i, s.a(1)) ? "block" : super.f(i);
        }
    }

    public static final class c extends gi5 {
        public static final c c = new c();

        private c() {
            super(0, 2, 1, null);
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            int a = ((dn3) ji5Var.a(s.a(0))).a();
            List list = (List) ji5Var.a(s.a(1));
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                zq3.f(lnVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i2 = a + i;
                lnVar.f(i2, obj);
                lnVar.d(i2, obj);
            }
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "effectiveNodeIndex" : s.b(i, s.a(1)) ? "nodes" : super.f(i);
        }
    }

    public static final class c0 extends gi5 {
        public static final c0 c = new c0();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private c0() {
            /*
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.c0.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            Object a = ji5Var.a(s.a(0));
            int b = ji5Var.b(p.a(0));
            if (a instanceof pv6) {
                nv6Var.c(((pv6) a).a());
            }
            Object R0 = tVar.R0(b, a);
            if (R0 instanceof pv6) {
                nv6Var.d(((pv6) R0).a());
            } else if (R0 instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) R0).x();
            }
        }

        @Override // defpackage.gi5
        public String e(int i) {
            return p.b(i, p.a(0)) ? "groupSlotIndex" : super.e(i);
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "value" : super.f(i);
        }
    }

    public static final class d extends gi5 {
        public static final d c = new d();

        private d() {
            super(0, 4, 1, null);
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            lw4 lw4Var = (lw4) ji5Var.a(s.a(2));
            androidx.compose.runtime.c cVar = (androidx.compose.runtime.c) ji5Var.a(s.a(1));
            cVar.k(lw4Var);
            androidx.compose.runtime.b.t("Could not resolve state for movable content");
            throw new KotlinNothingValueException();
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "resolvedState" : s.b(i, s.a(1)) ? "resolvedCompositionContext" : s.b(i, s.a(2)) ? "from" : s.b(i, s.a(3)) ? "to" : super.f(i);
        }
    }

    public static final class d0 extends gi5 {
        public static final d0 c = new d0();

        private d0() {
            super(1, 0, 2, null);
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            int b = ji5Var.b(p.a(0));
            for (int i = 0; i < b; i++) {
                lnVar.i();
            }
        }

        @Override // defpackage.gi5
        public String e(int i) {
            return p.b(i, p.a(0)) ? "count" : super.e(i);
        }
    }

    public static final class e extends gi5 {
        public static final e c = new e();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private e() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.e.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            androidx.compose.runtime.b.u(tVar, nv6Var);
        }
    }

    public static final class e0 extends gi5 {
        public static final e0 c = new e0();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private e0() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.e0.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            Object b = lnVar.b();
            zq3.f(b, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((es0) b).g();
        }
    }

    public static final class f extends gi5 {
        public static final f c = new f();

        private f() {
            super(0, 2, 1, null);
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            int d;
            dn3 dn3Var = (dn3) ji5Var.a(s.a(0));
            hd hdVar = (hd) ji5Var.a(s.a(1));
            zq3.f(lnVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            d = qi5.d(tVar, hdVar, lnVar);
            dn3Var.b(d);
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "effectiveNodeIndexOut" : s.b(i, s.a(1)) ? "anchor" : super.f(i);
        }
    }

    public static final class g extends gi5 {
        public static final g c = new g();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private g() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.g.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            zq3.f(lnVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) ji5Var.a(s.a(0))) {
                lnVar.g(obj);
            }
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "nodes" : super.f(i);
        }
    }

    public static final class h extends gi5 {
        public static final h c = new h();

        private h() {
            super(0, 2, 1, null);
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            ((ss2) ji5Var.a(s.a(0))).invoke((ws0) ji5Var.a(s.a(1)));
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "anchor" : s.b(i, s.a(1)) ? "composition" : super.f(i);
        }
    }

    public static final class i extends gi5 {
        public static final i c = new i();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private i() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.i.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            tVar.T();
        }
    }

    public static final class j extends gi5 {
        public static final j c = new j();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private j() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.j.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            zq3.f(lnVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            qi5.e(tVar, lnVar, 0);
            tVar.T();
        }
    }

    public static final class k extends gi5 {
        public static final k c = new k();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private k() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.k.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            tVar.W((hd) ji5Var.a(s.a(0)));
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "anchor" : super.f(i);
        }
    }

    public static final class l extends gi5 {
        public static final l c = new l();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private l() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.l.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            tVar.V(0);
        }
    }

    public static final class m extends gi5 {
        public static final m c = new m();

        private m() {
            super(1, 2, null);
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            Object mo865invoke = ((qs2) ji5Var.a(s.a(0))).mo865invoke();
            hd hdVar = (hd) ji5Var.a(s.a(1));
            int b = ji5Var.b(p.a(0));
            zq3.f(lnVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            tVar.m1(hdVar, mo865invoke);
            lnVar.d(b, mo865invoke);
            lnVar.g(mo865invoke);
        }

        @Override // defpackage.gi5
        public String e(int i) {
            return p.b(i, p.a(0)) ? "insertIndex" : super.e(i);
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "factory" : s.b(i, s.a(1)) ? "groupAnchor" : super.f(i);
        }
    }

    public static final class n extends gi5 {
        public static final n c = new n();

        private n() {
            super(0, 2, 1, null);
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) ji5Var.a(s.a(1));
            hd hdVar = (hd) ji5Var.a(s.a(0));
            tVar.I();
            tVar.v0(rVar, hdVar.d(rVar), false);
            tVar.U();
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "anchor" : s.b(i, s.a(1)) ? "from" : super.f(i);
        }
    }

    public static final class o extends gi5 {
        public static final o c = new o();

        private o() {
            super(0, 3, 1, null);
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) ji5Var.a(s.a(1));
            hd hdVar = (hd) ji5Var.a(s.a(0));
            yj2 yj2Var = (yj2) ji5Var.a(s.a(2));
            androidx.compose.runtime.t z = rVar.z();
            try {
                yj2Var.d(lnVar, z, nv6Var);
                ww8 ww8Var = ww8.a;
                z.L();
                tVar.I();
                tVar.v0(rVar, hdVar.d(rVar), false);
                tVar.U();
            } catch (Throwable th) {
                z.L();
                throw th;
            }
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "anchor" : s.b(i, s.a(1)) ? "from" : s.b(i, s.a(2)) ? "fixups" : super.f(i);
        }
    }

    public static final class p {
        public static int a(int i) {
            return i;
        }

        public static final boolean b(int i, int i2) {
            return i == i2;
        }
    }

    public static final class q extends gi5 {
        public static final q c = new q();

        private q() {
            super(1, 0, 2, null);
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            tVar.w0(ji5Var.b(p.a(0)));
        }

        @Override // defpackage.gi5
        public String e(int i) {
            return p.b(i, p.a(0)) ? "offset" : super.e(i);
        }
    }

    public static final class r extends gi5 {
        public static final r c = new r();

        private r() {
            super(3, 0, 2, null);
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            lnVar.c(ji5Var.b(p.a(0)), ji5Var.b(p.a(1)), ji5Var.b(p.a(2)));
        }

        @Override // defpackage.gi5
        public String e(int i) {
            return p.b(i, p.a(0)) ? "from" : p.b(i, p.a(1)) ? "to" : p.b(i, p.a(2)) ? "count" : super.e(i);
        }
    }

    public static final class s {
        public static int a(int i) {
            return i;
        }

        public static final boolean b(int i, int i2) {
            return i == i2;
        }
    }

    public static final class t extends gi5 {
        public static final t c = new t();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private t() {
            /*
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.t.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            hd hdVar = (hd) ji5Var.a(s.a(0));
            int b = ji5Var.b(p.a(0));
            lnVar.i();
            zq3.f(lnVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            lnVar.f(b, tVar.B0(hdVar));
        }

        @Override // defpackage.gi5
        public String e(int i) {
            return p.b(i, p.a(0)) ? "insertIndex" : super.e(i);
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "groupAnchor" : super.f(i);
        }
    }

    public static final class u extends gi5 {
        public static final u c = new u();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private u() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.u.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            nv6Var.c((ov6) ji5Var.a(s.a(0)));
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "value" : super.f(i);
        }
    }

    public static final class v extends gi5 {
        public static final v c = new v();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private v() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.v.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            androidx.compose.runtime.b.M(tVar, nv6Var);
        }
    }

    public static final class w extends gi5 {
        public static final w c = new w();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private w() {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                r2 = 2
                r3.<init>(r2, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.w.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            lnVar.a(ji5Var.b(p.a(0)), ji5Var.b(p.a(1)));
        }

        @Override // defpackage.gi5
        public String e(int i) {
            return p.b(i, p.a(0)) ? "removeIndex" : p.b(i, p.a(1)) ? "count" : super.e(i);
        }
    }

    public static final class x extends gi5 {
        public static final x c = new x();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private x() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.x.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            tVar.N0();
        }
    }

    public static final class y extends gi5 {
        public static final y c = new y();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private y() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.y.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            nv6Var.a((qs2) ji5Var.a(s.a(0)));
        }

        @Override // defpackage.gi5
        public String f(int i) {
            return s.b(i, s.a(0)) ? "effect" : super.f(i);
        }
    }

    public static final class z extends gi5 {
        public static final z c = new z();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private z() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi5.z.<init>():void");
        }

        @Override // defpackage.gi5
        public void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var) {
            tVar.V0();
        }
    }

    public /* synthetic */ gi5(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3);
    }

    public abstract void a(ji5 ji5Var, ln lnVar, androidx.compose.runtime.t tVar, nv6 nv6Var);

    public final int b() {
        return this.a;
    }

    public final String c() {
        String d2 = zt6.b(getClass()).d();
        return d2 == null ? "" : d2;
    }

    public final int d() {
        return this.b;
    }

    public String e(int i2) {
        return "IntParameter(" + i2 + ')';
    }

    public String f(int i2) {
        return "ObjectParameter(" + i2 + ')';
    }

    public String toString() {
        return c();
    }

    private gi5(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public /* synthetic */ gi5(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, null);
    }
}
