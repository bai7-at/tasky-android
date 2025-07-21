package androidx.lifecycle;

import android.view.View;
import defpackage.d44;
import defpackage.hh6;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class ViewTreeLifecycleOwner {
    public static final d44 a(View view) {
        zq3.h(view, "<this>");
        return (d44) kotlin.sequences.d.m(kotlin.sequences.d.s(kotlin.sequences.d.f(view, new ss2() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final View invoke(View view2) {
                zq3.h(view2, "currentView");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new ss2() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d44 invoke(View view2) {
                zq3.h(view2, "viewParent");
                Object tag = view2.getTag(hh6.view_tree_lifecycle_owner);
                if (tag instanceof d44) {
                    return (d44) tag;
                }
                return null;
            }
        }));
    }

    public static final void b(View view, d44 d44Var) {
        zq3.h(view, "<this>");
        view.setTag(hh6.view_tree_lifecycle_owner, d44Var);
    }
}
