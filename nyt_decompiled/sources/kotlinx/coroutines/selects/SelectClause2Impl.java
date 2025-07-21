package kotlinx.coroutines.selects;

import defpackage.it2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SelectClause2Impl<P, Q> implements SelectClause2<P, Q> {
    private final Object clauseObject;
    private final it2 onCancellationConstructor;
    private final it2 processResFunc;
    private final it2 regFunc;

    public SelectClause2Impl(Object obj, it2 it2Var, it2 it2Var2, it2 it2Var3) {
        this.clauseObject = obj;
        this.regFunc = it2Var;
        this.processResFunc = it2Var2;
        this.onCancellationConstructor = it2Var3;
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

    public /* synthetic */ SelectClause2Impl(Object obj, it2 it2Var, it2 it2Var2, it2 it2Var3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, it2Var, it2Var2, (i & 8) != 0 ? null : it2Var3);
    }
}
