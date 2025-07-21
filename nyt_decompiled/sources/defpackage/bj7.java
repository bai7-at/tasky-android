package defpackage;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class bj7 implements lj7, Iterable, yu3 {
    private final Map a = new LinkedHashMap();
    private boolean b;
    private boolean c;

    @Override // defpackage.lj7
    public void a(SemanticsPropertyKey semanticsPropertyKey, Object obj) {
        if (!(obj instanceof u2) || !f(semanticsPropertyKey)) {
            this.a.put(semanticsPropertyKey, obj);
            return;
        }
        Object obj2 = this.a.get(semanticsPropertyKey);
        zq3.f(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        u2 u2Var = (u2) obj2;
        Map map = this.a;
        u2 u2Var2 = (u2) obj;
        String b = u2Var2.b();
        if (b == null) {
            b = u2Var.b();
        }
        lt2 a = u2Var2.a();
        if (a == null) {
            a = u2Var.a();
        }
        map.put(semanticsPropertyKey, new u2(b, a));
    }

    public final void c(bj7 bj7Var) {
        if (bj7Var.b) {
            this.b = true;
        }
        if (bj7Var.c) {
            this.c = true;
        }
        for (Map.Entry entry : bj7Var.a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) entry.getKey();
            Object value = entry.getValue();
            if (!this.a.containsKey(semanticsPropertyKey)) {
                this.a.put(semanticsPropertyKey, value);
            } else if (value instanceof u2) {
                Object obj = this.a.get(semanticsPropertyKey);
                zq3.f(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                u2 u2Var = (u2) obj;
                Map map = this.a;
                String b = u2Var.b();
                if (b == null) {
                    b = ((u2) value).b();
                }
                lt2 a = u2Var.a();
                if (a == null) {
                    a = ((u2) value).a();
                }
                map.put(semanticsPropertyKey, new u2(b, a));
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj7)) {
            return false;
        }
        bj7 bj7Var = (bj7) obj;
        return zq3.c(this.a, bj7Var.a) && this.b == bj7Var.b && this.c == bj7Var.c;
    }

    public final boolean f(SemanticsPropertyKey semanticsPropertyKey) {
        return this.a.containsKey(semanticsPropertyKey);
    }

    public final boolean g() {
        Set keySet = this.a.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        Iterator it2 = keySet.iterator();
        while (it2.hasNext()) {
            if (((SemanticsPropertyKey) it2.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.c);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.a.entrySet().iterator();
    }

    public final bj7 j() {
        bj7 bj7Var = new bj7();
        bj7Var.b = this.b;
        bj7Var.c = this.c;
        bj7Var.a.putAll(this.a);
        return bj7Var;
    }

    public final Object n(SemanticsPropertyKey semanticsPropertyKey) {
        Object obj = this.a.get(semanticsPropertyKey);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + semanticsPropertyKey + " - consider getOrElse or getOrNull");
    }

    public final Object o(SemanticsPropertyKey semanticsPropertyKey, qs2 qs2Var) {
        Object obj = this.a.get(semanticsPropertyKey);
        return obj == null ? qs2Var.mo865invoke() : obj;
    }

    public final Object p(SemanticsPropertyKey semanticsPropertyKey, qs2 qs2Var) {
        Object obj = this.a.get(semanticsPropertyKey);
        return obj == null ? qs2Var.mo865invoke() : obj;
    }

    public final boolean q() {
        return this.c;
    }

    public final boolean t() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.b) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.c) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(semanticsPropertyKey.a());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return nu3.a(this, null) + "{ " + ((Object) sb) + " }";
    }

    public final void u(bj7 bj7Var) {
        for (Map.Entry entry : bj7Var.a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) entry.getKey();
            Object value = entry.getValue();
            Object obj = this.a.get(semanticsPropertyKey);
            zq3.f(semanticsPropertyKey, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object c = semanticsPropertyKey.c(obj, value);
            if (c != null) {
                this.a.put(semanticsPropertyKey, c);
            }
        }
    }

    public final void v(boolean z) {
        this.c = z;
    }

    public final void w(boolean z) {
        this.b = z;
    }
}
