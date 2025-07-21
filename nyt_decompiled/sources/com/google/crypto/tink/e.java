package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.proto.a;
import defpackage.jw3;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class e {
    private final a.b a;

    private e(a.b bVar) {
        this.a = bVar;
    }

    private synchronized boolean d(int i) {
        Iterator it2 = this.a.x().iterator();
        while (it2.hasNext()) {
            if (((a.c) it2.next()).Q() == i) {
                return true;
            }
        }
        return false;
    }

    private synchronized a.c e(jw3 jw3Var) {
        KeyData p;
        int f;
        OutputPrefixType P;
        try {
            p = g.p(jw3Var);
            f = f();
            P = jw3Var.P();
            if (P == OutputPrefixType.UNKNOWN_PREFIX) {
                P = OutputPrefixType.TINK;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (a.c) a.c.U().u(p).v(f).x(KeyStatusType.ENABLED).w(P).l();
    }

    private synchronized int f() {
        int g;
        g = g();
        while (d(g)) {
            g = g();
        }
        return g;
    }

    private static int g() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    public static e i() {
        return new e(com.google.crypto.tink.proto.a.T());
    }

    public static e j(d dVar) {
        return new e((a.b) dVar.f().a());
    }

    public synchronized e a(KeyTemplate keyTemplate) {
        b(keyTemplate.b(), false);
        return this;
    }

    public synchronized int b(jw3 jw3Var, boolean z) {
        a.c e;
        try {
            e = e(jw3Var);
            this.a.u(e);
            if (z) {
                this.a.y(e.Q());
            }
        } catch (Throwable th) {
            throw th;
        }
        return e.Q();
    }

    public synchronized d c() {
        return d.e((com.google.crypto.tink.proto.a) this.a.l());
    }

    public synchronized e h(int i) {
        for (int i2 = 0; i2 < this.a.w(); i2++) {
            a.c v = this.a.v(i2);
            if (v.Q() == i) {
                if (!v.S().equals(KeyStatusType.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
                }
                this.a.y(i);
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }
}
