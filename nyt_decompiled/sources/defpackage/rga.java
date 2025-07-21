package defpackage;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* loaded from: classes3.dex */
final class rga implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ sga a;

    rga(sga sgaVar) {
        this.a = sgaVar;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        long j;
        long j2;
        long j3;
        if (z) {
            this.a.a = System.currentTimeMillis();
            this.a.d = true;
            return;
        }
        sga sgaVar = this.a;
        long currentTimeMillis = System.currentTimeMillis();
        j = sgaVar.b;
        if (j > 0) {
            sga sgaVar2 = this.a;
            j2 = sgaVar2.b;
            if (currentTimeMillis >= j2) {
                j3 = sgaVar2.b;
                sgaVar2.c = currentTimeMillis - j3;
            }
        }
        this.a.d = false;
    }
}
