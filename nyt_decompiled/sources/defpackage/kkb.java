package defpackage;

import java.util.HashMap;

/* loaded from: classes3.dex */
final class kkb implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ mkb d;

    kkb(mkb mkbVar, String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = mkbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.a);
        hashMap.put("cachedSrc", this.b);
        hashMap.put("totalDuration", Long.toString(this.c));
        mkb.k(this.d, "onPrecacheEvent", hashMap);
    }
}
