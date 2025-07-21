package defpackage;

import android.content.Intent;
import com.nytimes.android.notification.parsing.SaveIntentParser;

/* loaded from: classes4.dex */
public final class q95 {
    private final SaveIntentParser a;
    private final zp7 b;

    public q95(SaveIntentParser saveIntentParser, zp7 zp7Var) {
        zq3.h(saveIntentParser, "saveParser");
        zq3.h(zp7Var, "shareParser");
        this.a = saveIntentParser;
        this.b = zp7Var;
    }

    public final void a(Intent intent) {
        zq3.h(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != 2537853) {
                if (hashCode == 78862271 && action.equals("SHARE")) {
                    this.b.b(intent);
                    return;
                }
            } else if (action.equals("SAVE")) {
                this.a.b(intent);
                return;
            }
        }
        throw new IllegalStateException(("Action " + intent.getAction() + " not supported").toString());
    }
}
