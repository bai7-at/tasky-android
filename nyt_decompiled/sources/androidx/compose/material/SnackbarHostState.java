package androidx.compose.material;

import androidx.compose.runtime.b0;
import defpackage.by0;
import defpackage.sy4;
import defpackage.tv7;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes.dex */
public final class SnackbarHostState {
    private final Mutex a = MutexKt.Mutex$default(false, 1, null);
    private final sy4 b = b0.e(null, null, 2, null);

    private static final class a implements tv7 {
        private final String a;
        private final String b;
        private final SnackbarDuration c;
        private final CancellableContinuation d;

        public a(String str, String str2, SnackbarDuration snackbarDuration, CancellableContinuation cancellableContinuation) {
            this.a = str;
            this.b = str2;
            this.c = snackbarDuration;
            this.d = cancellableContinuation;
        }

        @Override // defpackage.tv7
        public String a() {
            return this.a;
        }

        @Override // defpackage.tv7
        public String b() {
            return this.b;
        }

        @Override // defpackage.tv7
        public void c() {
            if (this.d.isActive()) {
                CancellableContinuation cancellableContinuation = this.d;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(SnackbarResult.ActionPerformed));
            }
        }

        @Override // defpackage.tv7
        public void dismiss() {
            if (this.d.isActive()) {
                CancellableContinuation cancellableContinuation = this.d;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(SnackbarResult.Dismissed));
            }
        }

        @Override // defpackage.tv7
        public SnackbarDuration getDuration() {
            return this.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(tv7 tv7Var) {
        this.b.setValue(tv7Var);
    }

    public static /* synthetic */ Object e(SnackbarHostState snackbarHostState, String str, String str2, SnackbarDuration snackbarDuration, by0 by0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            snackbarDuration = SnackbarDuration.Short;
        }
        return snackbarHostState.d(str, str2, snackbarDuration, by0Var);
    }

    public final tv7 b() {
        return (tv7) this.b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #0 {all -> 0x00b5, blocks: (B:26:0x0085, B:28:0x00b1), top: B:25:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r7v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, java.lang.String r9, androidx.compose.material.SnackbarDuration r10, defpackage.by0 r11) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostState.d(java.lang.String, java.lang.String, androidx.compose.material.SnackbarDuration, by0):java.lang.Object");
    }
}
