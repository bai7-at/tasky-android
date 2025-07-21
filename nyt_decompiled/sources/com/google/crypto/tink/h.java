package com.google.crypto.tink;

import com.amazonaws.services.s3.internal.Constants;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.proto.a;
import defpackage.zw3;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes3.dex */
abstract class h {
    public static final Charset a = Charset.forName(Constants.DEFAULT_ENCODING);

    public static zw3.c a(a.c cVar) {
        return (zw3.c) zw3.c.Q().x(cVar.P().Q()).w(cVar.S()).v(cVar.R()).u(cVar.Q()).l();
    }

    public static zw3 b(com.google.crypto.tink.proto.a aVar) {
        zw3.b v = zw3.Q().v(aVar.S());
        Iterator it2 = aVar.R().iterator();
        while (it2.hasNext()) {
            v.u(a((a.c) it2.next()));
        }
        return (zw3) v.l();
    }

    public static void c(a.c cVar) {
        if (!cVar.T()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.Q())));
        }
        if (cVar.R() == OutputPrefixType.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.Q())));
        }
        if (cVar.S() == KeyStatusType.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.Q())));
        }
    }

    public static void d(com.google.crypto.tink.proto.a aVar) {
        int S = aVar.S();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (a.c cVar : aVar.R()) {
            if (cVar.S() == KeyStatusType.ENABLED) {
                c(cVar);
                if (cVar.Q() == S) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (cVar.P().P() != KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
