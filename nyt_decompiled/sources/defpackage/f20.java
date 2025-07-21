package defpackage;

import defpackage.r18;

/* loaded from: classes3.dex */
final class f20 extends r18 {
    private final r18.a a;
    private final r18.c b;
    private final r18.b c;

    f20(r18.a aVar, r18.c cVar, r18.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.c = bVar;
    }

    @Override // defpackage.r18
    public r18.a a() {
        return this.a;
    }

    @Override // defpackage.r18
    public r18.b c() {
        return this.c;
    }

    @Override // defpackage.r18
    public r18.c d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r18)) {
            return false;
        }
        r18 r18Var = (r18) obj;
        return this.a.equals(r18Var.a()) && this.b.equals(r18Var.d()) && this.c.equals(r18Var.c());
    }

    public int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
