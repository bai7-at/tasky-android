package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class xwe implements xle {
    private static final xwe a = new xwe();
    private static final eue b = eue.b(new cue() { // from class: uwe
        @Override // defpackage.cue
        public final Object a(ble bleVar) {
            return mxe.a((bte) bleVar);
        }
    }, bte.class, ole.class);

    xwe() {
    }

    public static void b() {
        cme.f(a);
        pte.a().e(b);
    }

    @Override // defpackage.xle
    public final /* bridge */ /* synthetic */ Object a(wle wleVar) {
        Iterator it2 = wleVar.d().iterator();
        while (it2.hasNext()) {
            for (sle sleVar : (List) it2.next()) {
                if (sleVar.b() instanceof qwe) {
                    qwe qweVar = (qwe) sleVar.b();
                    tze b2 = tze.b(sleVar.g());
                    if (!b2.equals(qweVar.b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + String.valueOf(qweVar.a()) + " has wrong output prefix (" + qweVar.b().toString() + ") instead of (" + b2.toString() + ")");
                    }
                }
            }
        }
        return new wwe(wleVar, null);
    }

    @Override // defpackage.xle
    public final Class zza() {
        return ole.class;
    }

    @Override // defpackage.xle
    public final Class zzb() {
        return ole.class;
    }
}
