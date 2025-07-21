package defpackage;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class av4 {
    private final lx4 a;
    private final a b;

    private static class a {
        private final Map a = new HashMap();

        /* renamed from: av4$a$a, reason: collision with other inner class name */
        private static class C0126a {
            final List a;

            public C0126a(List list) {
                this.a = list;
            }
        }

        a() {
        }

        public void a() {
            this.a.clear();
        }

        public List b(Class cls) {
            C0126a c0126a = (C0126a) this.a.get(cls);
            if (c0126a == null) {
                return null;
            }
            return c0126a.a;
        }

        public void c(Class cls, List list) {
            if (((C0126a) this.a.put(cls, new C0126a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public av4(sz5 sz5Var) {
        this(new lx4(sz5Var));
    }

    private static Class b(Object obj) {
        return obj.getClass();
    }

    private synchronized List e(Class cls) {
        List b;
        b = this.b.b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.a.e(cls));
            this.b.c(cls, b);
        }
        return b;
    }

    public synchronized void a(Class cls, Class cls2, zu4 zu4Var) {
        this.a.b(cls, cls2, zu4Var);
        this.b.a();
    }

    public synchronized List c(Class cls) {
        return this.a.g(cls);
    }

    public List d(Object obj) {
        List e = e(b(obj));
        if (e.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj);
        }
        int size = e.size();
        List emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            yu4 yu4Var = (yu4) e.get(i);
            if (yu4Var.b(obj)) {
                if (z) {
                    emptyList = new ArrayList(size - i);
                    z = false;
                }
                emptyList.add(yu4Var);
            }
        }
        if (emptyList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj, e);
        }
        return emptyList;
    }

    private av4(lx4 lx4Var) {
        this.b = new a();
        this.a = lx4Var;
    }
}
