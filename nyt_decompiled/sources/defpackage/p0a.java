package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes3.dex */
public final class p0a {
    private final SparseBooleanArray a;

    public final int a(int i) {
        wad.a(i, 0, this.a.size());
        return this.a.keyAt(i);
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean c(int i) {
        return this.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0a)) {
            return false;
        }
        p0a p0aVar = (p0a) obj;
        if (khe.a >= 24) {
            return this.a.equals(p0aVar.a);
        }
        if (this.a.size() != p0aVar.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (a(i) != p0aVar.a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (khe.a >= 24) {
            return this.a.hashCode();
        }
        int size = this.a.size();
        for (int i = 0; i < this.a.size(); i++) {
            size = (size * 31) + a(i);
        }
        return size;
    }
}
