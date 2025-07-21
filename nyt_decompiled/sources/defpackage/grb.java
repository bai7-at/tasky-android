package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class grb extends hrc {
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ Bundle g;
    final /* synthetic */ j4d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    grb(j4d j4dVar, String str, String str2, Bundle bundle) {
        super(j4dVar, true);
        this.h = j4dVar;
        this.e = str;
        this.f = str2;
        this.g = bundle;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        sdbVar = this.h.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).clearConditionalUserProperty(this.e, this.f, this.g);
    }
}
