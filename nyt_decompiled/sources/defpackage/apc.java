package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class apc extends hrc {
    final /* synthetic */ Long e;
    final /* synthetic */ String f;
    final /* synthetic */ String g;
    final /* synthetic */ Bundle h;
    final /* synthetic */ boolean i;
    final /* synthetic */ boolean j;
    final /* synthetic */ j4d k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    apc(j4d j4dVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(j4dVar, true);
        this.k = j4dVar;
        this.e = l;
        this.f = str;
        this.g = str2;
        this.h = bundle;
        this.i = z;
        this.j = z2;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        Long l = this.e;
        long longValue = l == null ? this.a : l.longValue();
        sdbVar = this.k.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).logEvent(this.f, this.g, this.h, this.i, this.j, longValue);
    }
}
