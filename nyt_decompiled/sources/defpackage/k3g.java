package defpackage;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class k3g implements gke {
    final /* synthetic */ d8b a;
    final /* synthetic */ boolean b;
    final /* synthetic */ qq9 c;

    k3g(qq9 qq9Var, d8b d8bVar, boolean z) {
        this.a = d8bVar;
        this.b = z;
        this.c = qq9Var;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        try {
            this.a.b("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            fgb.e("", e);
        }
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z;
        String str;
        Uri Y6;
        d8e d8eVar;
        d8e d8eVar2;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.a.Y0(arrayList);
            z = this.c.s;
            if (!z && !this.b) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Uri uri = (Uri) it2.next();
                if (this.c.P6(uri)) {
                    str = this.c.M;
                    Y6 = qq9.Y6(uri, str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    d8eVar = this.c.r;
                    d8eVar.c(Y6.toString(), null);
                } else {
                    if (((Boolean) pla.c().a(mpa.x7)).booleanValue()) {
                        d8eVar2 = this.c.r;
                        d8eVar2.c(uri.toString(), null);
                    }
                }
            }
        } catch (RemoteException e) {
            fgb.e("", e);
        }
    }
}
