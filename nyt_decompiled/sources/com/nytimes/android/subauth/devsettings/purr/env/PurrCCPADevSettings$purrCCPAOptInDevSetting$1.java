package com.nytimes.android.subauth.devsettings.purr.env;

import android.content.Context;
import android.widget.Toast;
import com.nytimes.android.subauth.core.purr.a;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceName;
import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceValue;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@fc1(c = "com.nytimes.android.subauth.devsettings.purr.env.PurrCCPADevSettings$purrCCPAOptInDevSetting$1", f = "PurrCCPADevSettings.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurrCCPADevSettings$purrCCPAOptInDevSetting$1 extends SuspendLambda implements it2 {
    final /* synthetic */ a $purrManager;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @fc1(c = "com.nytimes.android.subauth.devsettings.purr.env.PurrCCPADevSettings$purrCCPAOptInDevSetting$1$1", f = "PurrCCPADevSettings.kt", l = {35, 40}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.devsettings.purr.env.PurrCCPADevSettings$purrCCPAOptInDevSetting$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $isChecked;
        final /* synthetic */ a $purrManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, a aVar, Context context, by0 by0Var) {
            super(2, by0Var);
            this.$isChecked = z;
            this.$purrManager = aVar;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$isChecked, this.$purrManager, this.$context, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        f.b(obj);
                        return (PrivacyConfiguration) obj;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                    return (PrivacyConfiguration) obj;
                }
                f.b(obj);
                if (this.$isChecked) {
                    a aVar = this.$purrManager;
                    PurrPrivacyPreferenceName purrPrivacyPreferenceName = PurrPrivacyPreferenceName.CCPA;
                    PurrPrivacyPreferenceValue purrPrivacyPreferenceValue = PurrPrivacyPreferenceValue.OPT_IN;
                    this.label = 1;
                    obj = aVar.d(purrPrivacyPreferenceName, purrPrivacyPreferenceValue, this);
                    if (obj == h) {
                        return h;
                    }
                    return (PrivacyConfiguration) obj;
                }
                a aVar2 = this.$purrManager;
                PurrPrivacyPreferenceName purrPrivacyPreferenceName2 = PurrPrivacyPreferenceName.GDPR;
                PurrPrivacyPreferenceValue purrPrivacyPreferenceValue2 = PurrPrivacyPreferenceValue.OPT_OUT;
                this.label = 2;
                obj = aVar2.d(purrPrivacyPreferenceName2, purrPrivacyPreferenceValue2, this);
                if (obj == h) {
                    return h;
                }
                return (PrivacyConfiguration) obj;
            } catch (Exception unused) {
                Toast.makeText(this.$context, "Dev Settings: Failed to update CCPA OptIn: " + this.$isChecked, 0).show();
                return ww8.a;
            }
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrCCPADevSettings$purrCCPAOptInDevSetting$1(a aVar, by0 by0Var) {
        super(3, by0Var);
        this.$purrManager = aVar;
    }

    public final Object b(Context context, boolean z, by0 by0Var) {
        PurrCCPADevSettings$purrCCPAOptInDevSetting$1 purrCCPADevSettings$purrCCPAOptInDevSetting$1 = new PurrCCPADevSettings$purrCCPAOptInDevSetting$1(this.$purrManager, by0Var);
        purrCCPADevSettings$purrCCPAOptInDevSetting$1.L$0 = context;
        purrCCPADevSettings$purrCCPAOptInDevSetting$1.Z$0 = z;
        return purrCCPADevSettings$purrCCPAOptInDevSetting$1.invokeSuspend(ww8.a);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b((Context) obj, ((Boolean) obj2).booleanValue(), (by0) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Context context = (Context) this.L$0;
            boolean z2 = this.Z$0;
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(z2, this.$purrManager, context, null);
            this.Z$0 = z2;
            this.label = 1;
            if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == h) {
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
