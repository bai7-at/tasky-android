package defpackage;

import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.ads.AdConfig;
import com.nytimes.android.ads.model.ContentType;
import com.nytimes.android.ads.models.CommonAdKeys;
import com.nytimes.android.ads.utils.AdExtensionsKt;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.DfpAssetMetaData;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class jb3 {
    public static final a Companion = new a(null);
    private final AdConfig.Builder a;
    private final AbraManager b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public jb3(AdConfig.Builder builder, AbraManager abraManager) {
        zq3.h(builder, "adConfigBuilder");
        zq3.h(abraManager, "abraManager");
        this.a = builder;
        this.b = abraManager;
    }

    public final Map a(Asset asset, String str) {
        zq3.h(str, "pageViewId");
        AdConfig b = this.a.b();
        if (asset != null) {
            String a2 = ContentType.Companion.a(asset);
            if (asset.isOak() && !h.P(a2, "oak", false, 2, null)) {
                a2 = a2 + ",oak";
            }
            b.b(CommonAdKeys.CONTENT_TYPE.getKey(), a2);
            DfpAssetMetaData dfp = asset.getDfp();
            List<AbstractMap.SimpleEntry> paramList = dfp != null ? dfp.paramList() : null;
            if (paramList == null) {
                paramList = i.l();
            }
            for (AbstractMap.SimpleEntry simpleEntry : paramList) {
                String str2 = (String) simpleEntry.getKey();
                String str3 = (String) simpleEntry.getValue();
                zq3.e(str2);
                zq3.e(str3);
                b.b(str2, str3);
            }
            b.o(asset.getUrlOrEmpty());
            b.b("id", String.valueOf(asset.getAssetId()));
            if (asset.getColumnName().length() > 0) {
                b.b("ser", asset.getColumnName());
            }
        }
        b.b(CommonAdKeys.PAGE_VIEW_ID.getKey(), str);
        b.b(CommonAdKeys.AB_EXPERIMENT.getKey(), AdExtensionsKt.b(this.b));
        return b.j();
    }
}
