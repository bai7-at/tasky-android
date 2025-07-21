package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e08 {
    private final ArrayList a = new ArrayList();

    public final void a() {
        this.a.clear();
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean c() {
        return this.a.isEmpty();
    }

    public final boolean d() {
        return !c();
    }

    public final Object e() {
        return this.a.get(b() - 1);
    }

    public final Object f(int i) {
        return this.a.get(i);
    }

    public final Object g() {
        return this.a.remove(b() - 1);
    }

    public final boolean h(Object obj) {
        return this.a.add(obj);
    }

    public final Object[] i() {
        int size = this.a.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = this.a.get(i);
        }
        return objArr;
    }
}
