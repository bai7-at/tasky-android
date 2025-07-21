package defpackage;

import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.appset.g;

/* loaded from: classes3.dex */
final class ilf extends bzc {
    final /* synthetic */ qg8 a;

    ilf(g gVar, qg8 qg8Var) {
        this.a = qg8Var;
    }

    @Override // defpackage.vsd
    public final void k2(Status status, zzc zzcVar) {
        TaskUtil.setResultOrApiException(status, zzcVar != null ? new wm(zzcVar.t0(), zzcVar.zza()) : null, this.a);
    }
}
