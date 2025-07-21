package defpackage;

import android.os.Bundle;
import defpackage.oc;
import defpackage.qm;

/* loaded from: classes3.dex */
final class n5c implements qm.a {
    final /* synthetic */ nzc a;

    public n5c(nzc nzcVar) {
        this.a = nzcVar;
    }

    @Override // defpackage.x4f
    public final void a(String str, String str2, Bundle bundle, long j) {
        oc.b bVar;
        if (this.a.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", cbb.c(str2));
            bVar = this.a.b;
            bVar.a(2, bundle2);
        }
    }
}
