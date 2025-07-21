package defpackage;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.q;
import androidx.lifecycle.t;

/* loaded from: classes4.dex */
final class o5 implements hx2 {
    private final sa9 a;
    private final Context b;
    private volatile m5 c;
    private final Object d = new Object();

    class a implements t.b {
        final /* synthetic */ Context b;

        a(Context context) {
            this.b = context;
        }

        @Override // androidx.lifecycle.t.b
        public q b(Class cls, t21 t21Var) {
            w97 w97Var = new w97(t21Var);
            return new c(((b) z12.b(this.b, b.class)).r().a(w97Var).build(), w97Var);
        }
    }

    public interface b {
        n5 r();
    }

    static final class c extends q {
        private final m5 a;
        private final w97 b;

        c(m5 m5Var, w97 w97Var) {
            this.a = m5Var;
            this.b = w97Var;
        }

        m5 e() {
            return this.a;
        }

        w97 f() {
            return this.b;
        }

        @Override // androidx.lifecycle.q
        protected void onCleared() {
            super.onCleared();
            ((z07) ((d) a22.a(this.a, d.class)).b()).a();
        }
    }

    public interface d {
        q5 b();
    }

    static abstract class e {
        static q5 a() {
            return new z07();
        }
    }

    o5(ComponentActivity componentActivity) {
        this.a = componentActivity;
        this.b = componentActivity;
    }

    private m5 a() {
        return ((c) d(this.a, this.b).a(c.class)).e();
    }

    private t d(sa9 sa9Var, Context context) {
        return new t(sa9Var, new a(context));
    }

    @Override // defpackage.hx2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m5 generatedComponent() {
        if (this.c == null) {
            synchronized (this.d) {
                try {
                    if (this.c == null) {
                        this.c = a();
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public w97 c() {
        return ((c) d(this.a, this.b).a(c.class)).f();
    }
}
