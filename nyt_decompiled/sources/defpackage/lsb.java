package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class lsb extends hrc {
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ m9b g;
    final /* synthetic */ j4d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    lsb(j4d j4dVar, String str, String str2, m9b m9bVar) {
        super(j4dVar, true);
        this.h = j4dVar;
        this.e = str;
        this.f = str2;
        this.g = m9bVar;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        sdbVar = this.h.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).getConditionalUserProperties(this.e, this.f, this.g);
    }

    @Override // defpackage.hrc
    protected final void b() {
        this.g.G(null);
    }
}
