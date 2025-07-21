package defpackage;

/* loaded from: classes2.dex */
public abstract class ip2 implements z72 {
    private final z72 a;

    public ip2(z72 z72Var) {
        this.a = z72Var;
    }

    @Override // defpackage.z72
    public int a(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.z72
    public boolean e(byte[] bArr, int i, int i2, boolean z) {
        return this.a.e(bArr, i, i2, z);
    }

    @Override // defpackage.z72
    public void g() {
        this.a.g();
    }

    @Override // defpackage.z72
    public long getLength() {
        return this.a.getLength();
    }

    @Override // defpackage.z72
    public long getPosition() {
        return this.a.getPosition();
    }

    @Override // defpackage.z72
    public boolean h(byte[] bArr, int i, int i2, boolean z) {
        return this.a.h(bArr, i, i2, z);
    }

    @Override // defpackage.z72
    public long l() {
        return this.a.l();
    }

    @Override // defpackage.z72
    public void n(int i) {
        this.a.n(i);
    }

    @Override // defpackage.z72
    public int o(byte[] bArr, int i, int i2) {
        return this.a.o(bArr, i, i2);
    }

    @Override // defpackage.z72
    public void p(int i) {
        this.a.p(i);
    }

    @Override // defpackage.z72
    public boolean q(int i, boolean z) {
        return this.a.q(i, z);
    }

    @Override // defpackage.z72
    public void r(byte[] bArr, int i, int i2) {
        this.a.r(bArr, i, i2);
    }

    @Override // defpackage.z72, defpackage.s91
    public int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }

    @Override // defpackage.z72
    public void readFully(byte[] bArr, int i, int i2) {
        this.a.readFully(bArr, i, i2);
    }
}
