package defpackage;

/* loaded from: classes.dex */
public final class gw7 implements sw1 {
    private final int a;

    public gw7(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof gw7) && ((gw7) obj).a == this.a;
    }

    public int hashCode() {
        return this.a;
    }

    @Override // defpackage.ci
    public l49 a(hu8 hu8Var) {
        return new r49(this.a);
    }
}
