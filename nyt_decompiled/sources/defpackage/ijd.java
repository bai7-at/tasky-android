package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class ijd implements fqd {
    final s1e a;
    private final long b;

    public ijd(s1e s1eVar, long j) {
        Preconditions.checkNotNull(s1eVar, "the targeting must not be null");
        this.a = s1eVar;
        this.b = j;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzl zzlVar = this.a.d;
        bundle.putInt("http_timeout_millis", zzlVar.zzw);
        bundle.putString("slotname", this.a.f);
        int i = this.a.o.a;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.b);
        f2e.f(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb)), zzlVar.zzb != -1);
        f2e.b(bundle, "extras", zzlVar.zzc);
        int i3 = zzlVar.zzd;
        f2e.e(bundle, "cust_gender", i3, i3 != -1);
        f2e.d(bundle, "kw", zzlVar.zze);
        int i4 = zzlVar.zzg;
        f2e.e(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzlVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzlVar.zzy);
        f2e.e(bundle, "d_imp_hdr", 1, zzlVar.zza >= 2 && zzlVar.zzh);
        String str = zzlVar.zzi;
        f2e.f(bundle, "ppid", str, zzlVar.zza >= 2 && !TextUtils.isEmpty(str));
        Location location = zzlVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = location.getLongitude() * 1.0E7d;
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        f2e.c(bundle, "url", zzlVar.zzl);
        f2e.d(bundle, "neighboring_content_urls", zzlVar.zzv);
        f2e.b(bundle, "custom_targeting", zzlVar.zzn);
        f2e.d(bundle, "category_exclusions", zzlVar.zzo);
        f2e.c(bundle, "request_agent", zzlVar.zzp);
        f2e.c(bundle, "request_pkg", zzlVar.zzq);
        f2e.g(bundle, "is_designed_for_families", zzlVar.zzr, zzlVar.zza >= 7);
        if (zzlVar.zza >= 8) {
            int i5 = zzlVar.zzt;
            f2e.e(bundle, "tag_for_under_age_of_consent", i5, i5 != -1);
            f2e.c(bundle, "max_ad_content_rating", zzlVar.zzu);
        }
    }
}
