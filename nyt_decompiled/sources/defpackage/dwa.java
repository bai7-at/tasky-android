package defpackage;

import android.text.TextUtils;
import com.chartbeat.androidsdk.QueryKeys;
import com.facebook.AuthenticationTokenClaims;
import java.util.Map;

/* loaded from: classes3.dex */
public final class dwa implements uxa {
    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        wlb wlbVar = (wlb) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                fgb.g("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                fgb.g("No timestamp given for CSI tick.");
                return;
            }
            try {
                long elapsedRealtime = dyf.b().elapsedRealtime() + (Long.parseLong(str4) - dyf.b().currentTimeMillis());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                wlbVar.zzm().c(str2, str3, elapsedRealtime);
                return;
            } catch (NumberFormatException e) {
                fgb.h("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                fgb.g("No value given for CSI experiment.");
                return;
            } else {
                wlbVar.zzm().a().d(QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get(AuthenticationTokenClaims.JSON_KEY_NAME);
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                fgb.g("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                fgb.g("No name given for CSI extra.");
            } else {
                wlbVar.zzm().a().d(str6, str7);
            }
        }
    }
}
