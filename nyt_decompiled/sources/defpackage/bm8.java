package defpackage;

/* loaded from: classes2.dex */
public final class bm8 implements ca2 {

    private static final class a {
        private static final bm8 a = new bm8();
    }

    public static bm8 a() {
        return a.a;
    }

    public static ul0 b() {
        return (ul0) a16.c(am8.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ul0 get() {
        return b();
    }
}
