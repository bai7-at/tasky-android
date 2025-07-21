package defpackage;

import java.util.Map;

/* loaded from: classes5.dex */
public abstract class l1 extends p1 {
    public final boolean a(Map.Entry entry) {
        zq3.h(entry, "element");
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

    public abstract /* bridge */ boolean f(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return f((Map.Entry) obj);
        }
        return false;
    }
}
