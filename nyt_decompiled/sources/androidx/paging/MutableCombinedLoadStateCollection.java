package androidx.paging;

import androidx.paging.d;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.dp0;
import defpackage.ss2;
import defpackage.zq3;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes.dex */
public final class MutableCombinedLoadStateCollection {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final MutableStateFlow b;
    private final StateFlow c;

    public MutableCombinedLoadStateCollection() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.b = MutableStateFlow;
        this.c = FlowKt.asStateFlow(MutableStateFlow);
    }

    private final d b(d dVar, d dVar2, d dVar3, d dVar4) {
        return dVar4 == null ? dVar3 : (!(dVar instanceof d.b) || ((dVar2 instanceof d.c) && (dVar4 instanceof d.c)) || (dVar4 instanceof d.a)) ? dVar4 : dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dp0 c(dp0 dp0Var, e eVar, e eVar2) {
        d b;
        d b2;
        d b3;
        if (dp0Var == null || (b = dp0Var.d()) == null) {
            b = d.c.b.b();
        }
        d b4 = b(b, eVar.f(), eVar.f(), eVar2 != null ? eVar2.f() : null);
        if (dp0Var == null || (b2 = dp0Var.c()) == null) {
            b2 = d.c.b.b();
        }
        d b5 = b(b2, eVar.f(), eVar.e(), eVar2 != null ? eVar2.e() : null);
        if (dp0Var == null || (b3 = dp0Var.a()) == null) {
            b3 = d.c.b.b();
        }
        return new dp0(b4, b5, b(b3, eVar.f(), eVar.d(), eVar2 != null ? eVar2.d() : null), eVar, eVar2);
    }

    private final void d(ss2 ss2Var) {
        Object value;
        dp0 dp0Var;
        MutableStateFlow mutableStateFlow = this.b;
        do {
            value = mutableStateFlow.getValue();
            dp0 dp0Var2 = (dp0) value;
            dp0Var = (dp0) ss2Var.invoke(dp0Var2);
            if (zq3.c(dp0Var2, dp0Var)) {
                return;
            }
        } while (!mutableStateFlow.compareAndSet(value, dp0Var));
        if (dp0Var != null) {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((ss2) it2.next()).invoke(dp0Var);
            }
        }
    }

    public final StateFlow e() {
        return this.c;
    }

    public final void f(final e eVar, final e eVar2) {
        zq3.h(eVar, "sourceLoadStates");
        d(new ss2() { // from class: androidx.paging.MutableCombinedLoadStateCollection$set$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final dp0 invoke(dp0 dp0Var) {
                dp0 c;
                c = MutableCombinedLoadStateCollection.this.c(dp0Var, eVar, eVar2);
                return c;
            }
        });
    }

    public final void g(final LoadType loadType, final boolean z, final d dVar) {
        zq3.h(loadType, TransferTable.COLUMN_TYPE);
        zq3.h(dVar, TransferTable.COLUMN_STATE);
        d(new ss2() { // from class: androidx.paging.MutableCombinedLoadStateCollection$set$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final dp0 invoke(dp0 dp0Var) {
                e a;
                dp0 c;
                if (dp0Var == null || (a = dp0Var.e()) == null) {
                    a = e.f.a();
                }
                e b = dp0Var != null ? dp0Var.b() : null;
                if (z) {
                    b = e.f.a().i(loadType, dVar);
                } else {
                    a = a.i(loadType, dVar);
                }
                c = this.c(dp0Var, a, b);
                return c;
            }
        });
    }
}
