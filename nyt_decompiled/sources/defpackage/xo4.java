package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.VideoAsset;
import java.util.Map;

/* loaded from: classes4.dex */
public interface xo4 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    Object a(VideoAsset videoAsset, String str, String str2, boolean z, by0 by0Var);

    Map b(VideoAsset videoAsset, Asset asset);
}
