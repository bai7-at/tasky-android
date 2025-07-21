package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.pal.zzagc;
import com.google.android.gms.internal.pal.zzil;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class dha extends ipa {
    private final Context e;

    public dha(Handler handler, ExecutorService executorService, Context context) {
        super(handler, executorService, zzagc.b(2L));
        this.e = context;
    }

    private final zzil g() {
        if (this.e.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            try {
                ContentResolver contentResolver = this.e.getContentResolver();
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                boolean z = true;
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                    z = false;
                }
                return zzil.f(new kja(string, "afai", z));
            } catch (Settings.SettingNotFoundException e) {
                Log.e("NonceGenerator", "Failed to retrieve advertising info from amazon fire tv.", e);
            }
        }
        return zzil.e();
    }

    private final zzil h() {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.e);
            String id = advertisingIdInfo.getId();
            if (id == null) {
                id = "";
            }
            return zzil.f(new kja(id, "adid", advertisingIdInfo.isLimitAdTrackingEnabled()));
        } catch (GooglePlayServicesNotAvailableException e) {
            Log.e("NonceGenerator", "Google Play services is not available entirely.", e);
            return zzil.e();
        } catch (GooglePlayServicesRepairableException e2) {
            Log.e("NonceGenerator", "Obsolete or disabled version of Google Play Services", e2);
            return zzil.e();
        } catch (IOException e3) {
            Log.e("NonceGenerator", "Unrecoverable error connecting to Google Play services.", e3);
            return zzil.e();
        } catch (IllegalStateException e4) {
            Log.e("NonceGenerator", "IllegalStateException, can't access android advertising info.", e4);
            return zzil.e();
        }
    }

    @Override // defpackage.ipa
    final zzil a() {
        zzil g = g();
        return !g.d() ? h() : g;
    }
}
