package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzdzc;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class fia {
    private final Object a = new Object();
    private String b = "";
    private String c = "";
    private boolean d = false;
    private boolean e = false;
    protected String f = "";
    private eyc g;

    protected static final String o(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", dyf.r().E(context, str2));
        j64 b = new yza(context).b(0, str, hashMap, null);
        try {
            return (String) b.get(((Integer) pla.c().a(mpa.G4)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            fgb.e("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e);
            b.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            fgb.e("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e2);
            b.cancel(true);
            return null;
        } catch (Exception e3) {
            fgb.e("Error retrieving a response from: ".concat(String.valueOf(str)), e3);
            return null;
        }
    }

    private final Uri p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.a) {
            if (TextUtils.isEmpty(this.b)) {
                dyf.r();
                try {
                    str5 = new String(IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), Constants.DEFAULT_ENCODING);
                } catch (IOException unused) {
                    fgb.b("Error reading from internal storage.");
                    str5 = "";
                }
                this.b = str5;
                if (TextUtils.isEmpty(str5)) {
                    dyf.r();
                    this.b = UUID.randomUUID().toString();
                    dyf.r();
                    String str6 = this.b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes(Constants.DEFAULT_ENCODING));
                        openFileOutput.close();
                    } catch (Exception e) {
                        fgb.e("Error writing to file in internal storage.", e);
                    }
                }
            }
            str4 = this.b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final eyc a() {
        return this.g;
    }

    public final String b() {
        String str;
        synchronized (this.a) {
            str = this.c;
        }
        return str;
    }

    public final void c(Context context) {
        eyc eycVar;
        if (!((Boolean) pla.c().a(mpa.c9)).booleanValue() || (eycVar = this.g) == null) {
            return;
        }
        eycVar.h(new xea(this, context), zzdzc.DEBUG_MENU);
    }

    public final void d(Context context, String str, String str2) {
        dyf.r();
        wxf.t(context, p(context, (String) pla.c().a(mpa.C4), str, str2));
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = p(context, (String) pla.c().a(mpa.F4), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        dyf.r();
        wxf.k(context, str, buildUpon.build().toString());
    }

    public final void f(boolean z) {
        synchronized (this.a) {
            try {
                this.e = z;
                if (((Boolean) pla.c().a(mpa.c9)).booleanValue()) {
                    dyf.q().i().b(z);
                    eyc eycVar = this.g;
                    if (eycVar != null) {
                        eycVar.k(z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(eyc eycVar) {
        this.g = eycVar;
    }

    public final void h(boolean z) {
        synchronized (this.a) {
            this.d = z;
        }
    }

    protected final void i(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            wxf.l.post(new aha(this, context, str, z, z2));
        } else {
            fgb.f("Can not create dialog without Activity Context");
        }
    }

    public final boolean j(Context context, String str, String str2) {
        String o = o(context, p(context, (String) pla.c().a(mpa.E4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o)) {
            fgb.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(new JSONObject(o.trim()).optString("debug_mode"));
            f(equals);
            if (((Boolean) pla.c().a(mpa.c9)).booleanValue()) {
                hie i = dyf.q().i();
                if (true != equals) {
                    str = "";
                }
                i.i(str);
            }
            return equals;
        } catch (JSONException e) {
            fgb.h("Fail to get debug mode response json.", e);
            return false;
        }
    }

    final boolean k(Context context, String str, String str2) {
        String o = o(context, p(context, (String) pla.c().a(mpa.D4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o)) {
            fgb.b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(o.trim());
            String optString = jSONObject.optString("gct");
            this.f = jSONObject.optString("status");
            if (((Boolean) pla.c().a(mpa.c9)).booleanValue()) {
                boolean z = "0".equals(this.f) || "2".equals(this.f);
                f(z);
                hie i = dyf.q().i();
                if (!z) {
                    str = "";
                }
                i.i(str);
            }
            synchronized (this.a) {
                this.c = optString;
            }
            return true;
        } catch (JSONException e) {
            fgb.h("Fail to get in app preview response json.", e);
            return false;
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    public final boolean n(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m()) {
            return false;
        }
        fgb.b("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }
}
