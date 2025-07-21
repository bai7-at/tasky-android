package defpackage;

import com.dropbox.android.external.store4.Fetcher;
import com.dropbox.android.external.store4.SourceOfTruth;
import com.dropbox.android.external.store4.impl.RealStore;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;

/* loaded from: classes2.dex */
final class rr6 implements n28 {
    private final Fetcher b;
    private final SourceOfTruth c;
    private CoroutineScope d;
    private rp4 e;

    public rr6(Fetcher fetcher, SourceOfTruth sourceOfTruth) {
        zq3.h(fetcher, "fetcher");
        this.b = fetcher;
        this.c = sourceOfTruth;
        this.e = r28.a.b();
    }

    @Override // defpackage.n28
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public rr6 a(rp4 rp4Var) {
        this.e = rp4Var;
        return this;
    }

    @Override // defpackage.n28
    public m28 build() {
        CoroutineScope coroutineScope = this.d;
        if (coroutineScope == null) {
            coroutineScope = GlobalScope.INSTANCE;
        }
        return new RealStore(coroutineScope, this.b, this.c, this.e);
    }
}
