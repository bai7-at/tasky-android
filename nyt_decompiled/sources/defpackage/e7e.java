package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class e7e {
    public static f7e a(Context context, int i) {
        boolean booleanValue;
        if (v7e.a()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) jra.c.e()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) jra.d.e()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) jra.b.e()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) jra.e.e()).booleanValue();
            }
            if (booleanValue) {
                return new h7e(context, i);
            }
        }
        return new w7e();
    }

    public static f7e b(Context context, int i, int i2, zzl zzlVar) {
        f7e a = a(context, i);
        if (a instanceof h7e) {
            a.zzh();
            a.c(i2);
            if (p7e.e(zzlVar.zzp)) {
                a.b(zzlVar.zzp);
            }
        }
        return a;
    }
}
