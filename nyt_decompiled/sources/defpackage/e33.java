package defpackage;

import com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher;
import java.util.List;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class e33 {
    private final GreatReadsFetcher a;

    public e33(GreatReadsFetcher greatReadsFetcher) {
        zq3.h(greatReadsFetcher, "greatReadsFetcher");
        this.a = greatReadsFetcher;
    }

    public final Flow a(List list, boolean z) {
        return this.a.d(list, z);
    }
}
