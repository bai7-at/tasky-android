package com.nytimes.android.comments.writenewcomment.data.local;

import androidx.datastore.preferences.core.PreferencesKt;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.comments.writenewcomment.data.repository.CommenterPreferences;
import defpackage.ba1;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class WriteNewCommentPreferencesDataStore {
    public static final int $stable = 8;
    private final Flow<CommenterPreferences> commenterPreferencesFlow;
    private final ba1 preferenceStore;

    public WriteNewCommentPreferencesDataStore(ba1 ba1Var) {
        zq3.h(ba1Var, "preferenceStore");
        this.preferenceStore = ba1Var;
        final Flow m911catch = FlowKt.m911catch(ba1Var.getData(), new WriteNewCommentPreferencesDataStore$commenterPreferencesFlow$1(null));
        this.commenterPreferencesFlow = new Flow<CommenterPreferences>() { // from class: com.nytimes.android.comments.writenewcomment.data.local.WriteNewCommentPreferencesDataStore$special$$inlined$map$1

            /* renamed from: com.nytimes.android.comments.writenewcomment.data.local.WriteNewCommentPreferencesDataStore$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @fc1(c = "com.nytimes.android.comments.writenewcomment.data.local.WriteNewCommentPreferencesDataStore$special$$inlined$map$1$2", f = "WriteNewCommentPreferencesDataStore.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.comments.writenewcomment.data.local.WriteNewCommentPreferencesDataStore$special$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r14, defpackage.by0 r15) {
                    /*
                        r13 = this;
                        boolean r0 = r15 instanceof com.nytimes.android.comments.writenewcomment.data.local.WriteNewCommentPreferencesDataStore$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r15
                        com.nytimes.android.comments.writenewcomment.data.local.WriteNewCommentPreferencesDataStore$special$$inlined$map$1$2$1 r0 = (com.nytimes.android.comments.writenewcomment.data.local.WriteNewCommentPreferencesDataStore$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.comments.writenewcomment.data.local.WriteNewCommentPreferencesDataStore$special$$inlined$map$1$2$1 r0 = new com.nytimes.android.comments.writenewcomment.data.local.WriteNewCommentPreferencesDataStore$special$$inlined$map$1$2$1
                        r0.<init>(r15)
                    L18:
                        java.lang.Object r15 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r15)
                        goto L6f
                    L29:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        throw r13
                    L31:
                        kotlin.f.b(r15)
                        kotlinx.coroutines.flow.FlowCollector r13 = r13.$this_unsafeFlow
                        s16 r14 = (defpackage.s16) r14
                        com.nytimes.android.comments.writenewcomment.data.local.PreferencesKeys r15 = com.nytimes.android.comments.writenewcomment.data.local.PreferencesKeys.INSTANCE
                        s16$a r2 = r15.getCOMMENTER_NAME()
                        java.lang.Object r2 = r14.c(r2)
                        java.lang.String r2 = (java.lang.String) r2
                        java.lang.String r4 = ""
                        if (r2 != 0) goto L4a
                        r6 = r4
                        goto L4b
                    L4a:
                        r6 = r2
                    L4b:
                        s16$a r15 = r15.getCOMMENTER_LOCATION()
                        java.lang.Object r14 = r14.c(r15)
                        java.lang.String r14 = (java.lang.String) r14
                        if (r14 != 0) goto L59
                        r7 = r4
                        goto L5a
                    L59:
                        r7 = r14
                    L5a:
                        com.nytimes.android.comments.writenewcomment.data.repository.CommenterPreferences r14 = new com.nytimes.android.comments.writenewcomment.data.repository.CommenterPreferences
                        r11 = 28
                        r12 = 0
                        r8 = 0
                        r9 = 0
                        r10 = 0
                        r5 = r14
                        r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                        r0.label = r3
                        java.lang.Object r13 = r13.emit(r14, r0)
                        if (r13 != r1) goto L6f
                        return r1
                    L6f:
                        ww8 r13 = defpackage.ww8.a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.writenewcomment.data.local.WriteNewCommentPreferencesDataStore$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super CommenterPreferences> flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
    }

    public final Flow<CommenterPreferences> getCommenterPreferencesFlow() {
        return this.commenterPreferencesFlow;
    }

    public final Object updateCommenterPreferences(CommenterPreferences commenterPreferences, by0<? super ww8> by0Var) {
        Object a = PreferencesKt.a(this.preferenceStore, new WriteNewCommentPreferencesDataStore$updateCommenterPreferences$2(commenterPreferences, null), by0Var);
        return a == a.h() ? a : ww8.a;
    }
}
