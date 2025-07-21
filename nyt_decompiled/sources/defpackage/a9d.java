package defpackage;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzeih;
import com.google.android.gms.internal.ads.zzeii;
import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzfok;
import com.google.android.gms.internal.ads.zzfol;
import com.google.android.gms.internal.ads.zzfom;
import com.nytimes.android.api.cms.AssetConstants;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a9d implements b9d {
    static /* synthetic */ k8e i(String str, String str2, String str3, zzeih zzeihVar, String str4, WebView webView, String str5, String str6, zzeii zzeiiVar) {
        o8e a = o8e.a("Google", str2);
        zzfom m = m("javascript");
        zzfoi k = k(zzeihVar.toString());
        zzfom zzfomVar = zzfom.NONE;
        if (m == zzfomVar) {
            fgb.g("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (k == null) {
            fgb.g("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzeihVar)));
            return null;
        }
        zzfom m2 = m(str4);
        if (k == zzfoi.VIDEO && m2 == zzfomVar) {
            fgb.g("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return k8e.a(l8e.a(k, l(zzeiiVar.toString()), m, m2, true), m8e.b(a, webView, str5, ""));
    }

    static /* synthetic */ k8e j(String str, String str2, String str3, String str4, zzeih zzeihVar, WebView webView, String str5, String str6, zzeii zzeiiVar) {
        o8e a = o8e.a(str, str2);
        zzfom m = m("javascript");
        zzfom m2 = m(str4);
        zzfoi k = k(zzeihVar.toString());
        zzfom zzfomVar = zzfom.NONE;
        if (m == zzfomVar) {
            fgb.g("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (k == null) {
            fgb.g("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzeihVar)));
            return null;
        }
        if (k == zzfoi.VIDEO && m2 == zzfomVar) {
            fgb.g("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return k8e.a(l8e.a(k, l(zzeiiVar.toString()), m, m2, true), m8e.c(a, webView, str5, ""));
    }

    private static zzfoi k(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals(AssetConstants.VIDEO_TYPE)) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            return zzfoi.HTML_DISPLAY;
        }
        if (c == 1) {
            return zzfoi.NATIVE_DISPLAY;
        }
        if (c != 2) {
            return null;
        }
        return zzfoi.VIDEO;
    }

    private static zzfol l(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? zzfol.UNSPECIFIED : zzfol.ONE_PIXEL : zzfol.DEFINED_BY_JAVASCRIPT : zzfol.BEGIN_TO_RENDER;
    }

    private static zzfom m(String str) {
        return "native".equals(str) ? zzfom.NATIVE : "javascript".equals(str) ? zzfom.JAVASCRIPT : zzfom.NONE;
    }

    private static final Object n(z8d z8dVar) {
        try {
            return z8dVar.zza();
        } catch (RuntimeException e) {
            dyf.q().v(e, "omid exception");
            return null;
        }
    }

    private static final void o(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            dyf.q().v(e, "omid exception");
        }
    }

    @Override // defpackage.b9d
    public final boolean a(final Context context) {
        if (((Boolean) pla.c().a(mpa.U4)).booleanValue()) {
            Boolean bool = (Boolean) n(new z8d() { // from class: v8d
                @Override // defpackage.z8d
                public final Object zza() {
                    if (i8e.b()) {
                        return Boolean.TRUE;
                    }
                    i8e.a(context);
                    return Boolean.valueOf(i8e.b());
                }
            });
            return bool != null && bool.booleanValue();
        }
        fgb.g("Omid flag is disabled");
        return false;
    }

    @Override // defpackage.b9d
    public final k8e b(final String str, final WebView webView, String str2, String str3, final String str4, final zzeii zzeiiVar, final zzeih zzeihVar, final String str5) {
        if (!((Boolean) pla.c().a(mpa.U4)).booleanValue() || !i8e.b()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (k8e) n(new z8d(str7, str, str6, zzeihVar, str4, webView, str5, str8, zzeiiVar) { // from class: w8d
            public final /* synthetic */ String b;
            public final /* synthetic */ zzeih d;
            public final /* synthetic */ String e;
            public final /* synthetic */ WebView f;
            public final /* synthetic */ String g;
            public final /* synthetic */ zzeii i;
            public final /* synthetic */ String a = "Google";
            public final /* synthetic */ String c = "javascript";
            public final /* synthetic */ String h = "";

            {
                this.b = str;
                this.d = zzeihVar;
                this.e = str4;
                this.f = webView;
                this.g = str5;
                this.i = zzeiiVar;
            }

            @Override // defpackage.z8d
            public final Object zza() {
                return a9d.i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            }
        });
    }

    @Override // defpackage.b9d
    public final void c(final k8e k8eVar, final View view) {
        o(new Runnable() { // from class: q8d
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) pla.c().a(mpa.U4)).booleanValue() && i8e.b()) {
                    k8e.this.d(view);
                }
            }
        });
    }

    @Override // defpackage.b9d
    public final void d(final k8e k8eVar) {
        if (((Boolean) pla.c().a(mpa.U4)).booleanValue() && i8e.b()) {
            Objects.requireNonNull(k8eVar);
            o(new Runnable() { // from class: s8d
                @Override // java.lang.Runnable
                public final void run() {
                    k8e.this.e();
                }
            });
        }
    }

    @Override // defpackage.b9d
    public final void e(final k8e k8eVar) {
        o(new Runnable() { // from class: y8d
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) pla.c().a(mpa.U4)).booleanValue() && i8e.b()) {
                    k8e.this.c();
                }
            }
        });
    }

    @Override // defpackage.b9d
    public final void f(final k8e k8eVar, final View view) {
        o(new Runnable() { // from class: p8d
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) pla.c().a(mpa.U4)).booleanValue() && i8e.b()) {
                    k8e.this.b(view, zzfok.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // defpackage.b9d
    public final k8e g(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzeii zzeiiVar, final zzeih zzeihVar, final String str6) {
        if (!((Boolean) pla.c().a(mpa.U4)).booleanValue() || !i8e.b()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (k8e) n(new z8d(str5, str, str8, str4, zzeihVar, webView, str6, str7, zzeiiVar) { // from class: r8d
            public final /* synthetic */ String a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String d;
            public final /* synthetic */ zzeih e;
            public final /* synthetic */ WebView f;
            public final /* synthetic */ String g;
            public final /* synthetic */ zzeii i;
            public final /* synthetic */ String c = "javascript";
            public final /* synthetic */ String h = "";

            {
                this.d = str4;
                this.e = zzeihVar;
                this.f = webView;
                this.g = str6;
                this.i = zzeiiVar;
            }

            @Override // defpackage.z8d
            public final Object zza() {
                return a9d.j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            }
        });
    }

    @Override // defpackage.b9d
    public final String h(Context context) {
        if (((Boolean) pla.c().a(mpa.U4)).booleanValue()) {
            return (String) n(new z8d() { // from class: x8d
                @Override // defpackage.z8d
                public final Object zza() {
                    return "a.1.4.8-google_20230803";
                }
            });
        }
        return null;
    }
}
