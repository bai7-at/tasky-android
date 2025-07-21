package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.FetchedAppSettingsManager;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class s20 {
    public static final s20 a = new s20();
    private static final String b = s20.class.getCanonicalName();
    private static final kq3 c = new kq3(w92.l());

    private static final class a {
        private BigDecimal a;
        private Currency b;
        private Bundle c;

        public a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            zq3.h(bigDecimal, "purchaseAmount");
            zq3.h(currency, "currency");
            zq3.h(bundle, "param");
            this.a = bigDecimal;
            this.b = currency;
            this.c = bundle;
        }

        public final Currency a() {
            return this.b;
        }

        public final Bundle b() {
            return this.c;
        }

        public final BigDecimal c() {
            return this.a;
        }
    }

    private s20() {
    }

    private final a a(String str, String str2) {
        return b(str, str2, new HashMap());
    }

    private final a b(String str, String str2, Map map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString(TransferTable.COLUMN_TYPE);
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (zq3.c(optString, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                zq3.g(optString2, "introductoryPriceCycles");
                if (optString2.length() != 0) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                bundle.putCharSequence((String) entry.getKey(), (String) entry.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            zq3.g(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            return new a(bigDecimal, currency, bundle);
        } catch (JSONException e) {
            Log.e(b, "Error parsing in-app subscription data.", e);
            return null;
        }
    }

    public static final boolean c() {
        rd2 f = FetchedAppSettingsManager.f(w92.m());
        return f != null && w92.p() && f.f();
    }

    public static final void d() {
        Context l = w92.l();
        String m = w92.m();
        if (w92.p()) {
            if (l instanceof Application) {
                AppEventsLogger.b.b((Application) l, m);
            } else {
                Log.w(b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    public static final void e(String str, long j) {
        Context l = w92.l();
        rd2 n = FetchedAppSettingsManager.n(w92.m(), false);
        if (n == null || !n.a() || j <= 0) {
            return;
        }
        kq3 kq3Var = new kq3(l);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        kq3Var.c("fb_aa_time_spent_on_view", j, bundle);
    }

    public static final void f(String str, String str2, boolean z) {
        a a2;
        zq3.h(str, "purchase");
        zq3.h(str2, "skuDetails");
        if (c() && (a2 = a.a(str, str2)) != null) {
            if (z) {
                qd2 qd2Var = qd2.a;
                if (qd2.d("app_events_if_auto_log_subs", w92.m(), false)) {
                    c.i(oi3.a.m(str2) ? "StartTrial" : "Subscribe", a2.c(), a2.a(), a2.b());
                    return;
                }
            }
            c.j(a2.c(), a2.a(), a2.b());
        }
    }
}
