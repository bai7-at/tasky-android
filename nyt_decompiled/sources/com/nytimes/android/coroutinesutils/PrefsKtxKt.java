package com.nytimes.android.coroutinesutils;

import android.content.SharedPreferences;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public abstract class PrefsKtxKt {
    public static final StateFlow a(final SharedPreferences sharedPreferences, CoroutineScope coroutineScope, final String str, final boolean z, SharingStarted sharingStarted) {
        zq3.h(sharedPreferences, "<this>");
        zq3.h(coroutineScope, "scope");
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(sharingStarted, "started");
        final Flow c = c(sharedPreferences, str);
        return FlowKt.stateIn(new Flow() { // from class: com.nytimes.android.coroutinesutils.PrefsKtxKt$getBooleanValueAsStateFlow$$inlined$map$1

            /* renamed from: com.nytimes.android.coroutinesutils.PrefsKtxKt$getBooleanValueAsStateFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ SharedPreferences b;
                final /* synthetic */ String c;
                final /* synthetic */ boolean d;

                @fc1(c = "com.nytimes.android.coroutinesutils.PrefsKtxKt$getBooleanValueAsStateFlow$$inlined$map$1$2", f = "PrefsKtx.kt", l = {223}, m = "emit")
                /* renamed from: com.nytimes.android.coroutinesutils.PrefsKtxKt$getBooleanValueAsStateFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, SharedPreferences sharedPreferences, String str, boolean z) {
                    this.a = flowCollector;
                    this.b = sharedPreferences;
                    this.c = str;
                    this.d = z;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.nytimes.android.coroutinesutils.PrefsKtxKt$getBooleanValueAsStateFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.coroutinesutils.PrefsKtxKt$getBooleanValueAsStateFlow$$inlined$map$1$2$1 r0 = (com.nytimes.android.coroutinesutils.PrefsKtxKt$getBooleanValueAsStateFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.coroutinesutils.PrefsKtxKt$getBooleanValueAsStateFlow$$inlined$map$1$2$1 r0 = new com.nytimes.android.coroutinesutils.PrefsKtxKt$getBooleanValueAsStateFlow$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.a
                        java.lang.String r5 = (java.lang.String) r5
                        android.content.SharedPreferences r5 = r4.b
                        java.lang.String r2 = r4.c
                        boolean r4 = r4.d
                        boolean r4 = r5.getBoolean(r2, r4)
                        java.lang.Boolean r4 = defpackage.cc0.a(r4)
                        r0.label = r3
                        java.lang.Object r4 = r6.emit(r4, r0)
                        if (r4 != r1) goto L4f
                        return r1
                    L4f:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.coroutinesutils.PrefsKtxKt$getBooleanValueAsStateFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, sharedPreferences, str, z), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        }, coroutineScope, sharingStarted, Boolean.valueOf(sharedPreferences.getBoolean(str, z)));
    }

    public static /* synthetic */ StateFlow b(SharedPreferences sharedPreferences, CoroutineScope coroutineScope, String str, boolean z, SharingStarted sharingStarted, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            sharingStarted = SharingStarted.Companion.getLazily();
        }
        return a(sharedPreferences, coroutineScope, str, z, sharingStarted);
    }

    public static final Flow c(SharedPreferences sharedPreferences, String str) {
        zq3.h(sharedPreferences, "<this>");
        zq3.h(str, TransferTable.COLUMN_KEY);
        return FlowKt.callbackFlow(new PrefsKtxKt$getKeyChangesAsFlow$1(sharedPreferences, str, null));
    }
}
