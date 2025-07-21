package defpackage;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;

/* loaded from: classes3.dex */
final class hkb implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;
    final /* synthetic */ long g;
    final /* synthetic */ boolean h;
    final /* synthetic */ int i;
    final /* synthetic */ int j;
    final /* synthetic */ mkb k;

    hkb(mkb mkbVar, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = z;
        this.i = i;
        this.j = i2;
        this.k = mkbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.a);
        hashMap.put("cachedSrc", this.b);
        hashMap.put("bufferedDuration", Long.toString(this.c));
        hashMap.put("totalDuration", Long.toString(this.d));
        if (((Boolean) pla.c().a(mpa.Q1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.e));
            hashMap.put("qoeCachedBytes", Long.toString(this.f));
            hashMap.put("totalBytes", Long.toString(this.g));
            hashMap.put("reportTime", Long.toString(dyf.b().currentTimeMillis()));
        }
        hashMap.put("cacheReady", true != this.h ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        hashMap.put("playerCount", Integer.toString(this.i));
        hashMap.put("playerPreparedCount", Integer.toString(this.j));
        mkb.k(this.k, "onPrecacheEvent", hashMap);
    }
}
