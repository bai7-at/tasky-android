package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class m9b extends zfb {
    private final AtomicReference a = new AtomicReference();
    private boolean b;

    public static final Object n4(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get(QueryKeys.EXTERNAL_REFERRER)) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    @Override // defpackage.chb
    public final void G(Bundle bundle) {
        synchronized (this.a) {
            try {
                try {
                    this.a.set(bundle);
                    this.b = true;
                } finally {
                    this.a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle Q1(long j) {
        Bundle bundle;
        synchronized (this.a) {
            if (!this.b) {
                try {
                    this.a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.a.get();
        }
        return bundle;
    }

    public final String l3(long j) {
        return (String) n4(Q1(j), String.class);
    }
}
