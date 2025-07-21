package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public abstract class q17 {
    public static void b(final Context context, final String str, final n7 n7Var, final r17 r17Var) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(n7Var, "AdRequest cannot be null.");
        Preconditions.checkNotNull(r17Var, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        mpa.a(context);
        if (((Boolean) ora.l.e()).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.Ga)).booleanValue()) {
                pfb.b.execute(new Runnable() { // from class: lka
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        n7 n7Var2 = n7Var;
                        try {
                            new adb(context2, str2).d(n7Var2.a(), r17Var);
                        } catch (IllegalStateException e) {
                            k8b.c(context2).b(e, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new adb(context, str).d(n7Var.a(), r17Var);
    }

    public abstract r07 a();

    public abstract void c(Activity activity, bg5 bg5Var);
}
