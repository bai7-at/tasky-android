package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzavj;
import com.google.android.gms.internal.ads.zzgad;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.Tag;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class fya implements uxa {
    private final ela a;
    private final zuc b;
    private final k6e c;
    private final k6b e;
    private final a8d f;
    private final gwb g;
    private n5g h = null;
    private final kke i = pgb.f;
    private final jgb d = new jgb(null);

    public fya(ela elaVar, k6b k6bVar, a8d a8dVar, zuc zucVar, k6e k6eVar, gwb gwbVar) {
        this.a = elaVar;
        this.e = k6bVar;
        this.f = a8dVar;
        this.b = zucVar;
        this.c = k6eVar;
        this.g = gwbVar;
    }

    public static int b(Map map) {
        String str = (String) map.get(QueryKeys.DOCUMENT_WIDTH);
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return QueryKeys.TIME_ON_VIEW_IN_MINUTES.equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri c(Context context, gfa gfaVar, Uri uri, View view, Activity activity, w1e w1eVar) {
        if (gfaVar == null) {
            return uri;
        }
        try {
            if (!((Boolean) pla.c().a(mpa.rb)).booleanValue() || w1eVar == null) {
                if (gfaVar.e(uri)) {
                    uri = gfaVar.a(uri, context, view, activity);
                }
            } else if (gfaVar.e(uri)) {
                uri = w1eVar.a(uri, context, view, activity);
            }
        } catch (zzavj unused) {
        } catch (Exception e) {
            dyf.q().w(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            fgb.e("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean f(Map map) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(String str, jq9 jq9Var, Map map, String str2) {
        String str3;
        boolean z;
        HashMap hashMap;
        Object obj;
        wlb wlbVar = (wlb) jq9Var;
        v0e b = wlbVar.b();
        y0e j = wlbVar.j();
        boolean z2 = false;
        if (b == null || j == null) {
            str3 = "";
            z = false;
        } else {
            String str4 = j.b;
            z = b.j0;
            str3 = str4;
        }
        boolean z3 = (((Boolean) pla.c().a(mpa.ka)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (wlbVar.p()) {
                fgb.g("Cannot expand WebView that is already expanded.");
                return;
            } else {
                k(false);
                ((gnb) jq9Var).C0(f(map), b(map), z3);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            k(false);
            if (((Boolean) pla.c().a(mpa.mb)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                z2 = true;
            }
            if (str != null) {
                ((gnb) jq9Var).w0(f(map), b(map), str, z3, z2);
                return;
            } else {
                ((gnb) jq9Var).G0(f(map), b(map), (String) map.get(AssetConstants.HTML), (String) map.get("baseurl"), z3);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            wlbVar.getContext();
            if (((Boolean) pla.c().a(mpa.w4)).booleanValue()) {
                if (((Boolean) pla.c().a(mpa.A4)).booleanValue()) {
                    pzc.k("User opt out chrome custom tab.");
                } else {
                    z2 = true;
                }
            }
            boolean g = tqa.g(wlbVar.getContext());
            if (z2) {
                if (g) {
                    k(true);
                    if (TextUtils.isEmpty(str)) {
                        fgb.g("Cannot open browser with null or empty url");
                        m(7);
                        return;
                    }
                    Uri d = d(c(wlbVar.getContext(), wlbVar.r(), Uri.parse(str), wlbVar.h(), wlbVar.zzi(), wlbVar.g()));
                    if (z && this.f != null && l(jq9Var, wlbVar.getContext(), d.toString(), str3)) {
                        return;
                    }
                    this.h = new cya(this);
                    ((gnb) jq9Var).y0(new zzc(null, d.toString(), null, null, null, null, null, null, fc5.l3(this.h).asBinder(), true), z3);
                    return;
                }
                m(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            j(jq9Var, map, z, str3, z3);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            j(jq9Var, map, z, str3, z3);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) pla.c().a(mpa.d8)).booleanValue()) {
                k(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    fgb.g("Package name missing from open app action.");
                    return;
                }
                if (z && this.f != null && l(jq9Var, wlbVar.getContext(), str5, str3)) {
                    return;
                }
                PackageManager packageManager = wlbVar.getContext().getPackageManager();
                if (packageManager == null) {
                    fgb.g("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((gnb) jq9Var).y0(new zzc(launchIntentForPackage, this.h), z3);
                    return;
                }
                return;
            }
            return;
        }
        k(true);
        String str6 = (String) map.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str6)) {
            try {
                intent = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e) {
                fgb.e("Error parsing the url: ".concat(String.valueOf(str6)), e);
            }
        }
        Intent intent2 = intent;
        if (intent2 != null && intent2.getData() != null) {
            Uri data = intent2.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri d2 = d(c(wlbVar.getContext(), wlbVar.r(), data, wlbVar.h(), wlbVar.zzi(), wlbVar.g()));
                if (!TextUtils.isEmpty(intent2.getType())) {
                    if (((Boolean) pla.c().a(mpa.e8)).booleanValue()) {
                        intent2.setDataAndType(d2, intent2.getType());
                    }
                }
                intent2.setData(d2);
            }
        }
        boolean z4 = ((Boolean) pla.c().a(mpa.v8)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        HashMap hashMap2 = new HashMap();
        if (z4) {
            hashMap = hashMap2;
            obj = "event_id";
            this.h = new dya(this, z3, jq9Var, hashMap2, map);
            z3 = false;
        } else {
            hashMap = hashMap2;
            obj = "event_id";
        }
        if (intent2 != null) {
            if (!z || this.f == null || !l(jq9Var, wlbVar.getContext(), intent2.getData().toString(), str3)) {
                ((gnb) jq9Var).y0(new zzc(intent2, this.h), z3);
                return;
            } else {
                if (z4) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put((String) map.get(obj), Boolean.TRUE);
                    ((d0b) jq9Var).t("openIntentAsync", hashMap3);
                    return;
                }
                return;
            }
        }
        HashMap hashMap4 = hashMap;
        String uri = !TextUtils.isEmpty(str) ? d(c(wlbVar.getContext(), wlbVar.r(), Uri.parse(str), wlbVar.h(), wlbVar.zzi(), wlbVar.g())).toString() : str;
        if (!z || this.f == null || !l(jq9Var, wlbVar.getContext(), uri, str3)) {
            ((gnb) jq9Var).y0(new zzc((String) map.get(QueryKeys.VIEW_TITLE), uri, (String) map.get(QueryKeys.MAX_SCROLL_DEPTH), (String) map.get("p"), (String) map.get(QueryKeys.TIME_ON_VIEW_IN_MINUTES), (String) map.get(QueryKeys.VISIT_FREQUENCY), (String) map.get(QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING), this.h), z3);
        } else if (z4) {
            hashMap4.put((String) map.get(obj), Boolean.TRUE);
            ((d0b) jq9Var).t("openIntentAsync", hashMap4);
        }
    }

    private final void i(Context context, String str, String str2) {
        this.f.d(str);
        zuc zucVar = this.b;
        if (zucVar != null) {
            l8d.x6(context, zucVar, this.c, this.f, str, "dialog_not_shown", zzgad.h("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0105, code lost:
    
        if (defpackage.eya.c(r2, r11, r12, r13, r14) == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        r21 = r6;
        r10 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j(defpackage.jq9 r20, java.util.Map r21, boolean r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fya.j(jq9, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    private final void k(boolean z) {
        k6b k6bVar = this.e;
        if (k6bVar != null) {
            k6bVar.h(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) defpackage.pla.c().a(defpackage.mpa.o8)).booleanValue() : ((java.lang.Boolean) defpackage.pla.c().a(defpackage.mpa.n8)).booleanValue()) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean l(defpackage.jq9 r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fya.l(jq9, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(int i) {
        if (this.b == null) {
            return;
        }
        if (!((Boolean) pla.c().a(mpa.z8)).booleanValue()) {
            yuc a = this.b.a();
            a.b("action", "cct_action");
            a.b("cct_open_status", sqa.a(i));
            a.g();
            return;
        }
        k6e k6eVar = this.c;
        String a2 = sqa.a(i);
        j6e b = j6e.b("cct_action");
        b.a("cct_open_status", a2);
        k6eVar.a(b);
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        jq9 jq9Var = (jq9) obj;
        String c = eeb.c((String) map.get(QueryKeys.USER_ID), ((wlb) jq9Var).getContext(), true);
        String str = (String) map.get(Tag.A);
        if (str == null) {
            fgb.g("Action missing from an open GMSG.");
            return;
        }
        ela elaVar = this.a;
        if (elaVar == null || elaVar.c()) {
            zb.r((((Boolean) pla.c().a(mpa.L9)).booleanValue() && this.g != null && gwb.h(c)) ? this.g.b(c, kia.e()) : zb.h(c), new bya(this, jq9Var, map, str), this.i);
        } else {
            elaVar.b(c);
        }
    }
}
