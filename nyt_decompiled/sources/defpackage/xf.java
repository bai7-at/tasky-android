package defpackage;

import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.j;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import java.util.List;

/* loaded from: classes.dex */
public abstract class xf {
    public static final io5 a(lo5 lo5Var, int i, boolean z, long j) {
        zq3.f(lo5Var, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new AndroidParagraph((AndroidParagraphIntrinsics) lo5Var, i, z, j, null);
    }

    public static final io5 b(String str, j jVar, List list, List list2, int i, boolean z, long j, fm1 fm1Var, e.b bVar) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, jVar, list, list2, bVar, fm1Var), i, z, j, null);
    }
}
