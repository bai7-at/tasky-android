package com.nytimes.android.internal.pushmessaging.subscription;

import androidx.work.ExistingWorkPolicy;
import com.nytimes.android.abra.utilities.ParamProviderKt;
import com.nytimes.android.internal.pushmessaging.PushMessaging;
import com.nytimes.android.internal.pushmessaging.database.PushMessagingDao;
import com.nytimes.android.internal.pushmessaging.model.NYTPushMessagingUser;
import com.nytimes.android.internal.pushmessaging.model.Subscription;
import com.nytimes.android.internal.pushmessaging.subscription.PushSubscriptionAPI;
import com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerWorker;
import com.nytimes.android.internal.pushmessaging.util.ControlledRunner;
import defpackage.a15;
import defpackage.b22;
import defpackage.by0;
import defpackage.ot2;
import defpackage.qj9;
import defpackage.r82;
import defpackage.tf8;
import defpackage.vf8;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.i;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class SubscriptionManagerImpl implements PushMessaging {
    public static final Companion Companion = new Companion(null);
    private final PushMessaging.c a;
    private final a15 b;
    private final r82 c;
    private final PushSubscriptionAPI d;
    private final PushMessagingDao e;
    private final vf8 f;
    private final String g;
    private final qj9 h;
    private final String i;
    private final String j;
    private final CoroutineScope k;
    private NYTPushMessagingUser l;
    private String m;
    private Set n;
    private final ControlledRunner o;

    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class AddDelTags {
            private static final /* synthetic */ b22 $ENTRIES;
            private static final /* synthetic */ AddDelTags[] $VALUES;
            public static final AddDelTags ADD_TAGS = new AddDelTags("ADD_TAGS", 0, AnonymousClass1.a);
            public static final AddDelTags DEL_TAGS = new AddDelTags("DEL_TAGS", 1, AnonymousClass2.a);
            private final ot2 func;

            /* renamed from: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$Companion$AddDelTags$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ot2 {
                public static final AnonymousClass1 a = new AnonymousClass1();

                AnonymousClass1() {
                    super(7, PushSubscriptionAPI.class, "addTags", "addTags(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nytimes/android/internal/pushmessaging/subscription/PushSubscriptionAPI$HelixTagsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                }

                @Override // defpackage.ot2
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(PushSubscriptionAPI pushSubscriptionAPI, String str, String str2, String str3, String str4, PushSubscriptionAPI.HelixTagsRequest helixTagsRequest, by0 by0Var) {
                    return pushSubscriptionAPI.addTags(str, str2, str3, str4, helixTagsRequest, by0Var);
                }
            }

            /* renamed from: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$Companion$AddDelTags$2, reason: invalid class name */
            /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements ot2 {
                public static final AnonymousClass2 a = new AnonymousClass2();

                AnonymousClass2() {
                    super(7, PushSubscriptionAPI.class, "deleteTags", "deleteTags(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nytimes/android/internal/pushmessaging/subscription/PushSubscriptionAPI$HelixTagsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                }

                @Override // defpackage.ot2
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(PushSubscriptionAPI pushSubscriptionAPI, String str, String str2, String str3, String str4, PushSubscriptionAPI.HelixTagsRequest helixTagsRequest, by0 by0Var) {
                    return pushSubscriptionAPI.deleteTags(str, str2, str3, str4, helixTagsRequest, by0Var);
                }
            }

            private static final /* synthetic */ AddDelTags[] $values() {
                return new AddDelTags[]{ADD_TAGS, DEL_TAGS};
            }

            static {
                AddDelTags[] $values = $values();
                $VALUES = $values;
                $ENTRIES = a.a($values);
            }

            private AddDelTags(String str, int i, ot2 ot2Var) {
                this.func = ot2Var;
            }

            public static b22 getEntries() {
                return $ENTRIES;
            }

            public static AddDelTags valueOf(String str) {
                return (AddDelTags) Enum.valueOf(AddDelTags.class, str);
            }

            public static AddDelTags[] values() {
                return (AddDelTags[]) $VALUES.clone();
            }

            public final ot2 getFunc() {
                return this.func;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class UpdateReason {
            private static final /* synthetic */ b22 $ENTRIES;
            private static final /* synthetic */ UpdateReason[] $VALUES;
            public static final UpdateReason SUBSCRIPTION = new UpdateReason("SUBSCRIPTION", 0);
            public static final UpdateReason TOKEN = new UpdateReason("TOKEN", 1);
            public static final UpdateReason REGI_ID = new UpdateReason("REGI_ID", 2);
            public static final UpdateReason APP_VERSION = new UpdateReason("APP_VERSION", 3);
            public static final UpdateReason ENVIRONMENT = new UpdateReason("ENVIRONMENT", 4);
            public static final UpdateReason MIGRATION = new UpdateReason("MIGRATION", 5);

            private static final /* synthetic */ UpdateReason[] $values() {
                return new UpdateReason[]{SUBSCRIPTION, TOKEN, REGI_ID, APP_VERSION, ENVIRONMENT, MIGRATION};
            }

            static {
                UpdateReason[] $values = $values();
                $VALUES = $values;
                $ENTRIES = a.a($values);
            }

            private UpdateReason(String str, int i) {
            }

            public static b22 getEntries() {
                return $ENTRIES;
            }

            public static UpdateReason valueOf(String str) {
                return (UpdateReason) Enum.valueOf(UpdateReason.class, str);
            }

            public static UpdateReason[] values() {
                return (UpdateReason[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a(Set set) {
            zq3.h(set, "<this>");
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (((tf8) obj).e()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(i.w(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((tf8) it2.next()).a());
            }
            return i.c1(arrayList2);
        }

        private Companion() {
        }
    }

    public SubscriptionManagerImpl(PushMessaging.c cVar, a15 a15Var, r82 r82Var, PushSubscriptionAPI pushSubscriptionAPI, PushMessagingDao pushMessagingDao, vf8 vf8Var, String str, qj9 qj9Var, String str2, String str3, CoroutineScope coroutineScope) {
        zq3.h(cVar, "settings");
        zq3.h(a15Var, "nytPushMessagingUserProvider");
        zq3.h(r82Var, "fcmTokenProvider");
        zq3.h(pushSubscriptionAPI, "pushSubscriptionAPI");
        zq3.h(pushMessagingDao, "pushMessagingDao");
        zq3.h(vf8Var, "tagManager");
        zq3.h(str, "appVersion");
        zq3.h(qj9Var, "workManager");
        zq3.h(str2, ParamProviderKt.PARAM_TIMEZONE);
        zq3.h(str3, "namedTimezone");
        zq3.h(coroutineScope, "coroutineScope");
        this.a = cVar;
        this.b = a15Var;
        this.c = r82Var;
        this.d = pushSubscriptionAPI;
        this.e = pushMessagingDao;
        this.f = vf8Var;
        this.g = str;
        this.h = qj9Var;
        this.i = str2;
        this.j = str3;
        this.k = coroutineScope;
        this.o = new ControlledRunner();
        x();
        o();
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.nytimes.android.internal.pushmessaging.model.Subscription r27, com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl.Companion.AddDelTags r28, java.util.Set r29, defpackage.by0 r30) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl.l(com.nytimes.android.internal.pushmessaging.model.Subscription, com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$Companion$AddDelTags, java.util.Set, by0):java.lang.Object");
    }

    private final void o() {
        this.h.a("refreshTags", ExistingWorkPolicy.REPLACE, TagManagerWorker.g.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(by0 by0Var) {
        Object b = this.o.b(new SubscriptionManagerImpl$initSubscription$2(this, null), by0Var);
        return b == kotlin.coroutines.intrinsics.a.h() ? b : ww8.a;
    }

    private final void x() {
        Subscription c = this.a.c();
        if (c != null) {
            BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new SubscriptionManagerImpl$migrateSubscription$1$1(this, c, null), 3, null);
        }
    }

    private final void y() {
        BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new SubscriptionManagerImpl$observeUpdates$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new SubscriptionManagerImpl$observeUpdates$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new SubscriptionManagerImpl$observeUpdates$3(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.nytimes.android.internal.pushmessaging.PushMessaging
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.util.Set r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$1 r0 = (com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$1 r0 = new com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L65
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl r5 = (com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl) r5
            kotlin.f.b(r7)
            goto L53
        L41:
            kotlin.f.b(r7)
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDao r7 = r5.e
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            com.nytimes.android.internal.pushmessaging.model.Subscription r7 = (com.nytimes.android.internal.pushmessaging.model.Subscription) r7
            if (r7 == 0) goto L66
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r5.n(r7, r6, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            return r7
        L66:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$sub$1 r6 = new defpackage.qs2() { // from class: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$sub$1
                static {
                    /*
                        com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$sub$1 r0 = new com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$sub$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$sub$1) com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$sub$1.a com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$sub$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$sub$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$sub$1.<init>():void");
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ java.lang.Object mo865invoke() {
                    /*
                        r0 = this;
                        java.lang.String r0 = r0.mo865invoke()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$sub$1.mo865invoke():java.lang.Object");
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final java.lang.String mo865invoke() {
                    /*
                        r0 = this;
                        java.lang.String r0 = "No subscription to delete from"
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$deleteTagsFromSubscription$sub$1.mo865invoke():java.lang.String");
                }
            }
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl.a(java.util.Set, by0):java.lang.Object");
    }

    @Override // com.nytimes.android.internal.pushmessaging.PushMessaging
    public Flow b() {
        return FlowKt.filterNotNull(this.e.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.nytimes.android.internal.pushmessaging.PushMessaging
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.util.Set r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$1 r0 = (com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$1 r0 = new com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L65
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl r5 = (com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl) r5
            kotlin.f.b(r7)
            goto L53
        L41:
            kotlin.f.b(r7)
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDao r7 = r5.e
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            com.nytimes.android.internal.pushmessaging.model.Subscription r7 = (com.nytimes.android.internal.pushmessaging.model.Subscription) r7
            if (r7 == 0) goto L66
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r5.m(r7, r6, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            return r7
        L66:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$sub$1 r6 = new defpackage.qs2() { // from class: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$sub$1
                static {
                    /*
                        com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$sub$1 r0 = new com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$sub$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$sub$1) com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$sub$1.a com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$sub$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$sub$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$sub$1.<init>():void");
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ java.lang.Object mo865invoke() {
                    /*
                        r0 = this;
                        java.lang.String r0 = r0.mo865invoke()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$sub$1.mo865invoke():java.lang.Object");
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final java.lang.String mo865invoke() {
                    /*
                        r0 = this;
                        java.lang.String r0 = "No subscription to add to"
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$addTagsToSubscription$sub$1.mo865invoke():java.lang.String");
                }
            }
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl.c(java.util.Set, by0):java.lang.Object");
    }

    public final Object m(Subscription subscription, Set set, by0 by0Var) {
        return l(subscription, Companion.AddDelTags.ADD_TAGS, set, by0Var);
    }

    public final Object n(Subscription subscription, Set set, by0 by0Var) {
        return l(subscription, Companion.AddDelTags.DEL_TAGS, set, by0Var);
    }

    public final String p() {
        return this.g;
    }

    public final r82 q() {
        return this.c;
    }

    public final a15 r() {
        return this.b;
    }

    public final PushMessagingDao s() {
        return this.e;
    }

    public final PushMessaging.c t() {
        return this.a;
    }

    public final vf8 u() {
        return this.f;
    }

    public final qj9 v() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(com.nytimes.android.internal.pushmessaging.model.Subscription r24, defpackage.by0 r25) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl.z(com.nytimes.android.internal.pushmessaging.model.Subscription, by0):java.lang.Object");
    }
}
