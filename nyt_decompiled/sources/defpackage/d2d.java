package defpackage;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* loaded from: classes3.dex */
final class d2d implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ g3d a;

    d2d(g3d g3dVar) {
        this.a = g3dVar;
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
        long currentTimeMillis = System.currentTimeMillis();
        g3d g3dVar = this.a;
        j = g3dVar.b;
        if (j > 0) {
            j2 = g3dVar.b;
            if (currentTimeMillis >= j2) {
                j3 = g3dVar.b;
                g3dVar.c = currentTimeMillis - j3;
            }
        }
        this.a.d = false;
    }
}
