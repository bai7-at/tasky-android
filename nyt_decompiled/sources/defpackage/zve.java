package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zve implements xle {
    private static final zve a = new zve();

    private zve() {
    }

    static void b() {
        cme.f(a);
    }

    @Override // defpackage.xle
    public final /* bridge */ /* synthetic */ Object a(wle wleVar) {
        if (wleVar.a() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it2 = wleVar.d().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((List) it2.next()).iterator();
            while (it3.hasNext()) {
            }
        }
        return new yve(wleVar, null);
    }

    @Override // defpackage.xle
    public final Class zza() {
        return wve.class;
    }

    @Override // defpackage.xle
    public final Class zzb() {
        return wve.class;
    }
}
