package defpackage;

/* loaded from: classes2.dex */
final class m08 extends ip2 {
    private final long b;

    public m08(z72 z72Var, long j) {
        super(z72Var);
        ur.a(z72Var.getPosition() >= j);
        this.b = j;
    }

    @Override // defpackage.ip2, defpackage.z72
    public long getLength() {
        return super.getLength() - this.b;
    }

    @Override // defpackage.ip2, defpackage.z72
    public long getPosition() {
        return super.getPosition() - this.b;
    }

    @Override // defpackage.ip2, defpackage.z72
    public long l() {
        return super.l() - this.b;
    }
}
