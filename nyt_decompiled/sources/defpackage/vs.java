package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.assetretriever.e;
import com.nytimes.android.assetretriever.h;
import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeOnSubscribe;
import io.reactivex.Single;
import java.util.concurrent.Callable;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class vs implements js5 {
    private final h a;

    public vs(h hVar) {
        zq3.h(hVar, "assetRepository");
        this.a = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(vs vsVar, e eVar, MaybeEmitter maybeEmitter) {
        zq3.h(vsVar, "this$0");
        zq3.h(eVar, "$key");
        zq3.h(maybeEmitter, "emitter");
        Asset u = vsVar.a.u(eVar);
        if (u == null) {
            maybeEmitter.onComplete();
        } else {
            maybeEmitter.onSuccess(u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean h(vs vsVar, e eVar, Asset asset) {
        zq3.h(vsVar, "this$0");
        zq3.h(eVar, "$key");
        zq3.h(asset, "$raw");
        vsVar.a.m(eVar, asset, i.l());
        return Boolean.TRUE;
    }

    @Override // defpackage.js5
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Maybe d(final e eVar) {
        zq3.h(eVar, TransferTable.COLUMN_KEY);
        Maybe create = Maybe.create(new MaybeOnSubscribe() { // from class: ts
            @Override // io.reactivex.MaybeOnSubscribe
            public final void subscribe(MaybeEmitter maybeEmitter) {
                vs.f(vs.this, eVar, maybeEmitter);
            }
        });
        zq3.g(create, "create(...)");
        return create;
    }

    @Override // defpackage.js5
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Single b(final e eVar, final Asset asset) {
        zq3.h(eVar, TransferTable.COLUMN_KEY);
        zq3.h(asset, "raw");
        Single fromCallable = Single.fromCallable(new Callable() { // from class: us
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean h;
                h = vs.h(vs.this, eVar, asset);
                return h;
            }
        });
        zq3.g(fromCallable, "fromCallable(...)");
        return fromCallable;
    }
}
