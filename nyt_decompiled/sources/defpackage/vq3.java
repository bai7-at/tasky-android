package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public abstract class vq3 {
    public static void b(final Context context, final String str, final n7 n7Var, final wq3 wq3Var) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(n7Var, "AdRequest cannot be null.");
        Preconditions.checkNotNull(wq3Var, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        mpa.a(context);
        if (((Boolean) ora.i.e()).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.Ga)).booleanValue()) {
                pfb.b.execute(new Runnable() { // from class: mq9
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        n7 n7Var2 = n7Var;
                        try {
                            new xza(context2, str2).f(n7Var2.a(), wq3Var);
                        } catch (IllegalStateException e) {
                            k8b.c(context2).b(e, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new xza(context, str).f(n7Var.a(), wq3Var);
    }

    public abstract r07 a();

    public abstract void c(fr2 fr2Var);

    public abstract void d(boolean z);

    public abstract void e(Activity activity);
}
