package defpackage;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import com.google.android.gms.internal.ads.zb;
import defpackage.zy2;

/* loaded from: classes3.dex */
public final class e9d {
    private final Context a;

    e9d(Context context) {
        this.a = context;
    }

    public final j64 a(boolean z) {
        zy2 a = new zy2.a().b("com.google.android.gms.ads").c(z).a();
        TopicsManagerFutures a2 = TopicsManagerFutures.a(this.a);
        return a2 != null ? a2.b(a) : zb.g(new IllegalStateException());
    }
}
