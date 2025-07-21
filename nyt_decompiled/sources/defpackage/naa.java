package defpackage;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class naa {
    private final String a;
    private final String b;

    public naa(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && naa.class == obj.getClass()) {
            naa naaVar = (naa) obj;
            if (TextUtils.equals(this.a, naaVar.a) && TextUtils.equals(this.b, naaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.a + ",value=" + this.b + "]";
    }
}
