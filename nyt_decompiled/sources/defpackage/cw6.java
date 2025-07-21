package defpackage;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class cw6 {

    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(cw6 cw6Var) {
            throw null;
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static RemoteInput a(cw6 cw6Var) {
        return a.b(cw6Var);
    }

    static RemoteInput[] b(cw6[] cw6VarArr) {
        if (cw6VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[cw6VarArr.length];
        for (int i = 0; i < cw6VarArr.length; i++) {
            cw6 cw6Var = cw6VarArr[i];
            remoteInputArr[i] = a(null);
        }
        return remoteInputArr;
    }
}
