package com.nytimes.android.logging.remote.stream.debugging;

import android.content.Context;
import android.widget.Toast;
import com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.logging.remote.stream.debugging.NYTLoggingRemoteStreamDevSettingsFactory$enableRemoteStreamLoggingDevSetting$1", f = "NYTLoggingRemoteStreamDevSettingsFactory.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NYTLoggingRemoteStreamDevSettingsFactory$enableRemoteStreamLoggingDevSetting$1 extends SuspendLambda implements it2 {
    final /* synthetic */ LoggingRemoteStreamManager $manager;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NYTLoggingRemoteStreamDevSettingsFactory$enableRemoteStreamLoggingDevSetting$1(LoggingRemoteStreamManager loggingRemoteStreamManager, by0 by0Var) {
        super(3, by0Var);
        this.$manager = loggingRemoteStreamManager;
    }

    public final Object b(Context context, boolean z, by0 by0Var) {
        NYTLoggingRemoteStreamDevSettingsFactory$enableRemoteStreamLoggingDevSetting$1 nYTLoggingRemoteStreamDevSettingsFactory$enableRemoteStreamLoggingDevSetting$1 = new NYTLoggingRemoteStreamDevSettingsFactory$enableRemoteStreamLoggingDevSetting$1(this.$manager, by0Var);
        nYTLoggingRemoteStreamDevSettingsFactory$enableRemoteStreamLoggingDevSetting$1.L$0 = context;
        nYTLoggingRemoteStreamDevSettingsFactory$enableRemoteStreamLoggingDevSetting$1.Z$0 = z;
        return nYTLoggingRemoteStreamDevSettingsFactory$enableRemoteStreamLoggingDevSetting$1.invokeSuspend(ww8.a);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b((Context) obj, ((Boolean) obj2).booleanValue(), (by0) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Context context;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Context context2 = (Context) this.L$0;
            boolean z2 = this.Z$0;
            LoggingRemoteStreamManager loggingRemoteStreamManager = this.$manager;
            this.L$0 = context2;
            this.Z$0 = z2;
            this.label = 1;
            Object n = loggingRemoteStreamManager.n(this);
            if (n == h) {
                return h;
            }
            z = z2;
            obj = n;
            context = context2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            context = (Context) this.L$0;
            f.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Toast.makeText(context, (z && booleanValue) ? "Enabled Remote Stream Logging" : (!z || booleanValue) ? !z ? "Disabled Remote Stream Logging" : "Unknown error on remote stream logging" : "ERROR: Enabled Remote Stream Logging. Server not connected.", 0).show();
        return cc0.a(z);
    }
}
