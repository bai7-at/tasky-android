package androidx.activity;

import android.view.View;
import defpackage.fe5;
import defpackage.jh6;
import defpackage.ss2;
import defpackage.zq3;
import kotlin.sequences.d;

/* loaded from: classes.dex */
public abstract class ViewTreeOnBackPressedDispatcherOwner {
    public static final fe5 a(View view) {
        zq3.h(view, "<this>");
        return (fe5) d.m(d.s(d.f(view, new ss2() { // from class: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final View invoke(View view2) {
                zq3.h(view2, "it");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new ss2() { // from class: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final fe5 invoke(View view2) {
                zq3.h(view2, "it");
                Object tag = view2.getTag(jh6.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof fe5) {
                    return (fe5) tag;
                }
                return null;
            }
        }));
    }

    public static final void b(View view, fe5 fe5Var) {
        zq3.h(view, "<this>");
        zq3.h(fe5Var, "onBackPressedDispatcherOwner");
        view.setTag(jh6.view_tree_on_back_pressed_dispatcher_owner, fe5Var);
    }
}
