package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
final class fdb implements gke {
    final /* synthetic */ j64 a;

    fdb(gdb gdbVar, j64 j64Var) {
        this.a = j64Var;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        List list;
        list = gdb.m;
        list.remove(this.a);
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        list = gdb.m;
        list.remove(this.a);
    }
}
