package defpackage;

import com.google.android.gms.internal.ads.ef;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.nf;
import com.google.android.gms.internal.ads.of;
import com.google.android.gms.internal.ads.pf;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ile {
    private final List a = new ArrayList();
    private final pxe b = pxe.b;
    private boolean c = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((gle) it2.next()).a = false;
        }
    }

    public final ile a(gle gleVar) {
        if (gleVar.f != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (gleVar.a) {
            d();
        }
        gleVar.f = this;
        this.a.add(gleVar);
        return this;
    }

    public final lle b() {
        hle hleVar;
        int i;
        hle hleVar2;
        hle hleVar3;
        if (this.c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.c = true;
        List list = this.a;
        mf N = pf.N();
        int i2 = 0;
        while (i2 < list.size() - 1) {
            int i3 = i2 + 1;
            hle hleVar4 = ((gle) list.get(i2)).e;
            hleVar2 = hle.a;
            if (hleVar4 == hleVar2) {
                hle hleVar5 = ((gle) list.get(i3)).e;
                hleVar3 = hle.a;
                if (hleVar5 != hleVar3) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (gle gleVar : this.a) {
            dle unused = gleVar.b;
            if (gleVar.e == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            hle hleVar6 = gleVar.e;
            hleVar = hle.a;
            int i4 = 3;
            if (hleVar6 == hleVar) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i5 = 0;
                    while (i5 == 0) {
                        secureRandom.nextBytes(bArr);
                        i5 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    }
                    i = i5;
                }
            } else {
                hle unused2 = gleVar.e;
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
            }
            hashSet.add(valueOf);
            gle.a(gleVar);
            ple pleVar = gleVar.d;
            dle c = gleVar.c();
            dle dleVar = dle.b;
            if (!dleVar.equals(c)) {
                if (dle.c.equals(c)) {
                    i4 = 4;
                } else {
                    if (!dle.d.equals(c)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i4 = 5;
                }
            }
            mue mueVar = (mue) (pleVar instanceof cte ? ((cte) pleVar).b() : ste.d().f(pleVar, mue.class));
            ef a = cme.a(mueVar.c());
            nf N2 = of.N();
            N2.o(i);
            N2.q(i4);
            N2.n(a);
            N2.p(mueVar.c().P());
            N.n((of) N2.i());
            if (gleVar.a) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (gleVar.b != dleVar) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = valueOf;
            }
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        N.o(num.intValue());
        return lle.b((pf) N.i(), this.b);
    }
}
