package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class x5c extends hrc {
    final /* synthetic */ m9b e;
    final /* synthetic */ j4d f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x5c(j4d j4dVar, m9b m9bVar) {
        super(j4dVar, true);
        this.f = j4dVar;
        this.e = m9bVar;
    }

    @Override // defpackage.hrc
    final void a() {
        sdb sdbVar;
        sdbVar = this.f.i;
        ((sdb) Preconditions.checkNotNull(sdbVar)).getGmpAppId(this.e);
    }

    @Override // defpackage.hrc
    protected final void b() {
        this.e.G(null);
    }
}
