package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class c3e implements c7c {
    private final HashSet a = new HashSet();
    private final Context b;
    private final nfb c;

    public c3e(Context context, nfb nfbVar) {
        this.b = context;
        this.c = nfbVar;
    }

    public final Bundle a() {
        return this.c.n(this.b, this);
    }

    public final synchronized void b(HashSet hashSet) {
        this.a.clear();
        this.a.addAll(hashSet);
    }

    @Override // defpackage.c7c
    public final synchronized void n(zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.c.l(this.a);
        }
    }
}
