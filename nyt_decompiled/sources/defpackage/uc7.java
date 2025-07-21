package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.sectionfront.layoutmanager.SpannableGridLayoutManager;

/* loaded from: classes4.dex */
public abstract class uc7 {
    public static final int a(RecyclerView.o oVar) {
        zq3.h(oVar, "<this>");
        if (oVar instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) oVar).e2();
        }
        if (oVar instanceof SpannableGridLayoutManager) {
            return ((SpannableGridLayoutManager) oVar).X1();
        }
        throw new IllegalStateException((oVar.getClass() + " not yet supported!").toString());
    }

    public static final boolean b(RecyclerView.o oVar, int i) {
        zq3.h(oVar, "<this>");
        return a(oVar) == i;
    }
}
