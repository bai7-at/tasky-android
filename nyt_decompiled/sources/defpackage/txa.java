package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzavj;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class txa {
    public static final uxa a = new uxa() { // from class: mwa
        @Override // defpackage.uxa
        public final void a(Object obj, Map map) {
            dnb dnbVar = (dnb) obj;
            uxa uxaVar = txa.a;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                fgb.g("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = dnbVar.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                Boolean valueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null);
                hashMap.put(str2, valueOf);
                pzc.k("/canOpenURLs;" + str2 + ";" + valueOf);
            }
            ((d0b) dnbVar).t("openableURLs", hashMap);
        }
    };
    public static final uxa b = new uxa() { // from class: owa
        @Override // defpackage.uxa
        public final void a(Object obj, Map map) {
            dnb dnbVar = (dnb) obj;
            uxa uxaVar = txa.a;
            if (!((Boolean) pla.c().a(mpa.d8)).booleanValue()) {
                fgb.g("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                fgb.g("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(dnbVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            pzc.k("/canOpenApp;" + str + ";" + valueOf);
            ((d0b) dnbVar).t("openableApp", hashMap);
        }
    };
    public static final uxa c = new uxa() { // from class: rwa
        @Override // defpackage.uxa
        public final void a(Object obj, Map map) {
            txa.b((dnb) obj, map);
        }
    };
    public static final uxa d = new gxa();
    public static final uxa e = new hxa();
    public static final uxa f = new uxa() { // from class: swa
        @Override // defpackage.uxa
        public final void a(Object obj, Map map) {
            dnb dnbVar = (dnb) obj;
            uxa uxaVar = txa.a;
            String str = (String) map.get(QueryKeys.USER_ID);
            if (str == null) {
                fgb.g("URL missing from httpTrack GMSG.");
            } else {
                new mbb(dnbVar.getContext(), ((knb) dnbVar).zzn().zza, str).b();
            }
        }
    };
    public static final uxa g = new ixa();
    public static final uxa h = new oxa();
    public static final uxa i = new uxa() { // from class: qwa
        @Override // defpackage.uxa
        public final void a(Object obj, Map map) {
            jnb jnbVar = (jnb) obj;
            uxa uxaVar = txa.a;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                gfa r2 = jnbVar.r();
                if (r2 != null) {
                    r2.c().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                fgb.g("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final uxa j = new pxa();
    public static final uxa k = new qxa();
    public static final uxa l = new akb();
    public static final uxa m = new bkb();
    public static final uxa n = new dwa();
    public static final jya o = new jya();
    public static final uxa p = new rxa();
    public static final uxa q = new sxa();
    public static final uxa r = new twa();
    public static final uxa s = new uwa();
    public static final uxa t = new vwa();
    public static final uxa u = new wwa();
    public static final uxa v = new xwa();
    public static final uxa w = new ywa();
    public static final uxa x = new zwa();
    public static final uxa y = new axa();
    public static final uxa z = new bxa();
    public static final uxa A = new cxa();
    public static final uxa B = new exa();
    public static final uxa C = new fxa();

    public static j64 a(wlb wlbVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            gfa r2 = wlbVar.r();
            w1e g2 = wlbVar.g();
            if (!((Boolean) pla.c().a(mpa.rb)).booleanValue() || g2 == null) {
                if (r2 != null && r2.f(parse)) {
                    parse = r2.a(parse, wlbVar.getContext(), wlbVar.h(), wlbVar.zzi());
                }
            } else if (r2 != null && r2.f(parse)) {
                parse = g2.a(parse, wlbVar.getContext(), wlbVar.h(), wlbVar.zzi());
            }
        } catch (zzavj unused) {
            fgb.g("Unable to append parameter to URL: ".concat(str));
        }
        final String b2 = eeb.b(parse, wlbVar.getContext());
        long longValue = ((Long) pra.e.e()).longValue();
        if (longValue <= 0 || longValue > 240304702) {
            return zb.h(b2);
        }
        vb C2 = vb.C(wlbVar.A0());
        jwa jwaVar = new gge() { // from class: jwa
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                uxa uxaVar = txa.a;
                if (!((Boolean) pra.k.e()).booleanValue()) {
                    return "failure_click_attok";
                }
                dyf.q().w(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        kke kkeVar = pgb.f;
        return zb.e(zb.m(zb.e(C2, Throwable.class, jwaVar, kkeVar), new gge() { // from class: kwa
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                uxa uxaVar = txa.a;
                String str3 = b2;
                if (str2 == null) {
                    return str3;
                }
                if (((Boolean) pra.f.e()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(str3).getHost();
                    for (int i2 = 0; i2 < 3; i2++) {
                        if (!host.endsWith(strArr[i2])) {
                        }
                    }
                    return str3;
                }
                String str4 = (String) pra.a.e();
                String str5 = (String) pra.b.e();
                if (!TextUtils.isEmpty(str4)) {
                    str3 = str3.replace(str4, str2);
                }
                if (TextUtils.isEmpty(str5)) {
                    return str3;
                }
                Uri parse2 = Uri.parse(str3);
                return TextUtils.isEmpty(parse2.getQueryParameter(str5)) ? parse2.buildUpon().appendQueryParameter(str5, str2).toString() : str3;
            }
        }, kkeVar), Throwable.class, new gge() { // from class: lwa
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                uxa uxaVar = txa.a;
                if (((Boolean) pra.k.e()).booleanValue()) {
                    dyf.q().w(th, "prepareClickUrl.attestation2");
                }
                return b2;
            }
        }, kkeVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:10|11|12|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        defpackage.fgb.e("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        defpackage.dyf.q().w(r0, r8.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void b(defpackage.dnb r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txa.b(dnb, java.util.Map):void");
    }

    public static void c(Map map, bgc bgcVar) {
        if (((Boolean) pla.c().a(mpa.la)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) && bgcVar != null) {
            bgcVar.zzs();
        }
    }
}
