package com.nytimes.android.subauth.devsettings.items;

import android.content.Context;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.group.DevSettingPreferenceGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.devsettings.common.DevSettingLazySummaryItem;
import com.nytimes.android.devsettings.common.DevSettingSimpleClipboardItemKt;
import com.nytimes.android.devsettings.common.DevSettingSimpleItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;
import com.nytimes.android.subauth.core.di.DataStoreKt;
import defpackage.ao1;
import defpackage.b98;
import defpackage.ba1;
import defpackage.by0;
import defpackage.dm5;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hm6;
import defpackage.ol5;
import defpackage.pl5;
import defpackage.rl5;
import defpackage.u16;
import defpackage.ww8;
import defpackage.yn1;
import defpackage.zn1;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class SubauthPurchaseDevSettingFactory {
    public static final SubauthPurchaseDevSettingFactory a = new SubauthPurchaseDevSettingFactory();

    private SubauthPurchaseDevSettingFactory() {
    }

    public final Set a(Context context, final b98 b98Var, final CoroutineScope coroutineScope) {
        DevSettingSwitchItem a2;
        DevSettingSwitchItem a3;
        zq3.h(context, "context");
        zq3.h(b98Var, "subauthPurchase");
        zq3.h(coroutineScope, "applicationScope");
        final ba1 a4 = DataStoreKt.a(context);
        final String string = context.getString(hm6.subauth_override_verify_purchase_result_pref);
        zq3.g(string, "getString(...)");
        ArrayList<String> h = i.h("No Override");
        h.add(dm5.c.b.a());
        h.add(dm5.a.b.a());
        h.add(dm5.b.b.a());
        ArrayList arrayList = new ArrayList(i.w(h, 10));
        for (String str : h) {
            arrayList.add(new zn1(str, str, null, false, 4, null));
        }
        final String string2 = context.getString(hm6.subauth_override_link_purchase_result_pref);
        zq3.g(string2, "getString(...)");
        List b = ao1.b(i.o("No Override", ol5.g.b.a(), ol5.c.b.a(), ol5.a.b.a(), ol5.b.b.a(), ol5.e.b.a(), ol5.d.b.a(), ol5.f.b.a(), ol5.h.b.a()), false);
        List o = i.o(pl5.b.c, pl5.a.c, pl5.c.c, pl5.d.c);
        ArrayList arrayList2 = new ArrayList(i.w(o, 10));
        Iterator it2 = o.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((pl5) it2.next()).b());
        }
        List b2 = ao1.b(arrayList2, false);
        final String string3 = context.getString(hm6.subauth_override_product_details_pref);
        zq3.g(string3, "getString(...)");
        List c = ao1.c(i.o(rl5.a.c.a(), rl5.b.c.a()), false, 1, null);
        yn1.b bVar = new yn1.b("Subauth-Purchase");
        DevSettingLazySummaryItem b3 = DevSettingSimpleClipboardItemKt.b("Subscription ID (Click to copy)", new SubauthPurchaseDevSettingFactory$purchaseDevSettings$1(a4, null), null, bVar, "3", 4, null);
        DevSettingPreferenceGroupExpandable j = new DevSettingChoiceListPreferenceItem("Override the `verify purchase` response. Changing this will override the `verify purchase` response we're getting from backend.", string, arrayList, null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$2

            @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$2$1", f = "SubauthPurchaseDevSettingFactory.kt", l = {124}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ ba1 $datastore;
                final /* synthetic */ zn1 $item;
                final /* synthetic */ String $overrideVerifyPurchaseKey;
                int label;

                @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$2$1$1", f = "SubauthPurchaseDevSettingFactory.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C04241 extends SuspendLambda implements gt2 {
                    final /* synthetic */ zn1 $item;
                    final /* synthetic */ String $overrideVerifyPurchaseKey;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C04241(String str, zn1 zn1Var, by0 by0Var) {
                        super(2, by0Var);
                        this.$overrideVerifyPurchaseKey = str;
                        this.$item = zn1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        C04241 c04241 = new C04241(this.$overrideVerifyPurchaseKey, this.$item, by0Var);
                        c04241.L$0 = obj;
                        return c04241;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
                        return ((C04241) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        a.h();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                        ((MutablePreferences) this.L$0).j(u16.f(this.$overrideVerifyPurchaseKey), this.$item.getPrefValue());
                        return ww8.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ba1 ba1Var, String str, zn1 zn1Var, by0 by0Var) {
                    super(2, by0Var);
                    this.$datastore = ba1Var;
                    this.$overrideVerifyPurchaseKey = str;
                    this.$item = zn1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$datastore, this.$overrideVerifyPurchaseKey, this.$item, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        ba1 ba1Var = this.$datastore;
                        C04241 c04241 = new C04241(this.$overrideVerifyPurchaseKey, this.$item, null);
                        this.label = 1;
                        if (PreferencesKt.a(ba1Var, c04241, this) == h) {
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
                String prefValue = zn1Var.getPrefValue();
                dm5 dm5Var = dm5.c.b;
                if (!zq3.c(prefValue, dm5Var.a())) {
                    dm5Var = dm5.a.b;
                    if (!zq3.c(prefValue, dm5Var.a())) {
                        dm5Var = dm5.b.b;
                        if (!zq3.c(prefValue, dm5Var.a())) {
                            dm5Var = null;
                        }
                    }
                }
                b98.this.k(dm5Var);
                BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(a4, string, zn1Var, null), 1, null);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, bVar, "4", false, false, 392, null).j(context);
        DevSettingPreferenceGroupExpandable j2 = new DevSettingChoiceListPreferenceItem("Override the purchase linking response. Changing this will override the linking purchase response we're getting from backend.", string2, b, null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$3

            @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$3$1", f = "SubauthPurchaseDevSettingFactory.kt", l = {171}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ String $choice;
                final /* synthetic */ ba1 $datastore;
                final /* synthetic */ String $overrideLinkStatusKey;
                int label;

                @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$3$1$1", f = "SubauthPurchaseDevSettingFactory.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C04251 extends SuspendLambda implements gt2 {
                    final /* synthetic */ String $choice;
                    final /* synthetic */ String $overrideLinkStatusKey;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C04251(String str, String str2, by0 by0Var) {
                        super(2, by0Var);
                        this.$overrideLinkStatusKey = str;
                        this.$choice = str2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        C04251 c04251 = new C04251(this.$overrideLinkStatusKey, this.$choice, by0Var);
                        c04251.L$0 = obj;
                        return c04251;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
                        return ((C04251) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        a.h();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                        ((MutablePreferences) this.L$0).j(u16.f(this.$overrideLinkStatusKey), this.$choice);
                        return ww8.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ba1 ba1Var, String str, String str2, by0 by0Var) {
                    super(2, by0Var);
                    this.$datastore = ba1Var;
                    this.$overrideLinkStatusKey = str;
                    this.$choice = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$datastore, this.$overrideLinkStatusKey, this.$choice, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        ba1 ba1Var = this.$datastore;
                        C04251 c04251 = new C04251(this.$overrideLinkStatusKey, this.$choice, null);
                        this.label = 1;
                        if (PreferencesKt.a(ba1Var, c04251, this) == h) {
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
                String prefValue = zn1Var.getPrefValue();
                ol5 ol5Var = ol5.g.b;
                if (!zq3.c(prefValue, ol5Var.a())) {
                    ol5Var = ol5.c.b;
                    if (!zq3.c(prefValue, ol5Var.a())) {
                        ol5Var = ol5.a.b;
                        if (!zq3.c(prefValue, ol5Var.a())) {
                            ol5Var = ol5.b.b;
                            if (!zq3.c(prefValue, ol5Var.a())) {
                                ol5Var = ol5.e.b;
                                if (!zq3.c(prefValue, ol5Var.a())) {
                                    ol5Var = ol5.d.b;
                                    if (!zq3.c(prefValue, ol5Var.a())) {
                                        ol5Var = ol5.f.b;
                                        if (!zq3.c(prefValue, ol5Var.a())) {
                                            ol5Var = ol5.h.b;
                                            if (!zq3.c(prefValue, ol5Var.a())) {
                                                ol5Var = null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                b98.this.m(ol5Var);
                BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(a4, string2, prefValue, null), 1, null);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, bVar, "5", false, false, 392, null).j(context);
        String string4 = context.getString(hm6.subauth_enable_intro_pricing_pref);
        zq3.e(string4);
        a2 = DevSettingSwitchItemKt.a("Enable/Disable intro pricing.", (r23 & 2) != 0 ? null : "Enabled, uses mock intro pricing override", (r23 & 4) != 0 ? null : "Disabled, no intro pricing override", string4, (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : bVar, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Enable/Disable intro pricing." : "6", (r23 & 512) != 0 ? null : new SubauthPurchaseDevSettingFactory$purchaseDevSettings$4(b98Var, a4, string2, null));
        DevSettingSimpleItem devSettingSimpleItem = new DevSettingSimpleItem("Force Purchase Poll", "Force a purchase poll (refreshes google play purchase entitlements)", new SubauthPurchaseDevSettingFactory$purchaseDevSettings$5(b98Var, null), null, null, bVar, "7", false, 152, null);
        DevSettingPreferenceGroupExpandable j3 = new DevSettingChoiceListPreferenceItem("Override Store Purchase Poll Interval.", "com.nytimes.android.subauth.pruchase_override_store_purchase_poll_interval", b2, null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$6

            @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$6$1", f = "SubauthPurchaseDevSettingFactory.kt", l = {218}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ ba1 $datastore;
                final /* synthetic */ zn1 $item;
                int label;

                @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$6$1$1", f = "SubauthPurchaseDevSettingFactory.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C04271 extends SuspendLambda implements gt2 {
                    final /* synthetic */ zn1 $item;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C04271(zn1 zn1Var, by0 by0Var) {
                        super(2, by0Var);
                        this.$item = zn1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        C04271 c04271 = new C04271(this.$item, by0Var);
                        c04271.L$0 = obj;
                        return c04271;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
                        return ((C04271) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        a.h();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                        ((MutablePreferences) this.L$0).j(u16.f("com.nytimes.android.subauth.pruchase_override_store_purchase_poll_interval"), this.$item.getPrefValue());
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
                        C04271 c04271 = new C04271(this.$item, null);
                        this.label = 1;
                        obj = PreferencesKt.a(ba1Var, c04271, this);
                        if (obj == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                    }
                    return obj;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$6$2", f = "SubauthPurchaseDevSettingFactory.kt", l = {224}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$6$2, reason: invalid class name */
            static final class AnonymousClass2 extends SuspendLambda implements gt2 {
                final /* synthetic */ b98 $subauthPurchase;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(b98 b98Var, by0 by0Var) {
                    super(2, by0Var);
                    this.$subauthPurchase = b98Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass2(this.$subauthPurchase, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        b98 b98Var = this.$subauthPurchase;
                        this.label = 1;
                        if (b98Var.d(this) == h) {
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
                    return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                zq3.h(context2, "<anonymous parameter 0>");
                zq3.h(zn1Var, "item");
                BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(a4, zn1Var, null), 1, null);
                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass2(b98Var, null), 3, null);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, bVar, "8", false, false, 392, null).j(context);
        String string5 = context.getString(hm6.subauth_disable_products_api_pref);
        zq3.e(string5);
        a3 = DevSettingSwitchItemKt.a("Enable/Disable Product Details API", (r23 & 2) != 0 ? null : "Product Detail API is disabled. Using to SKU Detail Api ", (r23 & 4) != 0 ? null : "Product Detail API is enabled", string5, (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : bVar, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Enable/Disable Product Details API" : "9", (r23 & 512) != 0 ? null : new SubauthPurchaseDevSettingFactory$purchaseDevSettings$7(b98Var, a4, context, null));
        return b0.j(b3, j, j2, a2, devSettingSimpleItem, j3, a3, new DevSettingChoiceListPreferenceItem("Override the query product details response", string3, c, null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$8

            @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$8$1", f = "SubauthPurchaseDevSettingFactory.kt", l = {270}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ ba1 $datastore;
                final /* synthetic */ zn1 $item;
                final /* synthetic */ String $overrideProductDetailsStatusKey;
                int label;

                @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$8$1$1", f = "SubauthPurchaseDevSettingFactory.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$8$1$1, reason: invalid class name and collision with other inner class name */
                static final class C04291 extends SuspendLambda implements gt2 {
                    final /* synthetic */ zn1 $item;
                    final /* synthetic */ String $overrideProductDetailsStatusKey;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C04291(String str, zn1 zn1Var, by0 by0Var) {
                        super(2, by0Var);
                        this.$overrideProductDetailsStatusKey = str;
                        this.$item = zn1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        C04291 c04291 = new C04291(this.$overrideProductDetailsStatusKey, this.$item, by0Var);
                        c04291.L$0 = obj;
                        return c04291;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
                        return ((C04291) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        a.h();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                        ((MutablePreferences) this.L$0).j(u16.f(this.$overrideProductDetailsStatusKey), this.$item.getPrefValue());
                        return ww8.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ba1 ba1Var, String str, zn1 zn1Var, by0 by0Var) {
                    super(2, by0Var);
                    this.$datastore = ba1Var;
                    this.$overrideProductDetailsStatusKey = str;
                    this.$item = zn1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$datastore, this.$overrideProductDetailsStatusKey, this.$item, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        ba1 ba1Var = this.$datastore;
                        C04291 c04291 = new C04291(this.$overrideProductDetailsStatusKey, this.$item, null);
                        this.label = 1;
                        if (PreferencesKt.a(ba1Var, c04291, this) == h) {
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
                String prefValue = zn1Var.getPrefValue();
                rl5.b bVar2 = rl5.b.c;
                if (!zq3.c(prefValue, bVar2.a())) {
                    bVar2 = null;
                }
                b98.this.a(bVar2);
                BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(a4, string3, zn1Var, null), 1, null);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, bVar, "10", false, false, 392, null).j(context));
    }
}
