package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class v5c extends a implements SignInConnectionListener {
    private Semaphore o;
    private Set p;

    public v5c(Context context, Set set) {
        super(context);
        this.o = new Semaphore(0);
        this.p = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.loader.content.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final Void A() {
        Iterator it2 = this.p.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (((GoogleApiClient) it2.next()).maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.o.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // androidx.loader.content.b
    protected final void o() {
        this.o.drainPermits();
        h();
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.o.release();
    }
}
