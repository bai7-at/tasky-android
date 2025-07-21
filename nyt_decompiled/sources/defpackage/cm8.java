package defpackage;

/* loaded from: classes2.dex */
public final class cm8 implements ca2 {

    private static final class a {
        private static final cm8 a = new cm8();
    }

    public static cm8 a() {
        return a.a;
    }

    public static ul0 c() {
        return (ul0) a16.c(am8.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ul0 get() {
        return c();
    }
}
