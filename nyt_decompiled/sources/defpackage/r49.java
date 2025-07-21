package defpackage;

/* loaded from: classes.dex */
public final class r49 implements l49 {
    private final int a;

    public r49(int i) {
        this.a = i;
    }

    @Override // defpackage.l49
    public int c() {
        return this.a;
    }

    @Override // defpackage.l49
    public int d() {
        return 0;
    }

    @Override // defpackage.i49
    public mi f(long j, mi miVar, mi miVar2, mi miVar3) {
        return miVar3;
    }

    @Override // defpackage.i49
    public mi g(long j, mi miVar, mi miVar2, mi miVar3) {
        return j < ((long) c()) * 1000000 ? miVar : miVar2;
    }
}
