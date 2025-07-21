package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.chartbeat.androidsdk.QueryKeys;
import io.embrace.android.embracesdk.payload.Session;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class akb implements uxa {
    private boolean a;

    private static int b(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                kia.b();
                i = tfb.z(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                fgb.g("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (pzc.m()) {
            pzc.k("Parse pixels for " + str + ", got string " + str2 + ", int " + i + InstructionFileId.DOT);
        }
        return i;
    }

    private static void c(fib fibVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                fibVar.c(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                fgb.g(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            fibVar.b(Integer.parseInt(str2));
        }
        if (str3 != null) {
            fibVar.A(Integer.parseInt(str3));
        }
        if (str4 != null) {
            fibVar.B(Integer.parseInt(str4));
        }
        if (str5 != null) {
            fibVar.e(Integer.parseInt(str5));
        }
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        int min;
        int min2;
        wib wibVar = (wib) obj;
        String str = (String) map.get("action");
        if (str == null) {
            fgb.g("Action missing from video GMSG.");
            return;
        }
        Integer num = null;
        Integer valueOf = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer b = wibVar.zzo() != null ? wibVar.zzo().b() : null;
        if (valueOf != null && b != null && !valueOf.equals(b) && !str.equals("load")) {
            fgb.f(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", valueOf, b));
            return;
        }
        if (fgb.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            fgb.b("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if (Session.APPLICATION_STATE_BACKGROUND.equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                fgb.g("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                wibVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                fgb.g("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                fgb.g("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                wibVar.F(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                fgb.g("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        int i = 0;
        if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                fgb.g("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                wibVar.t("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            String[] split = str4.split(",");
            int length = split.length;
            while (i < length) {
                String str5 = split[i];
                hashMap2.put(str5, ypb.a(str5.trim()));
                i++;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event", "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            wibVar.t("onVideoEvent", hashMap3);
            return;
        }
        lib zzo = wibVar.zzo();
        if (zzo == null) {
            fgb.g("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        if (equals || equals2) {
            Context context = wibVar.getContext();
            int b2 = b(context, map, QueryKeys.SCROLL_POSITION_TOP, 0);
            int b3 = b(context, map, QueryKeys.CONTENT_HEIGHT, 0);
            int b4 = b(context, map, QueryKeys.SCROLL_WINDOW_HEIGHT, -1);
            zoa zoaVar = mpa.K3;
            if (((Boolean) pla.c().a(zoaVar)).booleanValue()) {
                min = b4 == -1 ? wibVar.zzh() : Math.min(b4, wibVar.zzh());
            } else {
                if (pzc.m()) {
                    pzc.k("Calculate width with original width " + b4 + ", videoHost.getVideoBoundingWidth() " + wibVar.zzh() + ", x " + b2 + InstructionFileId.DOT);
                }
                min = Math.min(b4, wibVar.zzh() - b2);
            }
            int i2 = min;
            int b5 = b(context, map, QueryKeys.HOST, -1);
            if (((Boolean) pla.c().a(zoaVar)).booleanValue()) {
                min2 = b5 == -1 ? wibVar.zzg() : Math.min(b5, wibVar.zzg());
            } else {
                if (pzc.m()) {
                    pzc.k("Calculate height with original height " + b5 + ", videoHost.getVideoBoundingHeight() " + wibVar.zzg() + ", y " + b3 + InstructionFileId.DOT);
                }
                min2 = Math.min(b5, wibVar.zzg() - b3);
            }
            int i3 = min2;
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
            }
            int i4 = i;
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || zzo.a() != null) {
                zzo.c(b2, b3, i2, i3);
                return;
            }
            zzo.d(b2, b3, i2, i3, i4, parseBoolean, new vib((String) map.get("flags")));
            fib a = zzo.a();
            if (a != null) {
                c(a, map);
                return;
            }
            return;
        }
        ymb zzq = wibVar.zzq();
        if (zzq != null) {
            if ("timeupdate".equals(str)) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    fgb.g("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzq.B6(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    fgb.g("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if ("skip".equals(str)) {
                zzq.c();
                return;
            }
        }
        fib a2 = zzo.a();
        if (a2 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("event", "no_video_view");
            wibVar.t("onVideoEvent", hashMap4);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = wibVar.getContext();
            int b6 = b(context2, map, QueryKeys.SCROLL_POSITION_TOP, 0);
            float b7 = b(context2, map, QueryKeys.CONTENT_HEIGHT, 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, b6, b7, 0);
            a2.z(obtain);
            obtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                fgb.g("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                a2.y((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                fgb.g("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if ("hide".equals(str)) {
            if (((Boolean) pla.c().a(mpa.G)).booleanValue()) {
                a2.setVisibility(8);
                return;
            } else {
                a2.setVisibility(4);
                return;
            }
        }
        if ("load".equals(str)) {
            a2.t(valueOf);
            return;
        }
        if ("loadControl".equals(str)) {
            c(a2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                a2.u();
                return;
            } else {
                a2.j();
                return;
            }
        }
        if ("pause".equals(str)) {
            a2.w();
            return;
        }
        if ("play".equals(str)) {
            a2.x();
            return;
        }
        if ("show".equals(str)) {
            a2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    fgb.g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        strArr2[i5] = jSONArray.getString(i5);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    fgb.g("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (num != null) {
                wibVar.I(num.intValue());
            }
            a2.f(str8, strArr);
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = wibVar.getContext();
            a2.i(b(context3, map, "dx", 0), b(context3, map, "dy", 0));
            if (this.a) {
                return;
            }
            wibVar.c();
            this.a = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                a2.p();
                return;
            } else {
                fgb.g("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            fgb.g("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            a2.h(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            fgb.g("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
