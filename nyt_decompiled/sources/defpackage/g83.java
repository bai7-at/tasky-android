package defpackage;

import android.app.Activity;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import defpackage.t21;
import java.io.Closeable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class g83 implements t.b {
    public static final t21.b e = new b();
    private final Set b;
    private final t.b c;
    private final t.b d;

    class a implements t.b {
        final /* synthetic */ ma9 b;

        a(ma9 ma9Var) {
            this.b = ma9Var;
        }

        private q c(la9 la9Var, Class cls, t21 t21Var) {
            p76 p76Var = (p76) ((d) a22.a(la9Var, d.class)).a().get(cls.getName());
            ss2 ss2Var = (ss2) t21Var.a(g83.e);
            Object obj = ((d) a22.a(la9Var, d.class)).b().get(cls.getName());
            if (obj == null) {
                if (ss2Var != null) {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (p76Var != null) {
                    return (q) p76Var.get();
                }
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            if (p76Var != null) {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            if (ss2Var != null) {
                return (q) ss2Var.invoke(obj);
            }
            throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
        }

        @Override // androidx.lifecycle.t.b
        public q b(Class cls, t21 t21Var) {
            final z07 z07Var = new z07();
            q c = c(this.b.a(SavedStateHandleSupport.a(t21Var)).b(z07Var).build(), cls, t21Var);
            c.addCloseable(new Closeable() { // from class: f83
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    z07.this.a();
                }
            });
            return c;
        }
    }

    class b implements t21.b {
        b() {
        }
    }

    interface c {
        Set m();

        ma9 x0();
    }

    public interface d {
        Map a();

        Map b();
    }

    public g83(Set set, t.b bVar, ma9 ma9Var) {
        this.b = set;
        this.c = bVar;
        this.d = new a(ma9Var);
    }

    public static t.b c(Activity activity, t.b bVar) {
        c cVar = (c) a22.a(activity, c.class);
        return new g83(cVar.m(), bVar, cVar.x0());
    }

    @Override // androidx.lifecycle.t.b
    public q a(Class cls) {
        return this.b.contains(cls.getName()) ? this.d.a(cls) : this.c.a(cls);
    }

    @Override // androidx.lifecycle.t.b
    public q b(Class cls, t21 t21Var) {
        return this.b.contains(cls.getName()) ? this.d.b(cls, t21Var) : this.c.b(cls, t21Var);
    }
}
