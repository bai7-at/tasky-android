package defpackage;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;

/* loaded from: classes3.dex */
final class ikb implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;
    final /* synthetic */ boolean g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;
    final /* synthetic */ mkb j;

    ikb(mkb mkbVar, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = z;
        this.h = i3;
        this.i = i4;
        this.j = mkbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.a);
        hashMap.put("cachedSrc", this.b);
        hashMap.put("bytesLoaded", Integer.toString(this.c));
        hashMap.put("totalBytes", Integer.toString(this.d));
        hashMap.put("bufferedDuration", Long.toString(this.e));
        hashMap.put("totalDuration", Long.toString(this.f));
        hashMap.put("cacheReady", true != this.g ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        hashMap.put("playerCount", Integer.toString(this.h));
        hashMap.put("playerPreparedCount", Integer.toString(this.i));
        mkb.k(this.j, "onPrecacheEvent", hashMap);
    }
}
