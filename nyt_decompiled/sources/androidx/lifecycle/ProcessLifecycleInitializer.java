package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.l;
import defpackage.d44;
import defpackage.uj3;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements uj3 {
    @Override // defpackage.uj3
    public List a() {
        return kotlin.collections.i.l();
    }

    @Override // defpackage.uj3
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d44 b(Context context) {
        zq3.h(context, "context");
        androidx.startup.a e = androidx.startup.a.e(context);
        zq3.g(e, "getInstance(context)");
        if (!e.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        f.a(context);
        l.b bVar = l.i;
        bVar.b(context);
        return bVar.a();
    }
}
