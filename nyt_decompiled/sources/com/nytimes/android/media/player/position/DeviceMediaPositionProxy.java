package com.nytimes.android.media.player.position;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.media.player.p;
import com.nytimes.android.media.player.position.DeviceMediaPositionProxy;
import com.nytimes.android.room.common.CompositeState;
import defpackage.cl4;
import defpackage.d28;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xh4;
import defpackage.zq3;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes4.dex */
public final class DeviceMediaPositionProxy implements cl4 {
    private final xh4 a;
    private final CompositeDisposable b;

    public DeviceMediaPositionProxy(xh4 xh4Var) {
        zq3.h(xh4Var, "mediaDao");
        this.a = xh4Var;
        this.b = new CompositeDisposable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(DeviceMediaPositionProxy deviceMediaPositionProxy, String str) {
        zq3.h(deviceMediaPositionProxy, "this$0");
        zq3.h(str, "$displayTitle");
        deviceMediaPositionProxy.a.e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(long j, String str, long j2, CompositeState compositeState) {
        final d28 d28Var = new d28(j, str, j2, null, compositeState, 8, null);
        CompositeDisposable compositeDisposable = this.b;
        Single subscribeOn = this.a.a(d28Var.a()).subscribeOn(Schedulers.io());
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.media.player.position.DeviceMediaPositionProxy$savePosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(d28 d28Var2) {
                xh4 xh4Var;
                xh4Var = DeviceMediaPositionProxy.this.a;
                xh4Var.f(d28Var);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((d28) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: mp1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DeviceMediaPositionProxy.t(ss2.this, obj);
            }
        };
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.media.player.position.DeviceMediaPositionProxy$savePosition$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                xh4 xh4Var;
                xh4Var = DeviceMediaPositionProxy.this.a;
                xh4Var.c(d28Var);
            }
        };
        Disposable subscribe = subscribeOn.subscribe(consumer, new Consumer() { // from class: np1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DeviceMediaPositionProxy.u(ss2.this, obj);
            }
        });
        zq3.g(subscribe, "subscribe(...)");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long v(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (Long) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    @Override // defpackage.cl4
    public void a(final String str) {
        zq3.h(str, "displayTitle");
        CompositeDisposable compositeDisposable = this.b;
        Completable subscribeOn = Completable.fromAction(new Action() { // from class: op1
            @Override // io.reactivex.functions.Action
            public final void run() {
                DeviceMediaPositionProxy.p(DeviceMediaPositionProxy.this, str);
            }
        }).subscribeOn(Schedulers.io());
        Action action = new Action() { // from class: pp1
            @Override // io.reactivex.functions.Action
            public final void run() {
                DeviceMediaPositionProxy.q();
            }
        };
        final DeviceMediaPositionProxy$deletePositionOf$3 deviceMediaPositionProxy$deletePositionOf$3 = new ss2() { // from class: com.nytimes.android.media.player.position.DeviceMediaPositionProxy$deletePositionOf$3
            public final void invoke(Throwable th) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }
        };
        Disposable subscribe = subscribeOn.subscribe(action, new Consumer() { // from class: qp1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DeviceMediaPositionProxy.r(ss2.this, obj);
            }
        });
        zq3.g(subscribe, "subscribe(...)");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }

    @Override // defpackage.cl4
    public void b(String str, final p pVar) {
        zq3.h(str, "displayTitle");
        zq3.h(pVar, "playback");
        CompositeDisposable compositeDisposable = this.b;
        Single b = this.a.b(str);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.media.player.position.DeviceMediaPositionProxy$seekToSavedPosition$1
            {
                super(1);
            }

            public final void b(Long l) {
                p pVar2 = p.this;
                zq3.e(l);
                pVar2.e0(l.longValue());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Long) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: hp1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DeviceMediaPositionProxy.y(ss2.this, obj);
            }
        };
        final DeviceMediaPositionProxy$seekToSavedPosition$2 deviceMediaPositionProxy$seekToSavedPosition$2 = new ss2() { // from class: com.nytimes.android.media.player.position.DeviceMediaPositionProxy$seekToSavedPosition$2
            public final void invoke(Throwable th) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }
        };
        Disposable subscribe = b.subscribe(consumer, new Consumer() { // from class: ip1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DeviceMediaPositionProxy.z(ss2.this, obj);
            }
        });
        zq3.g(subscribe, "subscribe(...)");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }

    @Override // defpackage.cl4
    public void c(Long l, final String str, final long j, final CompositeState compositeState) {
        zq3.h(str, "displayTitle");
        zq3.h(compositeState, TransferTable.COLUMN_STATE);
        if (l != null) {
            s(l.longValue(), str, j, compositeState);
            return;
        }
        CompositeDisposable compositeDisposable = this.b;
        Single d = this.a.d(str);
        final DeviceMediaPositionProxy$savePositionOf$1 deviceMediaPositionProxy$savePositionOf$1 = new ss2() { // from class: com.nytimes.android.media.player.position.DeviceMediaPositionProxy$savePositionOf$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Long invoke(d28 d28Var) {
                zq3.h(d28Var, "it");
                return Long.valueOf(d28Var.a());
            }
        };
        Single map = d.map(new Function() { // from class: jp1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Long v;
                v = DeviceMediaPositionProxy.v(ss2.this, obj);
                return v;
            }
        });
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.media.player.position.DeviceMediaPositionProxy$savePositionOf$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Long l2) {
                DeviceMediaPositionProxy deviceMediaPositionProxy = DeviceMediaPositionProxy.this;
                zq3.e(l2);
                deviceMediaPositionProxy.s(l2.longValue(), str, j, compositeState);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Long) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: kp1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DeviceMediaPositionProxy.w(ss2.this, obj);
            }
        };
        final DeviceMediaPositionProxy$savePositionOf$3 deviceMediaPositionProxy$savePositionOf$3 = new ss2() { // from class: com.nytimes.android.media.player.position.DeviceMediaPositionProxy$savePositionOf$3
            public final void invoke(Throwable th) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }
        };
        Disposable subscribe = map.subscribe(consumer, new Consumer() { // from class: lp1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DeviceMediaPositionProxy.x(ss2.this, obj);
            }
        });
        zq3.g(subscribe, "subscribe(...)");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }
}
