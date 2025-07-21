package defpackage;

import androidx.compose.ui.text.font.d;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.g;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.o;
import com.nytimes.android.growthui.R;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class gn2 {
    private static final e a = g.c(g.b(R.font.font_karnak_condensed_bold, null, 0, 0, 14, null));
    private static final e b;
    private static final e c;

    static {
        int i = R.font.font_franklin_bold;
        o.a aVar = o.b;
        d b2 = g.b(i, aVar.a(), 0, 0, 12, null);
        d b3 = g.b(R.font.font_franklin_bold_extra, aVar.b(), 0, 0, 12, null);
        int i2 = R.font.font_franklin_bold_italics;
        o a2 = aVar.a();
        l.a aVar2 = l.b;
        b = mm2.a(i.o(b2, b3, g.b(i2, a2, aVar2.a(), 0, 8, null), g.b(R.font.font_franklin_bold_italics_extra, aVar.b(), aVar2.a(), 0, 8, null), g.b(R.font.font_franklin_light, aVar.d(), 0, 0, 12, null), g.b(R.font.font_franklin_light_italics, aVar.d(), aVar2.a(), 0, 8, null), g.b(R.font.font_franklin_medium, aVar.e(), 0, 0, 12, null), g.b(R.font.font_franklin_medium_italics, aVar.e(), aVar2.a(), 0, 8, null), g.b(R.font.font_franklin_semi_bold, aVar.g(), 0, 0, 12, null), g.b(R.font.font_franklin_semi_bold_italics, aVar.g(), aVar2.a(), 0, 8, null)));
        c = g.c(g.b(R.font.font_cheltenham_medium, null, 0, 0, 14, null));
    }

    public static final e a() {
        return c;
    }

    public static final e b() {
        return b;
    }

    public static final e c() {
        return a;
    }
}
