package defpackage;

import com.nytimes.android.api.cms.LatestFeed;
import io.reactivex.functions.Function;
import java.util.Map;

/* loaded from: classes4.dex */
public class vf3 implements Function {
    @Override // io.reactivex.functions.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map apply(LatestFeed latestFeed) {
        return latestFeed.getImageCropMappings();
    }
}
