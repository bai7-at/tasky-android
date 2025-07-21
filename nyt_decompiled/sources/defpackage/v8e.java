package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class v8e {
    private static final v8e c = new v8e();
    private final ArrayList a = new ArrayList();
    private final ArrayList b = new ArrayList();

    private v8e() {
    }

    public static v8e a() {
        return c;
    }

    public final Collection b() {
        return Collections.unmodifiableCollection(this.b);
    }

    public final Collection c() {
        return Collections.unmodifiableCollection(this.a);
    }

    public final void d(n8e n8eVar) {
        this.a.add(n8eVar);
    }

    public final void e(n8e n8eVar) {
        ArrayList arrayList = this.a;
        boolean g = g();
        arrayList.remove(n8eVar);
        this.b.remove(n8eVar);
        if (!g || g()) {
            return;
        }
        e9e.c().g();
    }

    public final void f(n8e n8eVar) {
        ArrayList arrayList = this.b;
        boolean g = g();
        arrayList.add(n8eVar);
        if (g) {
            return;
        }
        e9e.c().f();
    }

    public final boolean g() {
        return this.b.size() > 0;
    }
}
