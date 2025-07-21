package com.nytimes.android.subauth.devsettings.items;

import android.content.Context;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
import defpackage.b98;
import defpackage.ba1;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hm6;
import defpackage.it2;
import defpackage.u16;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$7", f = "SubauthPurchaseDevSettingFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthPurchaseDevSettingFactory$purchaseDevSettings$7 extends SuspendLambda implements it2 {
    final /* synthetic */ Context $context;
    final /* synthetic */ ba1 $datastore;
    final /* synthetic */ b98 $subauthPurchase;
    /* synthetic */ boolean Z$0;
    int label;

    @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$7$1", f = "SubauthPurchaseDevSettingFactory.kt", l = {242}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$7$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ Context $context;
        final /* synthetic */ ba1 $datastore;
        final /* synthetic */ boolean $isChecked;
        int label;

        @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$7$1$1", f = "SubauthPurchaseDevSettingFactory.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$7$1$1, reason: invalid class name and collision with other inner class name */
        static final class C04281 extends SuspendLambda implements gt2 {
            final /* synthetic */ Context $context;
            final /* synthetic */ boolean $isChecked;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04281(Context context, boolean z, by0 by0Var) {
                super(2, by0Var);
                this.$context = context;
                this.$isChecked = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                C04281 c04281 = new C04281(this.$context, this.$isChecked, by0Var);
                c04281.L$0 = obj;
                return c04281;
            }

            @Override // defpackage.gt2
            public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
                return ((C04281) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                a.h();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                String string = this.$context.getString(hm6.subauth_disable_products_api_pref);
                zq3.g(string, "getString(...)");
                mutablePreferences.j(u16.f(string), String.valueOf(this.$isChecked));
                return ww8.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ba1 ba1Var, Context context, boolean z, by0 by0Var) {
            super(2, by0Var);
            this.$datastore = ba1Var;
            this.$context = context;
            this.$isChecked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$datastore, this.$context, this.$isChecked, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                ba1 ba1Var = this.$datastore;
                C04281 c04281 = new C04281(this.$context, this.$isChecked, null);
                this.label = 1;
                obj = PreferencesKt.a(ba1Var, c04281, this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthPurchaseDevSettingFactory$purchaseDevSettings$7(b98 b98Var, ba1 ba1Var, Context context, by0 by0Var) {
        super(3, by0Var);
        this.$subauthPurchase = b98Var;
        this.$datastore = ba1Var;
        this.$context = context;
    }

    public final Object b(Context context, boolean z, by0 by0Var) {
        SubauthPurchaseDevSettingFactory$purchaseDevSettings$7 subauthPurchaseDevSettingFactory$purchaseDevSettings$7 = new SubauthPurchaseDevSettingFactory$purchaseDevSettings$7(this.$subauthPurchase, this.$datastore, this.$context, by0Var);
        subauthPurchaseDevSettingFactory$purchaseDevSettings$7.Z$0 = z;
        return subauthPurchaseDevSettingFactory$purchaseDevSettings$7.invokeSuspend(ww8.a);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b((Context) obj, ((Boolean) obj2).booleanValue(), (by0) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        boolean z = this.Z$0;
        this.$subauthPurchase.h(!z);
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(this.$datastore, this.$context, z, null), 1, null);
        return cc0.a(z);
    }
}
