package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class vm4 {
    private final Context a;
    private final d b;
    private final c c;
    private a d;
    private um4 e;
    private boolean f;
    private wm4 g;
    private boolean h;

    public static abstract class a {
        public abstract void a(vm4 vm4Var, wm4 wm4Var);
    }

    public static abstract class b extends e {
        private final Object a = new Object();
        Executor b;
        d c;
        sm4 d;
        Collection e;

        class a implements Runnable {
            final /* synthetic */ d a;
            final /* synthetic */ sm4 b;
            final /* synthetic */ Collection c;

            a(d dVar, sm4 sm4Var, Collection collection) {
                this.a = dVar;
                this.b = sm4Var;
                this.c = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.a(b.this, this.b, this.c);
            }
        }

        /* renamed from: vm4$b$b, reason: collision with other inner class name */
        class RunnableC0550b implements Runnable {
            final /* synthetic */ d a;
            final /* synthetic */ sm4 b;
            final /* synthetic */ Collection c;

            RunnableC0550b(d dVar, sm4 sm4Var, Collection collection) {
                this.a = dVar;
                this.b = sm4Var;
                this.c = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.a(b.this, this.b, this.c);
            }
        }

        public static final class c {
            final sm4 a;
            final int b;
            final boolean c;
            final boolean d;
            final boolean e;

            public static final class a {
                private final sm4 a;
                private int b = 1;
                private boolean c = false;
                private boolean d = false;
                private boolean e = false;

                public a(sm4 sm4Var) {
                    this.a = sm4Var;
                }

                public c a() {
                    return new c(this.a, this.b, this.c, this.d, this.e);
                }

                public a b(boolean z) {
                    this.d = z;
                    return this;
                }

                public a c(boolean z) {
                    this.e = z;
                    return this;
                }

                public a d(boolean z) {
                    this.c = z;
                    return this;
                }

                public a e(int i) {
                    this.b = i;
                    return this;
                }
            }

            c(sm4 sm4Var, int i, boolean z, boolean z2, boolean z3) {
                this.a = sm4Var;
                this.b = i;
                this.c = z;
                this.d = z2;
                this.e = z3;
            }

            static c a(Bundle bundle) {
                if (bundle == null) {
                    return null;
                }
                return new c(sm4.d(bundle.getBundle("mrDescriptor")), bundle.getInt("selectionState", 1), bundle.getBoolean("isUnselectable", false), bundle.getBoolean("isGroupable", false), bundle.getBoolean("isTransferable", false));
            }

            public sm4 b() {
                return this.a;
            }

            public int c() {
                return this.b;
            }

            public boolean d() {
                return this.d;
            }

            public boolean e() {
                return this.e;
            }

            public boolean f() {
                return this.c;
            }
        }

        interface d {
            void a(b bVar, sm4 sm4Var, Collection collection);
        }

        public String j() {
            return null;
        }

        public String k() {
            return null;
        }

        public final void l(sm4 sm4Var, Collection collection) {
            if (sm4Var == null) {
                throw new NullPointerException("groupRoute must not be null");
            }
            if (collection == null) {
                throw new NullPointerException("dynamicRoutes must not be null");
            }
            synchronized (this.a) {
                try {
                    Executor executor = this.b;
                    if (executor != null) {
                        executor.execute(new RunnableC0550b(this.c, sm4Var, collection));
                    } else {
                        this.d = sm4Var;
                        this.e = new ArrayList(collection);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public abstract void m(String str);

        public abstract void n(String str);

        public abstract void o(List list);

        void p(Executor executor, d dVar) {
            synchronized (this.a) {
                try {
                    if (executor == null) {
                        throw new NullPointerException("Executor shouldn't be null");
                    }
                    if (dVar == null) {
                        throw new NullPointerException("Listener shouldn't be null");
                    }
                    this.b = executor;
                    this.c = dVar;
                    Collection collection = this.e;
                    if (collection != null && !collection.isEmpty()) {
                        sm4 sm4Var = this.d;
                        Collection collection2 = this.e;
                        this.d = null;
                        this.e = null;
                        this.b.execute(new a(dVar, sm4Var, collection2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final class c extends Handler {
        c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                vm4.this.l();
            } else {
                if (i != 2) {
                    return;
                }
                vm4.this.m();
            }
        }
    }

    public static final class d {
        private final ComponentName a;

        d(ComponentName componentName) {
            if (componentName == null) {
                throw new IllegalArgumentException("componentName must not be null");
            }
            this.a = componentName;
        }

        public ComponentName a() {
            return this.a;
        }

        public String b() {
            return this.a.getPackageName();
        }

        public String toString() {
            return "ProviderMetadata{ componentName=" + this.a.flattenToShortString() + " }";
        }
    }

    public static abstract class e {
        public void d() {
        }

        public void e() {
        }

        public abstract void f(int i);

        public void g() {
        }

        public void h(int i) {
            g();
        }

        public abstract void i(int i);
    }

    public vm4(Context context) {
        this(context, null);
    }

    void l() {
        this.h = false;
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(this, this.g);
        }
    }

    void m() {
        this.f = false;
        u(this.e);
    }

    public final Context n() {
        return this.a;
    }

    public final wm4 o() {
        return this.g;
    }

    public final um4 p() {
        return this.e;
    }

    public final d q() {
        return this.b;
    }

    public b r(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract e s(String str);

    public e t(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return s(str);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public abstract void u(um4 um4Var);

    public final void v(a aVar) {
        zm4.d();
        this.d = aVar;
    }

    public final void w(wm4 wm4Var) {
        zm4.d();
        if (this.g != wm4Var) {
            this.g = wm4Var;
            if (this.h) {
                return;
            }
            this.h = true;
            this.c.sendEmptyMessage(1);
        }
    }

    public final void x(um4 um4Var) {
        zm4.d();
        if (ic5.a(this.e, um4Var)) {
            return;
        }
        y(um4Var);
    }

    final void y(um4 um4Var) {
        this.e = um4Var;
        if (this.f) {
            return;
        }
        this.f = true;
        this.c.sendEmptyMessage(2);
    }

    vm4(Context context, d dVar) {
        this.c = new c();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.a = context;
        if (dVar == null) {
            this.b = new d(new ComponentName(context, getClass()));
        } else {
            this.b = dVar;
        }
    }
}
