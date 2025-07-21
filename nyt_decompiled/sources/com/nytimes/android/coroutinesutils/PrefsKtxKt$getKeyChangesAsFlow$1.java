package com.nytimes.android.coroutinesutils;

import android.content.SharedPreferences;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@fc1(c = "com.nytimes.android.coroutinesutils.PrefsKtxKt$getKeyChangesAsFlow$1", f = "PrefsKtx.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PrefsKtxKt$getKeyChangesAsFlow$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $key;
    final /* synthetic */ SharedPreferences $this_getKeyChangesAsFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrefsKtxKt$getKeyChangesAsFlow$1(SharedPreferences sharedPreferences, String str, by0 by0Var) {
        super(2, by0Var);
        this.$this_getKeyChangesAsFlow = sharedPreferences;
        this.$key = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(String str, ProducerScope producerScope, SharedPreferences sharedPreferences, String str2) {
        if (zq3.c(str2, str)) {
            ChannelsKt.trySendBlocking(producerScope, str);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PrefsKtxKt$getKeyChangesAsFlow$1 prefsKtxKt$getKeyChangesAsFlow$1 = new PrefsKtxKt$getKeyChangesAsFlow$1(this.$this_getKeyChangesAsFlow, this.$key, by0Var);
        prefsKtxKt$getKeyChangesAsFlow$1.L$0 = obj;
        return prefsKtxKt$getKeyChangesAsFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final String str = this.$key;
            final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.nytimes.android.coroutinesutils.c
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    PrefsKtxKt$getKeyChangesAsFlow$1.c(str, producerScope, sharedPreferences, str2);
                }
            };
            this.$this_getKeyChangesAsFlow.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            final SharedPreferences sharedPreferences = this.$this_getKeyChangesAsFlow;
            qs2 qs2Var = new qs2() { // from class: com.nytimes.android.coroutinesutils.PrefsKtxKt$getKeyChangesAsFlow$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m328invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m328invoke() {
                    sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, qs2Var, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(ProducerScope producerScope, by0 by0Var) {
        return ((PrefsKtxKt$getKeyChangesAsFlow$1) create(producerScope, by0Var)).invokeSuspend(ww8.a);
    }
}
