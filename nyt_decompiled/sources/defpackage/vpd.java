package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class vpd implements gqd {
    private final kke a;
    private final Context b;
    private final zzcei c;
    private final String d;

    vpd(kke kkeVar, Context context, zzcei zzceiVar, String str) {
        this.a = kkeVar;
        this.b = context;
        this.c = zzceiVar;
        this.d = str;
    }

    final /* synthetic */ wpd a() {
        boolean isCallerInstantApp = Wrappers.packageManager(this.b).isCallerInstantApp();
        dyf.r();
        boolean d = wxf.d(this.b);
        String str = this.c.zza;
        dyf.r();
        boolean e = wxf.e();
        dyf.r();
        ApplicationInfo applicationInfo = this.b.getApplicationInfo();
        int i = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        Context context = this.b;
        return new wpd(isCallerInstantApp, d, str, e, i, DynamiteModule.c(context, ModuleDescriptor.MODULE_ID), DynamiteModule.a(context, ModuleDescriptor.MODULE_ID), this.d);
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 35;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: upd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return vpd.this.a();
            }
        });
    }
}
