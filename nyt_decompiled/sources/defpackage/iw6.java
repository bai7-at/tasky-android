package defpackage;

import com.nytimes.android.external.cache3.RemovalCause;
import java.util.Map;

/* loaded from: classes4.dex */
public final class iw6 implements Map.Entry {
    private final Object a;
    private final Object b;
    private final RemovalCause c;

    private iw6(Object obj, Object obj2, RemovalCause removalCause) {
        this.a = obj;
        this.b = obj2;
        this.c = (RemovalCause) e16.d(removalCause);
    }

    public static iw6 a(Object obj, Object obj2, RemovalCause removalCause) {
        return new iw6(obj, obj2, removalCause);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return gc5.a(getKey(), entry.getKey()) && gc5.a(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
