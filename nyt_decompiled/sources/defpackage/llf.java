package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class llf implements Callable {
    final /* synthetic */ wwf a;

    llf(wwf wwfVar) {
        this.a = wwfVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzcei zzceiVar;
        Context context;
        wwf wwfVar = this.a;
        zzceiVar = wwfVar.a;
        String str = zzceiVar.zza;
        context = wwfVar.d;
        return new gfa(ffa.u(str, context, false));
    }
}
