package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.b;
import java.util.Map;

/* loaded from: classes.dex */
public final class j83 extends sk9 {
    private final Map a;

    j83(Map map) {
        this.a = map;
    }

    @Override // defpackage.sk9
    public b a(Context context, String str, WorkerParameters workerParameters) {
        p76 p76Var = (p76) this.a.get(str);
        if (p76Var == null) {
            return null;
        }
        return ((ok9) p76Var.get()).a(context, workerParameters);
    }
}
