package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* loaded from: classes3.dex */
final class afb implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ ugb b;

    afb(bfb bfbVar, Context context, ugb ugbVar) {
        this.a = context;
        this.b = ugbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.c(AdvertisingIdClient.getAdvertisingIdInfo(this.a));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.b.d(e);
            fgb.e("Exception while getting advertising Id info", e);
        }
    }
}
