package defpackage;

/* loaded from: classes.dex */
public interface i49 {
    boolean a();

    long b(mi miVar, mi miVar2, mi miVar3);

    default mi e(mi miVar, mi miVar2, mi miVar3) {
        return f(b(miVar, miVar2, miVar3), miVar, miVar2, miVar3);
    }

    mi f(long j, mi miVar, mi miVar2, mi miVar3);

    mi g(long j, mi miVar, mi miVar2, mi miVar3);
}
