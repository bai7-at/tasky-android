package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzavj;
import defpackage.n7;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class yf8 {
    private final Context a;
    private final WebView b;
    private final gfa c;
    private final w1e d;
    private final int e;
    private final evc f;
    private final boolean g;
    private final kke h = pgb.e;
    private final d8e i;

    yf8(WebView webView, gfa gfaVar, evc evcVar, d8e d8eVar, w1e w1eVar) {
        this.b = webView;
        Context context = webView.getContext();
        this.a = context;
        this.c = gfaVar;
        this.f = evcVar;
        mpa.a(context);
        this.e = ((Integer) pla.c().a(mpa.q9)).intValue();
        this.g = ((Boolean) pla.c().a(mpa.r9)).booleanValue();
        this.i = d8eVar;
        this.d = w1eVar;
    }

    final /* synthetic */ void b(Bundle bundle, jb6 jb6Var) {
        CookieManager a = dyf.s().a(this.a);
        bundle.putBoolean("accept_3p_cookie", a != null ? a.acceptThirdPartyCookies(this.b) : false);
        ib6.a(this.a, AdFormat.BANNER, ((n7.a) new n7.a().b(AdMobAdapter.class, bundle)).h(), jb6Var);
    }

    final /* synthetic */ void c(String str) {
        w1e w1eVar;
        Uri parse = Uri.parse(str);
        try {
            parse = (!((Boolean) pla.c().a(mpa.rb)).booleanValue() || (w1eVar = this.d) == null) ? this.c.a(parse, this.a, this.b, null) : w1eVar.a(parse, this.a, this.b, null);
        } catch (zzavj e) {
            fgb.c("Failed to append the click signal to URL: ", e);
            dyf.q().w(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.i.c(parse.toString(), null);
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = dyf.b().currentTimeMillis();
            String c = this.c.c().c(this.a, str, this.b);
            if (this.g) {
                ktd.c(this.f, null, "csg", new Pair("clat", String.valueOf(dyf.b().currentTimeMillis() - currentTimeMillis)));
            }
            return c;
        } catch (RuntimeException e) {
            fgb.e("Exception getting click signals. ", e);
            dyf.q().w(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i) {
        if (i <= 0) {
            fgb.d("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) pgb.a.j(new Callable() { // from class: baa
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return yf8.this.getClickSignals(str);
                }
            }).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            fgb.e("Exception getting click signals with timeout. ", e);
            dyf.q().w(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getQueryInfo() {
        dyf.r();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final vba vbaVar = new vba(this, uuid);
        if (((Boolean) pla.c().a(mpa.t9)).booleanValue()) {
            this.h.execute(new Runnable() { // from class: uaa
                @Override // java.lang.Runnable
                public final void run() {
                    yf8.this.b(bundle, vbaVar);
                }
            });
        } else {
            ib6.a(this.a, AdFormat.BANNER, ((n7.a) new n7.a().b(AdMobAdapter.class, bundle)).h(), vbaVar);
        }
        return uuid;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long currentTimeMillis = dyf.b().currentTimeMillis();
            String zzh = this.c.c().zzh(this.a, this.b, null);
            if (this.g) {
                ktd.c(this.f, null, "vsg", new Pair("vlat", String.valueOf(dyf.b().currentTimeMillis() - currentTimeMillis)));
            }
            return zzh;
        } catch (RuntimeException e) {
            fgb.e("Exception getting view signals. ", e);
            dyf.q().w(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            fgb.d("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) pgb.a.j(new Callable() { // from class: p7a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return yf8.this.getViewSignals();
                }
            }).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            fgb.e("Exception getting view signals with timeout. ", e);
            dyf.q().w(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void recordClick(final String str) {
        if (!((Boolean) pla.c().a(mpa.v9)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        pgb.a.execute(new Runnable() { // from class: v8a
            @Override // java.lang.Runnable
            public final void run() {
                yf8.this.c(str);
            }
        });
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i;
        int i2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i3 = jSONObject.getInt(QueryKeys.SCROLL_POSITION_TOP);
            int i4 = jSONObject.getInt(QueryKeys.CONTENT_HEIGHT);
            int i5 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i6 = jSONObject.getInt(TransferTable.COLUMN_TYPE);
            if (i6 != 0) {
                int i7 = 1;
                if (i6 != 1) {
                    i7 = 2;
                    if (i6 != 2) {
                        i7 = 3;
                        i2 = i6 != 3 ? -1 : 0;
                    }
                }
                i = i7;
                this.c.d(MotionEvent.obtain(0L, i5, i, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            }
            i = i2;
            this.c.d(MotionEvent.obtain(0L, i5, i, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException | JSONException e) {
            fgb.e("Failed to parse the touch string. ", e);
            dyf.q().w(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
