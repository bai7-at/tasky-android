package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
final class tmb implements uxa {
    final /* synthetic */ vmb a;

    tmb(vmb vmbVar) {
        this.a = vmbVar;
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        int i;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.a) {
                    try {
                        vmb vmbVar = this.a;
                        i = vmbVar.i0;
                        if (i != parseInt) {
                            vmbVar.i0 = parseInt;
                            this.a.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                fgb.h("Exception occurred while getting webview content height", e);
            }
        }
    }
}
