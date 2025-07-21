package com.nytimes.xwords.hybrid.devsettings;

import android.content.Context;
import android.webkit.WebView;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.xwords.hybrid.devsettings.GamesHybridDevSettingFactory$devSettings$2", f = "GamesHybridDevSettingFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GamesHybridDevSettingFactory$devSettings$2 extends SuspendLambda implements it2 {
    /* synthetic */ boolean Z$0;
    int label;

    GamesHybridDevSettingFactory$devSettings$2(by0 by0Var) {
        super(3, by0Var);
    }

    public final Object b(Context context, boolean z, by0 by0Var) {
        GamesHybridDevSettingFactory$devSettings$2 gamesHybridDevSettingFactory$devSettings$2 = new GamesHybridDevSettingFactory$devSettings$2(by0Var);
        gamesHybridDevSettingFactory$devSettings$2.Z$0 = z;
        return gamesHybridDevSettingFactory$devSettings$2.invokeSuspend(ww8.a);
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
        WebView.setWebContentsDebuggingEnabled(z);
        return cc0.a(z);
    }
}
