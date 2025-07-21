package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class dqc extends hrc {
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ Object g;
    final /* synthetic */ boolean h;
    final /* synthetic */ j4d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dqc(j4d j4dVar, String str, String str2, Object obj, boolean z) {
        super(j4dVar, true);
        this.i = j4dVar;
        this.e = str;
        this.f = str2;
        this.g = obj;
        this.h = z;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        sdbVar = this.i.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).setUserProperty(this.e, this.f, fc5.l3(this.g), this.h, this.a);
    }
}
