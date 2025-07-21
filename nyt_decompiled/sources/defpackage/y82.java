package defpackage;

import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeOnSubscribe;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes4.dex */
public class y82 {
    final ve2 a;
    final bq5 b;

    public y82(ve2 ve2Var, bq5 bq5Var) {
        this.a = ve2Var;
        this.b = bq5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0022 -> B:9:0x005a). Please report as a decompilation issue!!! */
    public /* synthetic */ void b(Object obj, MaybeEmitter maybeEmitter) {
        String a = this.b.a(obj);
        if (!this.a.d(a)) {
            maybeEmitter.onError(new FileNotFoundException("resolvedKey does not resolve to a file" + a));
            return;
        }
        sd0 sd0Var = null;
        try {
            try {
                try {
                    sd0Var = this.a.c(a);
                    maybeEmitter.onSuccess(sd0Var);
                    maybeEmitter.onComplete();
                    if (sd0Var != null) {
                        sd0Var.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace(System.err);
                }
            } catch (FileNotFoundException e2) {
                maybeEmitter.onError(e2);
                if (sd0Var != null) {
                    sd0Var.close();
                }
            }
        } catch (Throwable th) {
            if (sd0Var != null) {
                try {
                    sd0Var.close();
                } catch (IOException e3) {
                    e3.printStackTrace(System.err);
                }
            }
            throw th;
        }
    }

    public Maybe c(final Object obj) {
        return Maybe.create(new MaybeOnSubscribe() { // from class: x82
            @Override // io.reactivex.MaybeOnSubscribe
            public final void subscribe(MaybeEmitter maybeEmitter) {
                y82.this.b(obj, maybeEmitter);
            }
        });
    }
}
