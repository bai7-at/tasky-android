package kotlinx.coroutines.selects;

import defpackage.by0;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ss2;
import defpackage.v1;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.i;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectBuilder;

/* loaded from: classes5.dex */
public class SelectImplementation<R> extends CancelHandler implements SelectBuilder<R>, SelectInstanceInternal<R> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");
    private List<SelectImplementation<R>.ClauseData> clauses;
    private final CoroutineContext context;
    private Object disposableHandleOrSegment;
    private int indexInSegment;
    private Object internalResult;
    private volatile /* synthetic */ Object state$volatile;

    public final class ClauseData {
        private final Object block;
        public final Object clauseObject;
        public Object disposableHandleOrSegment;
        public int indexInSegment = -1;
        public final it2 onCancellationConstructor;
        private final Object param;
        private final it2 processResFunc;
        private final it2 regFunc;

        public ClauseData(Object obj, it2 it2Var, it2 it2Var2, Object obj2, Object obj3, it2 it2Var3) {
            this.clauseObject = obj;
            this.regFunc = it2Var;
            this.processResFunc = it2Var2;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = it2Var3;
        }

        public final ss2 createOnCancellationAction(SelectInstance<?> selectInstance, Object obj) {
            it2 it2Var = this.onCancellationConstructor;
            if (it2Var != null) {
                return (ss2) it2Var.invoke(selectInstance, this.param, obj);
            }
            return null;
        }

        public final void dispose() {
            Object obj = this.disposableHandleOrSegment;
            SelectImplementation<R> selectImplementation = SelectImplementation.this;
            if (obj instanceof Segment) {
                ((Segment) obj).onCancellation(this.indexInSegment, null, selectImplementation.getContext());
                return;
            }
            DisposableHandle disposableHandle = obj instanceof DisposableHandle ? (DisposableHandle) obj : null;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }

        public final Object invokeBlock(Object obj, by0<? super R> by0Var) {
            Object obj2 = this.block;
            if (this.param == SelectKt.getPARAM_CLAUSE_0()) {
                zq3.f(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((ss2) obj2).invoke(by0Var);
            }
            zq3.f(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((gt2) obj2).invoke(obj, by0Var);
        }

        public final Object processResult(Object obj) {
            return this.processResFunc.invoke(this.clauseObject, this.param, obj);
        }

        public final boolean tryRegisterAsWaiter(SelectImplementation<R> selectImplementation) {
            Symbol symbol;
            this.regFunc.invoke(this.clauseObject, selectImplementation, this.param);
            Object obj = ((SelectImplementation) selectImplementation).internalResult;
            symbol = SelectKt.NO_RESULT;
            return obj == symbol;
        }
    }

    public SelectImplementation(CoroutineContext coroutineContext) {
        Symbol symbol;
        Symbol symbol2;
        this.context = coroutineContext;
        symbol = SelectKt.STATE_REG;
        this.state$volatile = symbol;
        this.clauses = new ArrayList(2);
        this.indexInSegment = -1;
        symbol2 = SelectKt.NO_RESULT;
        this.internalResult = symbol2;
    }

    private final void checkClauseObject(Object obj) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        zq3.e(list);
        List<SelectImplementation<R>.ClauseData> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((ClauseData) it2.next()).clauseObject == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    private final void cleanup(SelectImplementation<R>.ClauseData clauseData) {
        Symbol symbol;
        Symbol symbol2;
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        if (list == null) {
            return;
        }
        for (SelectImplementation<R>.ClauseData clauseData2 : list) {
            if (clauseData2 != clauseData) {
                clauseData2.dispose();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
        symbol = SelectKt.STATE_COMPLETED;
        atomicReferenceFieldUpdater.set(this, symbol);
        symbol2 = SelectKt.NO_RESULT;
        this.internalResult = symbol2;
        this.clauses = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object complete(by0<? super R> by0Var) {
        Object obj = state$volatile$FU.get(this);
        zq3.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        SelectImplementation<R>.ClauseData clauseData = (ClauseData) obj;
        Object obj2 = this.internalResult;
        cleanup(clauseData);
        return clauseData.invokeBlock(clauseData.processResult(obj2), by0Var);
    }

    static /* synthetic */ <R> Object doSelect$suspendImpl(SelectImplementation<R> selectImplementation, by0<? super R> by0Var) {
        return selectImplementation.isSelected() ? selectImplementation.complete(by0Var) : selectImplementation.doSelectSuspend(by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0056 A[PHI: r6
      0x0056: PHI (r6v5 java.lang.Object) = (r6v4 java.lang.Object), (r6v1 java.lang.Object) binds: [B:17:0x0053, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doSelectSuspend(defpackage.by0<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L56
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.selects.SelectImplementation r5 = (kotlinx.coroutines.selects.SelectImplementation) r5
            kotlin.f.b(r6)
            goto L4a
        L3c:
            kotlin.f.b(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.waitUntilSelected(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r5.complete(r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.doSelectSuspend(by0):java.lang.Object");
    }

    private final SelectImplementation<R>.ClauseData findClause(Object obj) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((ClauseData) next).clauseObject == obj) {
                obj2 = next;
                break;
            }
        }
        SelectImplementation<R>.ClauseData clauseData = (ClauseData) obj2;
        if (clauseData != null) {
            return clauseData;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getInRegistrationPhase() {
        Symbol symbol;
        Object obj = state$volatile$FU.get(this);
        symbol = SelectKt.STATE_REG;
        return obj == symbol || (obj instanceof List);
    }

    private final /* synthetic */ Object getState$volatile() {
        return this.state$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCancelled() {
        Symbol symbol;
        Object obj = state$volatile$FU.get(this);
        symbol = SelectKt.STATE_CANCELLED;
        return obj == symbol;
    }

    private final boolean isSelected() {
        return state$volatile$FU.get(this) instanceof ClauseData;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ss2 ss2Var) {
        while (true) {
            ss2Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processResultAndInvokeBlockRecoveringException(kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData r5, java.lang.Object r6, defpackage.by0<? super R> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.f.b(r4)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r4)
            java.lang.Object r4 = r5.processResult(r6)
            r0.label = r2
            java.lang.Object r4 = r5.invokeBlock(r4, r0)
            if (r4 != r7) goto L41
            return r7
        L41:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.processResultAndInvokeBlockRecoveringException(kotlinx.coroutines.selects.SelectImplementation$ClauseData, java.lang.Object, by0):java.lang.Object");
    }

    public static /* synthetic */ void register$default(SelectImplementation selectImplementation, ClauseData clauseData, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        selectImplementation.register(clauseData, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reregisterClause(Object obj) {
        SelectImplementation<R>.ClauseData findClause = findClause(obj);
        zq3.e(findClause);
        findClause.disposableHandleOrSegment = null;
        findClause.indexInSegment = -1;
        register(findClause, true);
    }

    private final /* synthetic */ void setState$volatile(Object obj) {
        this.state$volatile = obj;
    }

    private final int trySelectInternal(Object obj, Object obj2) {
        boolean tryResume;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        while (true) {
            Object obj3 = state$volatile$FU.get(this);
            if (obj3 instanceof CancellableContinuation) {
                SelectImplementation<R>.ClauseData findClause = findClause(obj);
                if (findClause == null) {
                    continue;
                } else {
                    ss2 createOnCancellationAction = findClause.createOnCancellationAction(this, obj2);
                    if (v1.a(state$volatile$FU, this, obj3, findClause)) {
                        this.internalResult = obj2;
                        tryResume = SelectKt.tryResume((CancellableContinuation) obj3, createOnCancellationAction);
                        if (tryResume) {
                            return 0;
                        }
                        symbol = SelectKt.NO_RESULT;
                        this.internalResult = symbol;
                        return 2;
                    }
                }
            } else {
                symbol2 = SelectKt.STATE_COMPLETED;
                if (zq3.c(obj3, symbol2) ? true : obj3 instanceof ClauseData) {
                    return 3;
                }
                symbol3 = SelectKt.STATE_CANCELLED;
                if (zq3.c(obj3, symbol3)) {
                    return 2;
                }
                symbol4 = SelectKt.STATE_REG;
                if (zq3.c(obj3, symbol4)) {
                    if (v1.a(state$volatile$FU, this, obj3, i.e(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (v1.a(state$volatile$FU, this, obj3, i.G0((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    private final /* synthetic */ void update$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ss2 ss2Var) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!v1.a(atomicReferenceFieldUpdater, obj, obj2, ss2Var.invoke(obj2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r5 = r0.getResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r5 != kotlin.coroutines.intrinsics.a.h()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        defpackage.hc1.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r5 != kotlin.coroutines.intrinsics.a.h()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        return defpackage.ww8.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitUntilSelected(defpackage.by0<? super defpackage.ww8> r6) {
        /*
            r5 = this;
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            by0 r1 = kotlin.coroutines.intrinsics.a.d(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getState$volatile$FU()
        L11:
            java.lang.Object r2 = r1.get(r5)
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_REG$p()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = access$getState$volatile$FU()
            boolean r2 = defpackage.v1.a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            r0.invokeOnCancellation(r5)
            goto L62
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = access$getState$volatile$FU()
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_REG$p()
            boolean r3 = defpackage.v1.a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            access$reregisterClause(r5, r3)
            goto L41
        L4f:
            boolean r1 = r2 instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData
            if (r1 == 0) goto L79
            ww8 r1 = defpackage.ww8.a
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r2 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r2
            java.lang.Object r3 = access$getInternalResult$p(r5)
            ss2 r5 = r2.createOnCancellationAction(r5, r3)
            r0.resume(r1, r5)
        L62:
            java.lang.Object r5 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            if (r5 != r0) goto L6f
            defpackage.hc1.c(r6)
        L6f:
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.h()
            if (r5 != r6) goto L76
            return r5
        L76:
            ww8 r5 = defpackage.ww8.a
            return r5
        L79:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "unexpected state: "
            r6.append(r0)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.waitUntilSelected(by0):java.lang.Object");
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnCompletion(DisposableHandle disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    public Object doSelect(by0<? super R> by0Var) {
        return doSelect$suspendImpl(this, by0Var);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.CancelHandler, kotlinx.coroutines.CancelHandlerBase, defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return ww8.a;
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment<?> segment, int i) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = i;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    @ExperimentalCoroutinesApi
    public void onTimeout(long j, ss2 ss2Var) {
        SelectBuilder.DefaultImpls.onTimeout(this, j, ss2Var);
    }

    public final void register(SelectImplementation<R>.ClauseData clauseData, boolean z) {
        if (state$volatile$FU.get(this) instanceof ClauseData) {
            return;
        }
        if (!z) {
            checkClauseObject(clauseData.clauseObject);
        }
        if (!clauseData.tryRegisterAsWaiter(this)) {
            state$volatile$FU.set(this, clauseData);
            return;
        }
        if (!z) {
            List<SelectImplementation<R>.ClauseData> list = this.clauses;
            zq3.e(list);
            list.add(clauseData);
        }
        clauseData.disposableHandleOrSegment = this.disposableHandleOrSegment;
        clauseData.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void selectInRegistrationPhase(Object obj) {
        this.internalResult = obj;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect(Object obj, Object obj2) {
        return trySelectInternal(obj, obj2) == 0;
    }

    public final TrySelectDetailedResult trySelectDetailed(Object obj, Object obj2) {
        TrySelectDetailedResult TrySelectDetailedResult;
        TrySelectDetailedResult = SelectKt.TrySelectDetailedResult(trySelectInternal(obj, obj2));
        return TrySelectDetailedResult;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, gt2 gt2Var) {
        SelectBuilder.DefaultImpls.invoke(this, selectClause2, gt2Var);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(SelectClause0 selectClause0, ss2 ss2Var) {
        register$default(this, new ClauseData(selectClause0.getClauseObject(), selectClause0.getRegFunc(), selectClause0.getProcessResFunc(), SelectKt.getPARAM_CLAUSE_0(), ss2Var, selectClause0.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(SelectClause1<? extends Q> selectClause1, gt2 gt2Var) {
        register$default(this, new ClauseData(selectClause1.getClauseObject(), selectClause1.getRegFunc(), selectClause1.getProcessResFunc(), null, gt2Var, selectClause1.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p, gt2 gt2Var) {
        register$default(this, new ClauseData(selectClause2.getClauseObject(), selectClause2.getRegFunc(), selectClause2.getProcessResFunc(), p, gt2Var, selectClause2.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    public void invoke(Throwable th) {
        Object obj;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            symbol = SelectKt.STATE_COMPLETED;
            if (obj == symbol) {
                return;
            } else {
                symbol2 = SelectKt.STATE_CANCELLED;
            }
        } while (!v1.a(atomicReferenceFieldUpdater, this, obj, symbol2));
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        if (list == null) {
            return;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            ((ClauseData) it2.next()).dispose();
        }
        symbol3 = SelectKt.NO_RESULT;
        this.internalResult = symbol3;
        this.clauses = null;
    }
}
