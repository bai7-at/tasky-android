package kotlinx.coroutines.selects;

import defpackage.gt2;
import defpackage.ss2;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

/* loaded from: classes5.dex */
public interface SelectBuilder<R> {

    public static final class DefaultImpls {
        public static <R, P, Q> void invoke(SelectBuilder<? super R> selectBuilder, SelectClause2<? super P, ? extends Q> selectClause2, gt2 gt2Var) {
            selectBuilder.invoke(selectClause2, null, gt2Var);
        }

        @ExperimentalCoroutinesApi
        public static <R> void onTimeout(SelectBuilder<? super R> selectBuilder, long j, ss2 ss2Var) {
            OnTimeoutKt.onTimeout(selectBuilder, j, ss2Var);
        }
    }

    void invoke(SelectClause0 selectClause0, ss2 ss2Var);

    <Q> void invoke(SelectClause1<? extends Q> selectClause1, gt2 gt2Var);

    <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, gt2 gt2Var);

    <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p, gt2 gt2Var);

    @ExperimentalCoroutinesApi
    void onTimeout(long j, ss2 ss2Var);
}
