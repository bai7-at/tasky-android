package androidx.compose.foundation.text.selection;

import defpackage.ss2;
import defpackage.xi7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class h implements xi7 {
    public static final a f = new a(null);
    private final boolean a;
    private final int b;
    private final int c;
    private final e d;
    private final d e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(boolean z, int i, int i2, e eVar, d dVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = eVar;
        this.e = dVar;
    }

    @Override // defpackage.xi7
    public int a() {
        return 1;
    }

    @Override // defpackage.xi7
    public boolean b() {
        return this.a;
    }

    @Override // defpackage.xi7
    public d c() {
        return this.e;
    }

    @Override // defpackage.xi7
    public d d() {
        return this.e;
    }

    @Override // defpackage.xi7
    public void e(ss2 ss2Var) {
    }

    @Override // defpackage.xi7
    public int f() {
        return this.c;
    }

    @Override // defpackage.xi7
    public CrossStatus g() {
        return this.e.d();
    }

    @Override // defpackage.xi7
    public e h() {
        return this.d;
    }

    @Override // defpackage.xi7
    public d i() {
        return this.e;
    }

    @Override // defpackage.xi7
    public d j() {
        return this.e;
    }

    @Override // defpackage.xi7
    public int k() {
        return this.b;
    }

    @Override // defpackage.xi7
    public boolean l(xi7 xi7Var) {
        if (h() != null && xi7Var != null && (xi7Var instanceof h)) {
            h hVar = (h) xi7Var;
            if (b() == hVar.b() && !this.e.m(hVar.e)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + b() + ", crossed=" + g() + ", info=\n\t" + this.e + ')';
    }
}
