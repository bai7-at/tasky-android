package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.zzc;

/* loaded from: classes2.dex */
public final class kq9 {
    public static final boolean a(Context context, Intent intent, wq9 wq9Var, n5g n5gVar, boolean z) {
        if (z) {
            return c(context, intent.getData(), wq9Var, n5gVar);
        }
        try {
            pzc.k("Launching an intent: " + intent.toURI());
            dyf.r();
            wxf.s(context, intent);
            if (wq9Var != null) {
                wq9Var.zzg();
            }
            if (n5gVar != null) {
                n5gVar.a(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            fgb.g(e.getMessage());
            if (n5gVar != null) {
                n5gVar.a(false);
            }
            return false;
        }
    }

    public static final boolean b(Context context, zzc zzcVar, wq9 wq9Var, n5g n5gVar) {
        int i = 0;
        if (zzcVar == null) {
            fgb.g("No intent data for launcher overlay.");
            return false;
        }
        mpa.a(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return a(context, intent, wq9Var, n5gVar, zzcVar.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzcVar.zzb)) {
            fgb.g("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(zzcVar.zzc)) {
            intent2.setData(Uri.parse(zzcVar.zzb));
        } else {
            String str = zzcVar.zzb;
            intent2.setDataAndType(Uri.parse(str), zzcVar.zzc);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzcVar.zzd)) {
            intent2.setPackage(zzcVar.zzd);
        }
        if (!TextUtils.isEmpty(zzcVar.zze)) {
            String[] split = zzcVar.zze.split("/", 2);
            if (split.length < 2) {
                fgb.g("Could not parse component name from open GMSG: ".concat(String.valueOf(zzcVar.zze)));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str2 = zzcVar.zzf;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                fgb.g("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) pla.c().a(mpa.v4)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) pla.c().a(mpa.u4)).booleanValue()) {
                dyf.r();
                wxf.Q(context, intent2);
            }
        }
        return a(context, intent2, wq9Var, n5gVar, zzcVar.zzj);
    }

    private static final boolean c(Context context, Uri uri, wq9 wq9Var, n5g n5gVar) {
        int i;
        try {
            i = dyf.r().O(context, uri);
            if (wq9Var != null) {
                wq9Var.zzg();
            }
        } catch (ActivityNotFoundException e) {
            fgb.g(e.getMessage());
            i = 6;
        }
        if (n5gVar != null) {
            n5gVar.zzb(i);
        }
        return i == 5;
    }
}
