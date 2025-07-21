package com.nytimes.android.hybrid;

import android.content.res.Resources;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hd4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zj8;
import defpackage.zq3;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.hybrid.HybridScriptInflater$getScript$2", f = "HybridScriptInflater.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HybridScriptInflater$getScript$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ int $fileResId;
    final /* synthetic */ Resources $resources;
    int label;
    final /* synthetic */ HybridScriptInflater this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridScriptInflater$getScript$2(Resources resources, int i, HybridScriptInflater hybridScriptInflater, by0 by0Var) {
        super(2, by0Var);
        this.$resources = resources;
        this.$fileResId = i;
        this.this$0 = hybridScriptInflater;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridScriptInflater$getScript$2(this.$resources, this.$fileResId, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hd4 hd4Var;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        InputStream openRawResource = this.$resources.openRawResource(this.$fileResId);
        zq3.g(openRawResource, "openRawResource(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource));
        final StringBuilder sb = new StringBuilder();
        zj8.c(bufferedReader, new ss2() { // from class: com.nytimes.android.hybrid.HybridScriptInflater$getScript$2$code$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((String) obj2);
                return ww8.a;
            }

            public final void invoke(String str) {
                zq3.h(str, "it");
                sb.append(str);
            }
        });
        bufferedReader.close();
        String sb2 = sb.toString();
        HybridScriptInflater hybridScriptInflater = this.this$0;
        int i = this.$fileResId;
        hd4Var = hybridScriptInflater.b;
        hd4Var.f(cc0.c(i), sb2);
        zq3.g(sb2, "also(...)");
        return sb2;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridScriptInflater$getScript$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
