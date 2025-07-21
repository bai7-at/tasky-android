package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzccx;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class a2g implements gke {
    final /* synthetic */ j64 a;
    final /* synthetic */ zzccx b;
    final /* synthetic */ leb c;
    final /* synthetic */ f7e d;
    final /* synthetic */ long e;
    final /* synthetic */ qq9 f;

    a2g(qq9 qq9Var, j64 j64Var, zzccx zzccxVar, leb lebVar, f7e f7eVar, long j) {
        this.a = j64Var;
        this.b = zzccxVar;
        this.c = lebVar;
        this.d = f7eVar;
        this.e = j;
        this.f = qq9Var;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        evc evcVar;
        uuc uucVar;
        long currentTimeMillis = dyf.b().currentTimeMillis() - this.e;
        String message = th.getMessage();
        dyf.q().w(th, "SignalGeneratorImpl.generateSignals");
        qq9 qq9Var = this.f;
        evcVar = qq9Var.n;
        uucVar = qq9Var.f;
        ktd.c(evcVar, uucVar, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(currentTimeMillis)));
        q7e h7 = qq9.h7(this.a, this.b);
        if (((Boolean) jra.e.e()).booleanValue() && h7 != null) {
            f7e f7eVar = this.d;
            f7eVar.d(th);
            f7eVar.S(false);
            h7.a(f7eVar);
            h7.g();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.c.f(message);
        } catch (RemoteException e) {
            fgb.e("", e);
        }
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AtomicBoolean atomicBoolean;
        evc evcVar;
        uuc uucVar;
        uuc uucVar2;
        boolean z;
        boolean z2;
        evc evcVar2;
        uuc uucVar3;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        zzcei zzceiVar;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        evc evcVar3;
        uuc uucVar4;
        evc evcVar4;
        uuc uucVar5;
        k6a k6aVar = (k6a) obj;
        q7e h7 = qq9.h7(this.a, this.b);
        atomicBoolean = this.f.Z;
        atomicBoolean.set(true);
        if (!((Boolean) pla.c().a(mpa.D7)).booleanValue()) {
            try {
                this.c.f("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                fgb.d("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) jra.e.e()).booleanValue() || h7 == null) {
                return;
            }
            f7e f7eVar = this.d;
            f7eVar.s("QueryInfo generation has been disabled.");
            f7eVar.S(false);
            h7.a(f7eVar);
            h7.g();
            return;
        }
        long currentTimeMillis = dyf.b().currentTimeMillis() - this.e;
        try {
            try {
                if (k6aVar == null) {
                    this.c.f1(null, null, null);
                    qq9 qq9Var = this.f;
                    evcVar4 = qq9Var.n;
                    uucVar5 = qq9Var.f;
                    ktd.c(evcVar4, uucVar5, "sgs", new Pair("rid", "-1"));
                    this.d.S(true);
                    if (!((Boolean) jra.e.e()).booleanValue() || h7 == null) {
                        return;
                    }
                    h7.a(this.d);
                    h7.g();
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(k6aVar.b);
                    String optString = jSONObject.optString("request_id", "");
                    if (TextUtils.isEmpty(optString)) {
                        fgb.g("The request ID is empty in request JSON.");
                        this.c.f("Internal error: request ID is empty in request JSON.");
                        qq9 qq9Var2 = this.f;
                        evcVar3 = qq9Var2.n;
                        uucVar4 = qq9Var2.f;
                        ktd.c(evcVar3, uucVar4, "sgf", new Pair("sgf_reason", "rid_missing"));
                        f7e f7eVar2 = this.d;
                        f7eVar2.s("Request ID empty");
                        f7eVar2.S(false);
                        if (!((Boolean) jra.e.e()).booleanValue() || h7 == null) {
                            return;
                        }
                        h7.a(this.d);
                        h7.g();
                        return;
                    }
                    qq9 qq9Var3 = this.f;
                    String str7 = k6aVar.b;
                    uucVar2 = qq9Var3.f;
                    qq9.H6(qq9Var3, optString, str7, uucVar2);
                    Bundle bundle = k6aVar.c;
                    qq9 qq9Var4 = this.f;
                    z = qq9Var4.w;
                    if (z && bundle != null) {
                        str5 = qq9Var4.y;
                        if (bundle.getInt(str5, -1) == -1) {
                            qq9 qq9Var5 = this.f;
                            str6 = qq9Var5.y;
                            atomicInteger = qq9Var5.B;
                            bundle.putInt(str6, atomicInteger.get());
                        }
                    }
                    qq9 qq9Var6 = this.f;
                    z2 = qq9Var6.u;
                    if (z2 && bundle != null) {
                        str = qq9Var6.x;
                        if (TextUtils.isEmpty(bundle.getString(str))) {
                            str2 = this.f.L;
                            if (TextUtils.isEmpty(str2)) {
                                qq9 qq9Var7 = this.f;
                                wxf r = dyf.r();
                                qq9 qq9Var8 = this.f;
                                context = qq9Var8.b;
                                zzceiVar = qq9Var8.H;
                                qq9Var7.L = r.E(context, zzceiVar.zza);
                            }
                            qq9 qq9Var9 = this.f;
                            str3 = qq9Var9.x;
                            str4 = qq9Var9.L;
                            bundle.putString(str3, str4);
                        }
                    }
                    this.c.f1(k6aVar.a, k6aVar.b, bundle);
                    qq9 qq9Var10 = this.f;
                    evcVar2 = qq9Var10.n;
                    uucVar3 = qq9Var10.f;
                    Pair pair = new Pair("tqgt", String.valueOf(currentTimeMillis));
                    String str8 = "na";
                    if (((Boolean) pla.c().a(mpa.u9)).booleanValue()) {
                        try {
                            str8 = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0";
                        } catch (JSONException e2) {
                            fgb.e("Error retrieving JSONObject from the requestJson, ", e2);
                        }
                    }
                    ktd.c(evcVar2, uucVar3, "sgs", pair, new Pair("tpc", str8));
                    this.d.S(true);
                    if (!((Boolean) jra.e.e()).booleanValue() || h7 == null) {
                        return;
                    }
                    h7.a(this.d);
                    h7.g();
                } catch (JSONException e3) {
                    fgb.g("Failed to create JSON object from the request string.");
                    this.c.f("Internal error for request JSON: " + e3.toString());
                    qq9 qq9Var11 = this.f;
                    evcVar = qq9Var11.n;
                    uucVar = qq9Var11.f;
                    ktd.c(evcVar, uucVar, "sgf", new Pair("sgf_reason", "request_invalid"));
                    f7e f7eVar3 = this.d;
                    f7eVar3.d(e3);
                    f7eVar3.S(false);
                    dyf.q().w(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) jra.e.e()).booleanValue() || h7 == null) {
                        return;
                    }
                    h7.a(this.d);
                    h7.g();
                }
            } catch (RemoteException e4) {
                f7e f7eVar4 = this.d;
                f7eVar4.d(e4);
                f7eVar4.S(false);
                fgb.e("", e4);
                dyf.q().w(e4, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) jra.e.e()).booleanValue() || h7 == null) {
                    return;
                }
                h7.a(this.d);
                h7.g();
            }
        } catch (Throwable th) {
            if (((Boolean) jra.e.e()).booleanValue() && h7 != null) {
                h7.a(this.d);
                h7.g();
            }
            throw th;
        }
    }
}
