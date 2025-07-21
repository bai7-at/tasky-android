package com.nytimes.android.logging.devsettings.items;

import android.content.Context;
import android.widget.Toast;
import com.nytimes.android.devsettings.utils.ContextUtilsKt;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.logging.devsettings.items.NYTLoggingFiltersDevSettingsFactory$clearMessageRemovalFiltersDevSetting$1", f = "NYTLoggingFiltersDevSettingsFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NYTLoggingFiltersDevSettingsFactory$clearMessageRemovalFiltersDevSetting$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;

    NYTLoggingFiltersDevSettingsFactory$clearMessageRemovalFiltersDevSetting$1(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((NYTLoggingFiltersDevSettingsFactory$clearMessageRemovalFiltersDevSetting$1) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        NYTLoggingFiltersDevSettingsFactory$clearMessageRemovalFiltersDevSetting$1 nYTLoggingFiltersDevSettingsFactory$clearMessageRemovalFiltersDevSetting$1 = new NYTLoggingFiltersDevSettingsFactory$clearMessageRemovalFiltersDevSetting$1(by0Var);
        nYTLoggingFiltersDevSettingsFactory$clearMessageRemovalFiltersDevSetting$1.L$0 = obj;
        return nYTLoggingFiltersDevSettingsFactory$clearMessageRemovalFiltersDevSetting$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Context context = (Context) this.L$0;
        ContextUtilsKt.a(context).edit().remove("NYTLogger.msgFiltersKey").commit();
        NYTLogger.t(null);
        Toast.makeText(context, "Cleared Log removal filters for MESSAGEs", 0).show();
        return ww8.a;
    }
}
