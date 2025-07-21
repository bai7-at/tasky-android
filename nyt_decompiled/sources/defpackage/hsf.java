package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes2.dex */
public final class hsf {
    private static hsf d;
    private e28 a;
    private GoogleSignInAccount b;
    private GoogleSignInOptions c;

    private hsf(Context context) {
        e28 b = e28.b(context);
        this.a = b;
        this.b = b.c();
        this.c = this.a.d();
    }

    public static synchronized hsf c(Context context) {
        hsf d2;
        synchronized (hsf.class) {
            d2 = d(context.getApplicationContext());
        }
        return d2;
    }

    private static synchronized hsf d(Context context) {
        synchronized (hsf.class) {
            hsf hsfVar = d;
            if (hsfVar != null) {
                return hsfVar;
            }
            hsf hsfVar2 = new hsf(context);
            d = hsfVar2;
            return hsfVar2;
        }
    }

    public final synchronized void a() {
        this.a.a();
        this.b = null;
        this.c = null;
    }

    public final synchronized void b(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.a.f(googleSignInAccount, googleSignInOptions);
        this.b = googleSignInAccount;
        this.c = googleSignInOptions;
    }
}
