package defpackage;

/* loaded from: classes5.dex */
public final class mb7 {
    private static final mb7 d = new mb7();
    private final eb7 a;
    private final eb7 b;
    private final eb7 c;

    private mb7() {
        s47 e = r47.b().e();
        eb7 g = e.g();
        if (g != null) {
            this.a = g;
        } else {
            this.a = s47.a();
        }
        eb7 i = e.i();
        if (i != null) {
            this.b = i;
        } else {
            this.b = s47.c();
        }
        eb7 j = e.j();
        if (j != null) {
            this.c = j;
        } else {
            this.c = s47.e();
        }
    }

    public static eb7 a() {
        return d.a;
    }

    public static eb7 b() {
        return d.b;
    }
}
