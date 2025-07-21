package androidx.constraintlayout.compose;

import android.os.Handler;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.bv0;
import defpackage.ov6;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.u08;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class ConstraintSetForInlineDsl implements bv0, ov6 {
    private final ConstraintLayoutScope a;
    private Handler b;
    private final SnapshotStateObserver c;
    private boolean d;
    private final ss2 e;
    private final List f;

    public ConstraintSetForInlineDsl(ConstraintLayoutScope constraintLayoutScope) {
        zq3.h(constraintLayoutScope, "scope");
        this.a = constraintLayoutScope;
        this.c = new SnapshotStateObserver(new ConstraintSetForInlineDsl$observer$1(this));
        this.d = true;
        this.e = new ss2() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1
            {
                super(1);
            }

            public final void b(ww8 ww8Var) {
                zq3.h(ww8Var, "$noName_0");
                ConstraintSetForInlineDsl.this.i(true);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ww8) obj);
                return ww8.a;
            }
        };
        this.f = new ArrayList();
    }

    @Override // defpackage.bv0
    public boolean a(List list) {
        zq3.h(list, "measurables");
        if (this.d || list.size() != this.f.size()) {
            return true;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object d = ((qg4) list.get(i)).d();
                if (!zq3.c(d instanceof d ? (d) d : null, this.f.get(i))) {
                    return true;
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }

    @Override // defpackage.bv0
    public void b(final u08 u08Var, final List list) {
        zq3.h(u08Var, TransferTable.COLUMN_STATE);
        zq3.h(list, "measurables");
        this.a.a(u08Var);
        this.f.clear();
        this.c.o(ww8.a, this.e, new qs2() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$applyTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m116invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m116invoke() {
                List list2;
                List<qg4> list3 = list;
                u08 u08Var2 = u08Var;
                ConstraintSetForInlineDsl constraintSetForInlineDsl = this;
                int size = list3.size() - 1;
                if (size < 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Object d = list3.get(i).d();
                    d dVar = d instanceof d ? (d) d : null;
                    if (dVar != null) {
                        ConstrainScope constrainScope = new ConstrainScope(dVar.b().c());
                        dVar.a().invoke(constrainScope);
                        constrainScope.a(u08Var2);
                    }
                    list2 = constraintSetForInlineDsl.f;
                    list2.add(dVar);
                    if (i2 > size) {
                        return;
                    } else {
                        i = i2;
                    }
                }
            }
        });
        this.d = false;
    }

    @Override // defpackage.ov6
    public void c() {
        this.c.s();
    }

    @Override // defpackage.ov6
    public void d() {
    }

    @Override // defpackage.ov6
    public void e() {
        this.c.t();
        this.c.j();
    }

    public final void i(boolean z) {
        this.d = z;
    }
}
