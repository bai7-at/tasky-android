package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
final class p10 extends v73 {
    private final String a;
    private final List b;

    p10(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.b = list;
    }

    @Override // defpackage.v73
    public List b() {
        return this.b;
    }

    @Override // defpackage.v73
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v73)) {
            return false;
        }
        v73 v73Var = (v73) obj;
        return this.a.equals(v73Var.c()) && this.b.equals(v73Var.b());
    }

    public int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
