package kotlinx.coroutines.selects;

import defpackage.it2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SelectClause0Impl implements SelectClause0 {
    private final Object clauseObject;
    private final it2 onCancellationConstructor;
    private final it2 processResFunc;
    private final it2 regFunc;

    public SelectClause0Impl(Object obj, it2 it2Var, it2 it2Var2) {
        it2 it2Var3;
        this.clauseObject = obj;
        this.regFunc = it2Var;
        this.onCancellationConstructor = it2Var2;
        it2Var3 = SelectKt.DUMMY_PROCESS_RESULT_FUNCTION;
        this.processResFunc = it2Var3;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Object getClauseObject() {
        return this.clauseObject;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public it2 getOnCancellationConstructor() {
        return this.onCancellationConstructor;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public it2 getProcessResFunc() {
        return this.processResFunc;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public it2 getRegFunc() {
        return this.regFunc;
    }

    public /* synthetic */ SelectClause0Impl(Object obj, it2 it2Var, it2 it2Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, it2Var, (i & 4) != 0 ? null : it2Var2);
    }
}
