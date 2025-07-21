package defpackage;

/* loaded from: classes5.dex */
public abstract class q47 {
    public static void a(Throwable th) {
        try {
            r47.b().a().a(th);
        } catch (Throwable th2) {
            b(th2);
        }
    }

    private static void b(Throwable th) {
        System.err.println("RxJavaErrorHandler threw an Exception. It shouldn't. => " + th.getMessage());
        th.printStackTrace();
    }
}
