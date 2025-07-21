package com.nytimes.android.utils;

import android.content.SharedPreferences;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.utils.LegacyFileUtils$removeLegacyFiles$2", f = "LegacyFileUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LegacyFileUtils$removeLegacyFiles$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ LegacyFileUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyFileUtils$removeLegacyFiles$2(LegacyFileUtils legacyFileUtils, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = legacyFileUtils;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LegacyFileUtils$removeLegacyFiles$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        try {
            sharedPreferences = this.this$0.prefs;
            if (!sharedPreferences.getBoolean("rmLegFil", false)) {
                this.this$0.removeLegacyDatabases();
                this.this$0.removeLegacyImageCacheDir();
                this.this$0.removeHomeCaches();
                sharedPreferences2 = this.this$0.prefs;
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                edit.putBoolean("rmLegFil", true);
                edit.apply();
            }
            NYTLogger.l("legacy check complete", new Object[0]);
        } catch (Exception e) {
            NYTLogger.i(e, "problem removing legacy files", new Object[0]);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LegacyFileUtils$removeLegacyFiles$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
