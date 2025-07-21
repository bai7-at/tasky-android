package com.nytimes.android.subauth.devsettings.items;

import android.content.Context;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
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

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$13", f = "SubauthUserDevSettingFactory.kt", l = {282}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserDevSettingFactory$userDevSettings$13 extends SuspendLambda implements it2 {
    final /* synthetic */ ba1 $datastore;
    final /* synthetic */ String $overrideTargetingDataKey;
    /* synthetic */ boolean Z$0;
    int label;

    @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$13$1", f = "SubauthUserDevSettingFactory.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$13$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ boolean $isChecked;
        final /* synthetic */ String $overrideTargetingDataKey;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, boolean z, by0 by0Var) {
            super(2, by0Var);
            this.$overrideTargetingDataKey = str;
            this.$isChecked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$overrideTargetingDataKey, this.$isChecked, by0Var);
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
            ((MutablePreferences) this.L$0).j(u16.a(this.$overrideTargetingDataKey), cc0.a(this.$isChecked));
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserDevSettingFactory$userDevSettings$13(ba1 ba1Var, String str, by0 by0Var) {
        super(3, by0Var);
        this.$datastore = ba1Var;
        this.$overrideTargetingDataKey = str;
    }

    public final Object b(Context context, boolean z, by0 by0Var) {
        SubauthUserDevSettingFactory$userDevSettings$13 subauthUserDevSettingFactory$userDevSettings$13 = new SubauthUserDevSettingFactory$userDevSettings$13(this.$datastore, this.$overrideTargetingDataKey, by0Var);
        subauthUserDevSettingFactory$userDevSettings$13.Z$0 = z;
        return subauthUserDevSettingFactory$userDevSettings$13.invokeSuspend(ww8.a);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$overrideTargetingDataKey, z2, null);
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
