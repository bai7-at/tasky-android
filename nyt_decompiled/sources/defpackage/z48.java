package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.text.a;
import com.nytimes.android.unfear.nytdesignsystem.model.StyledText;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class z48 {
    public static final a a(List list, Composer composer, int i) {
        zq3.h(list, "<this>");
        composer.z(-691020362);
        if (b.G()) {
            b.S(-691020362, i, -1, "com.nytimes.android.unfear.nytdesignsystem.model.toAnnotatedString (StyledText.kt:23)");
        }
        a.C0064a c0064a = new a.C0064a(0, 1, null);
        composer.z(1936976469);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            c0064a.g(((StyledText) it2.next()).d(composer, 0));
        }
        composer.R();
        a o = c0064a.o();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return o;
    }
}
