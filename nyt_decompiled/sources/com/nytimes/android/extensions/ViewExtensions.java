package com.nytimes.android.extensions;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ch9;
import defpackage.d44;
import defpackage.ei1;
import defpackage.fb9;
import defpackage.mt2;
import defpackage.pc7;
import defpackage.ph9;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class ViewExtensions {
    public static final pc7 a(View view, mt2 mt2Var) {
        zq3.h(view, "<this>");
        zq3.h(mt2Var, "onScroll");
        pc7 a = pc7.Companion.a(view);
        a.b(mt2Var);
        return a;
    }

    public static final pc7 b(View view, d44 d44Var, final mt2 mt2Var) {
        zq3.h(view, "<this>");
        zq3.h(d44Var, "lifecycleOwner");
        zq3.h(mt2Var, "onScroll");
        final pc7 a = pc7.Companion.a(view);
        a.b(mt2Var);
        Lifecycle lifecycle = d44Var.getLifecycle();
        zq3.g(lifecycle, "getLifecycle(...)");
        lifecycle.a(new ei1() { // from class: com.nytimes.android.extensions.ViewExtensions$addOnScrollChangeListener$lambda$7$$inlined$onDestroy$1
            @Override // defpackage.ei1
            public void onDestroy(d44 d44Var2) {
                zq3.h(d44Var2, "owner");
                d44Var2.getLifecycle().d(this);
                pc7.this.c(mt2Var);
            }
        });
        return a;
    }

    public static final Button c(View view, int i) {
        zq3.h(view, "<this>");
        View findViewById = view.findViewById(i);
        zq3.g(findViewById, "findViewById(...)");
        return (Button) findViewById;
    }

    public static final boolean d(View view) {
        zq3.h(view, "<this>");
        return view.canScrollVertically(1);
    }

    public static final boolean e(View view) {
        zq3.h(view, "<this>");
        return view.canScrollVertically(-1);
    }

    public static final void f(final View view, long j) {
        zq3.h(view, "<this>");
        ViewPropertyAnimator duration = view.animate().alpha(1.0f).setDuration(j);
        zq3.g(duration, "setDuration(...)");
        fb9.b(duration, null, new ss2() { // from class: com.nytimes.android.extensions.ViewExtensions$fadeIn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Animator) obj);
                return ww8.a;
            }

            public final void invoke(Animator animator) {
                zq3.h(animator, "it");
                view.setVisibility(0);
            }
        }, null, null, 13, null).start();
    }

    public static /* synthetic */ void g(View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 200;
        }
        f(view, j);
    }

    public static final void h(final View view, long j) {
        zq3.h(view, "<this>");
        ViewPropertyAnimator duration = view.animate().alpha(0.0f).setDuration(j);
        zq3.g(duration, "setDuration(...)");
        fb9.b(duration, new ss2() { // from class: com.nytimes.android.extensions.ViewExtensions$fadeOut$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Animator) obj);
                return ww8.a;
            }

            public final void invoke(Animator animator) {
                zq3.h(animator, "it");
                view.setVisibility(8);
            }
        }, null, null, null, 14, null).start();
    }

    public static /* synthetic */ void i(View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 200;
        }
        h(view, j);
    }

    public static final View j(ViewGroup viewGroup, ss2 ss2Var) {
        zq3.h(viewGroup, "<this>");
        zq3.h(ss2Var, "predicate");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            zq3.e(childAt);
            if (((Boolean) ss2Var.invoke(childAt)).booleanValue()) {
                return childAt;
            }
        }
        return null;
    }

    public static final void k(View view) {
        zq3.h(view, "<this>");
        view.setVisibility(8);
    }

    public static final View l(ViewGroup viewGroup, int i) {
        zq3.h(viewGroup, "<this>");
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    public static final pc7 m(View view, mt2 mt2Var) {
        zq3.h(view, "<this>");
        zq3.h(mt2Var, "onScroll");
        pc7 a = pc7.Companion.a(view);
        a.c(mt2Var);
        return a;
    }

    public static final Activity n(View view) {
        zq3.h(view, "<this>");
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        throw new IllegalStateException(("View " + view.getClass().getCanonicalName() + " has no Activity attached!").toString());
    }

    public static final void o(RecyclerView recyclerView, boolean z) {
        zq3.h(recyclerView, "<this>");
        if (z) {
            recyclerView.smoothScrollToPosition(0);
        } else {
            recyclerView.scrollToPosition(0);
        }
    }

    public static final void p(View view, View view2) {
        zq3.h(view, "<this>");
        zq3.h(view2, "newView");
        i(view, 0L, 1, null);
        ww8 ww8Var = ww8.a;
        g(view2, 0L, 1, null);
    }

    public static final TextView q(View view, int i) {
        zq3.h(view, "<this>");
        View findViewById = view.findViewById(i);
        zq3.g(findViewById, "findViewById(...)");
        return (TextView) findViewById;
    }

    public static final ph9 r(ph9 ph9Var, boolean z) {
        zq3.h(ph9Var, "<this>");
        if (z) {
            ph9Var.a(ch9.l.h());
            ph9Var.f(2);
        } else {
            ph9Var.g(ch9.l.h());
            ph9Var.f(1);
        }
        return ph9Var;
    }
}
