package defpackage;

import androidx.fragment.app.Fragment;
import com.nytimes.android.features.home.ui.HomeWebViewClient;
import com.nytimes.navigation.deeplink.DeepLinkManager;

/* loaded from: classes4.dex */
public abstract class aa3 implements ba2 {
    public static HomeWebViewClient a(Fragment fragment, DeepLinkManager deepLinkManager, t93 t93Var) {
        return new HomeWebViewClient(fragment, deepLinkManager, t93Var);
    }
}
