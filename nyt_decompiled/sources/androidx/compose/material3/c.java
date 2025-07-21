package androidx.compose.material3;

import defpackage.ru1;
import defpackage.zq3;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class c implements ru1 {
    private final Map a;

    public c(Map map) {
        this.a = map;
    }

    @Override // defpackage.ru1
    public Object a(float f, boolean z) {
        Object next;
        Iterator it2 = this.a.entrySet().iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f2 = z ? floatValue - f : f - floatValue;
                if (f2 < 0.0f) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it2.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f3 = z ? floatValue2 - f : f - floatValue2;
                    if (f3 < 0.0f) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    @Override // defpackage.ru1
    public Object b(float f) {
        Object next;
        Iterator it2 = this.a.entrySet().iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                float abs = Math.abs(f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it2.next();
                    float abs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    @Override // defpackage.ru1
    public boolean c(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.ru1
    public float d() {
        Float C0 = kotlin.collections.i.C0(this.a.values());
        if (C0 != null) {
            return C0.floatValue();
        }
        return Float.NaN;
    }

    @Override // defpackage.ru1
    public float e(Object obj) {
        Float f = (Float) this.a.get(obj);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return zq3.c(this.a, ((c) obj).a);
        }
        return false;
    }

    @Override // defpackage.ru1
    public float f() {
        Float A0 = kotlin.collections.i.A0(this.a.values());
        if (A0 != null) {
            return A0.floatValue();
        }
        return Float.NaN;
    }

    public int hashCode() {
        return this.a.hashCode() * 31;
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.a + ')';
    }
}
