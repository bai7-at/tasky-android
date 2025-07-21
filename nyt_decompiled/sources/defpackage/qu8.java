package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import defpackage.fn2;
import defpackage.um2;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
abstract class qu8 {
    private ConcurrentHashMap a = new ConcurrentHashMap();

    qu8() {
    }

    public abstract Typeface a(Context context, um2.c cVar, Resources resources, int i);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, fn2.b[] bVarArr, int i);

    public abstract Typeface c(Context context, Resources resources, int i, String str, int i2);
}
