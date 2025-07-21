package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import defpackage.kif;
import defpackage.n1a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class o8 extends g9 {
    private final Map d;
    private String e;
    private boolean f;
    private long g;
    public final h4 h;
    public final h4 i;
    public final h4 j;
    public final h4 k;
    public final h4 l;

    o8(r9 r9Var) {
        super(r9Var);
        this.d = new HashMap();
        k4 E = this.a.E();
        E.getClass();
        this.h = new h4(E, "last_delete_stale", 0L);
        k4 E2 = this.a.E();
        E2.getClass();
        this.i = new h4(E2, "backoff", 0L);
        k4 E3 = this.a.E();
        E3.getClass();
        this.j = new h4(E3, "last_upload", 0L);
        k4 E4 = this.a.E();
        E4.getClass();
        this.k = new h4(E4, "last_upload_attempt", 0L);
        k4 E5 = this.a.E();
        E5.getClass();
        this.l = new h4(E5, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.g9
    protected final boolean h() {
        return false;
    }

    final Pair i(String str) {
        AdvertisingIdClient.Info advertisingIdInfo;
        n8 n8Var;
        AdvertisingIdClient.Info advertisingIdInfo2;
        c();
        long elapsedRealtime = this.a.p().elapsedRealtime();
        kif.b();
        if (this.a.y().A(null, m3.t0)) {
            n8 n8Var2 = (n8) this.d.get(str);
            if (n8Var2 != null && elapsedRealtime < n8Var2.c) {
                return new Pair(n8Var2.a, Boolean.valueOf(n8Var2.b));
            }
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            long n = elapsedRealtime + this.a.y().n(str, m3.c);
            try {
                advertisingIdInfo2 = AdvertisingIdClient.getAdvertisingIdInfo(this.a.zzau());
            } catch (Exception e) {
                this.a.o().m().b("Unable to get advertising id", e);
                n8Var = new n8("", false, n);
            }
            if (advertisingIdInfo2 == null) {
                return new Pair("", Boolean.FALSE);
            }
            String id = advertisingIdInfo2.getId();
            n8Var = id != null ? new n8(id, advertisingIdInfo2.isLimitAdTrackingEnabled(), n) : new n8("", advertisingIdInfo2.isLimitAdTrackingEnabled(), n);
            this.d.put(str, n8Var);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(n8Var.a, Boolean.valueOf(n8Var.b));
        }
        String str2 = this.e;
        if (str2 != null && elapsedRealtime < this.g) {
            return new Pair(str2, Boolean.valueOf(this.f));
        }
        this.g = elapsedRealtime + this.a.y().n(str, m3.c);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a.zzau());
        } catch (Exception e2) {
            this.a.o().m().b("Unable to get advertising id", e2);
            this.e = "";
        }
        if (advertisingIdInfo == null) {
            return new Pair("", Boolean.FALSE);
        }
        this.e = "";
        String id2 = advertisingIdInfo.getId();
        if (id2 != null) {
            this.e = id2;
        }
        this.f = advertisingIdInfo.isLimitAdTrackingEnabled();
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.e, Boolean.valueOf(this.f));
    }

    final Pair j(String str, n1a n1aVar) {
        return n1aVar.i(zzah.AD_STORAGE) ? i(str) : new Pair("", Boolean.FALSE);
    }

    final String k(String str) {
        c();
        String str2 = (String) i(str).first;
        MessageDigest s = x9.s();
        if (s == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, s.digest(str2.getBytes())));
    }
}
