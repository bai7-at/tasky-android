package defpackage;

import com.google.gson.Gson;
import com.nytimes.android.jobs.HandleIncomingBNAWorker;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.push.BreakingNewsAlertManager;
import java.util.Map;

/* loaded from: classes4.dex */
public class va2 implements ua2 {
    private void b(h05 h05Var, Map map) {
        h05Var.d(HandleIncomingBNAWorker.class, "handle_incoming_bna_job", 1L, map, gv0.k);
    }

    @Override // defpackage.ua2
    public void a(wa2 wa2Var) {
        Map a = wa2Var.a();
        h05 b = wa2Var.b();
        if (BreakingNewsAlertManager.isBNAIntent(a)) {
            b(b, a);
            return;
        }
        NYTLogger.g("No handler for message " + new Gson().toJson(a), new Object[0]);
    }
}
