package defpackage;

/* loaded from: classes5.dex */
public abstract class n47 {
    public void a(Throwable th) {
    }

    public final String b(Object obj) {
        try {
            return c(obj);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return obj.getClass().getName() + ".errorRendering";
        } catch (Throwable th) {
            e62.d(th);
            return obj.getClass().getName() + ".errorRendering";
        }
    }

    protected String c(Object obj) {
        return null;
    }
}
