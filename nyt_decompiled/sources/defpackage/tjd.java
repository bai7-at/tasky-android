package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zb;

/* loaded from: classes3.dex */
public final class tjd implements gqd {
    private final gqd a;
    private final s1e b;
    private final Context c;
    private final kfb d;

    public tjd(sld sldVar, s1e s1eVar, Context context, kfb kfbVar) {
        this.a = sldVar;
        this.b = s1eVar;
        this.c = context;
        this.d = kfbVar;
    }

    final /* synthetic */ ujd a(lqd lqdVar) {
        String str;
        boolean z;
        String str2;
        float f;
        int i;
        int i2;
        int i3;
        DisplayMetrics displayMetrics;
        zzq zzqVar = this.b.e;
        zzq[] zzqVarArr = zzqVar.zzg;
        if (zzqVarArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzq zzqVar2 : zzqVarArr) {
                boolean z4 = zzqVar2.zzi;
                if (!z4 && !z2) {
                    str = zzqVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (z3) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzqVar.zza;
            z = zzqVar.zzi;
        }
        Resources resources = this.c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        } else {
            kfb kfbVar = this.d;
            f = displayMetrics.density;
            i2 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = kfbVar.i().zzm();
        }
        StringBuilder sb = new StringBuilder();
        zzq[] zzqVarArr2 = zzqVar.zzg;
        if (zzqVarArr2 != null) {
            boolean z5 = false;
            for (zzq zzqVar3 : zzqVarArr2) {
                if (zzqVar3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i4 = zzqVar3.zze;
                    if (i4 == -1) {
                        i4 = f != 0.0f ? (int) (zzqVar3.zzf / f) : -1;
                    }
                    sb.append(i4);
                    sb.append(QueryKeys.SCROLL_POSITION_TOP);
                    int i5 = zzqVar3.zzb;
                    if (i5 == -2) {
                        i5 = f != 0.0f ? (int) (zzqVar3.zzc / f) : -2;
                    }
                    sb.append(i5);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new ujd(zzqVar, str, z, sb.toString(), f, i2, i, str2, this.b.p);
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 7;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return zb.m(this.a.zzb(), new gge() { // from class: sjd
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                return tjd.this.a((lqd) obj);
            }
        }, pgb.f);
    }
}
