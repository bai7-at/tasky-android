package defpackage;

/* loaded from: classes.dex */
public abstract class wm3 {
    public static final long a(int i, int i2) {
        return vm3.e((i2 & 4294967295L) | (i << 32));
    }

    public static final long b(long j, long j2) {
        return hd5.a(fd5.o(j) - vm3.j(j2), fd5.p(j) - vm3.k(j2));
    }

    public static final long c(long j, long j2) {
        return hd5.a(fd5.o(j) + vm3.j(j2), fd5.p(j) + vm3.k(j2));
    }
}
