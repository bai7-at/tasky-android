package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzfs;

/* loaded from: classes2.dex */
public abstract class hh0 extends BroadcastReceiver {
    static Boolean zza;

    public static boolean zzb(@RecentlyNonNull Context context) {
        Preconditions.checkNotNull(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zzi = zzfs.zzi(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        zza = Boolean.valueOf(zzi);
        return zzi;
    }
}
