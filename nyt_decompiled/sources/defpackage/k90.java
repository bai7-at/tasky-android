package defpackage;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class k90 implements yc, vc {
    private final q11 a;
    private final int b;
    private final TimeUnit c;
    private CountDownLatch e;
    private final Object d = new Object();
    private boolean f = false;

    public k90(q11 q11Var, int i, TimeUnit timeUnit) {
        this.a = q11Var;
        this.b = i;
        this.c = timeUnit;
    }

    @Override // defpackage.vc
    public void a(String str, Bundle bundle) {
        synchronized (this.d) {
            try {
                m94.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.e = new CountDownLatch(1);
                this.f = false;
                this.a.a(str, bundle);
                m94.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.e.await(this.b, this.c)) {
                        this.f = true;
                        m94.f().i("App exception callback received from Analytics listener.");
                    } else {
                        m94.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    m94.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yc
    public void r0(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
