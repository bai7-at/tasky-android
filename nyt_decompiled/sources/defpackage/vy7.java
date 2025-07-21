package defpackage;

import com.nytimes.android.abra.AbraManager;
import com.nytimes.games.spellingbee.SpellingBeeHostActivity;

/* loaded from: classes4.dex */
public abstract class vy7 implements op4 {
    public static void a(SpellingBeeHostActivity spellingBeeHostActivity, AbraManager abraManager) {
        spellingBeeHostActivity.abraManager = abraManager;
    }

    public static void b(SpellingBeeHostActivity spellingBeeHostActivity, sb3 sb3Var) {
        spellingBeeHostActivity.authEventPublisher = sb3Var;
    }

    public static void c(SpellingBeeHostActivity spellingBeeHostActivity, uy3 uy3Var) {
        spellingBeeHostActivity.landingHelper = uy3Var;
    }

    public static void d(SpellingBeeHostActivity spellingBeeHostActivity, dz1 dz1Var) {
        spellingBeeHostActivity.sendEmail = dz1Var;
    }

    public static void e(SpellingBeeHostActivity spellingBeeHostActivity, z58 z58Var) {
        spellingBeeHostActivity.subauthClient = z58Var;
    }
}
