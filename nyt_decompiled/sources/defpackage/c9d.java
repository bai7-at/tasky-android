package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.internal.ads.zb;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class c9d {
    private MeasurementManagerFutures a;
    private final Context b;

    c9d(Context context) {
        this.b = context;
    }

    public final j64 a() {
        MeasurementManagerFutures a = MeasurementManagerFutures.a(this.b);
        this.a = a;
        return a == null ? zb.g(new IllegalStateException("MeasurementManagerFutures is null")) : a.b();
    }

    public final j64 b(Uri uri, InputEvent inputEvent) {
        MeasurementManagerFutures measurementManagerFutures = this.a;
        Objects.requireNonNull(measurementManagerFutures);
        return measurementManagerFutures.c(uri, inputEvent);
    }
}
