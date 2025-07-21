package defpackage;

/* loaded from: classes2.dex */
public final class z42 implements ca2 {

    private static final class a {
        private static final z42 a = new z42();
    }

    public static z42 a() {
        return a.a;
    }

    public static String b() {
        return (String) a16.c(y42.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
