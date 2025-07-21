package defpackage;

import java.util.HashMap;

/* loaded from: classes3.dex */
final class jkb implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ mkb d;

    jkb(mkb mkbVar, String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = mkbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.a);
        hashMap.put("cachedSrc", this.b);
        hashMap.put("totalBytes", Integer.toString(this.c));
        mkb.k(this.d, "onPrecacheEvent", hashMap);
    }
}
