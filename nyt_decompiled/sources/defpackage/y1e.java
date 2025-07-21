package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class y1e {
    public static zzq a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            w0e w0eVar = (w0e) it2.next();
            if (w0eVar.c) {
                arrayList.add(s7.p);
            } else {
                arrayList.add(new s7(w0eVar.a, w0eVar.b));
            }
        }
        return new zzq(context, (s7[]) arrayList.toArray(new s7[arrayList.size()]));
    }

    public static w0e b(zzq zzqVar) {
        return zzqVar.zzi ? new w0e(-3, 0, true) : new w0e(zzqVar.zze, zzqVar.zzb, false);
    }
}
