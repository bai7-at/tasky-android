package defpackage;

import com.bumptech.glide.Registry;
import defpackage.yu4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class lx4 {
    private static final c e = new c();
    private static final yu4 f = new a();
    private final List a;
    private final c b;
    private final Set c;
    private final sz5 d;

    private static class a implements yu4 {
        a() {
        }

        @Override // defpackage.yu4
        public yu4.a a(Object obj, int i, int i2, sk5 sk5Var) {
            return null;
        }

        @Override // defpackage.yu4
        public boolean b(Object obj) {
            return false;
        }
    }

    private static class b {
        private final Class a;
        final Class b;
        final zu4 c;

        public b(Class cls, Class cls2, zu4 zu4Var) {
            this.a = cls;
            this.b = cls2;
            this.c = zu4Var;
        }

        public boolean a(Class cls) {
            return this.a.isAssignableFrom(cls);
        }

        public boolean b(Class cls, Class cls2) {
            return a(cls) && this.b.isAssignableFrom(cls2);
        }
    }

    static class c {
        c() {
        }

        public kx4 a(List list, sz5 sz5Var) {
            return new kx4(list, sz5Var);
        }
    }

    public lx4(sz5 sz5Var) {
        this(sz5Var, e);
    }

    private void a(Class cls, Class cls2, zu4 zu4Var, boolean z) {
        b bVar = new b(cls, cls2, zu4Var);
        List list = this.a;
        list.add(z ? list.size() : 0, bVar);
    }

    private yu4 c(b bVar) {
        return (yu4) z06.d(bVar.c.b(this));
    }

    private static yu4 f() {
        return f;
    }

    synchronized void b(Class cls, Class cls2, zu4 zu4Var) {
        a(cls, cls2, zu4Var, true);
    }

    public synchronized yu4 d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b bVar : this.a) {
                if (this.c.contains(bVar)) {
                    z = true;
                } else if (bVar.b(cls, cls2)) {
                    this.c.add(bVar);
                    arrayList.add(c(bVar));
                    this.c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.b.a(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (yu4) arrayList.get(0);
            }
            if (!z) {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
            return f();
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    synchronized List e(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.a) {
                if (!this.c.contains(bVar) && bVar.a(cls)) {
                    this.c.add(bVar);
                    arrayList.add(c(bVar));
                    this.c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    synchronized List g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.a) {
            if (!arrayList.contains(bVar.b) && bVar.a(cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }

    lx4(sz5 sz5Var, c cVar) {
        this.a = new ArrayList();
        this.c = new HashSet();
        this.d = sz5Var;
        this.b = cVar;
    }
}
