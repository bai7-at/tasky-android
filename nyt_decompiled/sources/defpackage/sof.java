package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class sof {
    public static final sof a = new sof();

    protected sof() {
    }

    public final zzl a(Context context, xvc xvcVar) {
        Context context2;
        List list;
        String str;
        String h = xvcVar.h();
        Set m = xvcVar.m();
        if (m.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(m));
            context2 = context;
        }
        boolean o = xvcVar.o(context2);
        Bundle d = xvcVar.d(AdMobAdapter.class);
        String i = xvcVar.i();
        xvcVar.f();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            kia.b();
            str = tfb.s(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean n = xvcVar.n();
        RequestConfiguration a2 = v9d.b().a();
        return new zzl(8, -1L, d, -1, list, o, Math.max(xvcVar.b(), a2.c()), false, i, null, null, h, xvcVar.e(), xvcVar.c(), Collections.unmodifiableList(new ArrayList(xvcVar.l())), xvcVar.j(), str, n, null, a2.d(), (String) Collections.max(Arrays.asList(null, a2.a()), new Comparator() { // from class: clf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list2 = RequestConfiguration.f;
                return list2.indexOf((String) obj) - list2.indexOf((String) obj2);
            }
        }), xvcVar.k(), xvcVar.a(), xvcVar.g(), a2.b().getValue());
    }
}
