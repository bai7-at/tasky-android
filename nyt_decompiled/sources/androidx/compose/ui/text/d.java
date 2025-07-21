package androidx.compose.ui.text;

import androidx.compose.ui.text.font.e;
import defpackage.fm1;
import defpackage.lo5;
import defpackage.wf;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {
    public static final lo5 a(String str, j jVar, List list, List list2, fm1 fm1Var, e.b bVar) {
        return wf.a(str, jVar, list, list2, fm1Var, bVar);
    }

    public static /* synthetic */ lo5 b(String str, j jVar, List list, List list2, fm1 fm1Var, e.b bVar, int i, Object obj) {
        if ((i & 4) != 0) {
            list = kotlin.collections.i.l();
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = kotlin.collections.i.l();
        }
        return a(str, jVar, list3, list2, fm1Var, bVar);
    }
}
