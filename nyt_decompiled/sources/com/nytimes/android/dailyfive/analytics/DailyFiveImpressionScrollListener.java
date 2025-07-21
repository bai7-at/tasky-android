package com.nytimes.android.dailyfive.analytics;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.dailyfive.ui.items.c;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.bx4;
import defpackage.di0;
import defpackage.e52;
import defpackage.fi3;
import defpackage.it7;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.t33;
import defpackage.ue4;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import java.util.Set;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class DailyFiveImpressionScrollListener extends fi3 {
    private final ET2Scope c;

    public DailyFiveImpressionScrollListener(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.c = eT2Scope;
    }

    private final void j(final di0 di0Var, View view) {
        Set set;
        boolean g;
        Set set2;
        set = ((fi3) this).a;
        if (set.contains(di0Var)) {
            return;
        }
        g = g(view);
        if (g) {
            set2 = ((fi3) this).a;
            set2.add(di0Var);
            ET2PageScope.DefaultImpls.a(this.c, new e52.d(), null, null, new qs2() { // from class: com.nytimes.android.dailyfive.analytics.DailyFiveImpressionScrollListener$trackImpressionOnScroll$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ue4 mo865invoke() {
                    return di0.this;
                }
            }, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(List list, List list2) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                i.v();
            }
            j((di0) obj, (View) list2.get(i));
            i = i2;
        }
    }

    @Override // defpackage.fi3
    public void f(RecyclerView.d0 d0Var) {
        zq3.h(d0Var, "viewHolder");
        t33 t33Var = d0Var instanceof t33 ? (t33) d0Var : null;
        if (t33Var != null) {
            Object Z = t33Var.Z();
            zq3.f(Z, "null cannot be cast to non-null type com.nytimes.android.dailyfive.ui.items.DailyFiveViewItem<*>");
            Object obj = (c) Z;
            if (obj instanceof it7) {
                di0 h = ((it7) obj).h();
                View view = t33Var.a;
                zq3.g(view, "itemView");
                j(h, view);
                return;
            }
            if (obj instanceof bx4) {
                bx4 bx4Var = (bx4) obj;
                View view2 = t33Var.a;
                zq3.g(view2, "itemView");
                final List b = bx4Var.b(view2);
                final List e = bx4Var.e();
                View view3 = t33Var.a;
                zq3.g(view3, "itemView");
                bx4Var.g(view3, new ss2() { // from class: com.nytimes.android.dailyfive.analytics.DailyFiveImpressionScrollListener$checkViewHolder$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke(((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(int i) {
                        DailyFiveImpressionScrollListener.this.k(e, b);
                    }
                });
                k(e, b);
            }
        }
    }
}
