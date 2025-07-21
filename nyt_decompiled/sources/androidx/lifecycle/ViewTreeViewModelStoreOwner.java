package androidx.lifecycle;

import android.view.View;
import defpackage.ih6;
import defpackage.sa9;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class ViewTreeViewModelStoreOwner {
    public static final sa9 a(View view) {
        zq3.h(view, "<this>");
        return (sa9) kotlin.sequences.d.m(kotlin.sequences.d.s(kotlin.sequences.d.f(view, new ss2() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final View invoke(View view2) {
                zq3.h(view2, "view");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new ss2() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final sa9 invoke(View view2) {
                zq3.h(view2, "view");
                Object tag = view2.getTag(ih6.view_tree_view_model_store_owner);
                if (tag instanceof sa9) {
                    return (sa9) tag;
                }
                return null;
            }
        }));
    }

    public static final void b(View view, sa9 sa9Var) {
        zq3.h(view, "<this>");
        view.setTag(ih6.view_tree_view_model_store_owner, sa9Var);
    }
}
