package defpackage;

/* loaded from: classes.dex */
public final class u04 {
    private b a;

    public interface a {
        void cancel();
    }

    public interface b {
        a a(int i, long j);
    }

    public final a a(int i, long j) {
        a a2;
        b bVar = this.a;
        return (bVar == null || (a2 = bVar.a(i, j)) == null) ? qw1.a : a2;
    }

    public final void b(b bVar) {
        this.a = bVar;
    }
}
