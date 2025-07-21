package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
final class hjc implements uxa {
    private final WeakReference a;

    /* synthetic */ hjc(kjc kjcVar, gjc gjcVar) {
        this.a = new WeakReference(kjcVar);
    }

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        u6c u6cVar;
        zfc zfcVar;
        zfc zfcVar2;
        kjc kjcVar = (kjc) this.a.get();
        if (kjcVar == null) {
            return;
        }
        u6cVar = kjcVar.h;
        u6cVar.v();
        if (((Boolean) pla.c().a(mpa.ma)).booleanValue()) {
            zfcVar = kjcVar.i;
            zfcVar.zzs();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            zfcVar2 = kjcVar.i;
            zfcVar2.X();
        }
    }
}
