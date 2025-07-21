package com.nytimes.android.push;

import com.nytimes.android.internal.pushmessaging.PushMessaging;
import com.nytimes.android.internal.pushmessaging.model.Subscription;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.AppPreferences;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class PushClientManager {
    public static final a Companion = new a(null);
    private final PushMessagingFactory a;
    private final AppPreferences b;
    private final CoroutineExceptionHandler c;
    private PushMessaging d;
    private final CoroutineScope e;
    private Set f;

    @fc1(c = "com.nytimes.android.push.PushClientManager$1", f = "PushClientManager.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.push.PushClientManager$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        Object L$0;
        int label;

        @fc1(c = "com.nytimes.android.push.PushClientManager$1$1", f = "PushClientManager.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.nytimes.android.push.PushClientManager$1$1, reason: invalid class name and collision with other inner class name */
        static final class C03771 extends SuspendLambda implements gt2 {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PushClientManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03771(PushClientManager pushClientManager, by0 by0Var) {
                super(2, by0Var);
                this.this$0 = pushClientManager;
            }

            @Override // defpackage.gt2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Subscription subscription, by0 by0Var) {
                return ((C03771) create(subscription, by0Var)).invokeSuspend(ww8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                C03771 c03771 = new C03771(this.this$0, by0Var);
                c03771.L$0 = obj;
                return c03771;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.a.h();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                this.this$0.j(((Subscription) this.L$0).g());
                return ww8.a;
            }
        }

        @fc1(c = "com.nytimes.android.push.PushClientManager$1$2", f = "PushClientManager.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.nytimes.android.push.PushClientManager$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements it2 {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(by0 by0Var) {
                super(3, by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.a.h();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                NYTLogger.i((Throwable) this.L$0, "PushClientManager init error", new Object[0]);
                return ww8.a;
            }

            @Override // defpackage.it2
            public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(by0Var);
                anonymousClass2.L$0 = th;
                return anonymousClass2.invokeSuspend(ww8.a);
            }
        }

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return PushClientManager.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PushClientManager pushClientManager;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                PushClientManager pushClientManager2 = PushClientManager.this;
                PushMessagingFactory pushMessagingFactory = pushClientManager2.a;
                this.L$0 = pushClientManager2;
                this.label = 1;
                Object c = pushMessagingFactory.c(this);
                if (c == h) {
                    return h;
                }
                pushClientManager = pushClientManager2;
                obj = c;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pushClientManager = (PushClientManager) this.L$0;
                f.b(obj);
            }
            pushClientManager.d = (PushMessaging) obj;
            PushMessaging pushMessaging = PushClientManager.this.d;
            if (pushMessaging == null) {
                zq3.z("pushMessaging");
                pushMessaging = null;
            }
            FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(pushMessaging.b(), new C03771(PushClientManager.this, null)), new AnonymousClass2(null)), PushClientManager.this.e);
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            NYTLogger.g("BreadCrumb", "Exception Handler PushClientManger", th);
        }
    }

    public PushClientManager(PushMessagingFactory pushMessagingFactory, AppPreferences appPreferences, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(pushMessagingFactory, "pushMessagingFactory");
        zq3.h(appPreferences, "prefs");
        zq3.h(coroutineDispatcher, "dispatcher");
        this.a = pushMessagingFactory;
        this.b = appPreferences;
        b bVar = new b(CoroutineExceptionHandler.Key);
        this.c = bVar;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher.plus(bVar));
        this.e = CoroutineScope;
        this.f = b0.e();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Set set) {
        this.b.e("PUSH_SUBS", set);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.Set r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.push.PushClientManager$addTags$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.push.PushClientManager$addTags$1 r0 = (com.nytimes.android.push.PushClientManager$addTags$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.push.PushClientManager$addTags$1 r0 = new com.nytimes.android.push.PushClientManager$addTags$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r6)
            com.nytimes.android.internal.pushmessaging.PushMessaging r4 = r4.d
            if (r4 != 0) goto L3e
            java.lang.String r4 = "pushMessaging"
            defpackage.zq3.z(r4)
            r4 = 0
        L3e:
            r0.label = r3
            java.lang.Object r6 = r4.c(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            com.nytimes.android.internal.pushmessaging.model.Subscription r6 = (com.nytimes.android.internal.pushmessaging.model.Subscription) r6
            java.util.Set r4 = r6.g()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.push.PushClientManager.f(java.util.Set, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.Set r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.push.PushClientManager$delTags$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.push.PushClientManager$delTags$1 r0 = (com.nytimes.android.push.PushClientManager$delTags$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.push.PushClientManager$delTags$1 r0 = new com.nytimes.android.push.PushClientManager$delTags$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r6)
            com.nytimes.android.internal.pushmessaging.PushMessaging r4 = r4.d
            if (r4 != 0) goto L3e
            java.lang.String r4 = "pushMessaging"
            defpackage.zq3.z(r4)
            r4 = 0
        L3e:
            r0.label = r3
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            com.nytimes.android.internal.pushmessaging.model.Subscription r6 = (com.nytimes.android.internal.pushmessaging.model.Subscription) r6
            java.util.Set r4 = r6.g()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.push.PushClientManager.g(java.util.Set, by0):java.lang.Object");
    }

    public final Set h() {
        Set m = this.b.m("PUSH_SUBS", this.f);
        return m == null ? this.f : m;
    }

    public final boolean i(String str) {
        Set m = this.b.m("PUSH_SUBS", b0.e());
        if (m == null) {
            m = b0.e();
        }
        return i.c0(m, str);
    }
}
