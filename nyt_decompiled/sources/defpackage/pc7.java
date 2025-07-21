package defpackage;

import android.view.View;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class pc7 implements View.OnScrollChangeListener {
    public static final a Companion = new a(null);
    private final List a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pc7 a(View view) {
            zq3.h(view, "view");
            Object tag = view.getTag(ah6.on_scroll_change_listener);
            DefaultConstructorMarker defaultConstructorMarker = null;
            pc7 pc7Var = tag instanceof pc7 ? (pc7) tag : null;
            if (pc7Var != null) {
                return pc7Var;
            }
            pc7 pc7Var2 = new pc7(defaultConstructorMarker);
            view.setTag(ah6.on_scroll_change_listener, pc7Var2);
            view.setOnScrollChangeListener(pc7Var2);
            return pc7Var2;
        }

        private a() {
        }
    }

    public /* synthetic */ pc7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void b(mt2 mt2Var) {
        zq3.h(mt2Var, "onScroll");
        this.a.add(mt2Var);
    }

    public final void c(mt2 mt2Var) {
        zq3.h(mt2Var, "onScroll");
        this.a.remove(mt2Var);
    }

    @Override // android.view.View.OnScrollChangeListener
    public void onScrollChange(View view, int i, int i2, int i3, int i4) {
        zq3.h(view, QueryKeys.INTERNAL_REFERRER);
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((mt2) it2.next()).invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
    }

    private pc7() {
        this.a = new ArrayList();
    }
}
