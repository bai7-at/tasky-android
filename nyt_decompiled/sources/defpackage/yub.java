package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdyz;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yub implements oub {
    private final eyc a;

    yub(eyc eycVar) {
        this.a = eycVar;
    }

    @Override // defpackage.oub
    public final void a(Map map) {
        char c;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("flick")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            this.a.l(zzdyz.SHAKE);
        } else if (c != 1) {
            this.a.l(zzdyz.NONE);
        } else {
            this.a.l(zzdyz.FLICK);
        }
    }
}
