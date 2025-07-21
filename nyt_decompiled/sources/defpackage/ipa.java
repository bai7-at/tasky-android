package defpackage;

import android.os.Handler;
import com.google.android.gms.internal.pal.zzagc;
import com.google.android.gms.internal.pal.zzil;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public abstract class ipa {
    private final ExecutorService a;
    private final zzagc b;
    private final Handler c;
    private og8 d = vg8.e(zzil.e());

    ipa(Handler handler, ExecutorService executorService, zzagc zzagcVar) {
        this.a = executorService;
        this.c = handler;
        this.b = zzagcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.c.removeCallbacksAndMessages(null);
        this.c.postDelayed(new Runnable() { // from class: joa
            @Override // java.lang.Runnable
            public final void run() {
                ipa.this.f();
            }
        }, (this.b.zzd() / 1000) * 1000);
        this.d = vg8.c(this.a, new Callable() { // from class: ooa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ipa.this.a();
            }
        });
    }

    abstract zzil a();

    public final og8 b() {
        if (this.d.p() && !this.d.q()) {
            f();
        }
        return this.d;
    }

    public final void d() {
        f();
    }

    public final void e() {
        this.c.removeCallbacksAndMessages(null);
    }
}
