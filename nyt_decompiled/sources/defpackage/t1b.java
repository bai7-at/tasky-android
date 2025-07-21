package defpackage;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t1b implements f0b, s1b {
    private final s1b a;
    private final HashSet b = new HashSet();

    public t1b(s1b s1bVar) {
        this.a = s1bVar;
    }

    @Override // defpackage.s1b
    public final void E0(String str, uxa uxaVar) {
        this.a.E0(str, uxaVar);
        this.b.add(new AbstractMap.SimpleEntry(str, uxaVar));
    }

    @Override // defpackage.q0b
    public final /* synthetic */ void M0(String str, JSONObject jSONObject) {
        e0b.d(this, str, jSONObject);
    }

    @Override // defpackage.f0b, defpackage.q0b
    public final void a(String str) {
        this.a.a(str);
    }

    @Override // defpackage.f0b, defpackage.d0b
    public final /* synthetic */ void k(String str, JSONObject jSONObject) {
        e0b.b(this, str, jSONObject);
    }

    @Override // defpackage.d0b
    public final /* synthetic */ void t(String str, Map map) {
        e0b.a(this, str, map);
    }

    @Override // defpackage.s1b
    public final void z0(String str, uxa uxaVar) {
        this.a.z0(str, uxaVar);
        this.b.remove(new AbstractMap.SimpleEntry(str, uxaVar));
    }

    @Override // defpackage.f0b, defpackage.q0b
    public final /* synthetic */ void zzb(String str, String str2) {
        e0b.c(this, str, str2);
    }

    public final void zzc() {
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it2.next();
            pzc.k("Unregistering eventhandler: ".concat(String.valueOf(((uxa) simpleEntry.getValue()).toString())));
            this.a.z0((String) simpleEntry.getKey(), (uxa) simpleEntry.getValue());
        }
        this.b.clear();
    }
}
