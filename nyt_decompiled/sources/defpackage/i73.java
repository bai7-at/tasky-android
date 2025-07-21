package defpackage;

/* loaded from: classes2.dex */
public class i73 {
    private int a = 1;

    public i73 a(Object obj) {
        this.a = (this.a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.a;
    }

    public final i73 c(boolean z) {
        this.a = (this.a * 31) + (z ? 1 : 0);
        return this;
    }
}
