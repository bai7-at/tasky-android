package com.nytimes.android.subauth.devsettings.items;

import android.content.Context;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
import com.comscore.streaming.AdvertisementType;
import defpackage.ba1;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.u16;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserUiDevSettingFactory$accountDeleteDebugUseCaseOverride$1", f = "SubauthUserUiDevSettingFactory.kt", l = {AdvertisementType.ON_DEMAND_POST_ROLL}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserUiDevSettingFactory$accountDeleteDebugUseCaseOverride$1 extends SuspendLambda implements it2 {
    final /* synthetic */ ba1 $datastore;
    final /* synthetic */ String $noPurchaseDevSettingKey;
    /* synthetic */ boolean Z$0;
    int label;

    @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserUiDevSettingFactory$accountDeleteDebugUseCaseOverride$1$1", f = "SubauthUserUiDevSettingFactory.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserUiDevSettingFactory$accountDeleteDebugUseCaseOverride$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ boolean $isChecked;
        final /* synthetic */ String $noPurchaseDevSettingKey;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, boolean z, by0 by0Var) {
            super(2, by0Var);
            this.$noPurchaseDevSettingKey = str;
            this.$isChecked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$noPurchaseDevSettingKey, this.$isChecked, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.gt2
        public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
            return ((AnonymousClass1) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            ((MutablePreferences) this.L$0).j(u16.a(this.$noPurchaseDevSettingKey), cc0.a(this.$isChecked));
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserUiDevSettingFactory$accountDeleteDebugUseCaseOverride$1(ba1 ba1Var, String str, by0 by0Var) {
        super(3, by0Var);
        this.$datastore = ba1Var;
        this.$noPurchaseDevSettingKey = str;
    }

    public final Object b(Context context, boolean z, by0 by0Var) {
        SubauthUserUiDevSettingFactory$accountDeleteDebugUseCaseOverride$1 subauthUserUiDevSettingFactory$accountDeleteDebugUseCaseOverride$1 = new SubauthUserUiDevSettingFactory$accountDeleteDebugUseCaseOverride$1(this.$datastore, this.$noPurchaseDevSettingKey, by0Var);
        subauthUserUiDevSettingFactory$accountDeleteDebugUseCaseOverride$1.Z$0 = z;
        return subauthUserUiDevSettingFactory$accountDeleteDebugUseCaseOverride$1.invokeSuspend(ww8.a);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b((Context) obj, ((Boolean) obj2).booleanValue(), (by0) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            boolean z2 = this.Z$0;
            ba1 ba1Var = this.$datastore;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$noPurchaseDevSettingKey, z2, null);
            this.Z$0 = z2;
            this.label = 1;
            if (PreferencesKt.a(ba1Var, anonymousClass1, this) == h) {
                return h;
            }
            z = z2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            f.b(obj);
        }
        return cc0.a(z);
    }
}
