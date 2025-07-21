package defpackage;

import android.app.Application;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class kq7 implements ba2 {
    private final p76 a;

    public kq7(p76 p76Var) {
        this.a = p76Var;
    }

    public static kq7 a(p76 p76Var) {
        return new kq7(p76Var);
    }

    public static OkHttpClient c(Application application) {
        return (OkHttpClient) g16.e(iq7.a.b(application));
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public OkHttpClient get() {
        return c((Application) this.a.get());
    }
}
