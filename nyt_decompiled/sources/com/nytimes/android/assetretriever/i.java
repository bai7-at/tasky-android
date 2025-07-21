package com.nytimes.android.assetretriever;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.assetretriever.e;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import org.threeten.bp.Instant;

/* loaded from: classes.dex */
public abstract class i {
    public static /* synthetic */ void d(i iVar, e eVar, long j, int i, Instant instant, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementAttempts");
        }
        if ((i2 & 8) != 0) {
            instant = Instant.now();
            zq3.g(instant, "now(...)");
        }
        iVar.c(eVar, j, i, instant);
    }

    public static /* synthetic */ long g(i iVar, e eVar, Instant instant, Instant instant2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertOrUpdateRequest");
        }
        if ((i & 4) != 0) {
            instant2 = Instant.now();
            zq3.g(instant2, "now(...)");
        }
        return iVar.f(eVar, instant, instant2);
    }

    public static /* synthetic */ long m(i iVar, e eVar, e.b bVar, Instant instant, Instant instant2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveAssetUriInRequest");
        }
        if ((i & 8) != 0) {
            instant2 = Instant.now();
            zq3.g(instant2, "now(...)");
        }
        return iVar.l(eVar, bVar, instant, instant2);
    }

    public final void a(e eVar) {
        zq3.h(eVar, "assetIdentifier");
        k o = o(eVar);
        if (o != null) {
            b(o);
        }
    }

    protected abstract void b(k kVar);

    public final void c(e eVar, long j, int i, Instant instant) {
        k a;
        zq3.h(eVar, "assetIdentifier");
        zq3.h(instant, "now");
        k o = o(eVar);
        if (o != null) {
            if (o.c() + 1 >= i) {
                b(o);
                return;
            }
            int c = o.c() + 1;
            Instant plusSeconds = instant.plusSeconds((long) (j * Math.pow(2.0d, o.c())));
            zq3.g(plusSeconds, "plusSeconds(...)");
            a = o.a((r22 & 1) != 0 ? o.a : 0L, (r22 & 2) != 0 ? o.b : null, (r22 & 4) != 0 ? o.c : null, (r22 & 8) != 0 ? o.d : null, (r22 & 16) != 0 ? o.e : null, (r22 & 32) != 0 ? o.f : c, (r22 & 64) != 0 ? o.g : plusSeconds, (r22 & 128) != 0 ? o.h : false, (r22 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? o.i : null);
            r(a);
        }
    }

    public abstract long e(k kVar);

    public final long f(e eVar, Instant instant, Instant instant2) {
        zq3.h(eVar, "assetIdentifier");
        zq3.h(instant2, "now");
        k o = o(eVar);
        if (o == null) {
            return e(new k(eVar, instant2, instant, null, 8, null));
        }
        if (instant != null && (o.h() == null || instant.compareTo(o.h()) > 0)) {
            s(o.e(), instant, instant2);
        }
        return o.e();
    }

    public final void h(e eVar, boolean z) {
        zq3.h(eVar, "assetIdentifier");
        if (eVar instanceof e.b) {
            i((e.b) eVar, z);
        } else if (eVar instanceof e.c) {
            j((e.c) eVar, z);
        }
    }

    protected abstract void i(e.b bVar, boolean z);

    protected abstract void j(e.c cVar, boolean z);

    public abstract void k();

    public final long l(e eVar, e.b bVar, Instant instant, Instant instant2) {
        k a;
        zq3.h(eVar, "assetIdentifier");
        zq3.h(bVar, "uri");
        zq3.h(instant, "assetLastModified");
        zq3.h(instant2, "now");
        k o = o(eVar);
        if (o == null) {
            return e(new k(eVar, instant2, instant, bVar));
        }
        a = o.a((r22 & 1) != 0 ? o.a : 0L, (r22 & 2) != 0 ? o.b : null, (r22 & 4) != 0 ? o.c : null, (r22 & 8) != 0 ? o.d : instant, (r22 & 16) != 0 ? o.e : null, (r22 & 32) != 0 ? o.f : 0, (r22 & 64) != 0 ? o.g : null, (r22 & 128) != 0 ? o.h : false, (r22 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? o.i : bVar);
        r(a);
        return o.e();
    }

    public abstract n n(Instant instant);

    public final k o(e eVar) {
        zq3.h(eVar, "assetIdentifier");
        if (eVar instanceof e.b) {
            return p((e.b) eVar);
        }
        if (eVar instanceof e.c) {
            return q((e.c) eVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    protected abstract k p(e.b bVar);

    protected abstract k q(e.c cVar);

    protected abstract int r(k kVar);

    protected abstract int s(long j, Instant instant, Instant instant2);
}
