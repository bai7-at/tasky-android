package defpackage;

import com.google.android.gms.internal.pal.zzabf;
import com.google.android.gms.internal.pal.zzyz;
import com.google.android.gms.internal.pal.zzze;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class e9g {
    public static t7g a(ct9 ct9Var) {
        boolean z;
        try {
            try {
                ct9Var.G();
                try {
                    return (t7g) ys9.V.a(ct9Var);
                } catch (EOFException e) {
                    e = e;
                    z = false;
                    if (z) {
                        return g8g.a;
                    }
                    throw new zzze(e);
                }
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (zzabf e3) {
            throw new zzze(e3);
        } catch (IOException e4) {
            throw new zzyz(e4);
        } catch (NumberFormatException e5) {
            throw new zzze(e5);
        }
    }
}
