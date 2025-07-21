package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class p50 {
    private final d c;
    protected cd4 e;
    final List a = new ArrayList(1);
    private boolean b = false;
    protected float d = 0.0f;
    private Object f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    public interface b {
        void a();
    }

    private static final class c implements d {
        private c() {
        }

        @Override // p50.d
        public boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // p50.d
        public rw3 b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // p50.d
        public boolean c(float f) {
            return false;
        }

        @Override // p50.d
        public float d() {
            return 0.0f;
        }

        @Override // p50.d
        public float e() {
            return 1.0f;
        }

        @Override // p50.d
        public boolean isEmpty() {
            return true;
        }
    }

    private interface d {
        boolean a(float f);

        rw3 b();

        boolean c(float f);

        float d();

        float e();

        boolean isEmpty();
    }

    private static final class e implements d {
        private final List a;
        private rw3 c = null;
        private float d = -1.0f;
        private rw3 b = f(0.0f);

        e(List list) {
            this.a = list;
        }

        private rw3 f(float f) {
            List list = this.a;
            rw3 rw3Var = (rw3) list.get(list.size() - 1);
            if (f >= rw3Var.f()) {
                return rw3Var;
            }
            for (int size = this.a.size() - 2; size >= 1; size--) {
                rw3 rw3Var2 = (rw3) this.a.get(size);
                if (this.b != rw3Var2 && rw3Var2.a(f)) {
                    return rw3Var2;
                }
            }
            return (rw3) this.a.get(0);
        }

        @Override // p50.d
        public boolean a(float f) {
            rw3 rw3Var = this.c;
            rw3 rw3Var2 = this.b;
            if (rw3Var == rw3Var2 && this.d == f) {
                return true;
            }
            this.c = rw3Var2;
            this.d = f;
            return false;
        }

        @Override // p50.d
        public rw3 b() {
            return this.b;
        }

        @Override // p50.d
        public boolean c(float f) {
            if (this.b.a(f)) {
                return !this.b.i();
            }
            this.b = f(f);
            return true;
        }

        @Override // p50.d
        public float d() {
            return ((rw3) this.a.get(0)).f();
        }

        @Override // p50.d
        public float e() {
            return ((rw3) this.a.get(r1.size() - 1)).c();
        }

        @Override // p50.d
        public boolean isEmpty() {
            return false;
        }
    }

    private static final class f implements d {
        private final rw3 a;
        private float b = -1.0f;

        f(List list) {
            this.a = (rw3) list.get(0);
        }

        @Override // p50.d
        public boolean a(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // p50.d
        public rw3 b() {
            return this.a;
        }

        @Override // p50.d
        public boolean c(float f) {
            return !this.a.i();
        }

        @Override // p50.d
        public float d() {
            return this.a.f();
        }

        @Override // p50.d
        public float e() {
            return this.a.c();
        }

        @Override // p50.d
        public boolean isEmpty() {
            return false;
        }
    }

    p50(List list) {
        this.c = p(list);
    }

    private float g() {
        if (this.g == -1.0f) {
            this.g = this.c.d();
        }
        return this.g;
    }

    private static d p(List list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    protected rw3 b() {
        yx3.b("BaseKeyframeAnimation#getCurrentKeyframe");
        rw3 b2 = this.c.b();
        yx3.c("BaseKeyframeAnimation#getCurrentKeyframe");
        return b2;
    }

    float c() {
        if (this.h == -1.0f) {
            this.h = this.c.e();
        }
        return this.h;
    }

    protected float d() {
        rw3 b2 = b();
        if (b2 == null || b2.i()) {
            return 0.0f;
        }
        return b2.d.getInterpolation(e());
    }

    float e() {
        if (this.b) {
            return 0.0f;
        }
        rw3 b2 = b();
        if (b2.i()) {
            return 0.0f;
        }
        return (this.d - b2.f()) / (b2.c() - b2.f());
    }

    public float f() {
        return this.d;
    }

    public Object h() {
        float e2 = e();
        if (this.e == null && this.c.a(e2)) {
            return this.f;
        }
        rw3 b2 = b();
        Interpolator interpolator = b2.e;
        Object i = (interpolator == null || b2.f == null) ? i(b2, d()) : j(b2, e2, interpolator.getInterpolation(e2), b2.f.getInterpolation(e2));
        this.f = i;
        return i;
    }

    abstract Object i(rw3 rw3Var, float f2);

    protected Object j(rw3 rw3Var, float f2, float f3, float f4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.e != null;
    }

    public void l() {
        yx3.b("BaseKeyframeAnimation#notifyListeners");
        for (int i = 0; i < this.a.size(); i++) {
            ((b) this.a.get(i)).a();
        }
        yx3.c("BaseKeyframeAnimation#notifyListeners");
    }

    public void m() {
        this.b = true;
    }

    public void n(float f2) {
        yx3.b("BaseKeyframeAnimation#setProgress");
        if (this.c.isEmpty()) {
            yx3.c("BaseKeyframeAnimation#setProgress");
            return;
        }
        if (f2 < g()) {
            f2 = g();
        } else if (f2 > c()) {
            f2 = c();
        }
        if (f2 == this.d) {
            yx3.c("BaseKeyframeAnimation#setProgress");
            return;
        }
        this.d = f2;
        if (this.c.c(f2)) {
            l();
        }
        yx3.c("BaseKeyframeAnimation#setProgress");
    }

    public void o(cd4 cd4Var) {
        cd4 cd4Var2 = this.e;
        if (cd4Var2 != null) {
            cd4Var2.c(null);
        }
        this.e = cd4Var;
        if (cd4Var != null) {
            cd4Var.c(this);
        }
    }
}
