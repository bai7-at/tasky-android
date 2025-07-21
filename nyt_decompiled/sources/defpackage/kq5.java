package defpackage;

import com.nytimes.android.growthui.paywall.PaywallDialogFragment;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class kq5 implements op4 {
    public static void a(PaywallDialogFragment paywallDialogFragment, CoroutineScope coroutineScope) {
        paywallDialogFragment.applicationScope = coroutineScope;
    }

    public static void b(PaywallDialogFragment paywallDialogFragment, t53 t53Var) {
        paywallDialogFragment.theme = t53Var;
    }
}
