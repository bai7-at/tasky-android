package defpackage;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.a;
import com.google.android.gms.auth.api.signin.b;
import com.google.android.gms.common.util.UidVerifier;

/* loaded from: classes2.dex */
public final class q0g extends qwf {
    private final Context a;

    public q0g(Context context) {
        this.a = context;
    }

    private final void g() {
        if (UidVerifier.isGooglePlayServicesUid(this.a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    @Override // defpackage.xof
    public final void zzp() {
        g();
        e28 b = e28.b(this.a);
        GoogleSignInAccount c = b.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (c != null) {
            googleSignInOptions = b.d();
        }
        b a = a.a(this.a, googleSignInOptions);
        if (c != null) {
            a.e();
        } else {
            a.f();
        }
    }

    @Override // defpackage.xof
    public final void zzq() {
        g();
        hsf.c(this.a).a();
    }
}
