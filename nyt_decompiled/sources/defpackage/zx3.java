package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* loaded from: classes.dex */
public class zx3 extends Paint {
    public zx3() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(nu4.c(i, 0, 255));
        } else {
            setColor((nu4.c(i, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public zx3(int i) {
        super(i);
    }

    public zx3(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public zx3(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
