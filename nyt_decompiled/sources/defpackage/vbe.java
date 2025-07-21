package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.internal.ads.a2;
import com.google.android.gms.internal.ads.z1;
import com.google.android.gms.internal.ads.zzfso;
import com.google.android.gms.internal.ads.zzgyl;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class vbe implements wae {
    private final Object a;
    private final wbe b;
    private final cce c;
    private final tae d;

    vbe(Object obj, wbe wbeVar, cce cceVar, tae taeVar) {
        this.a = obj;
        this.b = wbeVar;
        this.c = cceVar;
        this.d = taeVar;
    }

    private static String e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        z1 L = a2.L();
        L.p(5);
        L.n(zzgyl.D(bArr, 0, bArr.length));
        return Base64.encodeToString(((a2) L.i()).i(), 11);
    }

    private final synchronized byte[] f(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.d.c(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.a, null, map2);
    }

    public final synchronized int a() {
        try {
        } catch (Exception e) {
            throw new zzfso(2006, e);
        }
        return ((Integer) this.a.getClass().getDeclaredMethod("lcs", null).invoke(this.a, null)).intValue();
    }

    final wbe b() {
        return this.b;
    }

    public final synchronized void c() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.a.getClass().getDeclaredMethod("close", null).invoke(this.a, null);
            this.d.d(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfso(2003, e);
        }
    }

    final synchronized boolean d() {
        try {
        } catch (Exception e) {
            throw new zzfso(2001, e);
        }
        return ((Boolean) this.a.getClass().getDeclaredMethod("init", null).invoke(this.a, null)).booleanValue();
    }

    @Override // defpackage.wae
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.c.zza();
        zza.put(QueryKeys.VISIT_FREQUENCY, QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put("view", view);
        zza.put("act", activity);
        return e(f(null, zza));
    }

    @Override // defpackage.wae
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map zzc;
        zzc = this.c.zzc();
        zzc.put(QueryKeys.VISIT_FREQUENCY, QueryKeys.INTERNAL_REFERRER);
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put("view", view);
        zzc.put("act", activity);
        return e(f(null, zzc));
    }

    @Override // defpackage.wae
    public final synchronized String zzc(Context context, String str) {
        Map zzb;
        zzb = this.c.zzb();
        zzb.put(QueryKeys.VISIT_FREQUENCY, "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return e(f(null, zzb));
    }

    @Override // defpackage.wae
    public final synchronized void zzd(String str, MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put(QueryKeys.TOKEN, new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.a.getClass().getDeclaredMethod("he", Map.class).invoke(this.a, hashMap);
            this.d.d(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfso(2005, e);
        }
    }
}
