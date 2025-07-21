package defpackage;

import android.content.Context;
import com.nytimes.android.ads.AdsDevSettings;
import com.nytimes.android.ads.a;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes2.dex */
public final class i9 {
    public final Set a(Context context, a aVar) {
        zq3.h(context, "context");
        zq3.h(aVar, "adClient");
        Set b = b0.b();
        AdsDevSettings adsDevSettings = AdsDevSettings.a;
        b.add(adsDevSettings.b(context, 1));
        b.add(adsDevSettings.a(context, 2));
        b.add(adsDevSettings.c(context, 3));
        if (aVar.a()) {
            b.add(adsDevSettings.d(context, 4));
        }
        return b0.a(b);
    }
}
