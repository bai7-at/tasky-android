package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import defpackage.ym4;

/* loaded from: classes.dex */
public class e extends androidx.fragment.app.e {
    private boolean a = false;
    private Dialog b;
    private ym4 c;

    public e() {
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

    public d e1(Context context, Bundle bundle) {
        return new d(context);
    }

    public h f1(Context context) {
        return new h(context);
    }

    public void g1(ym4 ym4Var) {
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
        if (dialog == null || !this.a) {
            return;
        }
        ((h) dialog).r(ym4Var);
    }

    void h1(boolean z) {
        if (this.b != null) {
            throw new IllegalStateException("This must be called before creating dialog");
        }
        this.a = z;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.b;
        if (dialog != null) {
            if (this.a) {
                ((h) dialog).t();
            } else {
                ((d) dialog).K();
            }
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.a) {
            h f1 = f1(getContext());
            this.b = f1;
            f1.r(this.c);
        } else {
            this.b = e1(getContext(), bundle);
        }
        return this.b;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.b;
        if (dialog == null || this.a) {
            return;
        }
        ((d) dialog).o(false);
    }
}
