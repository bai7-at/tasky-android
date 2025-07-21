package defpackage;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzflg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class cvc implements d6e {
    private final uuc b;
    private final Clock c;
    private final Map a = new HashMap();
    private final Map d = new HashMap();

    public cvc(uuc uucVar, Set set, Clock clock) {
        zzflg zzflgVar;
        this.b = uucVar;
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            bvc bvcVar = (bvc) it2.next();
            Map map = this.d;
            zzflgVar = bvcVar.c;
            map.put(zzflgVar, bvcVar);
        }
        this.c = clock;
    }

    private final void b(zzflg zzflgVar, boolean z) {
        zzflg zzflgVar2;
        String str;
        zzflgVar2 = ((bvc) this.d.get(zzflgVar)).b;
        if (this.a.containsKey(zzflgVar2)) {
            String str2 = true != z ? "f." : "s.";
            long elapsedRealtime = this.c.elapsedRealtime() - ((Long) this.a.get(zzflgVar2)).longValue();
            uuc uucVar = this.b;
            Map map = this.d;
            Map a = uucVar.a();
            str = ((bvc) map.get(zzflgVar)).a;
            a.put("label.".concat(str), str2.concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
    }

    @Override // defpackage.d6e
    public final void I(zzflg zzflgVar, String str) {
    }

    @Override // defpackage.d6e
    public final void a(zzflg zzflgVar, String str) {
        this.a.put(zzflgVar, Long.valueOf(this.c.elapsedRealtime()));
    }

    @Override // defpackage.d6e
    public final void k(zzflg zzflgVar, String str) {
        if (this.a.containsKey(zzflgVar)) {
            long elapsedRealtime = this.c.elapsedRealtime() - ((Long) this.a.get(zzflgVar)).longValue();
            uuc uucVar = this.b;
            String valueOf = String.valueOf(str);
            uucVar.a().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.d.containsKey(zzflgVar)) {
            b(zzflgVar, true);
        }
    }

    @Override // defpackage.d6e
    public final void s(zzflg zzflgVar, String str, Throwable th) {
        if (this.a.containsKey(zzflgVar)) {
            long elapsedRealtime = this.c.elapsedRealtime() - ((Long) this.a.get(zzflgVar)).longValue();
            uuc uucVar = this.b;
            String valueOf = String.valueOf(str);
            uucVar.a().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.d.containsKey(zzflgVar)) {
            b(zzflgVar, false);
        }
    }
}
