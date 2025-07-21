package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.p09;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class p09 {
    private final ks4 a;
    private final e11 b;
    private final String c;
    private final a d = new a(false);
    private final a e = new a(true);
    private final AtomicMarkableReference f = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    class a {
        final AtomicMarkableReference a;
        private final AtomicReference b = new AtomicReference(null);
        private final boolean c;

        public a(boolean z) {
            this.c = z;
            this.a = new AtomicMarkableReference(new yw3(64, z ? 8192 : 1024), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Void c() {
            this.b.set(null);
            e();
            return null;
        }

        private void d() {
            Callable callable = new Callable() { // from class: o09
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void c;
                    c = p09.a.this.c();
                    return c;
                }
            };
            if (kz4.a(this.b, null, callable)) {
                p09.this.b.h(callable);
            }
        }

        private void e() {
            Map map;
            synchronized (this) {
                try {
                    if (this.a.isMarked()) {
                        map = ((yw3) this.a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.a;
                        atomicMarkableReference.set((yw3) atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (map != null) {
                p09.this.a.k(p09.this.c, map, this.c);
            }
        }

        public Map b() {
            return ((yw3) this.a.getReference()).a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((yw3) this.a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.a;
                    atomicMarkableReference.set((yw3) atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public p09(String str, ue2 ue2Var, e11 e11Var) {
        this.c = str;
        this.a = new ks4(ue2Var);
        this.b = e11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object h() {
        k();
        return null;
    }

    public static p09 i(String str, ue2 ue2Var, e11 e11Var) {
        ks4 ks4Var = new ks4(ue2Var);
        p09 p09Var = new p09(str, ue2Var, e11Var);
        ((yw3) p09Var.d.a.getReference()).e(ks4Var.g(str, false));
        ((yw3) p09Var.e.a.getReference()).e(ks4Var.g(str, true));
        p09Var.f.set(ks4Var.h(str), false);
        return p09Var;
    }

    public static String j(String str, ue2 ue2Var) {
        return new ks4(ue2Var).h(str);
    }

    private void k() {
        boolean z;
        String str;
        synchronized (this.f) {
            try {
                z = false;
                if (this.f.isMarked()) {
                    str = g();
                    this.f.set(str, false);
                    z = true;
                } else {
                    str = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.a.l(this.c, str);
        }
    }

    public Map e() {
        return this.d.b();
    }

    public Map f() {
        return this.e.b();
    }

    public String g() {
        return (String) this.f.getReference();
    }

    public boolean l(String str, String str2) {
        return this.d.f(str, str2);
    }

    public void m(String str) {
        String c = yw3.c(str, 1024);
        synchronized (this.f) {
            try {
                if (CommonUtils.A(c, (String) this.f.getReference())) {
                    return;
                }
                this.f.set(c, true);
                this.b.h(new Callable() { // from class: n09
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Object h;
                        h = p09.this.h();
                        return h;
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
