package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
final class bif implements View.OnTouchListener {
    final /* synthetic */ wwf a;

    bif(wwf wwfVar) {
        this.a = wwfVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        gfa gfaVar;
        gfa gfaVar2;
        wwf wwfVar = this.a;
        gfaVar = wwfVar.h;
        if (gfaVar == null) {
            return false;
        }
        gfaVar2 = wwfVar.h;
        gfaVar2.d(motionEvent);
        return false;
    }
}
