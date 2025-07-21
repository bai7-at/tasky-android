package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzcef;

/* loaded from: classes3.dex */
public abstract class igb {
    public static Context a(Context context) {
        return c(context).b();
    }

    public static Object b(Context context, String str, hgb hgbVar) {
        try {
            return hgbVar.zza(c(context).d(str));
        } catch (Exception e) {
            throw new zzcef(e);
        }
    }

    private static DynamiteModule c(Context context) {
        try {
            return DynamiteModule.e(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzcef(e);
        }
    }
}
