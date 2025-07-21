package com.nytimes.android.menu.item;

import android.view.MenuItem;
import com.nytimes.android.SectionActivity;
import com.nytimes.android.entitlements.a;
import com.nytimes.android.menu.MenuData;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import defpackage.by0;
import defpackage.cc0;
import defpackage.d54;
import defpackage.e44;
import defpackage.eg6;
import defpackage.fc1;
import defpackage.g05;
import defpackage.gt2;
import defpackage.jk;
import defpackage.kq4;
import defpackage.lh6;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xk6;
import defpackage.zq3;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.rx2.RxObservableKt;

/* loaded from: classes4.dex */
public final class ConnectAccount extends MenuData {
    private final jk a;
    private final a b;
    private final CompositeDisposable c;

    @fc1(c = "com.nytimes.android.menu.item.ConnectAccount$2", f = "ConnectAccount.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.menu.item.ConnectAccount$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        int label;

        @fc1(c = "com.nytimes.android.menu.item.ConnectAccount$2$1", f = "ConnectAccount.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.nytimes.android.menu.item.ConnectAccount$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements gt2 {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ConnectAccount this$0;

            @fc1(c = "com.nytimes.android.menu.item.ConnectAccount$2$1$1", f = "ConnectAccount.kt", l = {51, 50}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.menu.item.ConnectAccount$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C03601 extends SuspendLambda implements gt2 {
                final /* synthetic */ ProducerScope<d54> $$this$rxObservable;
                Object L$0;
                int label;
                final /* synthetic */ ConnectAccount this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C03601(ProducerScope producerScope, ConnectAccount connectAccount, by0 by0Var) {
                    super(2, by0Var);
                    this.$$this$rxObservable = producerScope;
                    this.this$0 = connectAccount;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new C03601(this.$$this$rxObservable, this.this$0, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    SendChannel sendChannel;
                    Object h = kotlin.coroutines.intrinsics.a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        sendChannel = this.$$this$rxObservable;
                        a c = this.this$0.c();
                        jk a = this.this$0.a();
                        RegiInterface regiInterface = RegiInterface.RegiOverflow;
                        String str = this.this$0.a() instanceof SectionActivity ? "Section Front Overflow" : "Article Front Overflow";
                        this.L$0 = sendChannel;
                        this.label = 1;
                        obj = c.n(a, null, regiInterface, str, this);
                        if (obj == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            f.b(obj);
                            return ww8.a;
                        }
                        sendChannel = (ProducerScope) this.L$0;
                        f.b(obj);
                    }
                    this.L$0 = null;
                    this.label = 2;
                    if (sendChannel.send(obj, this) == h) {
                        return h;
                    }
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((C03601) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ConnectAccount connectAccount, by0 by0Var) {
                super(2, by0Var);
                this.this$0 = connectAccount;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, by0Var);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.a.h();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                BuildersKt__Builders_commonKt.launch$default(e44.a(this.this$0.a()), null, null, new C03601((ProducerScope) this.L$0, this.this$0, null), 3, null);
                return ww8.a;
            }

            @Override // defpackage.gt2
            public final Object invoke(ProducerScope producerScope, by0 by0Var) {
                return ((AnonymousClass1) create(producerScope, by0Var)).invokeSuspend(ww8.a);
            }
        }

        AnonymousClass2(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return ConnectAccount.this.new AnonymousClass2(by0Var);
        }

        @Override // defpackage.gt2
        public final Object invoke(MenuItem menuItem, by0 by0Var) {
            return ((AnonymousClass2) create(menuItem, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            ConnectAccount.this.b().add(RxObservableKt.rxObservable$default(null, new AnonymousClass1(ConnectAccount.this, null), 1, null).subscribe(Functions.emptyConsumer(), new g05(ConnectAccount.class)));
            return cc0.a(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectAccount(jk jkVar, a aVar, CompositeDisposable compositeDisposable) {
        super(xk6.connectAccount, eg6.connectAcct, 1, Integer.valueOf(lh6.main_menu_order_connect_account), Boolean.FALSE, 0, null, null, true, null, null, 1728, null);
        zq3.h(jkVar, "activity");
        zq3.h(aVar, "eCommClient");
        zq3.h(compositeDisposable, "disposables");
        this.a = jkVar;
        this.b = aVar;
        this.c = compositeDisposable;
        setPreparer(new ss2() { // from class: com.nytimes.android.menu.item.ConnectAccount.1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((kq4) obj);
                return ww8.a;
            }

            public final void invoke(kq4 kq4Var) {
                zq3.h(kq4Var, "param");
                MenuItem findItem = kq4Var.c().findItem(eg6.connectAcct);
                if (findItem == null) {
                    return;
                }
                findItem.setVisible(ConnectAccount.this.c().p());
            }
        });
        setHandler(new AnonymousClass2(null));
    }

    public final jk a() {
        return this.a;
    }

    public final CompositeDisposable b() {
        return this.c;
    }

    public final a c() {
        return this.b;
    }
}
