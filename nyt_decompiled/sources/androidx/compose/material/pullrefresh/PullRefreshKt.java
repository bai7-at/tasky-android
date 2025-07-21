package androidx.compose.material.pullrefresh;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.by0;
import defpackage.cc0;
import defpackage.gt2;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class PullRefreshKt {
    public static final Modifier b(Modifier modifier, final ss2 ss2Var, final gt2 gt2Var, final boolean z) {
        return InspectableValueKt.b(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.material.pullrefresh.PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), androidx.compose.ui.input.nestedscroll.a.b(Modifier.a, new PullRefreshNestedScrollConnection(ss2Var, gt2Var, z), null, 2, null));
    }

    public static final Modifier c(Modifier modifier, final PullRefreshState pullRefreshState, final boolean z) {
        return InspectableValueKt.b(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.material.pullrefresh.PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), b(Modifier.a, new PullRefreshKt$pullRefresh$2$1(pullRefreshState), new PullRefreshKt$pullRefresh$2$2(pullRefreshState), z));
    }

    public static /* synthetic */ Modifier d(Modifier modifier, PullRefreshState pullRefreshState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c(modifier, pullRefreshState, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object e(PullRefreshState pullRefreshState, float f, by0 by0Var) {
        return cc0.b(pullRefreshState.r(f));
    }
}
