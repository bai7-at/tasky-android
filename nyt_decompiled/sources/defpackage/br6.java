package defpackage;

import com.nytimes.android.external.store.util.Result;
import com.nytimes.android.external.store3.base.impl.StalePolicy;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.PublishSubject;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
final class br6 implements tq3 {
    dg0 a;
    dg0 b;
    StalePolicy c;
    js5 d;
    ew3 e;
    private final PublishSubject f;
    private wd2 g;
    private PublishSubject h;

    br6(wd2 wd2Var, js5 js5Var, ew3 ew3Var, StalePolicy stalePolicy) {
        this(wd2Var, js5Var, ew3Var, null, stalePolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SingleSource H(Object obj, Boolean bool) {
        return V(obj).toSingle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object I(Object obj, Object obj2) {
        return this.e.apply(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(Object obj, Object obj2) {
        X(obj, obj2);
        if (this.c == StalePolicy.REFRESH_ON_STALE && e38.d(obj, this.d)) {
            s(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SingleSource K(final Object obj, Object obj2) {
        return U().b(obj, obj2).flatMap(new Function() { // from class: sq6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj3) {
                SingleSource H;
                H = br6.this.H(obj, (Boolean) obj3);
                return H;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SingleSource L(Object obj, Throwable th) {
        return this.c == StalePolicy.NETWORK_BEFORE_STALE ? V(obj).switchIfEmpty(Maybe.error(th)).toSingle().map(new kq6()) : Single.error(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Object obj, Result result) {
        T(result.c(), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(Object obj) {
        this.a.d(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractMap.SimpleEntry O(Object obj, Object obj2) {
        return new AbstractMap.SimpleEntry(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean P(Object obj, AbstractMap.SimpleEntry simpleEntry) {
        return simpleEntry.getKey().equals(obj);
    }

    private Maybe Q(final Object obj) {
        return Maybe.defer(new Callable() { // from class: fq6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                MaybeSource F;
                F = br6.this.F(obj);
                return F;
            }
        }).onErrorResumeNext(Maybe.empty());
    }

    private Maybe R(final Object obj) {
        return Maybe.defer(new Callable() { // from class: qq6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                MaybeSource G;
                G = br6.this.G(obj);
                return G;
            }
        }).onErrorResumeNext(Maybe.empty());
    }

    private void S(Object obj) {
        this.f.onNext(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Single D(final Object obj) {
        return x().fetch(obj).flatMap(new Function() { // from class: mq6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                SingleSource K;
                K = br6.this.K(obj, obj2);
                return K;
            }
        }).map(new Function() { // from class: nq6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                return Result.b(obj2);
            }
        }).onErrorResumeNext(new Function() { // from class: oq6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                SingleSource L;
                L = br6.this.L(obj, (Throwable) obj2);
                return L;
            }
        }).doOnSuccess(new Consumer() { // from class: pq6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                br6.this.M(obj, (Result) obj2);
            }
        }).doAfterTerminate(new Action() { // from class: rq6
            @Override // io.reactivex.functions.Action
            public final void run() {
                br6.this.N(obj);
            }
        }).cache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Single E(final Object obj) {
        try {
            return (Single) this.a.b(obj, new Callable() { // from class: iq6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Single D;
                    D = br6.this.D(obj);
                    return D;
                }
            });
        } catch (ExecutionException e) {
            return Single.error(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(Throwable th) {
    }

    void T(Object obj, Object obj2) {
        this.h.onNext(new AbstractMap.SimpleEntry(obj2, obj));
    }

    js5 U() {
        return this.d;
    }

    Maybe V(final Object obj) {
        return U().d(obj).onErrorResumeNext(Maybe.empty()).map(new Function() { // from class: uq6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                Object I;
                I = br6.this.I(obj, obj2);
                return I;
            }
        }).doOnSuccess(new Consumer() { // from class: vq6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                br6.this.J(obj, obj2);
            }
        }).cache();
    }

    void X(Object obj, Object obj2) {
        this.b.put(obj, Maybe.just(obj2));
    }

    @Override // defpackage.l28
    public void clear() {
        Iterator it2 = this.b.c().keySet().iterator();
        while (it2.hasNext()) {
            clear(it2.next());
        }
    }

    @Override // defpackage.l28
    public void clearMemory() {
        clear();
    }

    @Override // defpackage.tq3
    /* renamed from: disk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Maybe B(Object obj) {
        return e38.f(this.d, this.c, obj) ? Maybe.empty() : V(obj);
    }

    @Override // defpackage.l28
    public Single fetch(final Object obj) {
        return Single.defer(new Callable() { // from class: zq6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SingleSource C;
                C = br6.this.C(obj);
                return C;
            }
        });
    }

    @Override // defpackage.l28
    public Single fetchWithResult(final Object obj) {
        return Single.defer(new Callable() { // from class: wq6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SingleSource E;
                E = br6.this.E(obj);
                return E;
            }
        });
    }

    @Override // defpackage.l28
    public Single get(Object obj) {
        return Q(obj).switchIfEmpty(fetch(obj).toMaybe()).toSingle();
    }

    @Override // defpackage.l28
    public Observable getRefreshing(Object obj) {
        return get(obj).toObservable().compose(e38.e(this.f, obj));
    }

    @Override // defpackage.l28
    public Single getWithResult(Object obj) {
        return R(obj).switchIfEmpty(fetchWithResult(obj).toMaybe()).toSingle();
    }

    @Override // defpackage.tq3
    public Maybe memory(Object obj) {
        Maybe maybe = (Maybe) this.b.e(obj);
        return maybe == null ? Maybe.empty() : maybe;
    }

    void s(Object obj) {
        fetch(obj).subscribe(new Consumer() { // from class: ar6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                br6.y(obj2);
            }
        }, new Consumer() { // from class: gq6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                br6.z((Throwable) obj2);
            }
        });
    }

    @Override // defpackage.l28
    public Observable stream(final Object obj) {
        return this.h.hide().startWith((ObservableSource) get(obj).toObservable().map(new Function() { // from class: xq6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                AbstractMap.SimpleEntry O;
                O = br6.O(obj, obj2);
                return O;
            }
        })).filter(new Predicate() { // from class: yq6
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj2) {
                boolean P;
                P = br6.P(obj, (AbstractMap.SimpleEntry) obj2);
                return P;
            }
        }).map(new tq6());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Maybe F(final Object obj) {
        try {
            return (Maybe) this.b.b(obj, new Callable() { // from class: lq6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Maybe A;
                    A = br6.this.A(obj);
                    return A;
                }
            });
        } catch (ExecutionException unused) {
            return Maybe.empty();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Maybe G(final Object obj) {
        try {
            Maybe maybe = (Maybe) this.b.b(obj, new Callable() { // from class: jq6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Maybe B;
                    B = br6.this.B(obj);
                    return B;
                }
            });
            return maybe == null ? Maybe.empty() : maybe.map(new kq6());
        } catch (ExecutionException unused) {
            return Maybe.empty();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Single C(Object obj) {
        return E(obj).map(new Function() { // from class: hq6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                return ((Result) obj2).c();
            }
        });
    }

    wd2 x() {
        return this.g;
    }

    br6(wd2 wd2Var, js5 js5Var, ew3 ew3Var, sp4 sp4Var, StalePolicy stalePolicy) {
        this.f = PublishSubject.create();
        this.g = wd2Var;
        this.d = js5Var;
        this.e = ew3Var;
        this.c = stalePolicy;
        this.b = gg0.c(sp4Var);
        this.a = gg0.d(sp4Var);
        this.h = PublishSubject.create();
    }

    @Override // defpackage.l28
    public void clearMemory(Object obj) {
        clear(obj);
    }

    @Override // defpackage.l28
    public void clear(Object obj) {
        this.a.d(obj);
        this.b.d(obj);
        e38.b(U(), obj);
        S(obj);
    }

    @Override // defpackage.l28
    public Observable stream() {
        return this.h.hide().map(new tq6());
    }
}
