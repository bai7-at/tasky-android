package com.nytimes.android.subauth.devsettings.items;

import android.content.Context;
import androidx.compose.foundation.text.c;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.group.DevSettingPreferenceGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.devsettings.common.DevSettingSimpleItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;
import com.nytimes.android.devsettings.common.DevSettingTextFieldItem;
import com.nytimes.android.devsettings.common.DevSettingTextFieldItemKt;
import com.nytimes.android.internal.auth.graphql.GraphQlEnvironment;
import com.nytimes.android.subauth.core.di.DataStoreKt;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import defpackage.ao1;
import defpackage.ba1;
import defpackage.by0;
import defpackage.cc6;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hm6;
import defpackage.kl7;
import defpackage.ss2;
import defpackage.u16;
import defpackage.ww8;
import defpackage.xz8;
import defpackage.yn1;
import defpackage.zn1;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class SubauthCommonDevSettingFactory {
    public static final SubauthCommonDevSettingFactory a = new SubauthCommonDevSettingFactory();

    private SubauthCommonDevSettingFactory() {
    }

    public final Set a(Context context, kl7 kl7Var, xz8 xz8Var) {
        DevSettingSwitchItem a2;
        DevSettingTextFieldItem a3;
        DevSettingTextFieldItem a4;
        zq3.h(context, "context");
        zq3.h(kl7Var, "sessionRefreshProvider");
        zq3.h(xz8Var, "userDetailsProvider");
        final ba1 a5 = DataStoreKt.a(context);
        String string = context.getString(hm6.subauth_graphql_env_pref);
        zq3.g(string, "getString(...)");
        List C0 = d.C0(GraphQlEnvironment.values());
        ArrayList arrayList = new ArrayList(i.w(C0, 10));
        Iterator it2 = C0.iterator();
        while (it2.hasNext()) {
            arrayList.add(context.getString(((GraphQlEnvironment) it2.next()).getLabel()));
        }
        List b = ao1.b(arrayList, true);
        List<SubauthEnvironment.Companion.LireEnv> C02 = d.C0(SubauthEnvironment.Companion.LireEnv.values());
        ArrayList arrayList2 = new ArrayList(i.w(C02, 10));
        for (SubauthEnvironment.Companion.LireEnv lireEnv : C02) {
            arrayList2.add(new zn1(lireEnv.name(), lireEnv.getTitle(), null, true, 4, null));
        }
        String[] stringArray = context.getResources().getStringArray(cc6.subauth_override_session_refresh_v2_entries);
        zq3.g(stringArray, "getStringArray(...)");
        List b2 = ao1.b(d.C0(stringArray), false);
        String[] stringArray2 = context.getResources().getStringArray(cc6.subauth_override_user_details_entries);
        zq3.g(stringArray2, "getStringArray(...)");
        List b3 = ao1.b(d.C0(stringArray2), false);
        DevSettingPreferenceGroupExpandable j = new DevSettingChoiceListPreferenceItem("Set Subauth GraphQL Environment. Requires Restart. Used by Apollo.", string, b, null, null, new yn1.b("Subauth-Common"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false, true, 152, null).j(context);
        final String str = "SA_LIRE_ENV_KEY";
        DevSettingPreferenceGroupExpandable j2 = new DevSettingChoiceListPreferenceItem("Set Subauth LIRE/Ecomm REST API Environment. Requires Restart. LIRE is used for login/registration/sso. Ecomm is used for purchases.", "SA_LIRE_ENV_KEY", arrayList2, null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$1

            @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$1$1", f = "SubauthCommonDevSettingFactory.kt", l = {78}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ ba1 $datastore;
                final /* synthetic */ zn1 $item;
                final /* synthetic */ String $lireKey;
                int label;

                @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$1$1$1", f = "SubauthCommonDevSettingFactory.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C04211 extends SuspendLambda implements gt2 {
                    final /* synthetic */ zn1 $item;
                    final /* synthetic */ String $lireKey;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C04211(String str, zn1 zn1Var, by0 by0Var) {
                        super(2, by0Var);
                        this.$lireKey = str;
                        this.$item = zn1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        C04211 c04211 = new C04211(this.$lireKey, this.$item, by0Var);
                        c04211.L$0 = obj;
                        return c04211;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
                        return ((C04211) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        a.h();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                        ((MutablePreferences) this.L$0).j(u16.f(this.$lireKey), this.$item.getPrefValue());
                        return ww8.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ba1 ba1Var, String str, zn1 zn1Var, by0 by0Var) {
                    super(2, by0Var);
                    this.$datastore = ba1Var;
                    this.$lireKey = str;
                    this.$item = zn1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$datastore, this.$lireKey, this.$item, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        ba1 ba1Var = this.$datastore;
                        C04211 c04211 = new C04211(this.$lireKey, this.$item, null);
                        this.label = 1;
                        if (PreferencesKt.a(ba1Var, c04211, this) == h) {
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
                BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(ba1.this, str, zn1Var, null), 1, null);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, new yn1.b("Subauth-Common"), "2", false, true, 136, null).j(context);
        DevSettingPreferenceGroupExpandable j3 = new DevSettingChoiceListPreferenceItem("Override Session Refresh Call.", "com.nytimes.android.subauth.common_override_session_refresh_v2", b2, null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$2

            @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$2$1", f = "SubauthCommonDevSettingFactory.kt", l = {93}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ ba1 $datastore;
                final /* synthetic */ zn1 $item;
                int label;

                @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$2$1$1", f = "SubauthCommonDevSettingFactory.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C04221 extends SuspendLambda implements gt2 {
                    final /* synthetic */ zn1 $item;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C04221(zn1 zn1Var, by0 by0Var) {
                        super(2, by0Var);
                        this.$item = zn1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        C04221 c04221 = new C04221(this.$item, by0Var);
                        c04221.L$0 = obj;
                        return c04221;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
                        return ((C04221) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        a.h();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                        ((MutablePreferences) this.L$0).j(u16.f("com.nytimes.android.subauth.common_override_session_refresh_v2"), this.$item.getPrefValue());
                        return ww8.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ba1 ba1Var, zn1 zn1Var, by0 by0Var) {
                    super(2, by0Var);
                    this.$datastore = ba1Var;
                    this.$item = zn1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$datastore, this.$item, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        ba1 ba1Var = this.$datastore;
                        C04221 c04221 = new C04221(this.$item, null);
                        this.label = 1;
                        if (PreferencesKt.a(ba1Var, c04221, this) == h) {
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
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                zq3.h(context2, "<anonymous parameter 0>");
                zq3.h(zn1Var, "item");
                BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(ba1.this, zn1Var, null), 1, null);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, new yn1.b("Subauth-Common"), "3", false, false, 392, null).j(context);
        DevSettingPreferenceGroupExpandable j4 = new DevSettingChoiceListPreferenceItem("Override User Details Call.", "com.nytimes.android.subauth.common_override_user_details", b3, null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$3

            @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$3$1", f = "SubauthCommonDevSettingFactory.kt", l = {108}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ ba1 $datastore;
                final /* synthetic */ zn1 $item;
                int label;

                @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$3$1$1", f = "SubauthCommonDevSettingFactory.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory$commonDevSettings$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C04231 extends SuspendLambda implements gt2 {
                    final /* synthetic */ zn1 $item;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C04231(zn1 zn1Var, by0 by0Var) {
                        super(2, by0Var);
                        this.$item = zn1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        C04231 c04231 = new C04231(this.$item, by0Var);
                        c04231.L$0 = obj;
                        return c04231;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
                        return ((C04231) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        a.h();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                        ((MutablePreferences) this.L$0).j(u16.f("com.nytimes.android.subauth.common_override_user_details"), this.$item.getPrefValue());
                        return ww8.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ba1 ba1Var, zn1 zn1Var, by0 by0Var) {
                    super(2, by0Var);
                    this.$datastore = ba1Var;
                    this.$item = zn1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$datastore, this.$item, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        ba1 ba1Var = this.$datastore;
                        C04231 c04231 = new C04231(this.$item, null);
                        this.label = 1;
                        if (PreferencesKt.a(ba1Var, c04231, this) == h) {
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
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                zq3.h(context2, "<anonymous parameter 0>");
                zq3.h(zn1Var, "item");
                BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(ba1.this, zn1Var, null), 1, null);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, new yn1.b("Subauth-Common"), "4", false, false, 392, null).j(context);
        DevSettingSimpleItem devSettingSimpleItem = new DevSettingSimpleItem("Reset UserDetails poll time", "Next session refrsh will fetch UserDetails", new SubauthCommonDevSettingFactory$commonDevSettings$4(xz8Var, null), null, null, new yn1.b("Subauth-Common"), "5", false, 152, null);
        DevSettingSimpleItem devSettingSimpleItem2 = new DevSettingSimpleItem("Force UserDetails Query", "Force a user details query", new SubauthCommonDevSettingFactory$commonDevSettings$5(xz8Var, null), null, null, new yn1.b("Subauth-Common"), "6", false, 152, null);
        DevSettingSimpleItem devSettingSimpleItem3 = new DevSettingSimpleItem("Run Session Refresh", "Run a session refresh (refreshes user login, cookies)", new SubauthCommonDevSettingFactory$commonDevSettings$6(kl7Var, null), null, null, new yn1.b("Subauth-Common"), "7", false, 152, null);
        DevSettingSimpleItem devSettingSimpleItem4 = new DevSettingSimpleItem("Force Session Refresh", "Force a session refresh (refreshes user login, cookies, linked entitlements)", new SubauthCommonDevSettingFactory$commonDevSettings$7(kl7Var, null), null, null, new yn1.b("Subauth-Common"), "8", false, 152, null);
        String string2 = context.getString(hm6.subauth_override_istheathletic);
        zq3.g(string2, "getString(...)");
        String string3 = context.getString(hm6.subauth_override_istheathletic_pref);
        zq3.g(string3, "getString(...)");
        a2 = DevSettingSwitchItemKt.a(string2, (r23 & 2) != 0 ? null : null, (r23 & 4) != 0 ? null : null, string3, (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : true, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? string2 : null, (r23 & 512) != 0 ? null : null);
        String string4 = context.getString(hm6.subauth_override_theathletic_email);
        zq3.g(string4, "getString(...)");
        String string5 = context.getString(hm6.subauth_override_theathletic_email_pref);
        zq3.g(string5, "getString(...)");
        a3 = DevSettingTextFieldItemKt.a(string4, string5, (r16 & 4) != 0 ? "" : null, (r16 & 8) != 0 ? new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str2) {
                zq3.h(str2, "it");
                if (h.d0(str2)) {
                    return null;
                }
                return str2;
            }
        } : null, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? DevSettingUI.c.a : null, (r16 & 64) != 0 ? null : null, (r16 & 128) != 0 ? string4 : null, (r16 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? c.e.a() : null);
        String string6 = context.getString(hm6.subauth_override_theathletic_token);
        zq3.g(string6, "getString(...)");
        String string7 = context.getString(hm6.subauth_override_theathletic_token_pref);
        zq3.g(string7, "getString(...)");
        a4 = DevSettingTextFieldItemKt.a(string6, string7, (r16 & 4) != 0 ? "" : null, (r16 & 8) != 0 ? new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str2) {
                zq3.h(str2, "it");
                if (h.d0(str2)) {
                    return null;
                }
                return str2;
            }
        } : null, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? DevSettingUI.c.a : null, (r16 & 64) != 0 ? null : null, (r16 & 128) != 0 ? string6 : null, (r16 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? c.e.a() : null);
        return b0.j(j, j2, j3, j4, devSettingSimpleItem, devSettingSimpleItem2, devSettingSimpleItem3, devSettingSimpleItem4, a2, a3, a4);
    }
}
