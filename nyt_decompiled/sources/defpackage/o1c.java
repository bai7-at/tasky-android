package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzcl;

/* loaded from: classes3.dex */
final class o1c extends hrc {
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ Context g;
    final /* synthetic */ Bundle h;
    final /* synthetic */ j4d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o1c(j4d j4dVar, String str, String str2, Context context, Bundle bundle) {
        super(j4dVar, true);
        this.i = j4dVar;
        this.e = str;
        this.f = str2;
        this.g = context;
        this.h = bundle;
    }

    @Override // defpackage.hrc
    public final void a() {
        boolean o;
        String str;
        String str2;
        String str3;
        sdb sdbVar;
        sdb sdbVar2;
        String str4;
        String str5;
        try {
            j4d j4dVar = this.i;
            o = j4d.o(this.e, this.f);
            if (o) {
                String str6 = this.f;
                String str7 = this.e;
                str5 = this.i.a;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.g);
            j4d j4dVar2 = this.i;
            j4dVar2.i = j4dVar2.u(this.g, true);
            sdbVar = this.i.i;
            if (sdbVar == null) {
                str4 = this.i.a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.a(this.g, ModuleDescriptor.MODULE_ID);
            zzcl zzclVar = new zzcl(64000L, Math.max(a, r0), DynamiteModule.c(this.g, ModuleDescriptor.MODULE_ID) < a, str, str2, str3, this.h, wie.a(this.g));
            sdbVar2 = this.i.i;
            ((sdb) Preconditions.checkNotNull(sdbVar2)).initialize(fc5.l3(this.g), zzclVar, this.a);
        } catch (Exception e) {
            this.i.l(e, true, false);
        }
    }
}
