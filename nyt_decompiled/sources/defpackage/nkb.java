package defpackage;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nkb implements uxa {
    private static final Integer b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            fgb.g("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        mkb mkbVar;
        ekb a;
        wib wibVar = (wib) obj;
        if (fgb.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            fgb.b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        fkb A = dyf.A();
        if (map.containsKey("abort")) {
            if (A.f(wibVar)) {
                return;
            }
            fgb.g("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer b = b(map, "periodicReportIntervalMs");
        Integer b2 = b(map, "exoPlayerRenderingIntervalMs");
        Integer b3 = b(map, "exoPlayerIdleIntervalMs");
        vib vibVar = new vib((String) map.get("flags"));
        boolean z = vibVar.l;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    fgb.g("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                Iterator it2 = A.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        a = null;
                        break;
                    }
                    ekb ekbVar = (ekb) it2.next();
                    if (ekbVar.c == wibVar && str.equals(ekbVar.e())) {
                        a = ekbVar;
                        break;
                    }
                }
            } else {
                a = A.a(wibVar);
            }
            if (a != null) {
                fgb.g("Precache task is already running.");
                return;
            }
            if (wibVar.zzj() == null) {
                fgb.g("Precache requires a dependency provider.");
                return;
            }
            Integer b4 = b(map, "player");
            if (b4 == null) {
                b4 = 0;
            }
            if (b != null) {
                wibVar.I(b.intValue());
            }
            if (b2 != null) {
                wibVar.i0(b2.intValue());
            }
            if (b3 != null) {
                wibVar.d0(b3.intValue());
            }
            int intValue = b4.intValue();
            yjb yjbVar = wibVar.zzj().b;
            if (intValue > 0) {
                int i2 = vibVar.h;
                int Q = nib.Q();
                mkbVar = Q < i2 ? new alb(wibVar, vibVar) : Q < vibVar.b ? new xkb(wibVar, vibVar) : new vkb(wibVar);
            } else {
                mkbVar = new pkb(wibVar);
            }
            new ekb(wibVar, mkbVar, str, strArr).b();
        } else {
            ekb a2 = A.a(wibVar);
            if (a2 == null) {
                fgb.g("Precache must specify a source.");
                return;
            }
            mkbVar = a2.d;
        }
        Integer b5 = b(map, "minBufferMs");
        if (b5 != null) {
            mkbVar.u(b5.intValue());
        }
        Integer b6 = b(map, "maxBufferMs");
        if (b6 != null) {
            mkbVar.t(b6.intValue());
        }
        Integer b7 = b(map, "bufferForPlaybackMs");
        if (b7 != null) {
            mkbVar.r(b7.intValue());
        }
        Integer b8 = b(map, "bufferForPlaybackAfterRebufferMs");
        if (b8 != null) {
            mkbVar.s(b8.intValue());
        }
    }
}
