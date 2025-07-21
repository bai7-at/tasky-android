package com.nytimes.android.subauth.devsettings.items;

import android.content.Context;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentFeedType;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.group.DevSettingPreferenceGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.devsettings.common.DevSettingLazySummaryItem;
import com.nytimes.android.devsettings.common.DevSettingSimpleClipboardItemKt;
import com.nytimes.android.devsettings.common.DevSettingSimpleItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;
import com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.di.DataStoreKt;
import defpackage.am5;
import defpackage.ao1;
import defpackage.ba1;
import defpackage.by0;
import defpackage.cc6;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hm6;
import defpackage.ll5;
import defpackage.q98;
import defpackage.ss2;
import defpackage.u16;
import defpackage.ul5;
import defpackage.ww8;
import defpackage.yl5;
import defpackage.yn1;
import defpackage.zn1;
import defpackage.zq3;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.d;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.random.Random;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class SubauthUserDevSettingFactory {
    public static final SubauthUserDevSettingFactory a = new SubauthUserDevSettingFactory();

    private SubauthUserDevSettingFactory() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(Context context, String str, NYTUser nYTUser, q98 q98Var, by0 by0Var) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new SubauthUserDevSettingFactory$handleUserStateChange$2(str, context, nYTUser, q98Var, null), 2, null);
        return ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0069 A[PHI: r9
      0x0069: PHI (r9v3 java.lang.Object) = (r9v2 java.lang.Object), (r9v1 java.lang.Object) binds: [B:21:0x0066, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r6, com.nytimes.android.subauth.core.api.client.NYTUser r7, defpackage.q98 r8, defpackage.by0 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$loginUser$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$loginUser$1 r0 = (com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$loginUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$loginUser$1 r0 = new com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$loginUser$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r9)
            goto L69
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            boolean r6 = r0.Z$0
            java.lang.Object r5 = r0.L$0
            r8 = r5
            q98 r8 = (defpackage.q98) r8
            kotlin.f.b(r9)
            goto L4f
        L3f:
            kotlin.f.b(r9)
            r0.L$0 = r8
            r0.Z$0 = r6
            r0.label = r4
            java.lang.Object r5 = r5.g(r7, r8, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            if (r6 == 0) goto L54
            java.lang.String r5 = "*Jezhf.vWrueB6G"
            goto L56
        L54:
            java.lang.String r5 = "tEsXe-wnJUcWc2L"
        L56:
            if (r6 == 0) goto L5b
            java.lang.String r6 = "nyt.test.mobile.subscribed@gmail.com"
            goto L5d
        L5b:
            java.lang.String r6 = "nyt.test.mobile.unsubscribed@gmail.com"
        L5d:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r9 = r8.E(r6, r5, r0)
            if (r9 != r1) goto L69
            return r1
        L69:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory.f(boolean, com.nytimes.android.subauth.core.api.client.NYTUser, q98, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(NYTUser nYTUser, q98 q98Var, by0 by0Var) {
        Object G;
        return (nYTUser.r() && (G = q98Var.G(by0Var)) == a.h()) ? G : ww8.a;
    }

    private final String h() {
        return "testsubauth" + String.valueOf(Random.a.e()) + "@grp.nytimes.com";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0065 A[PHI: r8
      0x0065: PHI (r8v3 java.lang.Object) = (r8v2 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0062, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.nytimes.android.subauth.core.api.client.NYTUser r6, defpackage.q98 r7, defpackage.by0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$registerTestUser$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$registerTestUser$1 r0 = (com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$registerTestUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$registerTestUser$1 r0 = new com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$registerTestUser$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L65
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$1
            r7 = r5
            q98 r7 = (defpackage.q98) r7
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory r5 = (com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory) r5
            kotlin.f.b(r8)
            goto L51
        L41:
            kotlin.f.b(r8)
            r0.L$0 = r5
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r6 = r5.g(r6, r7, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            java.lang.String r5 = r5.h()
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.String r6 = "test123"
            java.lang.Object r8 = r7.o(r5, r6, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory.i(com.nytimes.android.subauth.core.api.client.NYTUser, q98, by0):java.lang.Object");
    }

    public final Set j(final Context context, final NYTUser nYTUser, final q98 q98Var) {
        DevSettingSwitchItem a2;
        DevSettingSwitchItem a3;
        zq3.h(context, "context");
        zq3.h(nYTUser, "user");
        zq3.h(q98Var, "subauthUser");
        Context applicationContext = context.getApplicationContext();
        zq3.g(applicationContext, "getApplicationContext(...)");
        final ba1 a4 = DataStoreKt.a(applicationContext);
        final String string = context.getString(hm6.subauth_email_account_state);
        zq3.g(string, "getString(...)");
        String[] stringArray = context.getResources().getStringArray(cc6.subauth_email_account_state_entries);
        zq3.g(stringArray, "getStringArray(...)");
        List b = ao1.b(d.C0(stringArray), false);
        final String string2 = context.getString(hm6.subauth_request_verification_code_key);
        zq3.g(string2, "getString(...)");
        String[] stringArray2 = context.getResources().getStringArray(cc6.subauth_request_verification_code_entries);
        zq3.g(stringArray2, "getStringArray(...)");
        List b2 = ao1.b(d.C0(stringArray2), false);
        final String string3 = context.getString(hm6.subauth_verify_email_with_code_key);
        zq3.g(string3, "getString(...)");
        String[] stringArray3 = context.getResources().getStringArray(cc6.subauth_verify_email_with_code_entries);
        zq3.g(stringArray3, "getStringArray(...)");
        List b3 = ao1.b(d.C0(stringArray3), false);
        final String string4 = context.getString(hm6.subauth_set_password_with_token_key);
        zq3.g(string4, "getString(...)");
        String[] stringArray4 = context.getResources().getStringArray(cc6.subauth_set_password_with_token_entries);
        zq3.g(stringArray4, "getStringArray(...)");
        List b4 = ao1.b(d.C0(stringArray4), false);
        final String string5 = context.getString(hm6.subauth_user_state);
        zq3.g(string5, "getString(...)");
        String[] stringArray5 = context.getResources().getStringArray(cc6.subauth_user_state_entries);
        zq3.g(stringArray5, "getStringArray(...)");
        List b5 = ao1.b(d.C0(stringArray5), false);
        String string6 = context.getString(hm6.subauth_force_zero_regi_id);
        zq3.g(string6, "getString(...)");
        final String string7 = context.getString(hm6.subauth_override_targeting_data);
        zq3.g(string7, "getString(...)");
        final String string8 = context.getString(hm6.subauth_override_targeting_data_content);
        zq3.g(string8, "getString(...)");
        final String string9 = context.getString(hm6.subauth_override_sso_action_key);
        zq3.g(string9, "getString(...)");
        String[] stringArray6 = context.getResources().getStringArray(cc6.subauth_override_sso_action_entries);
        zq3.g(stringArray6, "getStringArray(...)");
        List b6 = ao1.b(d.C0(stringArray6), true);
        DevSettingPreferenceGroupExpandable j = new DevSettingChoiceListPreferenceItem("Override Email Account State. Changing the set email account state will change the result of accountState(email).", string, b, null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$1

            @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$1$1", f = "SubauthUserDevSettingFactory.kt", l = {107}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ Context $context;
                final /* synthetic */ ba1 $datastore;
                final /* synthetic */ String $emailAccountStateKey;
                final /* synthetic */ zn1 $item;
                final /* synthetic */ q98 $subauthUser;
                int label;

                @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$1$1$2", f = "SubauthUserDevSettingFactory.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$1$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements gt2 {
                    final /* synthetic */ String $emailAccountStateKey;
                    final /* synthetic */ zn1 $item;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(String str, zn1 zn1Var, by0 by0Var) {
                        super(2, by0Var);
                        this.$emailAccountStateKey = str;
                        this.$item = zn1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$emailAccountStateKey, this.$item, by0Var);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
                        return ((AnonymousClass2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        a.h();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                        ((MutablePreferences) this.L$0).j(u16.f(this.$emailAccountStateKey), this.$item.getPrefValue());
                        return ww8.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(q98 q98Var, zn1 zn1Var, ba1 ba1Var, Context context, String str, by0 by0Var) {
                    super(2, by0Var);
                    this.$subauthUser = q98Var;
                    this.$item = zn1Var;
                    this.$datastore = ba1Var;
                    this.$context = context;
                    this.$emailAccountStateKey = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$subauthUser, this.$item, this.$datastore, this.$context, this.$emailAccountStateKey, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        q98 q98Var = this.$subauthUser;
                        String prefValue = this.$item.getPrefValue();
                        final Context context = this.$context;
                        q98Var.C(ll5.a(prefValue, new ss2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory.userDevSettings.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final String b(int i2) {
                                return context.getString(i2);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                return b(((Number) obj2).intValue());
                            }
                        }));
                        ba1 ba1Var = this.$datastore;
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$emailAccountStateKey, this.$item, null);
                        this.label = 1;
                        if (PreferencesKt.a(ba1Var, anonymousClass2, this) == h) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                zq3.h(context2, "<anonymous parameter 0>");
                zq3.h(zn1Var, "item");
                BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(q98.this, zn1Var, a4, context, string, null), 1, null);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, new yn1.b("Subauth-User"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false, false, 392, null).j(context);
        DevSettingPreferenceGroupExpandable j2 = new DevSettingChoiceListPreferenceItem("Override RegiLite Request Verification Code Response. Changing the request verification code response will change the result of email-code(email)", string2, b2, null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$2

            @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$2$1", f = "SubauthUserDevSettingFactory.kt", l = {128}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ Context $context;
                final /* synthetic */ ba1 $datastore;
                final /* synthetic */ zn1 $item;
                final /* synthetic */ String $requestVerificationCodeKey;
                final /* synthetic */ q98 $subauthUser;
                int label;

                @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$2$1$2", f = "SubauthUserDevSettingFactory.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$2$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements gt2 {
                    final /* synthetic */ zn1 $item;
                    final /* synthetic */ String $requestVerificationCodeKey;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(String str, zn1 zn1Var, by0 by0Var) {
                        super(2, by0Var);
                        this.$requestVerificationCodeKey = str;
                        this.$item = zn1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$requestVerificationCodeKey, this.$item, by0Var);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
                        return ((AnonymousClass2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        a.h();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                        ((MutablePreferences) this.L$0).j(u16.f(this.$requestVerificationCodeKey), this.$item.getPrefValue());
                        return ww8.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(q98 q98Var, zn1 zn1Var, ba1 ba1Var, Context context, String str, by0 by0Var) {
                    super(2, by0Var);
                    this.$subauthUser = q98Var;
                    this.$item = zn1Var;
                    this.$datastore = ba1Var;
                    this.$context = context;
                    this.$requestVerificationCodeKey = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$subauthUser, this.$item, this.$datastore, this.$context, this.$requestVerificationCodeKey, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        q98 q98Var = this.$subauthUser;
                        String prefValue = this.$item.getPrefValue();
                        final Context context = this.$context;
                        q98Var.v(ul5.a(prefValue, new ss2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory.userDevSettings.2.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final String b(int i2) {
                                return context.getString(i2);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                return b(((Number) obj2).intValue());
                            }
                        }));
                        ba1 ba1Var = this.$datastore;
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$requestVerificationCodeKey, this.$item, null);
                        this.label = 1;
                        if (PreferencesKt.a(ba1Var, anonymousClass2, this) == h) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                zq3.h(context2, "<anonymous parameter 0>");
                zq3.h(zn1Var, "item");
                BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(q98.this, zn1Var, a4, context, string2, null), 1, null);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, new yn1.b("Subauth-User"), "2", false, false, 392, null).j(context);
        DevSettingPreferenceGroupExpandable j3 = new DevSettingChoiceListPreferenceItem("Override RegiLite Verify Email With Code Code Response. Changing the verify email with code response will change the result of redeem-code(email, code)", string3, b3, null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$3

            @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$3$1", f = "SubauthUserDevSettingFactory.kt", l = {150}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ Context $context;
                final /* synthetic */ ba1 $datastore;
                final /* synthetic */ zn1 $item;
                final /* synthetic */ q98 $subauthUser;
                final /* synthetic */ String $verifyEmailWithCodeKey;
                int label;

                @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$3$1$2", f = "SubauthUserDevSettingFactory.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$3$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements gt2 {
                    final /* synthetic */ zn1 $item;
                    final /* synthetic */ String $verifyEmailWithCodeKey;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(String str, zn1 zn1Var, by0 by0Var) {
                        super(2, by0Var);
                        this.$verifyEmailWithCodeKey = str;
                        this.$item = zn1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$verifyEmailWithCodeKey, this.$item, by0Var);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
                        return ((AnonymousClass2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        a.h();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                        ((MutablePreferences) this.L$0).j(u16.f(this.$verifyEmailWithCodeKey), this.$item.getPrefValue());
                        return ww8.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(q98 q98Var, zn1 zn1Var, ba1 ba1Var, Context context, String str, by0 by0Var) {
                    super(2, by0Var);
                    this.$subauthUser = q98Var;
                    this.$item = zn1Var;
                    this.$datastore = ba1Var;
                    this.$context = context;
                    this.$verifyEmailWithCodeKey = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$subauthUser, this.$item, this.$datastore, this.$context, this.$verifyEmailWithCodeKey, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        q98 q98Var = this.$subauthUser;
                        String prefValue = this.$item.getPrefValue();
                        final Context context = this.$context;
                        q98Var.B(am5.a(prefValue, new ss2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory.userDevSettings.3.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final String b(int i2) {
                                return context.getString(i2);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                return b(((Number) obj2).intValue());
                            }
                        }));
                        ba1 ba1Var = this.$datastore;
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$verifyEmailWithCodeKey, this.$item, null);
                        this.label = 1;
                        if (PreferencesKt.a(ba1Var, anonymousClass2, this) == h) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                zq3.h(context2, "<anonymous parameter 0>");
                zq3.h(zn1Var, "item");
                BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(q98.this, zn1Var, a4, context, string3, null), 1, null);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, new yn1.b("Subauth-User"), "3", false, false, 392, null).j(context);
        DevSettingPreferenceGroupExpandable j4 = new DevSettingChoiceListPreferenceItem("Override RegiLite Set Password With Token Response. Changing the set password with token response will change the result of set-password(token, password)", string4, b4, null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$4

            @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$4$1", f = "SubauthUserDevSettingFactory.kt", l = {171}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ Context $context;
                final /* synthetic */ ba1 $datastore;
                final /* synthetic */ zn1 $item;
                final /* synthetic */ String $setPasswordWithTokenKey;
                final /* synthetic */ q98 $subauthUser;
                int label;

                @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$4$1$2", f = "SubauthUserDevSettingFactory.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$4$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements gt2 {
                    final /* synthetic */ zn1 $item;
                    final /* synthetic */ String $setPasswordWithTokenKey;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(String str, zn1 zn1Var, by0 by0Var) {
                        super(2, by0Var);
                        this.$setPasswordWithTokenKey = str;
                        this.$item = zn1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$setPasswordWithTokenKey, this.$item, by0Var);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
                        return ((AnonymousClass2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        a.h();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                        ((MutablePreferences) this.L$0).j(u16.f(this.$setPasswordWithTokenKey), this.$item.getPrefValue());
                        return ww8.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(q98 q98Var, zn1 zn1Var, ba1 ba1Var, Context context, String str, by0 by0Var) {
                    super(2, by0Var);
                    this.$subauthUser = q98Var;
                    this.$item = zn1Var;
                    this.$datastore = ba1Var;
                    this.$context = context;
                    this.$setPasswordWithTokenKey = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$subauthUser, this.$item, this.$datastore, this.$context, this.$setPasswordWithTokenKey, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        q98 q98Var = this.$subauthUser;
                        String prefValue = this.$item.getPrefValue();
                        final Context context = this.$context;
                        q98Var.F(yl5.a(prefValue, new ss2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory.userDevSettings.4.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final String b(int i2) {
                                return context.getString(i2);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                return b(((Number) obj2).intValue());
                            }
                        }));
                        ba1 ba1Var = this.$datastore;
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$setPasswordWithTokenKey, this.$item, null);
                        this.label = 1;
                        if (PreferencesKt.a(ba1Var, anonymousClass2, this) == h) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                zq3.h(context2, "<anonymous parameter 0>");
                zq3.h(zn1Var, "item");
                BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(q98.this, zn1Var, a4, context, string4, null), 1, null);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, new yn1.b("Subauth-User"), "4", false, false, 392, null).j(context);
        DevSettingPreferenceGroupExpandable j5 = new DevSettingChoiceListPreferenceItem("Update to set user state on phone.WARNING: ONLY WORKS ON LIRE STAGING ENV + F5 VPN", string5, b5, null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$5

            @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$5$1", f = "SubauthUserDevSettingFactory.kt", l = {186}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ Context $context;
                final /* synthetic */ ba1 $datastore;
                final /* synthetic */ zn1 $item;
                final /* synthetic */ q98 $subauthUser;
                final /* synthetic */ NYTUser $user;
                final /* synthetic */ String $userStateKey;
                int label;

                @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$5$1$1", f = "SubauthUserDevSettingFactory.kt", l = {187}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C04351 extends SuspendLambda implements gt2 {
                    final /* synthetic */ Context $context;
                    final /* synthetic */ zn1 $item;
                    final /* synthetic */ q98 $subauthUser;
                    final /* synthetic */ NYTUser $user;
                    final /* synthetic */ String $userStateKey;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C04351(Context context, zn1 zn1Var, NYTUser nYTUser, q98 q98Var, String str, by0 by0Var) {
                        super(2, by0Var);
                        this.$context = context;
                        this.$item = zn1Var;
                        this.$user = nYTUser;
                        this.$subauthUser = q98Var;
                        this.$userStateKey = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        C04351 c04351 = new C04351(this.$context, this.$item, this.$user, this.$subauthUser, this.$userStateKey, by0Var);
                        c04351.L$0 = obj;
                        return c04351;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
                        return ((C04351) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object e;
                        MutablePreferences mutablePreferences;
                        Object h = a.h();
                        int i = this.label;
                        if (i == 0) {
                            f.b(obj);
                            MutablePreferences mutablePreferences2 = (MutablePreferences) this.L$0;
                            SubauthUserDevSettingFactory subauthUserDevSettingFactory = SubauthUserDevSettingFactory.a;
                            Context context = this.$context;
                            String prefValue = this.$item.getPrefValue();
                            NYTUser nYTUser = this.$user;
                            q98 q98Var = this.$subauthUser;
                            this.L$0 = mutablePreferences2;
                            this.label = 1;
                            e = subauthUserDevSettingFactory.e(context, prefValue, nYTUser, q98Var, this);
                            if (e == h) {
                                return h;
                            }
                            mutablePreferences = mutablePreferences2;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutablePreferences = (MutablePreferences) this.L$0;
                            f.b(obj);
                        }
                        mutablePreferences.j(u16.f(this.$userStateKey), this.$item.getPrefValue());
                        return ww8.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ba1 ba1Var, Context context, zn1 zn1Var, NYTUser nYTUser, q98 q98Var, String str, by0 by0Var) {
                    super(2, by0Var);
                    this.$datastore = ba1Var;
                    this.$context = context;
                    this.$item = zn1Var;
                    this.$user = nYTUser;
                    this.$subauthUser = q98Var;
                    this.$userStateKey = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$datastore, this.$context, this.$item, this.$user, this.$subauthUser, this.$userStateKey, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        ba1 ba1Var = this.$datastore;
                        C04351 c04351 = new C04351(this.$context, this.$item, this.$user, this.$subauthUser, this.$userStateKey, null);
                        this.label = 1;
                        if (PreferencesKt.a(ba1Var, c04351, this) == h) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                zq3.h(context2, "<anonymous parameter 0>");
                zq3.h(zn1Var, "item");
                BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(ba1.this, context, zn1Var, nYTUser, q98Var, string5, null), 1, null);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, new yn1.b("Subauth-User"), "5", false, false, 392, null).j(context);
        DevSettingLazySummaryItem b7 = DevSettingSimpleClipboardItemKt.b("NYT-S Cookie (Click to copy)", new SubauthUserDevSettingFactory$userDevSettings$6(q98Var, null), null, new yn1.b("Subauth-User"), "6", 4, null);
        DevSettingLazySummaryItem devSettingLazySummaryItem = new DevSettingLazySummaryItem("is NYT-S Cookie Valid (exists + not stale). Click to refresh.", new SubauthUserDevSettingFactory$userDevSettings$7(q98Var, null), null, null, null, null, new yn1.b("Subauth-User"), "7", false, true, 316, null);
        DevSettingTextFieldConfirmationButtonItem devSettingTextFieldConfirmationButtonItem = new DevSettingTextFieldConfirmationButtonItem("Set NYT-S Cookie", new ss2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$8
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(Context context2) {
                zq3.h(context2, "it");
                return "";
            }
        }, new SubauthUserDevSettingFactory$userDevSettings$9(q98Var, null), null, null, null, null, null, false, false, new yn1.b("Subauth-User"), "8", false, 1016, null);
        String str = "Expire NYT-S Cookie";
        String str2 = null;
        DevSettingSimpleItem devSettingSimpleItem = new DevSettingSimpleItem(str, str2, new SubauthUserDevSettingFactory$userDevSettings$10(q98Var, null), null, null, new yn1.b("Subauth-User"), "9", false, 154, null);
        DevSettingLazySummaryItem b8 = DevSettingSimpleClipboardItemKt.b("Regi ID (Click to copy)", new SubauthUserDevSettingFactory$userDevSettings$11(nYTUser, null), null, new yn1.b("Subauth-User"), "10", 4, null);
        a2 = DevSettingSwitchItemKt.a("Force Regi ID to get 0 on login/register", (r23 & 2) != 0 ? null : DebugKt.DEBUG_PROPERTY_VALUE_ON, (r23 & 4) != 0 ? null : DebugKt.DEBUG_PROPERTY_VALUE_OFF, string6, (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : new yn1.b("Subauth-User"), (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Force Regi ID to get 0 on login/register" : "11", (r23 & 512) != 0 ? null : new SubauthUserDevSettingFactory$userDevSettings$12(a4, string6, null));
        a3 = DevSettingSwitchItemKt.a("Override targeting API data", (r23 & 2) != 0 ? null : DebugKt.DEBUG_PROPERTY_VALUE_ON, (r23 & 4) != 0 ? null : DebugKt.DEBUG_PROPERTY_VALUE_OFF, string7, (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : true, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : new yn1.b("Subauth-User"), (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Override targeting API data" : "12", (r23 & 512) != 0 ? null : new SubauthUserDevSettingFactory$userDevSettings$13(a4, string7, null));
        return b0.j(j, j2, j3, j4, j5, b7, devSettingLazySummaryItem, devSettingTextFieldConfirmationButtonItem, devSettingSimpleItem, b8, a2, a3, new DevSettingTextFieldConfirmationButtonItem("Targeting Data", new ss2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$14

            @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$14$1", f = "SubauthUserDevSettingFactory.kt", l = {ContentFeedType.EAST_SD}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$14$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ ba1 $datastore;
                final /* synthetic */ String $overrideTargetingDataContentKey;
                final /* synthetic */ String $overrideTargetingDataKey;
                final /* synthetic */ q98 $subauthUser;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ba1 ba1Var, String str, q98 q98Var, String str2, by0 by0Var) {
                    super(2, by0Var);
                    this.$datastore = ba1Var;
                    this.$overrideTargetingDataKey = str;
                    this.$subauthUser = q98Var;
                    this.$overrideTargetingDataContentKey = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$datastore, this.$overrideTargetingDataKey, this.$subauthUser, this.$overrideTargetingDataContentKey, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        final Flow data = this.$datastore.getData();
                        final String str = this.$overrideTargetingDataKey;
                        final q98 q98Var = this.$subauthUser;
                        final String str2 = this.$overrideTargetingDataContentKey;
                        Flow flow = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0028: CONSTRUCTOR (r5v0 'flow' kotlinx.coroutines.flow.Flow) = 
                              (r7v2 'data' kotlinx.coroutines.flow.Flow A[DONT_INLINE])
                              (r1v1 'str' java.lang.String A[DONT_INLINE])
                              (r3v0 'q98Var' q98 A[DONT_INLINE])
                              (r4v0 'str2' java.lang.String A[DONT_INLINE])
                             A[DECLARE_VAR, MD:(kotlinx.coroutines.flow.Flow, java.lang.String, q98, java.lang.String):void (m)] call: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$14$1$invokeSuspend$$inlined$map$1.<init>(kotlinx.coroutines.flow.Flow, java.lang.String, q98, java.lang.String):void type: CONSTRUCTOR in method: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$14.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes4.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:782)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.processVarArg(InsnGen.java:1166)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1140)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$14$1$invokeSuspend$$inlined$map$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 103 more
                            */
                        /*
                            this = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
                            int r1 = r6.label
                            r2 = 1
                            if (r1 == 0) goto L17
                            if (r1 != r2) goto Lf
                            kotlin.f.b(r7)
                            goto L34
                        Lf:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L17:
                            kotlin.f.b(r7)
                            ba1 r7 = r6.$datastore
                            kotlinx.coroutines.flow.Flow r7 = r7.getData()
                            java.lang.String r1 = r6.$overrideTargetingDataKey
                            q98 r3 = r6.$subauthUser
                            java.lang.String r4 = r6.$overrideTargetingDataContentKey
                            com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$14$1$invokeSuspend$$inlined$map$1 r5 = new com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$14$1$invokeSuspend$$inlined$map$1
                            r5.<init>(r7, r1, r3, r4)
                            r6.label = r2
                            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r5, r6)
                            if (r7 != r0) goto L34
                            return r0
                        L34:
                            java.lang.String r7 = (java.lang.String) r7
                            if (r7 != 0) goto L3a
                            java.lang.String r7 = "NONE"
                        L3a:
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$14.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                        return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke(Context context2) {
                    Object runBlocking$default;
                    zq3.h(context2, "it");
                    runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(ba1.this, string7, q98Var, string8, null), 1, null);
                    return (String) runBlocking$default;
                }
            }, new SubauthUserDevSettingFactory$userDevSettings$15(a4, string7, string8, null), null, null, null, null, null, false, false, new yn1.b("Subauth-User"), "13", true, 1016, null), new DevSettingChoiceListPreferenceItem("Override SSO Action", string9, b6, null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$16

                @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$16$1", f = "SubauthUserDevSettingFactory.kt", l = {331}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$16$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                    final /* synthetic */ ba1 $datastore;
                    final /* synthetic */ zn1 $item;
                    final /* synthetic */ String $overrideSSOActionKey;
                    int label;

                    @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$16$1$1", f = "SubauthUserDevSettingFactory.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$16$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C04311 extends SuspendLambda implements gt2 {
                        final /* synthetic */ zn1 $item;
                        final /* synthetic */ String $overrideSSOActionKey;
                        /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C04311(String str, zn1 zn1Var, by0 by0Var) {
                            super(2, by0Var);
                            this.$overrideSSOActionKey = str;
                            this.$item = zn1Var;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final by0 create(Object obj, by0 by0Var) {
                            C04311 c04311 = new C04311(this.$overrideSSOActionKey, this.$item, by0Var);
                            c04311.L$0 = obj;
                            return c04311;
                        }

                        @Override // defpackage.gt2
                        public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
                            return ((C04311) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            a.h();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            f.b(obj);
                            ((MutablePreferences) this.L$0).j(u16.f(this.$overrideSSOActionKey), this.$item.getPrefValue());
                            return ww8.a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(ba1 ba1Var, String str, zn1 zn1Var, by0 by0Var) {
                        super(2, by0Var);
                        this.$datastore = ba1Var;
                        this.$overrideSSOActionKey = str;
                        this.$item = zn1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        return new AnonymousClass1(this.$datastore, this.$overrideSSOActionKey, this.$item, by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object h = a.h();
                        int i = this.label;
                        if (i == 0) {
                            f.b(obj);
                            ba1 ba1Var = this.$datastore;
                            C04311 c04311 = new C04311(this.$overrideSSOActionKey, this.$item, null);
                            this.label = 1;
                            if (PreferencesKt.a(ba1Var, c04311, this) == h) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(Context context2, zn1 zn1Var) {
                    zq3.h(context2, "<anonymous parameter 0>");
                    zq3.h(zn1Var, "item");
                    BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(ba1.this, string9, zn1Var, null), 1, null);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    b((Context) obj, (zn1) obj2);
                    return ww8.a;
                }
            }, new yn1.b("Subauth-User"), "14", false, false, 392, null).j(context));
        }
    }
