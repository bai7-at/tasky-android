package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.google.android.gms.common.annotation.KeepForSdk;
import defpackage.d3b;
import defpackage.d7b;
import defpackage.fc5;
import defpackage.kia;

@KeepForSdk
/* loaded from: classes2.dex */
public class OfflineNotificationPoster extends Worker {
    private final d7b e;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = kia.a().i(context, new d3b());
    }

    @Override // androidx.work.Worker
    public final b.a doWork() {
        try {
            this.e.Y2(fc5.l3(getApplicationContext()), new zza(getInputData().f("uri"), getInputData().f("gws_query_id"), getInputData().f("image_url")));
            return b.a.c();
        } catch (RemoteException unused) {
            return b.a.a();
        }
    }
}
