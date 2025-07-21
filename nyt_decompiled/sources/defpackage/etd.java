package defpackage;

import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import defpackage.oc;
import defpackage.qm;

/* loaded from: classes3.dex */
final class etd implements qm.a {
    final /* synthetic */ die a;

    public etd(die dieVar) {
        this.a = dieVar;
    }

    @Override // defpackage.x4f
    public final void a(String str, String str2, Bundle bundle, long j) {
        oc.b bVar;
        if (str == null || str.equals("crash") || !cbb.h(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        bVar = this.a.a;
        bVar.a(3, bundle2);
    }
}
