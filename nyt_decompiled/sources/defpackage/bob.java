package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class bob {
    private zzcei a;
    private Context b;
    private WeakReference c;

    public final bob c(Context context) {
        this.c = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.b = context;
        return this;
    }

    public final bob d(zzcei zzceiVar) {
        this.a = zzceiVar;
        return this;
    }
}
