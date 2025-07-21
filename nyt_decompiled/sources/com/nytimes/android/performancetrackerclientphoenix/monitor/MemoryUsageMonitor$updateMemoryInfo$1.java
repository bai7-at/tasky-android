package com.nytimes.android.performancetrackerclientphoenix.monitor;

import android.content.SharedPreferences;
import com.nytimes.android.performancetrackerclientphoenix.monitor.MemoryUsageMonitor;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.performancetrackerclientphoenix.monitor.MemoryUsageMonitor$updateMemoryInfo$1", f = "MemoryUsageMonitor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MemoryUsageMonitor$updateMemoryInfo$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ MemoryUsageMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MemoryUsageMonitor$updateMemoryInfo$1(MemoryUsageMonitor memoryUsageMonitor, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = memoryUsageMonitor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new MemoryUsageMonitor$updateMemoryInfo$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qs2 qs2Var;
        Long l;
        SharedPreferences sharedPreferences;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        qs2Var = this.this$0.c;
        Object mo865invoke = qs2Var.mo865invoke();
        MemoryUsageMonitor memoryUsageMonitor = this.this$0;
        MemoryUsageMonitor.b bVar = (MemoryUsageMonitor.b) mo865invoke;
        l = memoryUsageMonitor.e;
        if (l == null) {
            memoryUsageMonitor.e = cc0.d(bVar.c());
        }
        sharedPreferences = memoryUsageMonitor.a;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("PrefMemoryAvail", bVar.c());
        edit.putLong("PrefMemoryTotal", bVar.a());
        edit.putBoolean("PrefHasReceivedMemoryWarning", bVar.b());
        edit.apply();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((MemoryUsageMonitor$updateMemoryInfo$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
