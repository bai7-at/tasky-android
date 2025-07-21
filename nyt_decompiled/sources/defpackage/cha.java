package defpackage;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class cha {
    final Map a = new HashMap();
    final ysa b = new ysa();

    public cha() {
        b(new uea());
        b(new hia());
        b(new jja());
        b(new qna());
        b(new mqa());
        b(new sra());
        b(new aua());
    }

    public final caa a(xhe xheVar, caa caaVar) {
        s0f.c(xheVar);
        if (!(caaVar instanceof waa)) {
            return caaVar;
        }
        waa waaVar = (waa) caaVar;
        ArrayList c = waaVar.c();
        String b = waaVar.b();
        return (this.a.containsKey(b) ? (xfa) this.a.get(b) : this.b).a(b, xheVar, c);
    }

    final void b(xfa xfaVar) {
        Iterator it2 = xfaVar.a.iterator();
        while (it2.hasNext()) {
            this.a.put(((zzbl) it2.next()).zzb().toString(), xfaVar);
        }
    }
}
