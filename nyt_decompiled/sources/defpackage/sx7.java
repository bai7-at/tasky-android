package defpackage;

import coil.decode.DataSource;

/* loaded from: classes.dex */
public final class sx7 extends nd2 {
    private final yg3 a;
    private final String b;
    private final DataSource c;

    public sx7(yg3 yg3Var, String str, DataSource dataSource) {
        super(null);
        this.a = yg3Var;
        this.b = str;
        this.c = dataSource;
    }

    public final DataSource a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final yg3 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sx7) {
            sx7 sx7Var = (sx7) obj;
            if (zq3.c(this.a, sx7Var.a) && zq3.c(this.b, sx7Var.b) && this.c == sx7Var.c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.c.hashCode();
    }
}
