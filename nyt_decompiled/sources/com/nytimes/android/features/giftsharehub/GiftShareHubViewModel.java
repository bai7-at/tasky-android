package com.nytimes.android.features.giftsharehub;

import android.app.Application;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.features.giftsharehub.GiftShareHubViewModel;
import com.nytimes.android.features.giftsharehub.data.GiftHistoryDataFetcher;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.ShareOrigin;
import defpackage.cb2;
import defpackage.du8;
import defpackage.e52;
import defpackage.e54;
import defpackage.gz8;
import defpackage.h03;
import defpackage.h90;
import defpackage.hz8;
import defpackage.iz8;
import defpackage.k03;
import defpackage.qs2;
import defpackage.rp7;
import defpackage.s42;
import defpackage.ss2;
import defpackage.u32;
import defpackage.ue4;
import defpackage.uq7;
import defpackage.ww8;
import defpackage.y32;
import defpackage.z58;
import defpackage.zq3;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public final class GiftShareHubViewModel extends q {
    private final Application a;
    private final GiftHistoryDataFetcher b;
    private final e54 c;
    private final uq7 d;
    private final ET2Scope e;
    private final z58 f;
    private final cb2 g;
    private MutableStateFlow h;
    private final StateFlow i;
    private MutableStateFlow j;
    private final StateFlow k;
    private final CompositeDisposable l;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GiftShareHubFilterTab.values().length];
            try {
                iArr[GiftShareHubFilterTab.ACTIVE_LINKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GiftShareHubFilterTab.EXPIRED_LINKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public GiftShareHubViewModel(Application application, GiftHistoryDataFetcher giftHistoryDataFetcher, e54 e54Var, uq7 uq7Var, ET2Scope eT2Scope, z58 z58Var, cb2 cb2Var) {
        zq3.h(application, "application");
        zq3.h(giftHistoryDataFetcher, "giftHistoryDataFetcher");
        zq3.h(e54Var, "linkShareDAO");
        zq3.h(uq7Var, "sharingManager");
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(z58Var, "subauthClient");
        zq3.h(cb2Var, "featureFlagUtil");
        this.a = application;
        this.b = giftHistoryDataFetcher;
        this.c = e54Var;
        this.d = uq7Var;
        this.e = eT2Scope;
        this.f = z58Var;
        this.g = cb2Var;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new h03(0, null, 3, null));
        this.h = MutableStateFlow;
        this.i = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new k03(null, null, null, 0, false, 31, null));
        this.j = MutableStateFlow2;
        this.k = FlowKt.asStateFlow(MutableStateFlow2);
        this.l = new CompositeDisposable();
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        Object value;
        Object value2;
        MutableStateFlow mutableStateFlow = this.h;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, new h03(0, null, 3, null)));
        MutableStateFlow mutableStateFlow2 = this.j;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, new k03(null, null, null, 0, false, 31, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    private final void o(GiftShareHubFilterTab giftShareHubFilterTab) {
        boolean z;
        Object value;
        k03 k03Var;
        ArrayList arrayList;
        int i = a.a[giftShareHubFilterTab.ordinal()];
        if (i == 1) {
            z = true;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        MutableStateFlow mutableStateFlow = this.j;
        do {
            value = mutableStateFlow.getValue();
            k03Var = (k03) value;
            List a2 = ((h03) this.h.getValue()).a();
            arrayList = new ArrayList();
            for (Object obj : a2) {
                if (((h03.a) obj).j() == (!z)) {
                    arrayList.add(obj);
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, k03.b(k03Var, null, giftShareHubFilterTab, arrayList, ((h03) this.h.getValue()).b(), false, 17, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:22|23))(3:24|25|(1:27))|12|(1:13)|16|17|18))|30|6|7|(0)(0)|12|(1:13)|16|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002d, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        com.nytimes.android.logging.NYTLogger.h(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.features.giftsharehub.GiftShareHubViewModel$getGiftHistory$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.features.giftsharehub.GiftShareHubViewModel$getGiftHistory$1 r0 = (com.nytimes.android.features.giftsharehub.GiftShareHubViewModel$getGiftHistory$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.giftsharehub.GiftShareHubViewModel$getGiftHistory$1 r0 = new com.nytimes.android.features.giftsharehub.GiftShareHubViewModel$getGiftHistory$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.features.giftsharehub.GiftShareHubViewModel r4 = (com.nytimes.android.features.giftsharehub.GiftShareHubViewModel) r4
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L2d
            goto L49
        L2d:
            r4 = move-exception
            goto L6a
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r5)
            com.nytimes.android.features.giftsharehub.data.GiftHistoryDataFetcher r5 = r4.b     // Catch: java.lang.Exception -> L2d
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2d
            r0.label = r3     // Catch: java.lang.Exception -> L2d
            r2 = 50
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: java.lang.Exception -> L2d
            if (r5 != r1) goto L49
            return r1
        L49:
            h03 r5 = (defpackage.h03) r5     // Catch: java.lang.Exception -> L2d
            kotlinx.coroutines.flow.MutableStateFlow r0 = r4.h     // Catch: java.lang.Exception -> L2d
        L4d:
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L2d
            r2 = r1
            h03 r2 = (defpackage.h03) r2     // Catch: java.lang.Exception -> L2d
            boolean r1 = r0.compareAndSet(r1, r5)     // Catch: java.lang.Exception -> L2d
            if (r1 == 0) goto L4d
            kotlinx.coroutines.flow.MutableStateFlow r5 = r4.j     // Catch: java.lang.Exception -> L2d
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Exception -> L2d
            k03 r5 = (defpackage.k03) r5     // Catch: java.lang.Exception -> L2d
            com.nytimes.android.features.giftsharehub.GiftShareHubFilterTab r5 = r5.f()     // Catch: java.lang.Exception -> L2d
            r4.o(r5)     // Catch: java.lang.Exception -> L2d
            goto L6d
        L6a:
            com.nytimes.android.logging.NYTLogger.h(r4)
        L6d:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.giftsharehub.GiftShareHubViewModel.p(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(String str, String str2, String str3) {
        uq7.n(this.d, this.a, str, str3, null, ShareOrigin.ARTICLE_FRONT, new h90(null, null, null, null, "gift-share-hub", 15, null), str2, null, "gift-hub", false, null, null, 3712, null);
    }

    private final void t() {
        FlowKt.launchIn(FlowKt.onEach(this.f.e(), new GiftShareHubViewModel$listenUserLogout$1(this, null)), r.a(this));
    }

    private final void v(final String str, final String str2) {
        this.e.a(new e52.e(), new s42("share-tools", null, "gift-hub", null, null, null, null, null, "unlocked-article-menu", 250, null), new u32(null, null, "open", 3, null), new qs2() { // from class: com.nytimes.android.features.giftsharehub.GiftShareHubViewModel$trackGiftShare$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ue4 mo865invoke() {
                return new ue4(du8.a("item", new y32(null, str2, str, null, null, null, 57, null)));
            }
        });
    }

    private final void w(GiftShareHubFilterTab giftShareHubFilterTab) {
        ET2PageScope.DefaultImpls.a(this.e, new e52.e(), new s42("gift-hub-tab", null, null, null, null, null, null, new y32(null, null, null, giftShareHubFilterTab.getTabName(), null, null, 55, null), "gift-hub", WebSocketProtocol.PAYLOAD_SHORT, null), null, null, 12, null);
    }

    public final StateFlow getState() {
        return this.i;
    }

    public final void l(String str, final String str2, final String str3, final ss2 ss2Var) {
        zq3.h(str, "url");
        zq3.h(str2, "uri");
        zq3.h(str3, "title");
        zq3.h(ss2Var, "onError");
        rp7 rp7Var = new rp7(str);
        v(str, str2);
        CompositeDisposable compositeDisposable = this.l;
        Single subscribeOn = this.c.a(rp7Var, null).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.features.giftsharehub.GiftShareHubViewModel$createSubscriberShareLink$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(iz8 iz8Var) {
                if (iz8Var instanceof hz8) {
                    String a2 = ((hz8) iz8Var).a();
                    if (a2 != null && a2.length() != 0) {
                        GiftShareHubViewModel.this.s(a2, str2, str3);
                    }
                    GiftShareHubViewModel.this.u();
                    return;
                }
                if (iz8Var instanceof gz8) {
                    ss2Var.invoke(Boolean.valueOf(((gz8) iz8Var).a()));
                    NYTLogger.g("Link Sharing Failed: error=" + iz8Var, new Object[0]);
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((iz8) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: l03
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GiftShareHubViewModel.m(ss2.this, obj);
            }
        };
        final ss2 ss2Var3 = new ss2() { // from class: com.nytimes.android.features.giftsharehub.GiftShareHubViewModel$createSubscriberShareLink$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                ss2.this.invoke(Boolean.FALSE);
                zq3.e(th);
                NYTLogger.h(th);
            }
        };
        Disposable subscribe = subscribeOn.subscribe(consumer, new Consumer() { // from class: m03
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GiftShareHubViewModel.n(ss2.this, obj);
            }
        });
        zq3.g(subscribe, "subscribe(...)");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }

    @Override // androidx.lifecycle.q
    protected void onCleared() {
        this.l.clear();
        super.onCleared();
    }

    public final StateFlow q() {
        return this.k;
    }

    public final boolean r() {
        return this.g.E();
    }

    public final void u() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new GiftShareHubViewModel$refresh$1(this, null), 3, null);
    }

    public final void x(int i) {
        GiftShareHubFilterTab giftShareHubFilterTab = (GiftShareHubFilterTab) ((k03) this.j.getValue()).d().get(i);
        o(giftShareHubFilterTab);
        w(giftShareHubFilterTab);
    }
}
