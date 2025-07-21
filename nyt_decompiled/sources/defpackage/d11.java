package defpackage;

import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import defpackage.oc;
import java.util.Locale;

/* loaded from: classes3.dex */
class d11 implements oc.b {
    private yc a;
    private yc b;

    d11() {
    }

    private static void b(yc ycVar, String str, Bundle bundle) {
        if (ycVar == null) {
            return;
        }
        ycVar.r0(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.a : this.b, str, bundle);
    }

    @Override // oc.b
    public void a(int i, Bundle bundle) {
        String string;
        m94.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle == null || (string = bundle.getString(AuthenticationTokenClaims.JSON_KEY_NAME)) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(yc ycVar) {
        this.b = ycVar;
    }

    public void e(yc ycVar) {
        this.a = ycVar;
    }
}
