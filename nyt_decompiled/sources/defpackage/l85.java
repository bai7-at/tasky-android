package defpackage;

import com.nytimes.android.external.cache3.CacheBuilder;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class l85 implements js5, jl0 {
    protected final dg0 a;

    l85(sp4 sp4Var) {
        if (sp4Var.f()) {
            this.a = CacheBuilder.x().f(sp4Var.b(), sp4Var.c()).a();
        } else {
            if (!sp4Var.g()) {
                throw new IllegalArgumentException("No expiry policy set on memory-policy.");
            }
            this.a = CacheBuilder.x().g(sp4Var.d(), sp4Var.c()).a();
        }
    }

    public static l85 a() {
        return c(null);
    }

    public static l85 c(sp4 sp4Var) {
        return sp4Var == null ? new l85(sp4.a().c(24L).b(TimeUnit.HOURS).a()) : new l85(sp4Var);
    }

    @Override // defpackage.js5
    public Single b(Object obj, Object obj2) {
        this.a.put(obj, Maybe.just(obj2));
        return Single.just(Boolean.TRUE);
    }

    @Override // defpackage.jl0
    public void clear(Object obj) {
        this.a.d(obj);
    }

    @Override // defpackage.js5
    public Maybe d(Object obj) {
        Maybe maybe = (Maybe) this.a.e(obj);
        return maybe == null ? Maybe.empty() : maybe;
    }
}
