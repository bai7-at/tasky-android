package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import defpackage.n7;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xqa {
    private final ScheduledExecutorService a;
    private Runnable b;
    private uqa c;
    private j51 d;
    private String e;
    private long f = 0;
    private long g;
    private JSONArray h;
    private Context i;

    public xqa(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (((java.lang.Boolean) defpackage.pla.c().a(defpackage.mpa.B9)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r4 = this;
            uqa r0 = r4.c
            if (r0 != 0) goto La
            java.lang.String r4 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            defpackage.fgb.d(r4)
            return
        La:
            java.lang.Boolean r0 = r0.h()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r4.e
            if (r0 == 0) goto L70
            j51 r0 = r4.d
            if (r0 == 0) goto L70
            java.util.concurrent.ScheduledExecutorService r0 = r4.a
            if (r0 == 0) goto L70
            long r0 = r4.f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            goto L39
        L2a:
            com.google.android.gms.common.util.Clock r0 = defpackage.dyf.b()
            long r0 = r0.elapsedRealtime()
            long r2 = r4.f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L39
            goto L4b
        L39:
            zoa r0 = defpackage.mpa.B9
            kpa r1 = defpackage.pla.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
        L4b:
            j51 r0 = r4.d
            java.lang.String r1 = r4.e
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.h(r1)
            java.util.concurrent.ScheduledExecutorService r0 = r4.a
            java.lang.Runnable r4 = r4.b
            zoa r1 = defpackage.mpa.C9
            kpa r2 = defpackage.pla.c()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r4, r1, r3)
            return
        L70:
            java.lang.String r4 = "PACT max retry connection duration timed out"
            defpackage.pzc.k(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqa.j():void");
    }

    private final void k(JSONObject jSONObject) {
        try {
            if (this.h == null) {
                this.h = new JSONArray((String) pla.c().a(mpa.E9));
            }
            jSONObject.put("eids", this.h);
        } catch (JSONException e) {
            fgb.e("Error fetching the PACT active eids JSON: ", e);
        }
    }

    public final j51 b() {
        return this.d;
    }

    final JSONObject c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        k(jSONObject);
        return jSONObject;
    }

    final JSONObject d(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        k(jSONObject);
        return jSONObject;
    }

    final void f() {
        this.f = dyf.b().elapsedRealtime() + ((Integer) pla.c().a(mpa.A9)).intValue();
        if (this.b == null) {
            this.b = new Runnable() { // from class: vqa
                @Override // java.lang.Runnable
                public final void run() {
                    xqa.this.j();
                }
            };
        }
        j();
    }

    public final void g(Context context, g51 g51Var, String str, f51 f51Var) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (g51Var == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.i = context;
        this.e = str;
        uqa uqaVar = new uqa(this, f51Var);
        this.c = uqaVar;
        j51 c = g51Var.c(uqaVar);
        this.d = c;
        if (c == null) {
            fgb.d("CustomTabsClient failed to create new session.");
        }
    }

    final void h(String str) {
        try {
            j51 j51Var = this.d;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.g).toString());
            k(jSONObject);
            j51Var.g(jSONObject.toString(), null);
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            ib6.a(this.i, AdFormat.BANNER, ((n7.a) new n7.a().b(AdMobAdapter.class, bundle)).h(), new wqa(this, str));
        } catch (JSONException e) {
            fgb.e("Error creating JSON: ", e);
        }
    }

    public final void i(long j) {
        this.g = j;
    }
}
