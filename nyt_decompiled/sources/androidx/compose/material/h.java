package androidx.compose.material;

import defpackage.it2;
import defpackage.zq3;

/* loaded from: classes.dex */
final class h {
    private final Object a;
    private final it2 b;

    public h(Object obj, it2 it2Var) {
        this.a = obj;
        this.b = it2Var;
    }

    public final Object a() {
        return this.a;
    }

    public final it2 b() {
        return this.b;
    }

    public final Object c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b);
    }

    public int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
