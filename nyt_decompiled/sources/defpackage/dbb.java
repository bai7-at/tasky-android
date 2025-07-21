package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* loaded from: classes2.dex */
final class dbb extends ila {
    private final Context c;

    dbb(Context context) {
        this.c = context;
    }

    @Override // defpackage.ila
    public final void a() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.c);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            fgb.e("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        egb.j(z);
        fgb.g("Update ad debug logging enablement as " + z);
    }
}
