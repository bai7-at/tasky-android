package defpackage;

/* loaded from: classes3.dex */
public class ct8 {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final ct8 d;

    public ct8(Throwable th, f08 f08Var) {
        this.a = th.getLocalizedMessage();
        this.b = th.getClass().getName();
        this.c = f08Var.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.d = cause != null ? new ct8(cause, f08Var) : null;
    }
}
