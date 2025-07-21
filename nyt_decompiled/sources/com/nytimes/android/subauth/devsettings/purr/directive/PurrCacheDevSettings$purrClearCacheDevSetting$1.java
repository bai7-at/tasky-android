package com.nytimes.android.subauth.devsettings.purr.directive;

import android.content.Context;
import android.widget.Toast;
import com.nytimes.android.subauth.core.purr.a;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

@fc1(c = "com.nytimes.android.subauth.devsettings.purr.directive.PurrCacheDevSettings$purrClearCacheDevSetting$1", f = "PurrCacheDevSettings.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurrCacheDevSettings$purrClearCacheDevSetting$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ a $purrManager;
    /* synthetic */ Object L$0;
    int label;

    @fc1(c = "com.nytimes.android.subauth.devsettings.purr.directive.PurrCacheDevSettings$purrClearCacheDevSetting$1$1", f = "PurrCacheDevSettings.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.devsettings.purr.directive.PurrCacheDevSettings$purrClearCacheDevSetting$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ Context $it;
        final /* synthetic */ a $purrManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(a aVar, Context context, by0 by0Var) {
            super(2, by0Var);
            this.$purrManager = aVar;
            this.$it = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$purrManager, this.$it, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            try {
                this.$purrManager.clear();
            } catch (Exception unused) {
                Toast.makeText(this.$it, "Dev Settings: Failed to Clear local PURR cache", 0).show();
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrCacheDevSettings$purrClearCacheDevSetting$1(a aVar, by0 by0Var) {
        super(2, by0Var);
        this.$purrManager = aVar;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((PurrCacheDevSettings$purrClearCacheDevSetting$1) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PurrCacheDevSettings$purrClearCacheDevSetting$1 purrCacheDevSettings$purrClearCacheDevSetting$1 = new PurrCacheDevSettings$purrClearCacheDevSetting$1(this.$purrManager, by0Var);
        purrCacheDevSettings$purrClearCacheDevSetting$1.L$0 = obj;
        return purrCacheDevSettings$purrClearCacheDevSetting$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getDefault(), null, new AnonymousClass1(this.$purrManager, (Context) this.L$0, null), 2, null);
        return ww8.a;
    }
}
