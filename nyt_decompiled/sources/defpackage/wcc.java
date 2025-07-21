package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class wcc extends hrc {
    final /* synthetic */ String e;
    final /* synthetic */ Object f;
    final /* synthetic */ j4d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    wcc(j4d j4dVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(j4dVar, false);
        this.g = j4dVar;
        this.e = str;
        this.f = obj;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        sdbVar = this.g.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).logHealthData(5, this.e, fc5.l3(this.f), fc5.l3(null), fc5.l3(null));
    }
}
