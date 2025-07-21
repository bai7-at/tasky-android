package defpackage;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class uub extends hrc {
    final /* synthetic */ Activity e;
    final /* synthetic */ String f;
    final /* synthetic */ String g;
    final /* synthetic */ j4d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    uub(j4d j4dVar, Activity activity, String str, String str2) {
        super(j4dVar, true);
        this.h = j4dVar;
        this.e = activity;
        this.f = str;
        this.g = str2;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        sdbVar = this.h.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).setCurrentScreen(fc5.l3(this.e), this.f, this.g, this.a);
    }
}
