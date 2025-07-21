package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import defpackage.ym4;

/* loaded from: classes.dex */
public class c extends androidx.fragment.app.e {
    private boolean a = false;
    private Dialog b;
    private ym4 c;

    public c() {
        setCancelable(true);
    }

    private void d1() {
        if (this.c == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.c = ym4.d(arguments.getBundle("selector"));
            }
            if (this.c == null) {
                this.c = ym4.c;
            }
        }
    }

    public ym4 e1() {
        d1();
        return this.c;
    }

    public b f1(Context context, Bundle bundle) {
        return new b(context);
    }

    public g g1(Context context) {
        return new g(context);
    }

    public void h1(ym4 ym4Var) {
        if (ym4Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        d1();
        if (this.c.equals(ym4Var)) {
            return;
        }
        this.c = ym4Var;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle("selector", ym4Var.a());
        setArguments(arguments);
        Dialog dialog = this.b;
        if (dialog != null) {
            if (this.a) {
                ((g) dialog).l(ym4Var);
            } else {
                ((b) dialog).l(ym4Var);
            }
        }
    }

    void i1(boolean z) {
        if (this.b != null) {
            throw new IllegalStateException("This must be called before creating dialog");
        }
        this.a = z;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.b;
        if (dialog == null) {
            return;
        }
        if (this.a) {
            ((g) dialog).m();
        } else {
            ((b) dialog).m();
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.a) {
            g g1 = g1(getContext());
            this.b = g1;
            g1.l(e1());
        } else {
            b f1 = f1(getContext(), bundle);
            this.b = f1;
            f1.l(e1());
        }
        return this.b;
    }
}
