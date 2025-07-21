package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class bb9 {
    private Interpolator c;
    cb9 d;
    private boolean e;
    private long b = -1;
    private final db9 f = new a();
    final ArrayList a = new ArrayList();

    class a extends db9 {
        private boolean a = false;
        private int b = 0;

        a() {
        }

        @Override // defpackage.cb9
        public void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == bb9.this.a.size()) {
                cb9 cb9Var = bb9.this.d;
                if (cb9Var != null) {
                    cb9Var.b(null);
                }
                d();
            }
        }

        @Override // defpackage.db9, defpackage.cb9
        public void c(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            cb9 cb9Var = bb9.this.d;
            if (cb9Var != null) {
                cb9Var.c(null);
            }
        }

        void d() {
            this.b = 0;
            this.a = false;
            bb9.this.b();
        }
    }

    public void a() {
        if (this.e) {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((ab9) it2.next()).c();
            }
            this.e = false;
        }
    }

    void b() {
        this.e = false;
    }

    public bb9 c(ab9 ab9Var) {
        if (!this.e) {
            this.a.add(ab9Var);
        }
        return this;
    }

    public bb9 d(ab9 ab9Var, ab9 ab9Var2) {
        this.a.add(ab9Var);
        ab9Var2.j(ab9Var.d());
        this.a.add(ab9Var2);
        return this;
    }

    public bb9 e(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public bb9 f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public bb9 g(cb9 cb9Var) {
        if (!this.e) {
            this.d = cb9Var;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ab9 ab9Var = (ab9) it2.next();
            long j = this.b;
            if (j >= 0) {
                ab9Var.f(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                ab9Var.g(interpolator);
            }
            if (this.d != null) {
                ab9Var.h(this.f);
            }
            ab9Var.l();
        }
        this.e = true;
    }
}
