package defpackage;

import com.nytimes.android.external.store.util.Result;
import com.nytimes.android.external.store3.base.impl.StalePolicy;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;

/* loaded from: classes4.dex */
public class pr6 implements l28 {
    private final tq3 internalStore;

    public pr6(tq3 tq3Var) {
        this.internalStore = tq3Var;
    }

    @Override // defpackage.l28
    public void clear() {
        this.internalStore.clear();
    }

    @Override // defpackage.l28
    public void clearMemory() {
        this.internalStore.clearMemory();
    }

    protected Maybe<Object> disk(Object obj) {
        return this.internalStore.B(obj);
    }

    @Override // defpackage.l28
    public Single<Object> fetch(Object obj) {
        return this.internalStore.fetch(obj);
    }

    @Override // defpackage.l28
    public Single<Result> fetchWithResult(Object obj) {
        return this.internalStore.fetchWithResult(obj);
    }

    @Override // defpackage.l28
    public Single<Object> get(Object obj) {
        return this.internalStore.get(obj);
    }

    @Override // defpackage.l28
    public Observable<Object> getRefreshing(Object obj) {
        return this.internalStore.getRefreshing(obj);
    }

    @Override // defpackage.l28
    public Single<Result> getWithResult(Object obj) {
        return this.internalStore.getWithResult(obj);
    }

    protected Maybe<Object> memory(Object obj) {
        return this.internalStore.memory(obj);
    }

    @Override // defpackage.l28
    public Observable<Object> stream() {
        return this.internalStore.stream();
    }

    @Override // defpackage.l28
    public void clear(Object obj) {
        this.internalStore.clear(obj);
    }

    @Override // defpackage.l28
    public void clearMemory(Object obj) {
        this.internalStore.clearMemory(obj);
    }

    @Override // defpackage.l28
    public Observable<Object> stream(Object obj) {
        return this.internalStore.stream(obj);
    }

    public pr6(wd2 wd2Var) {
        this.internalStore = new br6(wd2Var, l85.a(), new m65(new k85()), StalePolicy.UNSPECIFIED);
    }

    public pr6(wd2 wd2Var, js5 js5Var, bp5 bp5Var, sp4 sp4Var, StalePolicy stalePolicy) {
        this.internalStore = new br6(wd2Var, js5Var, new m65(bp5Var), sp4Var, stalePolicy);
    }
}
