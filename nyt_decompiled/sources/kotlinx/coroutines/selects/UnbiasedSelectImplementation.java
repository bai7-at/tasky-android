package kotlinx.coroutines.selects;

import defpackage.by0;
import defpackage.gt2;
import defpackage.ss2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.selects.SelectImplementation;

/* loaded from: classes5.dex */
public class UnbiasedSelectImplementation<R> extends SelectImplementation<R> {
    private final List<SelectImplementation<R>.ClauseData> clausesToRegister;

    public UnbiasedSelectImplementation(CoroutineContext coroutineContext) {
        super(coroutineContext);
        this.clausesToRegister = new ArrayList();
    }

    static /* synthetic */ <R> Object doSelect$suspendImpl(UnbiasedSelectImplementation<R> unbiasedSelectImplementation, by0<? super R> by0Var) {
        unbiasedSelectImplementation.shuffleAndRegisterClauses();
        return super.doSelect(by0Var);
    }

    private final void shuffleAndRegisterClauses() {
        try {
            Collections.shuffle(this.clausesToRegister);
            Iterator<T> it2 = this.clausesToRegister.iterator();
            while (it2.hasNext()) {
                SelectImplementation.register$default(this, (SelectImplementation.ClauseData) it2.next(), false, 1, null);
            }
        } finally {
            this.clausesToRegister.clear();
        }
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation
    public Object doSelect(by0<? super R> by0Var) {
        return doSelect$suspendImpl((UnbiasedSelectImplementation) this, (by0) by0Var);
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public void invoke(SelectClause0 selectClause0, ss2 ss2Var) {
        this.clausesToRegister.add(new SelectImplementation.ClauseData(selectClause0.getClauseObject(), selectClause0.getRegFunc(), selectClause0.getProcessResFunc(), SelectKt.getPARAM_CLAUSE_0(), ss2Var, selectClause0.getOnCancellationConstructor()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(SelectClause1<? extends Q> selectClause1, gt2 gt2Var) {
        this.clausesToRegister.add(new SelectImplementation.ClauseData(selectClause1.getClauseObject(), selectClause1.getRegFunc(), selectClause1.getProcessResFunc(), null, gt2Var, selectClause1.getOnCancellationConstructor()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p, gt2 gt2Var) {
        this.clausesToRegister.add(new SelectImplementation.ClauseData(selectClause2.getClauseObject(), selectClause2.getRegFunc(), selectClause2.getProcessResFunc(), p, gt2Var, selectClause2.getOnCancellationConstructor()));
    }
}
