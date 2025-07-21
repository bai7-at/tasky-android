package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.meter.MeterServiceResponse;
import io.reactivex.Observable;

/* loaded from: classes4.dex */
public interface lw2 {
    void a(boolean z);

    Observable b(Asset asset, String str, String str2);

    MeterServiceResponse c();

    Observable d();
}
