package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import defpackage.bk8;
import defpackage.ch8;
import defpackage.ck8;
import defpackage.gl2;
import defpackage.kt6;
import defpackage.qs2;
import defpackage.ww8;

/* loaded from: classes.dex */
public final class AndroidTextToolbar implements bk8 {
    private final View a;
    private ActionMode b;
    private final ch8 c = new ch8(new qs2() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            m94invoke();
            return ww8.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m94invoke() {
            AndroidTextToolbar.this.b = null;
        }
    }, null, null, null, null, null, 62, null);
    private TextToolbarStatus d = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(View view) {
        this.a = view;
    }

    @Override // defpackage.bk8
    public void a(kt6 kt6Var, qs2 qs2Var, qs2 qs2Var2, qs2 qs2Var3, qs2 qs2Var4) {
        this.c.l(kt6Var);
        this.c.h(qs2Var);
        this.c.i(qs2Var3);
        this.c.j(qs2Var2);
        this.c.k(qs2Var4);
        ActionMode actionMode = this.b;
        if (actionMode == null) {
            this.d = TextToolbarStatus.Shown;
            this.b = ck8.a.b(this.a, new gl2(this.c), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // defpackage.bk8
    public void c() {
        this.d = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.b = null;
    }

    @Override // defpackage.bk8
    public TextToolbarStatus getStatus() {
        return this.d;
    }
}
