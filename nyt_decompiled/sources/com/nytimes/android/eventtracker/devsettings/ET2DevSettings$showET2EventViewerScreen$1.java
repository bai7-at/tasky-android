package com.nytimes.android.eventtracker.devsettings;

import android.content.Context;
import android.content.Intent;
import com.nytimes.android.eventtracker.devsettings.logviewer.ET2EventViewerActivity;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.eventtracker.devsettings.ET2DevSettings$showET2EventViewerScreen$1", f = "ET2DevSettings.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ET2DevSettings$showET2EventViewerScreen$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;

    ET2DevSettings$showET2EventViewerScreen$1(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((ET2DevSettings$showET2EventViewerScreen$1) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ET2DevSettings$showET2EventViewerScreen$1 eT2DevSettings$showET2EventViewerScreen$1 = new ET2DevSettings$showET2EventViewerScreen$1(by0Var);
        eT2DevSettings$showET2EventViewerScreen$1.L$0 = obj;
        return eT2DevSettings$showET2EventViewerScreen$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Context context = (Context) this.L$0;
        context.startActivity(new Intent(context, (Class<?>) ET2EventViewerActivity.class));
        return ww8.a;
    }
}
