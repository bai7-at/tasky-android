package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.unfear.reader.handlers.UnfearReaderHandlerProviderKt;

/* loaded from: classes4.dex */
public final class ow8 {
    public static final ow8 a = new ow8();
    public static final int b = 0;

    private ow8() {
    }

    public final br a(Composer composer, int i) {
        composer.z(2067837697);
        if (b.G()) {
            b.S(2067837697, i, -1, "com.nytimes.android.unfear.reader.handlers.UnfearReaderHandlerProvider.<get-articleNavigationHandler> (UnfearReaderHandlerProvider.kt:18)");
        }
        br brVar = (br) composer.m(UnfearReaderHandlerProviderKt.a());
        if (brVar == null) {
            brVar = cr.a(s5.b(composer, 0));
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return brVar;
    }

    public final sh7 b(Composer composer, int i) {
        composer.z(-73330928);
        if (b.G()) {
            b.S(-73330928, i, -1, "com.nytimes.android.unfear.reader.handlers.UnfearReaderHandlerProvider.<get-sectionNavigationHandler> (UnfearReaderHandlerProvider.kt:13)");
        }
        sh7 sh7Var = (sh7) composer.m(UnfearReaderHandlerProviderKt.b());
        if (sh7Var == null) {
            sh7Var = th7.a(s5.b(composer, 0));
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return sh7Var;
    }
}
