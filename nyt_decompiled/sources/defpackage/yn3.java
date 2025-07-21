package defpackage;

import com.nytimes.android.IntentFilterActivity;
import com.nytimes.android.entitlements.a;
import com.nytimes.navigation.deeplink.DeepLinkManager;
import com.nytimes.navigation.deeplink.MagicLinkManager;

/* loaded from: classes2.dex */
public abstract class yn3 implements op4 {
    public static void a(IntentFilterActivity intentFilterActivity, DeepLinkManager deepLinkManager) {
        intentFilterActivity.deepLinkManager = deepLinkManager;
    }

    public static void b(IntentFilterActivity intentFilterActivity, a aVar) {
        intentFilterActivity.eCommClient = aVar;
    }

    public static void c(IntentFilterActivity intentFilterActivity, MagicLinkManager magicLinkManager) {
        intentFilterActivity.magicLinkManager = magicLinkManager;
    }
}
