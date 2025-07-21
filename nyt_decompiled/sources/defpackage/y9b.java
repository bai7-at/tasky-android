package defpackage;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class y9b implements Callable {
    final /* synthetic */ Context a;
    final /* synthetic */ aab b;

    y9b(aab aabVar, Context context) {
        this.a = context;
        this.b = aabVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        WeakHashMap weakHashMap;
        x9b a;
        WeakHashMap weakHashMap2;
        weakHashMap = this.b.a;
        z9b z9bVar = (z9b) weakHashMap.get(this.a);
        if (z9bVar != null) {
            if (z9bVar.a + ((Long) gra.a.e()).longValue() >= dyf.b().currentTimeMillis()) {
                a = new w9b(this.a, z9bVar.b).a();
                aab aabVar = this.b;
                Context context = this.a;
                weakHashMap2 = aabVar.a;
                weakHashMap2.put(context, new z9b(aabVar, a));
                return a;
            }
        }
        a = new w9b(this.a).a();
        aab aabVar2 = this.b;
        Context context2 = this.a;
        weakHashMap2 = aabVar2.a;
        weakHashMap2.put(context2, new z9b(aabVar2, a));
        return a;
    }
}
