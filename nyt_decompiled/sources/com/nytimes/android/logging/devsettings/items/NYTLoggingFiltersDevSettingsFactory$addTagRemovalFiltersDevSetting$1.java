package com.nytimes.android.logging.devsettings.items;

import android.content.Context;
import android.widget.Toast;
import com.nytimes.android.devsettings.utils.ContextUtilsKt;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.logging.devsettings.items.NYTLoggingFiltersDevSettingsFactory$addTagRemovalFiltersDevSetting$1", f = "NYTLoggingFiltersDevSettingsFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NYTLoggingFiltersDevSettingsFactory$addTagRemovalFiltersDevSetting$1 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    NYTLoggingFiltersDevSettingsFactory$addTagRemovalFiltersDevSetting$1(by0 by0Var) {
        super(3, by0Var);
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, String str, by0 by0Var) {
        NYTLoggingFiltersDevSettingsFactory$addTagRemovalFiltersDevSetting$1 nYTLoggingFiltersDevSettingsFactory$addTagRemovalFiltersDevSetting$1 = new NYTLoggingFiltersDevSettingsFactory$addTagRemovalFiltersDevSetting$1(by0Var);
        nYTLoggingFiltersDevSettingsFactory$addTagRemovalFiltersDevSetting$1.L$0 = context;
        nYTLoggingFiltersDevSettingsFactory$addTagRemovalFiltersDevSetting$1.L$1 = str;
        return nYTLoggingFiltersDevSettingsFactory$addTagRemovalFiltersDevSetting$1.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Context context = (Context) this.L$0;
        String str = (String) this.L$1;
        Set<String> stringSet = ContextUtilsKt.a(context).getStringSet("NYTLogger.tagFiltersKey", b0.e());
        if (stringSet == null) {
            stringSet = b0.e();
        }
        Set<String> n = b0.n(stringSet, str);
        ContextUtilsKt.a(context).edit().putStringSet("NYTLogger.tagFiltersKey", n).commit();
        NYTLogger.u(n);
        Toast.makeText(context, "Filtering out TAGs with: " + str, 0).show();
        return ww8.a;
    }
}
