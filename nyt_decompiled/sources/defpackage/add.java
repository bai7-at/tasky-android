package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzfh;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class add implements g9d {
    private static Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // defpackage.g9d
    public final j64 a(g1e g1eVar, v0e v0eVar) {
        String optString = v0eVar.w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        s1e s1eVar = g1eVar.a.a;
        q1e q1eVar = new q1e();
        q1eVar.G(s1eVar);
        q1eVar.J(optString);
        Bundle d = d(s1eVar.d.zzm);
        Bundle d2 = d(d.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        d2.putInt("gw", 1);
        String optString2 = v0eVar.w.optString("mad_hac", null);
        if (optString2 != null) {
            d2.putString("mad_hac", optString2);
        }
        String optString3 = v0eVar.w.optString("adJson", null);
        if (optString3 != null) {
            d2.putString("_ad", optString3);
        }
        d2.putBoolean("_noRefresh", true);
        Iterator<String> keys = v0eVar.E.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = v0eVar.E.optString(next, null);
            if (next != null) {
                d2.putString(next, optString4);
            }
        }
        d.putBundle("com.google.ads.mediation.admob.AdMobAdapter", d2);
        zzl zzlVar = s1eVar.d;
        Bundle bundle = zzlVar.zzn;
        List list = zzlVar.zzo;
        String str = zzlVar.zzp;
        int i = zzlVar.zzd;
        String str2 = zzlVar.zzq;
        List list2 = zzlVar.zze;
        boolean z = zzlVar.zzr;
        boolean z2 = zzlVar.zzf;
        zzc zzcVar = zzlVar.zzs;
        int i2 = zzlVar.zzg;
        int i3 = zzlVar.zzt;
        boolean z3 = zzlVar.zzh;
        String str3 = zzlVar.zzu;
        String str4 = zzlVar.zzi;
        List list3 = zzlVar.zzv;
        zzfh zzfhVar = zzlVar.zzj;
        int i4 = zzlVar.zzw;
        q1eVar.e(new zzl(zzlVar.zza, zzlVar.zzb, d2, i, list2, z2, i2, z3, str4, zzfhVar, zzlVar.zzk, zzlVar.zzl, d, bundle, list, str, str2, z, zzcVar, i3, str3, list3, i4, zzlVar.zzx, zzlVar.zzy));
        s1e g = q1eVar.g();
        Bundle bundle2 = new Bundle();
        y0e y0eVar = g1eVar.b.b;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList<>(y0eVar.a));
        bundle3.putInt("refresh_interval", y0eVar.c);
        bundle3.putString("gws_query_id", y0eVar.b);
        bundle2.putBundle("parent_common_config", bundle3);
        s1e s1eVar2 = g1eVar.a.a;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", s1eVar2.f);
        bundle4.putString("allocation_id", v0eVar.x);
        bundle4.putStringArrayList("click_urls", new ArrayList<>(v0eVar.c));
        bundle4.putStringArrayList("imp_urls", new ArrayList<>(v0eVar.d));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList<>(v0eVar.q));
        bundle4.putStringArrayList("fill_urls", new ArrayList<>(v0eVar.n));
        bundle4.putStringArrayList("video_start_urls", new ArrayList<>(v0eVar.h));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList<>(v0eVar.i));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList<>(v0eVar.j));
        bundle4.putString("transaction_id", v0eVar.k);
        bundle4.putString("valid_from_timestamp", v0eVar.l);
        bundle4.putBoolean("is_closable_area_disabled", v0eVar.Q);
        bundle4.putString("recursive_server_response_data", v0eVar.p0);
        if (v0eVar.m != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", v0eVar.m.zzb);
            bundle5.putString("rb_type", v0eVar.m.zza);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return c(g, bundle2, v0eVar, g1eVar);
    }

    @Override // defpackage.g9d
    public final boolean b(g1e g1eVar, v0e v0eVar) {
        return !TextUtils.isEmpty(v0eVar.w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    protected abstract j64 c(s1e s1eVar, Bundle bundle, v0e v0eVar, g1e g1eVar);
}
