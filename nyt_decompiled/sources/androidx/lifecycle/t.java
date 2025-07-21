package androidx.lifecycle;

import android.app.Application;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.ra9;
import defpackage.sa9;
import defpackage.t21;
import defpackage.xg;
import defpackage.xx4;
import defpackage.zq3;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class t {
    private final u a;
    private final b b;
    private final t21 c;

    public interface b {
        public static final a a = a.a;

        public static final class a {
            static final /* synthetic */ a a = new a();

            private a() {
            }
        }

        default q a(Class cls) {
            zq3.h(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default q b(Class cls, t21 t21Var) {
            zq3.h(cls, "modelClass");
            zq3.h(t21Var, "extras");
            return a(cls);
        }
    }

    public static class c implements b {
        private static c c;
        public static final a b = new a(null);
        public static final t21.b d = a.C0087a.a;

        public static final class a {

            /* renamed from: androidx.lifecycle.t$c$a$a, reason: collision with other inner class name */
            private static final class C0087a implements t21.b {
                public static final C0087a a = new C0087a();

                private C0087a() {
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                if (c.c == null) {
                    c.c = new c();
                }
                c cVar = c.c;
                zq3.e(cVar);
                return cVar;
            }

            private a() {
            }
        }

        @Override // androidx.lifecycle.t.b
        public q a(Class cls) {
            zq3.h(cls, "modelClass");
            try {
                Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                zq3.g(newInstance, "{\n                modelC…wInstance()\n            }");
                return (q) newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }
    }

    public static class d {
        public abstract void c(q qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(u uVar, b bVar) {
        this(uVar, bVar, null, 4, null);
        zq3.h(uVar, "store");
        zq3.h(bVar, "factory");
    }

    public q a(Class cls) {
        zq3.h(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public q b(String str, Class cls) {
        q a2;
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(cls, "modelClass");
        q b2 = this.a.b(str);
        if (!cls.isInstance(b2)) {
            xx4 xx4Var = new xx4(this.c);
            xx4Var.c(c.d, str);
            try {
                a2 = this.b.b(cls, xx4Var);
            } catch (AbstractMethodError unused) {
                a2 = this.b.a(cls);
            }
            this.a.d(str, a2);
            return a2;
        }
        Object obj = this.b;
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            zq3.e(b2);
            dVar.c(b2);
        }
        zq3.f(b2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return b2;
    }

    public static class a extends c {
        private static a g;
        private final Application e;
        public static final C0085a f = new C0085a(null);
        public static final t21.b h = C0085a.C0086a.a;

        /* renamed from: androidx.lifecycle.t$a$a, reason: collision with other inner class name */
        public static final class C0085a {

            /* renamed from: androidx.lifecycle.t$a$a$a, reason: collision with other inner class name */
            private static final class C0086a implements t21.b {
                public static final C0086a a = new C0086a();

                private C0086a() {
                }
            }

            public /* synthetic */ C0085a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(sa9 sa9Var) {
                zq3.h(sa9Var, "owner");
                return sa9Var instanceof androidx.lifecycle.d ? ((androidx.lifecycle.d) sa9Var).getDefaultViewModelProviderFactory() : c.b.a();
            }

            public final a b(Application application) {
                zq3.h(application, "application");
                if (a.g == null) {
                    a.g = new a(application);
                }
                a aVar = a.g;
                zq3.e(aVar);
                return aVar;
            }

            private C0085a() {
            }
        }

        private a(Application application, int i) {
            this.e = application;
        }

        private final q g(Class cls, Application application) {
            if (!xg.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                q qVar = (q) cls.getConstructor(Application.class).newInstance(application);
                zq3.g(qVar, "{\n                try {\n…          }\n            }");
                return qVar;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }

        @Override // androidx.lifecycle.t.c, androidx.lifecycle.t.b
        public q a(Class cls) {
            zq3.h(cls, "modelClass");
            Application application = this.e;
            if (application != null) {
                return g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.t.b
        public q b(Class cls, t21 t21Var) {
            zq3.h(cls, "modelClass");
            zq3.h(t21Var, "extras");
            if (this.e != null) {
                return a(cls);
            }
            Application application = (Application) t21Var.a(h);
            if (application != null) {
                return g(cls, application);
            }
            if (xg.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(cls);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            zq3.h(application, "application");
        }
    }

    public t(u uVar, b bVar, t21 t21Var) {
        zq3.h(uVar, "store");
        zq3.h(bVar, "factory");
        zq3.h(t21Var, "defaultCreationExtras");
        this.a = uVar;
        this.b = bVar;
        this.c = t21Var;
    }

    public /* synthetic */ t(u uVar, b bVar, t21 t21Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uVar, bVar, (i & 4) != 0 ? t21.a.b : t21Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(sa9 sa9Var) {
        this(sa9Var.getViewModelStore(), a.f.a(sa9Var), ra9.a(sa9Var));
        zq3.h(sa9Var, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(sa9 sa9Var, b bVar) {
        this(sa9Var.getViewModelStore(), bVar, ra9.a(sa9Var));
        zq3.h(sa9Var, "owner");
        zq3.h(bVar, "factory");
    }
}
