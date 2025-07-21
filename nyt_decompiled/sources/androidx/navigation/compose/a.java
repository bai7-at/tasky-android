package androidx.navigation.compose;

import androidx.navigation.NavGraph;
import androidx.navigation.Navigator;
import androidx.navigation.f;
import androidx.navigation.k;
import defpackage.ss2;

@Navigator.b("navigation")
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: androidx.navigation.compose.a$a, reason: collision with other inner class name */
    public static final class C0096a extends NavGraph {
        private ss2 t;
        private ss2 u;
        private ss2 w;
        private ss2 x;

        public C0096a(Navigator navigator) {
            super(navigator);
        }

        public final ss2 Y() {
            return this.t;
        }

        public final ss2 Z() {
            return this.u;
        }

        public final ss2 a0() {
            return this.w;
        }

        public final ss2 b0() {
            return this.x;
        }

        public final void d0(ss2 ss2Var) {
            this.t = ss2Var;
        }

        public final void e0(ss2 ss2Var) {
            this.u = ss2Var;
        }

        public final void f0(ss2 ss2Var) {
            this.w = ss2Var;
        }

        public final void g0(ss2 ss2Var) {
            this.x = ss2Var;
        }
    }

    public a(k kVar) {
        super(kVar);
    }

    @Override // androidx.navigation.f, androidx.navigation.Navigator
    /* renamed from: l */
    public NavGraph a() {
        return new C0096a(this);
    }
}
