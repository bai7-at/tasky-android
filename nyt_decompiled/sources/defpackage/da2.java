package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class da2 {
    private static final g a = new a();

    class a implements g {
        a() {
        }

        @Override // da2.g
        public void a(Object obj) {
        }
    }

    class b implements d {
        b() {
        }

        @Override // da2.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List a() {
            return new ArrayList();
        }
    }

    class c implements g {
        c() {
        }

        @Override // da2.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            list.clear();
        }
    }

    public interface d {
        Object a();
    }

    private static final class e implements sz5 {
        private final d a;
        private final g b;
        private final sz5 c;

        e(sz5 sz5Var, d dVar, g gVar) {
            this.c = sz5Var;
            this.a = dVar;
            this.b = gVar;
        }

        @Override // defpackage.sz5
        public boolean a(Object obj) {
            if (obj instanceof f) {
                ((f) obj).b().b(true);
            }
            this.b.a(obj);
            return this.c.a(obj);
        }

        @Override // defpackage.sz5
        public Object b() {
            Object b = this.c.b();
            if (b == null) {
                b = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b.getClass());
                }
            }
            if (b instanceof f) {
                ((f) b).b().b(false);
            }
            return b;
        }
    }

    public interface f {
        b18 b();
    }

    public interface g {
        void a(Object obj);
    }

    private static sz5 a(sz5 sz5Var, d dVar) {
        return b(sz5Var, dVar, c());
    }

    private static sz5 b(sz5 sz5Var, d dVar, g gVar) {
        return new e(sz5Var, dVar, gVar);
    }

    private static g c() {
        return a;
    }

    public static sz5 d(int i, d dVar) {
        return a(new uz5(i), dVar);
    }

    public static sz5 e() {
        return f(20);
    }

    public static sz5 f(int i) {
        return b(new uz5(i), new b(), new c());
    }
}
