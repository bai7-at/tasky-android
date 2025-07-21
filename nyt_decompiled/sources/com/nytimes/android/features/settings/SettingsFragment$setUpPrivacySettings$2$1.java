package com.nytimes.android.features.settings;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.w86;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.features.settings.SettingsFragment$setUpPrivacySettings$2$1", f = "SettingsFragment.kt", l = {376}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SettingsFragment$setUpPrivacySettings$2$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SettingsFragment this$0;

    static final class a implements FlowCollector {
        public static final a a = new a();

        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(w86 w86Var, by0 by0Var) {
            ww8 ww8Var;
            Exception b = w86Var.b();
            if (b != null) {
                NYTLogger.i(b, w86Var.a(), new Object[0]);
                ww8Var = ww8.a;
            } else {
                ww8Var = null;
            }
            if (ww8Var == null) {
                NYTLogger.g(w86Var.a(), new Object[0]);
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsFragment$setUpPrivacySettings$2$1(SettingsFragment settingsFragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = settingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SettingsFragment$setUpPrivacySettings$2$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            Flow b = this.this$0.getPurrUIClientApi().b();
            a aVar = a.a;
            this.label = 1;
            if (b.collect(aVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SettingsFragment$setUpPrivacySettings$2$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
