package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public abstract class rm {

    public static abstract class a extends p6 {
    }

    public static void b(final Context context, final String str, final n7 n7Var, final int i, final a aVar) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(n7Var, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        mpa.a(context);
        if (((Boolean) ora.d.e()).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.Ga)).booleanValue()) {
                pfb.b.execute(new Runnable() { // from class: dla
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i2 = i;
                        String str2 = str;
                        n7 n7Var2 = n7Var;
                        try {
                            new hma(context2, str2, n7Var2.a(), i2, aVar).a();
                        } catch (IllegalStateException e) {
                            k8b.c(context2).b(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new hma(context, str, n7Var.a(), i, aVar).a();
    }

    public abstract r07 a();

    public abstract void c(Activity activity);
}
