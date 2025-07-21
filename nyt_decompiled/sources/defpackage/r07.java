package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r07 {
    private final qkc a;
    private final List b = new ArrayList();
    private i8 c;

    private r07(qkc qkcVar) {
        this.a = qkcVar;
        if (qkcVar != null) {
            try {
                List zzj = qkcVar.zzj();
                if (zzj != null) {
                    Iterator it2 = zzj.iterator();
                    while (it2.hasNext()) {
                        i8 e = i8.e((zzu) it2.next());
                        if (e != null) {
                            this.b.add(e);
                        }
                    }
                }
            } catch (RemoteException e2) {
                fgb.e("Could not forward getAdapterResponseInfo to ResponseInfo.", e2);
            }
        }
        qkc qkcVar2 = this.a;
        if (qkcVar2 == null) {
            return;
        }
        try {
            zzu zzf = qkcVar2.zzf();
            if (zzf != null) {
                this.c = i8.e(zzf);
            }
        } catch (RemoteException e3) {
            fgb.e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e3);
        }
    }

    public static r07 d(qkc qkcVar) {
        if (qkcVar != null) {
            return new r07(qkcVar);
        }
        return null;
    }

    public static r07 e(qkc qkcVar) {
        return new r07(qkcVar);
    }

    public String a() {
        try {
            qkc qkcVar = this.a;
            if (qkcVar != null) {
                return qkcVar.zzg();
            }
            return null;
        } catch (RemoteException e) {
            fgb.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    public Bundle b() {
        try {
            qkc qkcVar = this.a;
            if (qkcVar != null) {
                return qkcVar.zze();
            }
        } catch (RemoteException e) {
            fgb.e("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new Bundle();
    }

    public String c() {
        try {
            qkc qkcVar = this.a;
            if (qkcVar != null) {
                return qkcVar.zzi();
            }
            return null;
        } catch (RemoteException e) {
            fgb.e("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    public final qkc f() {
        return this.a;
    }

    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        String c = c();
        if (c == null) {
            jSONObject.put("Response ID", Constants.NULL_VERSION_ID);
        } else {
            jSONObject.put("Response ID", c);
        }
        String a = a();
        if (a == null) {
            jSONObject.put("Mediation Adapter Class Name", Constants.NULL_VERSION_ID);
        } else {
            jSONObject.put("Mediation Adapter Class Name", a);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((i8) it2.next()).f());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        i8 i8Var = this.c;
        if (i8Var != null) {
            jSONObject.put("Loaded Adapter Response", i8Var.f());
        }
        Bundle b = b();
        if (b != null) {
            jSONObject.put("Response Extras", kia.b().j(b));
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return g().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
