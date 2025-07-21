package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class igc extends hrc {
    final /* synthetic */ String e;
    final /* synthetic */ m9b f;
    final /* synthetic */ j4d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    igc(j4d j4dVar, String str, m9b m9bVar) {
        super(j4dVar, true);
        this.g = j4dVar;
        this.e = str;
        this.f = m9bVar;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        sdbVar = this.g.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).getMaxUserProperties(this.e, this.f);
    }

    @Override // defpackage.hrc
    protected final void b() {
        this.f.G(null);
    }
}
