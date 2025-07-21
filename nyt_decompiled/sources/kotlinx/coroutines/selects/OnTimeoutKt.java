package kotlinx.coroutines.selects;

import defpackage.ss2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

/* loaded from: classes5.dex */
public final class OnTimeoutKt {
    @ExperimentalCoroutinesApi
    public static final <R> void onTimeout(SelectBuilder<? super R> selectBuilder, long j, ss2 ss2Var) {
        selectBuilder.invoke(new OnTimeout(j).getSelectClause(), ss2Var);
    }

    @ExperimentalCoroutinesApi
    /* renamed from: onTimeout-8Mi8wO0, reason: not valid java name */
    public static final <R> void m954onTimeout8Mi8wO0(SelectBuilder<? super R> selectBuilder, long j, ss2 ss2Var) {
        onTimeout(selectBuilder, DelayKt.m873toDelayMillisLRDsOJo(j), ss2Var);
    }
}
