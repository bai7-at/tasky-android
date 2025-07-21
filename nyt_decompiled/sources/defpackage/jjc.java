package defpackage;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
final class jjc implements uxa {
    private final WeakReference a;

    /* synthetic */ jjc(kjc kjcVar, ijc ijcVar) {
        this.a = new WeakReference(kjcVar);
    }

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        r7c r7cVar;
        kjc kjcVar = (kjc) this.a.get();
        if (kjcVar == null) {
            return;
        }
        r7cVar = kjcVar.g;
        r7cVar.zza();
    }
}
