package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class p62 implements ca2 {

    private static final class a {
        private static final p62 a = new p62();
    }

    public static p62 a() {
        return a.a;
    }

    public static Executor b() {
        return (Executor) a16.c(o62.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
