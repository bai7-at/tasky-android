package defpackage;

import com.nytimes.android.growthui.regibundle.RegibundleDialogFragment;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class gu6 implements op4 {
    public static void a(RegibundleDialogFragment regibundleDialogFragment, CoroutineScope coroutineScope) {
        regibundleDialogFragment.applicationScope = coroutineScope;
    }

    public static void b(RegibundleDialogFragment regibundleDialogFragment, t43 t43Var) {
        regibundleDialogFragment.auth = t43Var;
    }

    public static void c(RegibundleDialogFragment regibundleDialogFragment, Map map) {
        regibundleDialogFragment.eventsSenderMap = map;
    }

    public static void d(RegibundleDialogFragment regibundleDialogFragment, t53 t53Var) {
        regibundleDialogFragment.theme = t53Var;
    }
}
