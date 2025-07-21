package defpackage;

import com.nytimes.android.assetretriever.AssetDownloader;
import com.nytimes.android.assetretriever.AssetRetrieverJobIntentService;

/* loaded from: classes.dex */
public abstract class gt implements op4 {
    public static void a(AssetRetrieverJobIntentService assetRetrieverJobIntentService, AssetDownloader assetDownloader) {
        assetRetrieverJobIntentService.assetDownloader = assetDownloader;
    }
}
