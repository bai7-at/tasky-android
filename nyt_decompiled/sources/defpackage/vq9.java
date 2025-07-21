package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class vq9 {
    private String a;
    private final long b;
    private final Map c;

    public vq9(String str, long j, Map map) {
        this.a = str;
        this.b = j;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final long a() {
        return this.b;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vq9 clone() {
        return new vq9(this.a, this.b, new HashMap(this.c));
    }

    public final Object c(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        return null;
    }

    public final String d() {
        return this.a;
    }

    public final Map e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq9)) {
            return false;
        }
        vq9 vq9Var = (vq9) obj;
        if (this.b == vq9Var.b && this.a.equals(vq9Var.a)) {
            return this.c.equals(vq9Var.c);
        }
        return false;
    }

    public final void f(String str) {
        this.a = str;
    }

    public final void g(String str, Object obj) {
        Map map = this.c;
        if (obj == null) {
            map.remove(str);
        } else {
            map.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.a + "', timestamp=" + this.b + ", params=" + this.c.toString() + "}";
    }
}
