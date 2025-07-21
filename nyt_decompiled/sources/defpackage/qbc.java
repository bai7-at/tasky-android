package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class qbc extends hrc {
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ boolean g;
    final /* synthetic */ m9b h;
    final /* synthetic */ j4d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    qbc(j4d j4dVar, String str, String str2, boolean z, m9b m9bVar) {
        super(j4dVar, true);
        this.i = j4dVar;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = m9bVar;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        sdbVar = this.i.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).getUserProperties(this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.hrc
    protected final void b() {
        this.h.G(null);
    }
}
