package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.a;
import androidx.work.c;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.common.annotation.KeepForSdk;
import defpackage.ee3;
import defpackage.fc5;
import defpackage.fgb;
import defpackage.gv0;
import defpackage.h2b;
import defpackage.mj9;

@KeepForSdk
/* loaded from: classes2.dex */
public class WorkManagerUtil extends h2b {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void w6(Context context) {
        try {
            mj9.i(context.getApplicationContext(), new a.C0120a().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.n3b
    public final void zze(ee3 ee3Var) {
        Context context = (Context) fc5.Q1(ee3Var);
        w6(context);
        try {
            mj9 g = mj9.g(context);
            g.a("offline_ping_sender_work");
            g.c((c) ((c.a) ((c.a) new c.a(OfflinePingSender.class).j(new gv0.a().b(NetworkType.CONNECTED).a())).a("offline_ping_sender_work")).b());
        } catch (IllegalStateException e) {
            fgb.h("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // defpackage.n3b
    public final boolean zzf(ee3 ee3Var, String str, String str2) {
        return zzg(ee3Var, new zza(str, str2, ""));
    }

    @Override // defpackage.n3b
    public final boolean zzg(ee3 ee3Var, zza zzaVar) {
        Context context = (Context) fc5.Q1(ee3Var);
        w6(context);
        gv0 a = new gv0.a().b(NetworkType.CONNECTED).a();
        try {
            mj9.g(context).c((c) ((c.a) ((c.a) ((c.a) new c.a(OfflineNotificationPoster.class).j(a)).m(new Data.a().p("uri", zzaVar.zza).p("gws_query_id", zzaVar.zzb).p("image_url", zzaVar.zzc).a())).a("offline_notification_work")).b());
            return true;
        } catch (IllegalStateException e) {
            fgb.h("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
