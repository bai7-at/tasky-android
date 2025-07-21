package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class k1 extends p1 {
    public final boolean a(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return c(entry);
    }

    public abstract boolean c(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return a((Map.Entry) obj);
        }
        return false;
    }

    public final boolean f(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return g(entry);
    }

    public abstract boolean g(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return f((Map.Entry) obj);
        }
        return false;
    }
}
