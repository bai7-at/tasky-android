package androidx.compose.ui.layout;

import defpackage.sg4;
import defpackage.ss2;
import defpackage.yq3;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes.dex */
public interface f extends yq3 {

    public static final class a {
    }

    static /* synthetic */ sg4 J(f fVar, int i, int i2, Map map, ss2 ss2Var, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i3 & 4) != 0) {
            map = t.i();
        }
        return fVar.P(i, i2, map, ss2Var);
    }

    sg4 P(int i, int i2, Map map, ss2 ss2Var);
}
