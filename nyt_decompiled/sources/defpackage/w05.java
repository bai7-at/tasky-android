package defpackage;

import java.util.Map;

/* loaded from: classes4.dex */
public final class w05 {
    private final String a;
    private final String b;
    private final Map c;

    public w05(String str, String str2, Map map) {
        zq3.h(map, "data");
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final Map a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w05)) {
            return false;
        }
        w05 w05Var = (w05) obj;
        return zq3.c(this.a, w05Var.a) && zq3.c(this.b, w05Var.b) && zq3.c(this.c, w05Var.c);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "NYTNotification(title=" + this.a + ", body=" + this.b + ", data=" + this.c + ")";
    }
}
