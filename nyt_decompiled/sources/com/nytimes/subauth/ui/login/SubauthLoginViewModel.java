package com.nytimes.subauth.ui.login;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.facebook.AccessToken;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import com.nytimes.subauth.ui.models.LoginType;
import com.nytimes.subauth.ui.models.SubauthUiParams;
import defpackage.by0;
import defpackage.c05;
import defpackage.cc0;
import defpackage.dr2;
import defpackage.eq5;
import defpackage.f68;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.i77;
import defpackage.na4;
import defpackage.nk8;
import defpackage.o98;
import defpackage.oa4;
import defpackage.p54;
import defpackage.p60;
import defpackage.p78;
import defpackage.qs2;
import defpackage.r54;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zt6;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class SubauthLoginViewModel extends q {
    public static final a N = new a(null);
    public static final int Q = 8;
    private static final Pattern S = Pattern.compile("^[a-zA-Z0-9._\\-]{5,15}$");
    private final MutableStateFlow B;
    private final MutableStateFlow H;
    private final qs2 L;
    private Job M;
    private final NYTUser a;
    private final o98 b;
    private final p78 c;
    private final c05 d;
    private final com.nytimes.android.subauth.core.purr.a e;
    private final p60 f;
    private final dr2 g;
    private final MutableSharedFlow h;
    private final f68 i;
    private final SubauthLIREFlowAnalyticsManager j;
    private final SubauthEnvironment k;
    private SubauthUiParams l;
    private final MutableStateFlow m;
    private final StateFlow n;
    private final MutableStateFlow r;
    private final StateFlow s;
    private MutableStateFlow t;
    private p54 u;
    private i77 w;
    private final MutableStateFlow x;
    private final StateFlow y;

    @fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$2", f = "SubauthLoginViewModel.kt", l = {145}, m = "invokeSuspend")
    /* renamed from: com.nytimes.subauth.ui.login.SubauthLoginViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(r54 r54Var, by0 by0Var) {
            return ((AnonymousClass2) create(r54Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = SubauthLoginViewModel.this.new AnonymousClass2(by0Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                r54 r54Var = (r54) this.L$0;
                if (r54Var instanceof r54.e) {
                    SubauthLoginViewModel.this.u = p54.g.b;
                    SubauthLoginViewModel.this.w = null;
                }
                SubauthLIREFlowAnalyticsManager subauthLIREFlowAnalyticsManager = SubauthLoginViewModel.this.j;
                boolean A = SubauthLoginViewModel.this.i.A();
                nk8 x = SubauthLoginViewModel.this.i.x();
                p54 T = SubauthLoginViewModel.this.T();
                this.label = 1;
                if (subauthLIREFlowAnalyticsManager.t(r54Var, A, x, T, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SubauthUserUIDebugAPI.SSOActionOverrideState.values().length];
            try {
                iArr[SubauthUserUIDebugAPI.SSOActionOverrideState.NO_OVERRIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubauthUserUIDebugAPI.SSOActionOverrideState.ACTION_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubauthUserUIDebugAPI.SSOActionOverrideState.ACTION_REGISTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SubauthUserUIDebugAPI.SSOActionOverrideState.ACTION_LINKED_REGILITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public SubauthLoginViewModel(NYTUser nYTUser, o98 o98Var, p78 p78Var, c05 c05Var, com.nytimes.android.subauth.core.purr.a aVar, p60 p60Var, dr2 dr2Var, MutableSharedFlow mutableSharedFlow, f68 f68Var, SubauthLIREFlowAnalyticsManager subauthLIREFlowAnalyticsManager, SubauthEnvironment subauthEnvironment) {
        zq3.h(nYTUser, "nytUser");
        zq3.h(o98Var, "subauthUser");
        zq3.h(p78Var, "subauthLoginLinkingAPI");
        zq3.h(c05Var, "nytCookieProvider");
        zq3.h(aVar, "purrManager");
        zq3.h(p60Var, "networkStatus");
        zq3.h(dr2Var, "errorParser");
        zq3.h(mutableSharedFlow, "lireResultFlow");
        zq3.h(f68Var, "subauthConfig");
        zq3.h(subauthLIREFlowAnalyticsManager, "analyticsManager");
        zq3.h(subauthEnvironment, "subauthEnvironment");
        this.a = nYTUser;
        this.b = o98Var;
        this.c = p78Var;
        this.d = c05Var;
        this.e = aVar;
        this.f = p60Var;
        this.g = dr2Var;
        this.h = mutableSharedFlow;
        this.i = f68Var;
        this.j = subauthLIREFlowAnalyticsManager;
        this.k = subauthEnvironment;
        this.l = new SubauthUiParams(false, false, false, false, null, false, false, null, null, null, 1023, null);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.m = MutableStateFlow;
        this.n = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new r54.e(f68Var.x().d()));
        this.r = MutableStateFlow2;
        this.s = MutableStateFlow2;
        this.t = StateFlowKt.MutableStateFlow(null);
        this.u = p54.g.b;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.x = MutableStateFlow3;
        this.y = MutableStateFlow3;
        this.B = StateFlowKt.MutableStateFlow(bool);
        this.H = StateFlowKt.MutableStateFlow(bool);
        this.L = new qs2() { // from class: com.nytimes.subauth.ui.login.SubauthLoginViewModel$onEmailSupportRequestedCallback$1

            @fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$onEmailSupportRequestedCallback$1$1", f = "SubauthLoginViewModel.kt", l = {125}, m = "invokeSuspend")
            /* renamed from: com.nytimes.subauth.ui.login.SubauthLoginViewModel$onEmailSupportRequestedCallback$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                int label;
                final /* synthetic */ SubauthLoginViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SubauthLoginViewModel subauthLoginViewModel, by0 by0Var) {
                    super(2, by0Var);
                    this.this$0 = subauthLoginViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.this$0, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    MutableStateFlow mutableStateFlow;
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        mutableStateFlow = this.this$0.m;
                        Object value = mutableStateFlow.getValue();
                        na4.b bVar = value instanceof na4.b ? (na4.b) value : null;
                        SubauthLIREFlowAnalyticsManager subauthLIREFlowAnalyticsManager = this.this$0.j;
                        this.label = 1;
                        if (subauthLIREFlowAnalyticsManager.p(bVar, this) == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                    }
                    this.this$0.O();
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m786invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m786invoke() {
                BuildersKt__Builders_commonKt.launch$default(r.a(SubauthLoginViewModel.this), null, null, new AnonymousClass1(SubauthLoginViewModel.this, null), 3, null);
            }
        };
        FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(MutableStateFlow2, new gt2() { // from class: com.nytimes.subauth.ui.login.SubauthLoginViewModel.1
            @Override // defpackage.gt2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(r54 r54Var, r54 r54Var2) {
                zq3.h(r54Var, "old");
                zq3.h(r54Var2, "new");
                return Boolean.valueOf(zq3.c(zt6.b(r54Var.getClass()).d(), zt6.b(r54Var2.getClass()).d()));
            }
        }), new AnonymousClass2(null)), r.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C0(yl7.a r8, int r9, defpackage.by0 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.nytimes.subauth.ui.login.SubauthLoginViewModel$onSetNewPasswordError$1
            if (r0 == 0) goto L13
            r0 = r10
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$onSetNewPasswordError$1 r0 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel$onSetNewPasswordError$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$onSetNewPasswordError$1 r0 = new com.nytimes.subauth.ui.login.SubauthLoginViewModel$onSetNewPasswordError$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            int r9 = r0.I$0
            java.lang.Object r7 = r0.L$1
            r8 = r7
            yl7$a r8 = (yl7.a) r8
            java.lang.Object r7 = r0.L$0
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r7 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel) r7
            kotlin.f.b(r10)
            goto La5
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.f.b(r10)
            boolean r10 = r8 instanceof yl7.a.C0558a
            if (r10 == 0) goto L50
            r10 = r8
            yl7$a$a r10 = (yl7.a.C0558a) r10
            com.nytimes.android.subauth.core.auth.network.response.LoginError r10 = r10.a()
            java.lang.String r10 = r10.c()
            goto L76
        L50:
            boolean r10 = r8 instanceof yl7.a.d
            if (r10 == 0) goto L60
            r10 = r8
            yl7$a$d r10 = (yl7.a.d) r10
            com.nytimes.android.subauth.core.auth.network.response.LoginError r10 = r10.a()
            java.lang.String r10 = r10.c()
            goto L76
        L60:
            boolean r10 = r8 instanceof yl7.a.b
            if (r10 == 0) goto L6c
            r10 = r8
            yl7$a$b r10 = (yl7.a.b) r10
            java.lang.String r10 = r10.a()
            goto L76
        L6c:
            yl7$a$c r10 = yl7.a.c.a
            boolean r10 = defpackage.zq3.c(r8, r10)
            if (r10 == 0) goto Lb7
            java.lang.String r10 = "Internet Not Connected"
        L76:
            ul8$b r2 = defpackage.ul8.a
            java.lang.String r5 = "SUBAUTH"
            ul8$c r2 = r2.z(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Error on Set New Password: "
            r5.append(r6)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r2.d(r5, r6)
            com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager r2 = r7.j
            r0.L$0 = r7
            r0.L$1 = r8
            r0.I$0 = r9
            r0.label = r4
            java.lang.Object r10 = r2.d(r10, r0)
            if (r10 != r1) goto La5
            return r1
        La5:
            kotlinx.coroutines.flow.MutableStateFlow r10 = r7.m
            dr2 r7 = r7.g
            r0 = 6
            if (r9 >= r0) goto Lad
            r3 = r4
        Lad:
            na4$b r7 = r7.p(r8, r3)
            r10.setValue(r7)
            ww8 r7 = defpackage.ww8.a
            return r7
        Lb7:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.C0(yl7$a, int, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G0(com.nytimes.android.subauth.core.auth.models.c.a r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.subauth.ui.login.SubauthLoginViewModel$onVerifyEmailError$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$onVerifyEmailError$1 r0 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel$onVerifyEmailError$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$onVerifyEmailError$1 r0 = new com.nytimes.subauth.ui.login.SubauthLoginViewModel$onVerifyEmailError$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            com.nytimes.android.subauth.core.auth.models.c$a r5 = (com.nytimes.android.subauth.core.auth.models.c.a) r5
            java.lang.Object r4 = r0.L$0
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r4 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel) r4
            kotlin.f.b(r6)
            goto L50
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.f.b(r6)
            com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager r6 = r4.j
            java.lang.String r2 = r5.a()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.y(r2, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            kotlinx.coroutines.flow.MutableStateFlow r6 = r4.m
            dr2 r0 = r4.g
            na4$b r5 = r0.q(r5)
            r6.setValue(r5)
            java.lang.String r5 = ""
            r4.F0(r5)
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.G0(com.nytimes.android.subauth.core.auth.models.c$a, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H0(java.lang.String r8, java.lang.String r9, defpackage.by0 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.nytimes.subauth.ui.login.SubauthLoginViewModel$onVerifyEmailSuccess$1
            if (r0 == 0) goto L13
            r0 = r10
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$onVerifyEmailSuccess$1 r0 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel$onVerifyEmailSuccess$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$onVerifyEmailSuccess$1 r0 = new com.nytimes.subauth.ui.login.SubauthLoginViewModel$onVerifyEmailSuccess$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.L$2
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r0.L$1
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.L$0
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r7 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel) r7
            kotlin.f.b(r10)
        L36:
            r1 = r8
            r3 = r9
            goto L55
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            kotlin.f.b(r10)
            com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager r10 = r7.j
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r3
            java.lang.Object r10 = r10.A(r0)
            if (r10 != r1) goto L36
            return r1
        L55:
            kotlinx.coroutines.flow.MutableStateFlow r7 = r7.r
            r54$c r8 = new r54$c
            r5 = 10
            r6 = 0
            r2 = 0
            r4 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.setValue(r8)
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.H0(java.lang.String, java.lang.String, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(java.lang.String r24, java.lang.String r25, androidx.fragment.app.f r26, defpackage.by0 r27) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.J(java.lang.String, java.lang.String, androidx.fragment.app.f, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r2v14, types: [oa4] */
    /* JADX WARN: Type inference failed for: r2v9, types: [oa4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(java.lang.String r27, java.lang.String r28, boolean r29, androidx.fragment.app.f r30, defpackage.by0 r31) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.K(java.lang.String, java.lang.String, boolean, androidx.fragment.app.f, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(defpackage.by0 r9) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.L(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0(LoginType loginType) {
        this.x.setValue(Boolean.TRUE);
        String uuid = UUID.randomUUID().toString();
        zq3.g(uuid, "toString(...)");
        String str = loginType instanceof LoginType.GoogleSSOLogin ? "google" : loginType instanceof LoginType.FacebookSSOLogin ? AccessToken.DEFAULT_GRAPH_DOMAIN : "";
        if (h.d0(str)) {
            ul8.a.u("unknown provider", new Object[0]);
            return;
        }
        this.m.setValue(new na4.e(this.k.c() + "/social-login?provider=" + str + "&state=" + uuid + "&app=" + this.i.y() + "&platform=android", uuid, loginType));
        this.x.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(java.lang.String r19, defpackage.by0 r20) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.M(java.lang.String, by0):java.lang.Object");
    }

    private final void N() {
        this.B.setValue(Boolean.TRUE);
    }

    public static /* synthetic */ void N0(SubauthLoginViewModel subauthLoginViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        subauthLoginViewModel.M0(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(defpackage.by0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.nytimes.subauth.ui.login.SubauthLoginViewModel$executeCustomLoginWithNYTSProvider$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$executeCustomLoginWithNYTSProvider$1 r0 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel$executeCustomLoginWithNYTSProvider$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$executeCustomLoginWithNYTSProvider$1 r0 = new com.nytimes.subauth.ui.login.SubauthLoginViewModel$executeCustomLoginWithNYTSProvider$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "SUBAUTH"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L37
            if (r2 != r5) goto L2f
            kotlin.f.b(r9)
            goto L9c
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.L$0
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r8 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel) r8
            kotlin.f.b(r9)
            goto L64
        L3f:
            kotlin.f.b(r9)
            com.nytimes.subauth.ui.providers.CustomLoginWithNYTSProvider r9 = com.nytimes.subauth.ui.providers.CustomLoginWithNYTSProvider.a
            boolean r9 = r9.c()
            if (r9 == 0) goto L9f
            ul8$b r9 = defpackage.ul8.a
            ul8$c r9 = r9.z(r4)
            java.lang.String r2 = "Execute Custom NYT-S Login Lambda"
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r9.a(r2, r7)
            c05 r9 = r8.d
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r9.q(r0)
            if (r9 != r1) goto L64
            return r1
        L64:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L7d
            ul8$b r9 = defpackage.ul8.a
            ul8$c r9 = r9.z(r4)
            java.lang.String r0 = "ERROR: Failed to Execute Custom NYT-S Login Lambda. No NYT-S Cookie"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r9.d(r0, r1)
            kotlinx.coroutines.flow.MutableStateFlow r8 = r8.t
            e15$b r9 = e15.b.a
            r8.setValue(r9)
            goto La6
        L7d:
            kotlinx.coroutines.flow.MutableStateFlow r2 = r8.t
            e15$c r3 = e15.c.a
            r2.setValue(r3)
            com.nytimes.subauth.ui.providers.CustomLoginWithNYTSProvider r2 = com.nytimes.subauth.ui.providers.CustomLoginWithNYTSProvider.a
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$executeCustomLoginWithNYTSProvider$2 r3 = new com.nytimes.subauth.ui.login.SubauthLoginViewModel$executeCustomLoginWithNYTSProvider$2
            r3.<init>()
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$executeCustomLoginWithNYTSProvider$3 r4 = new com.nytimes.subauth.ui.login.SubauthLoginViewModel$executeCustomLoginWithNYTSProvider$3
            r4.<init>()
            r8 = 0
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r8 = r2.b(r9, r3, r4, r0)
            if (r8 != r1) goto L9c
            return r1
        L9c:
            ww8 r8 = defpackage.ww8.a
            return r8
        L9f:
            kotlinx.coroutines.flow.MutableStateFlow r8 = r8.t
            e15$d r9 = e15.d.a
            r8.setValue(r9)
        La6:
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.Q(by0):java.lang.Object");
    }

    private final boolean Q0(oa4.b bVar) {
        return (((Boolean) this.H.getValue()).booleanValue() || (bVar.f() instanceof CancellationException)) ? false : true;
    }

    private final String U(oa4.c cVar) {
        int i = b.a[this.l.k().ordinal()];
        if (i == 1) {
            return cVar.d().b();
        }
        if (i == 2) {
            return "LOGIN";
        }
        if (i == 3) {
            return "REGISTER";
        }
        if (i != 4) {
            return null;
        }
        return "LINKED_REGILITE";
    }

    private final String W(boolean z) {
        return !this.l.i() ? "U" : z ? "Y" : !z ? "N" : "U";
    }

    private final String X() {
        return !this.l.i() ? "do-not-display" : this.l.m() ? "checked" : "unchecked";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a0(java.lang.String r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.subauth.ui.login.SubauthLoginViewModel$goToVerifyEmailScreen$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$goToVerifyEmailScreen$1 r0 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel$goToVerifyEmailScreen$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$goToVerifyEmailScreen$1 r0 = new com.nytimes.subauth.ui.login.SubauthLoginViewModel$goToVerifyEmailScreen$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r0.L$0
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r4 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel) r4
            kotlin.f.b(r6)
            goto L50
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.f.b(r6)
            p54$c r6 = p54.c.b
            r4.u = r6
            com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager r6 = r4.j
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.m(r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            kotlinx.coroutines.flow.MutableStateFlow r6 = r4.r
            r54$g r0 = new r54$g
            r1 = 2
            r2 = 0
            r0.<init>(r5, r2, r1, r2)
            r6.setValue(r0)
            r4.M0(r5, r3)
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.a0(java.lang.String, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b0(na4 na4Var, boolean z, by0 by0Var) {
        FlowKt.launchIn(FlowKt.onEach(FlowKt.takeWhile(this.t, new SubauthLoginViewModel$handleAppSetupAtEndOfLIRE$2(null)), new SubauthLoginViewModel$handleAppSetupAtEndOfLIRE$3(this, na4Var, z, null)), r.a(this));
        return ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c0(java.lang.String r9, boolean r10, defpackage.by0 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.nytimes.subauth.ui.login.SubauthLoginViewModel$handleAppSetupFailure$1
            if (r0 == 0) goto L13
            r0 = r11
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$handleAppSetupFailure$1 r0 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel$handleAppSetupFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$handleAppSetupFailure$1 r0 = new com.nytimes.subauth.ui.login.SubauthLoginViewModel$handleAppSetupFailure$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            kotlin.f.b(r11)
            goto Laa
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            boolean r10 = r0.Z$0
            java.lang.Object r8 = r0.L$0
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r8 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel) r8
            kotlin.f.b(r11)
            goto L81
        L40:
            kotlin.f.b(r11)
            ul8$b r11 = defpackage.ul8.a
            java.lang.String r2 = "SUBAUTH"
            ul8$c r11 = r11.z(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "App Setup from NYT-S failed: "
            r2.append(r6)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r11.d(r2, r7)
            kotlinx.coroutines.flow.MutableStateFlow r11 = r8.t
            r11.setValue(r3)
            kotlinx.coroutines.flow.MutableStateFlow r11 = r8.x
            java.lang.Boolean r2 = defpackage.cc0.a(r6)
            r11.setValue(r2)
            com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager r11 = r8.j
            p54 r2 = r8.u
            r0.L$0 = r8
            r0.Z$0 = r10
            r0.label = r5
            java.lang.Object r9 = r11.f(r9, r2, r0)
            if (r9 != r1) goto L81
            return r1
        L81:
            dr2 r9 = r8.g
            na4$b r9 = r9.d(r10)
            kotlinx.coroutines.flow.MutableStateFlow r10 = r8.m
            na4$c r11 = new na4$c
            java.lang.String r2 = r9.b()
            if (r2 != 0) goto L93
            java.lang.String r2 = ""
        L93:
            java.lang.String r9 = r9.a()
            r11.<init>(r2, r9)
            r10.setValue(r11)
            com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager r8 = r8.j
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r8 = r8.w(r0)
            if (r8 != r1) goto Laa
            return r1
        Laa:
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.c0(java.lang.String, boolean, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d0(na4 na4Var, by0 by0Var) {
        ul8.a.z("SUBAUTH").a("App Setup Success! Exiting Unified LIRE. Login State: " + na4Var, new Object[0]);
        this.t.setValue(null);
        this.x.setValue(cc0.a(false));
        this.m.setValue(na4Var);
        Object L = L(by0Var);
        return L == kotlin.coroutines.intrinsics.a.h() ? L : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e0(java.lang.String r10, com.nytimes.android.subauth.core.auth.network.response.a r11, boolean r12, defpackage.by0 r13) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.e0(java.lang.String, com.nytimes.android.subauth.core.auth.network.response.a, boolean, by0):java.lang.Object");
    }

    static /* synthetic */ Object f0(SubauthLoginViewModel subauthLoginViewModel, String str, com.nytimes.android.subauth.core.auth.network.response.a aVar, boolean z, by0 by0Var, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return subauthLoginViewModel.e0(str, aVar, z, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(com.nytimes.subauth.ui.models.LoginType r11, defpackage.oa4 r12, com.nytimes.android.subauth.core.api.providers.LinkResult r13, defpackage.by0 r14) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.g0(com.nytimes.subauth.ui.models.LoginType, oa4, com.nytimes.android.subauth.core.api.providers.LinkResult, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i0(com.nytimes.android.subauth.core.auth.network.response.LoginResponse r9, oa4.c r10, defpackage.na4 r11, defpackage.by0 r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.nytimes.subauth.ui.login.SubauthLoginViewModel$handleSSOLoginSuccess$1
            if (r0 == 0) goto L13
            r0 = r12
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$handleSSOLoginSuccess$1 r0 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel$handleSSOLoginSuccess$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$handleSSOLoginSuccess$1 r0 = new com.nytimes.subauth.ui.login.SubauthLoginViewModel$handleSSOLoginSuccess$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L4d
            if (r2 == r7) goto L45
            if (r2 == r5) goto L45
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            goto L45
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.L$1
            r11 = r8
            na4 r11 = (defpackage.na4) r11
            java.lang.Object r8 = r0.L$0
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r8 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel) r8
            kotlin.f.b(r12)
            goto Lb2
        L45:
            java.lang.Object r8 = r0.L$0
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r8 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel) r8
            kotlin.f.b(r12)
            goto Lc0
        L4d:
            kotlin.f.b(r12)
            java.lang.String r10 = r8.U(r10)
            java.lang.String r12 = "LINKED_REGILITE"
            boolean r12 = defpackage.zq3.c(r10, r12)
            if (r12 == 0) goto L78
            p54$e r10 = new p54$e
            i77 r12 = r8.w
            r10.<init>(r12)
            r8.u = r10
            java.lang.String r9 = r9.d()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r0.L$0 = r8
            r0.label = r7
            java.lang.Object r9 = r8.K0(r9, r11, r6, r0)
            if (r9 != r1) goto Lc0
            return r1
        L78:
            java.lang.String r12 = "REGISTER"
            boolean r10 = defpackage.zq3.c(r10, r12)
            if (r10 == 0) goto L9c
            p54$f r10 = new p54$f
            i77 r12 = r8.w
            r10.<init>(r12)
            r8.u = r10
            java.lang.String r9 = r9.d()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = r8.K0(r9, r11, r7, r0)
            if (r9 != r1) goto Lc0
            return r1
        L9c:
            p54$d r9 = new p54$d
            i77 r10 = r8.w
            r9.<init>(r10)
            r8.u = r9
            r0.L$0 = r8
            r0.L$1 = r11
            r0.label = r4
            java.lang.Object r9 = r8.Q(r0)
            if (r9 != r1) goto Lb2
            return r1
        Lb2:
            r0.L$0 = r8
            r9 = 0
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r9 = r8.b0(r11, r6, r0)
            if (r9 != r1) goto Lc0
            return r1
        Lc0:
            kotlinx.coroutines.flow.MutableStateFlow r8 = r8.x
            java.lang.Boolean r9 = defpackage.cc0.a(r6)
            r8.setValue(r9)
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.i0(com.nytimes.android.subauth.core.auth.network.response.LoginResponse, oa4$c, na4, by0):java.lang.Object");
    }

    private final boolean n0(String str) {
        return !h.d0(h.c1(str).toString()) && eq5.j.matcher(str).matches();
    }

    private final boolean o0(String str) {
        return S.matcher(str).matches();
    }

    private final void r0(ss2 ss2Var) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new SubauthLoginViewModel$onButtonPressed$1(this, ss2Var, null), 3, null);
        launch$default.invokeOnCompletion(new ss2() { // from class: com.nytimes.subauth.ui.login.SubauthLoginViewModel$onButtonPressed$2$1

            @fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$onButtonPressed$2$1$1", f = "SubauthLoginViewModel.kt", l = {1152}, m = "invokeSuspend")
            /* renamed from: com.nytimes.subauth.ui.login.SubauthLoginViewModel$onButtonPressed$2$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                int label;
                final /* synthetic */ SubauthLoginViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SubauthLoginViewModel subauthLoginViewModel, by0 by0Var) {
                    super(2, by0Var);
                    this.this$0 = subauthLoginViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.this$0, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object L;
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        SubauthLoginViewModel subauthLoginViewModel = this.this$0;
                        this.label = 1;
                        L = subauthLoginViewModel.L(this);
                        if (L == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                    }
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass1(SubauthLoginViewModel.this, null), 3, null);
            }
        });
        this.M = launch$default;
    }

    public final void A0(boolean z) {
        r54 r54Var = (r54) this.r.getValue();
        if (r54Var instanceof r54.b) {
            this.r.setValue(r54.b.d((r54.b) r54Var, null, null, Boolean.valueOf(z), 3, null));
        }
    }

    public final void B0(String str, String str2, String str3) {
        zq3.h(str, "email");
        zq3.h(str2, "password");
        zq3.h(str3, "token");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new SubauthLoginViewModel$onSetNewPassword$1(this, str3, str2, str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D0(java.lang.String r9, com.nytimes.android.subauth.core.auth.network.response.LoginResponse r10, defpackage.by0 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.nytimes.subauth.ui.login.SubauthLoginViewModel$onSetNewPasswordSuccess$1
            if (r0 == 0) goto L13
            r0 = r11
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$onSetNewPasswordSuccess$1 r0 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel$onSetNewPasswordSuccess$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$onSetNewPasswordSuccess$1 r0 = new com.nytimes.subauth.ui.login.SubauthLoginViewModel$onSetNewPasswordSuccess$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5a
            if (r2 == r5) goto L48
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.f.b(r11)
            goto Lab
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.L$2
            com.nytimes.android.subauth.core.auth.network.response.LoginResponse r8 = (com.nytimes.android.subauth.core.auth.network.response.LoginResponse) r8
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.L$0
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r10 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel) r10
            kotlin.f.b(r11)
            goto L80
        L48:
            java.lang.Object r8 = r0.L$2
            r10 = r8
            com.nytimes.android.subauth.core.auth.network.response.LoginResponse r10 = (com.nytimes.android.subauth.core.auth.network.response.LoginResponse) r10
            java.lang.Object r8 = r0.L$1
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.L$0
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r8 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel) r8
            kotlin.f.b(r11)
            goto L6c
        L5a:
            kotlin.f.b(r11)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r5
            java.lang.Object r11 = r8.I(r0)
            if (r11 != r1) goto L6c
            return r1
        L6c:
            com.nytimes.subauth.ui.login.SubauthLIREFlowAnalyticsManager r11 = r8.j
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r11 = r11.e(r0)
            if (r11 != r1) goto L7d
            return r1
        L7d:
            r7 = r10
            r10 = r8
            r8 = r7
        L80:
            na4$f r11 = new na4$f
            com.nytimes.subauth.ui.models.LoginType$RegiLiteLogin r2 = com.nytimes.subauth.ui.models.LoginType.RegiLiteLogin.INSTANCE
            oa4$c r4 = new oa4$c
            com.nytimes.android.subauth.core.auth.models.LoginMethod r5 = com.nytimes.android.subauth.core.auth.models.LoginMethod.SetPasswordWithToken
            r6 = 0
            r4.<init>(r8, r5, r6)
            com.nytimes.android.subauth.core.api.providers.LinkResult r8 = com.nytimes.android.subauth.core.api.providers.LinkResult.None
            r11.<init>(r2, r4, r8)
            kotlinx.coroutines.flow.MutableStateFlow r8 = r10.r
            r54$f r2 = new r54$f
            r4 = 0
            r2.<init>(r9, r11, r4, r4)
            r8.setValue(r2)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r8 = r10.Q(r0)
            if (r8 != r1) goto Lab
            return r1
        Lab:
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.D0(java.lang.String, com.nytimes.android.subauth.core.auth.network.response.LoginResponse, by0):java.lang.Object");
    }

    public final void E0(String str, String str2) {
        zq3.h(str, "email");
        zq3.h(str2, "verificationCode");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new SubauthLoginViewModel$onSubmitEmailVerificationCode$1(this, str2, str, null), 3, null);
    }

    public final void F0(String str) {
        zq3.h(str, "newTextInput");
        Object obj = (r54) this.r.getValue();
        MutableStateFlow mutableStateFlow = this.r;
        if (obj instanceof r54.d) {
            obj = r54.d.d((r54.d) obj, null, str, 1, null);
        } else if (obj instanceof r54.b) {
            obj = r54.b.d((r54.b) obj, null, str, null, 5, null);
        } else if (obj instanceof r54.c) {
            obj = r54.c.d((r54.c) obj, null, str, null, false, 13, null);
        } else if (obj instanceof r54.g) {
            obj = r54.g.d((r54.g) obj, null, str, 1, null);
        }
        mutableStateFlow.setValue(obj);
    }

    public final Object I(by0 by0Var) {
        return this.c.a(this.l.l(), by0Var);
    }

    public final void I0(String str, String str2) {
        zq3.h(str, "url");
        zq3.h(str2, "title");
        if (j0()) {
            this.x.setValue(Boolean.TRUE);
            this.r.setValue(new r54.h(str, str2, (r54) this.s.getValue()));
        } else {
            this.x.setValue(Boolean.FALSE);
            this.m.setValue(this.g.g());
        }
    }

    public final void J0() {
        this.x.setValue(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K0(java.lang.String r6, defpackage.na4 r7, boolean r8, defpackage.by0 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.nytimes.subauth.ui.login.SubauthLoginViewModel$openSSOSuccessScreen$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$openSSOSuccessScreen$1 r0 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel$openSSOSuccessScreen$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel$openSSOSuccessScreen$1 r0 = new com.nytimes.subauth.ui.login.SubauthLoginViewModel$openSSOSuccessScreen$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r9)
            goto L5d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r5 = (com.nytimes.subauth.ui.login.SubauthLoginViewModel) r5
            kotlin.f.b(r9)
            goto L51
        L3c:
            kotlin.f.b(r9)
            kotlinx.coroutines.flow.MutableStateFlow r9 = r5.r
            r54$f r2 = new r54$f
            r2.<init>(r6, r7, r8, r4)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r9.emit(r2, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = r5.Q(r0)
            if (r5 != r1) goto L5d
            return r1
        L5d:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.K0(java.lang.String, na4, boolean, by0):java.lang.Object");
    }

    public final void M0(String str, boolean z) {
        zq3.h(str, "email");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new SubauthLoginViewModel$requestEmailVerificationCode$1(this, str, z, null), 3, null);
    }

    public final void O() {
        this.x.setValue(Boolean.FALSE);
        this.m.setValue(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            defpackage.zq3.h(r4, r0)
            f68 r0 = r3.i
            java.lang.String r0 = r0.m()
            if (r0 == 0) goto L2a
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r1 = r1.name()
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "?redirect_uri="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            if (r0 != 0) goto L2c
        L2a:
            java.lang.String r0 = ""
        L2c:
            int r1 = defpackage.mm6.subauth_forgot_password_link
            java.lang.String r1 = r4.getString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r1 = defpackage.mm6.subauth_forgot_password_title
            java.lang.String r4 = r4.getString(r1)
            java.lang.String r1 = "getString(...)"
            defpackage.zq3.g(r4, r1)
            r3.O()
            r3.I0(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel.O0(android.content.Context):void");
    }

    public final qs2 P() {
        na4 na4Var = (na4) this.m.getValue();
        if (this.l.g() && (na4Var instanceof na4.b) && ((na4.b) na4Var).e()) {
            return this.L;
        }
        return null;
    }

    public final void P0(SubauthUiParams subauthUiParams) {
        zq3.h(subauthUiParams, "<set-?>");
        this.l = subauthUiParams;
    }

    public final void R() {
        ul8.a.z("SUBAUTH").a("Force Logout and Return to Email First Screen", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new SubauthLoginViewModel$forceLogoutAndReturnToEmailFirst$1(this, null), 3, null);
    }

    public final void S(boolean z) {
        ul8.a.z("SUBAUTH").a("Forcing One Tap Account Ready Flow (isRegister: " + z + ")", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new SubauthLoginViewModel$forceOneTapAccountReadyFlow$1(this, z, null), 3, null);
    }

    public final p54 T() {
        return this.u;
    }

    public final StateFlow V() {
        return this.n;
    }

    public final StateFlow Y() {
        return this.s;
    }

    public final SubauthUiParams Z() {
        return this.l;
    }

    public final Job h0(String str) {
        Job launch$default;
        zq3.h(str, "deepLink");
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new SubauthLoginViewModel$handleOAuthCallback$1(this, str, null), 3, null);
        return launch$default;
    }

    public final boolean j0() {
        return this.f.a();
    }

    public final boolean k0() {
        return this.i.z();
    }

    public final StateFlow l0() {
        return this.y;
    }

    public final boolean m0() {
        return this.i.A();
    }

    public final void p0() {
        if (((Boolean) this.B.getValue()).booleanValue()) {
            ul8.a.z("SUBAUTH").a("Clearing progress on activity created", new Object[0]);
            this.x.setValue(Boolean.FALSE);
        }
        this.B.setValue(Boolean.FALSE);
    }

    public final void q0() {
        this.H.setValue(Boolean.TRUE);
        r54 a2 = ((r54) this.s.getValue()).a();
        boolean c = zq3.c(a2, r54.a.c);
        if (this.s.getValue() instanceof r54.f) {
            return;
        }
        if (a2 != null && (!this.l.l() || !c)) {
            Job job = this.M;
            if (job != null && job.isActive()) {
                JobKt__JobKt.cancel$default(job, "User Cancelled", null, 2, null);
            }
            this.r.setValue(a2);
            this.x.setValue(Boolean.FALSE);
        }
        this.H.setValue(Boolean.FALSE);
        if (!c || this.l.l()) {
            return;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new SubauthLoginViewModel$onBackPressed$2(this, null), 1, null);
    }

    public final void s0(String str, String str2, boolean z, androidx.fragment.app.f fVar) {
        zq3.h(str, "username");
        zq3.h(str2, "password");
        zq3.h(fVar, "activity");
        r0(new SubauthLoginViewModel$onCreateAccountPressed$1(this, str, str2, z, fVar, null));
    }

    public final void t0(String str) {
        zq3.h(str, "newEmail");
        r54 r54Var = (r54) this.r.getValue();
        if (r54Var instanceof r54.e) {
            this.r.setValue(((r54.e) r54Var).c(str));
        }
    }

    public final void u0(String str) {
        zq3.h(str, "email");
        ul8.a.z("SUBAUTH").a("On Continue pressed", new Object[0]);
        r0(new SubauthLoginViewModel$onEmailFirstCheckEmailStatus$1(this, str, null));
    }

    public final void v0(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new SubauthLoginViewModel$onEmailOptInCheckboxToggled$1(this, z, null), 3, null);
    }

    public final void w0(Boolean bool) {
        ul8.a.z("SUBAUTH").a("On Email Opt In Success Screen Continue button pressed.", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new SubauthLoginViewModel$onEmailOptInSuccessScreenContinue$1(this, bool, null), 3, null);
    }

    public final void x0(androidx.fragment.app.f fVar) {
        zq3.h(fVar, "activity");
        N();
        r0(new SubauthLoginViewModel$onFacebookSSOPressed$1(this, fVar, null));
    }

    public final void y0(androidx.fragment.app.f fVar) {
        zq3.h(fVar, "activity");
        N();
        r0(new SubauthLoginViewModel$onGoogleSSOPressed$1(this, fVar, null));
    }

    public final void z0(String str, String str2, androidx.fragment.app.f fVar) {
        zq3.h(str, "username");
        zq3.h(str2, "password");
        zq3.h(fVar, "activity");
        r0(new SubauthLoginViewModel$onLoginPressed$1(this, str, str2, fVar, null));
    }
}
