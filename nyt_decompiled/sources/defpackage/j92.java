package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import com.facebook.FacebookException;
import defpackage.od9;
import defpackage.z92;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class j92 extends e {
    public static final a b = new a(null);
    private Dialog a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g1(j92 j92Var, Bundle bundle, FacebookException facebookException) {
        zq3.h(j92Var, "this$0");
        j92Var.i1(bundle, facebookException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h1(j92 j92Var, Bundle bundle, FacebookException facebookException) {
        zq3.h(j92Var, "this$0");
        j92Var.j1(bundle);
    }

    private final void i1(Bundle bundle, FacebookException facebookException) {
        f activity = getActivity();
        if (activity == null) {
            return;
        }
        c25 c25Var = c25.a;
        Intent intent = activity.getIntent();
        zq3.g(intent, "fragmentActivity.intent");
        activity.setResult(facebookException == null ? -1 : 0, c25.n(intent, bundle, facebookException));
        activity.finish();
    }

    private final void j1(Bundle bundle) {
        f activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }

    public final void f1() {
        f activity;
        od9 a2;
        if (this.a == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            c25 c25Var = c25.a;
            zq3.g(intent, "intent");
            Bundle y = c25.y(intent);
            if (y != null ? y.getBoolean("is_fallback", false) : false) {
                String string = y != null ? y.getString("url") : null;
                if (g29.Y(string)) {
                    g29.f0("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                z38 z38Var = z38.a;
                String format = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{w92.m()}, 1));
                zq3.g(format, "java.lang.String.format(format, *args)");
                z92.a aVar = z92.t;
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                a2 = aVar.a(activity, string, format);
                a2.B(new od9.d() { // from class: i92
                    @Override // od9.d
                    public final void a(Bundle bundle, FacebookException facebookException) {
                        j92.h1(j92.this, bundle, facebookException);
                    }
                });
            } else {
                String string2 = y == null ? null : y.getString("action");
                Bundle bundle = y != null ? y.getBundle("params") : null;
                if (g29.Y(string2)) {
                    g29.f0("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                } else {
                    if (string2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    a2 = new od9.a(activity, string2, bundle).h(new od9.d() { // from class: h92
                        @Override // od9.d
                        public final void a(Bundle bundle2, FacebookException facebookException) {
                            j92.g1(j92.this, bundle2, facebookException);
                        }
                    }).a();
                }
            }
            this.a = a2;
        }
    }

    public final void k1(Dialog dialog) {
        this.a = dialog;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        zq3.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if ((this.a instanceof od9) && isResumed()) {
            Dialog dialog = this.a;
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((od9) dialog).x();
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f1();
    }

    @Override // androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        if (dialog != null) {
            if (dialog != null) {
                return dialog;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
        i1(null, null);
        setShowsDialog(false);
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        zq3.g(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = this.a;
        if (dialog instanceof od9) {
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((od9) dialog).x();
        }
    }
}
