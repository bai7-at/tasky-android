package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes4.dex */
public final class ha5 implements f99 {
    private final NestedScrollView a;
    public final TextView b;
    public final TextView c;
    public final RecyclerView d;
    public final MaterialButton e;
    public final NestedScrollView f;

    private ha5(NestedScrollView nestedScrollView, TextView textView, TextView textView2, RecyclerView recyclerView, MaterialButton materialButton, NestedScrollView nestedScrollView2) {
        this.a = nestedScrollView;
        this.b = textView;
        this.c = textView2;
        this.d = recyclerView;
        this.e = materialButton;
        this.f = nestedScrollView2;
    }

    public static ha5 a(View view) {
        int i = wg6.notifications_header;
        TextView textView = (TextView) g99.a(view, i);
        if (textView != null) {
            i = wg6.notifications_header_title;
            TextView textView2 = (TextView) g99.a(view, i);
            if (textView2 != null) {
                i = wg6.notifications_list;
                RecyclerView recyclerView = (RecyclerView) g99.a(view, i);
                if (recyclerView != null) {
                    i = wg6.notifications_permissions_btn;
                    MaterialButton materialButton = (MaterialButton) g99.a(view, i);
                    if (materialButton != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                        return new ha5(nestedScrollView, textView, textView2, recyclerView, materialButton, nestedScrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.a;
    }
}
