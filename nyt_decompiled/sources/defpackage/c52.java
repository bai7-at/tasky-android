package defpackage;

/* loaded from: classes2.dex */
public final class c52 implements ca2 {

    private static final class a {
        private static final c52 a = new c52();
    }

    public static c52 a() {
        return a.a;
    }

    public static x42 c() {
        return (x42) a16.c(y42.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x42 get() {
        return c();
    }
}
