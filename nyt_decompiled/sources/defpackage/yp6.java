package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class yp6 {
    private final List a;
    private final String b;

    public yp6(List list, String str) {
        zq3.h(list, "assets");
        this.a = list;
        this.b = str;
    }

    public final List a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp6)) {
            return false;
        }
        yp6 yp6Var = (yp6) obj;
        return zq3.c(this.a, yp6Var.a) && zq3.c(this.b, yp6Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ReadingListPage(assets=" + this.a + ", nextPage=" + this.b + ")";
    }
}
