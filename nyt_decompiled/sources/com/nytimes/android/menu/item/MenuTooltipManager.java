package com.nytimes.android.menu.item;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import com.skydoves.balloon.ArrowOrientation;
import com.skydoves.balloon.ArrowOrientationRules;
import com.skydoves.balloon.ArrowPositionRules;
import com.skydoves.balloon.Balloon;
import defpackage.ei6;
import defpackage.nx;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes4.dex */
public final class MenuTooltipManager {
    private final Activity a;
    private Balloon b;

    public MenuTooltipManager(Activity activity) {
        zq3.h(activity, "activity");
        this.a = activity;
    }

    private final Balloon c(final qs2 qs2Var) {
        Balloon.a aVar = new Balloon.a(this.a);
        aVar.p1(ei6.layout_custom_tooltip);
        aVar.Y0(ArrowOrientation.BOTTOM);
        aVar.Z0(ArrowOrientationRules.ALIGN_ANCHOR);
        aVar.g1(0.0f);
        aVar.d1(9);
        aVar.U0(Color.parseColor("#4590EB"));
        aVar.k1(false);
        aVar.h1(true);
        aVar.c1(ArrowPositionRules.ALIGN_ANCHOR);
        View findViewById = this.a.findViewById(R.id.content);
        zq3.g(findViewById, "findViewById(...)");
        final MutableStateFlow a = nx.a(findViewById);
        aVar.x1(new ss2() { // from class: com.nytimes.android.menu.item.MenuTooltipManager$buildBalloon$1$1
            {
                super(1);
            }

            public final void b(View view) {
                zq3.h(view, "view");
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                MutableStateFlow.this.setValue(Integer.valueOf(((rect.bottom - rect.top) - view.getRootView().getHeight()) - view.getTop()));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((View) obj);
                return ww8.a;
            }
        });
        aVar.w1(new qs2() { // from class: com.nytimes.android.menu.item.MenuTooltipManager$buildBalloon$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m592invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m592invoke() {
                MutableStateFlow.this.setValue(Integer.MAX_VALUE);
                qs2Var.mo865invoke();
            }
        });
        return aVar.a();
    }

    public final void d() {
        Balloon balloon = this.b;
        if (balloon != null) {
            if (balloon == null) {
                zq3.z("balloon");
                balloon = null;
            }
            balloon.A();
        }
    }

    public final void e(View view, qs2 qs2Var, final qs2 qs2Var2) {
        Balloon balloon;
        Balloon balloon2;
        zq3.h(view, "view");
        zq3.h(qs2Var, "onDismiss");
        zq3.h(qs2Var2, "onClick");
        if (this.b == null) {
            this.b = c(qs2Var);
        }
        Balloon balloon3 = this.b;
        if (balloon3 == null) {
            zq3.z("balloon");
            balloon3 = null;
        }
        balloon3.l0(new ss2() { // from class: com.nytimes.android.menu.item.MenuTooltipManager$displayBalloon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(View view2) {
                Balloon balloon4;
                zq3.h(view2, "it");
                qs2.this.mo865invoke();
                balloon4 = this.b;
                if (balloon4 == null) {
                    zq3.z("balloon");
                    balloon4 = null;
                }
                balloon4.A();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((View) obj);
                return ww8.a;
            }
        });
        Balloon balloon4 = this.b;
        if (balloon4 == null) {
            zq3.z("balloon");
            balloon = null;
        } else {
            balloon = balloon4;
        }
        Balloon.P0(balloon, view, 0, 0, 6, null);
        Balloon balloon5 = this.b;
        if (balloon5 == null) {
            zq3.z("balloon");
            balloon2 = null;
        } else {
            balloon2 = balloon5;
        }
        Balloon.G0(balloon2, view, 0, 0, null, 14, null);
    }
}
