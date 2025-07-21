package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class k48 {
    public static final String a(int i, int i2, Object[] objArr, Composer composer, int i3) {
        if (b.G()) {
            b.S(523207213, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = p07.a(composer, 0).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        if (b.G()) {
            b.R();
        }
        return quantityString;
    }

    public static final String b(int i, Composer composer, int i2) {
        if (b.G()) {
            b.S(1223887937, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = p07.a(composer, 0).getString(i);
        if (b.G()) {
            b.R();
        }
        return string;
    }

    public static final String c(int i, Object[] objArr, Composer composer, int i2) {
        if (b.G()) {
            b.S(2071230100, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = p07.a(composer, 0).getString(i, Arrays.copyOf(objArr, objArr.length));
        if (b.G()) {
            b.R();
        }
        return string;
    }
}
