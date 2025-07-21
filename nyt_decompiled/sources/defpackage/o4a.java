package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class o4a {
    public static void a(p4a p4aVar, s4a s4aVar, pgd pgdVar) {
        for (int i = 0; i < p4aVar.zza(); i++) {
            long zzb = p4aVar.zzb(i);
            List a = p4aVar.a(zzb);
            if (!a.isEmpty()) {
                if (i == p4aVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                pgdVar.zza(new m4a(a, zzb, p4aVar.zzb(i + 1) - p4aVar.zzb(i)));
            }
        }
    }
}
