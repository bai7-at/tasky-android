package defpackage;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.nytimes.android.ad.c;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.media.common.NYTMediaItem;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class c61 implements m59 {
    public static final b Companion = new b(null);
    private final Application a;
    private final c b;
    private final com.nytimes.android.ad.b c;

    public final class a {
        private final Map a;
        private Map b;

        public a() {
            HashMap hashMap = new HashMap();
            this.a = hashMap;
            hashMap.put("env", "vp");
            hashMap.put("gdfp_req", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            hashMap.put("impl", "s");
            hashMap.put("unviewed_position_start", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            hashMap.put("output", "xml_vmap1");
            hashMap.put("cmsid", "1958");
            String packageName = c61.this.b().getPackageName();
            zq3.g(packageName, "getPackageName(...)");
            hashMap.put("url", packageName);
        }

        private final boolean b() {
            return this.a.containsKey("env") && this.a.containsKey("gdfp_req") && this.a.containsKey("impl") && this.a.containsKey("unviewed_position_start") && this.a.containsKey("iu") && this.a.containsKey("sz") && this.a.containsKey("url") && this.a.containsKey("description_url") && this.a.containsKey("output") && this.a.containsKey("cmsid") && this.a.containsKey("vid") && this.b != null;
        }

        private final String d(Map map, boolean z) {
            StringBuilder sb = new StringBuilder();
            for (String str : map.keySet()) {
                String str2 = (String) t.j(map, str);
                if (z) {
                    str2 = c(str2);
                }
                sb.append(str + "=" + str2 + "&");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            String sb2 = sb.toString();
            zq3.g(sb2, "toString(...)");
            return sb2;
        }

        public final Uri a() {
            if (!b()) {
                throw new IllegalStateException("Missing values for required parameters");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("https://pubads.g.doubleclick.net/gampad/ads?");
            sb.append(d(this.a, true));
            sb.append("&");
            Map map = this.b;
            zq3.e(map);
            sb.append("cust_params=" + c(d(map, false)));
            Uri parse = Uri.parse(sb.toString());
            zq3.g(parse, "parse(...)");
            return parse;
        }

        public final String c(String str) {
            zq3.h(str, "value");
            String encode = URLEncoder.encode(str, Constants.DEFAULT_ENCODING);
            zq3.g(encode, "encode(...)");
            return encode;
        }

        public final void e(Map map) {
            zq3.h(map, "customParams");
            this.b = map;
        }

        public final void f(String str) {
            zq3.h(str, "videoUrl");
            this.a.put("description_url", str);
        }

        public final void g(String str) {
            zq3.h(str, "taxonomy");
            String a = c61.this.d().a();
            String a2 = c61.this.c().a();
            this.a.put("iu", a + "/" + a2 + "/" + str);
        }

        public final void h(String... strArr) {
            zq3.h(strArr, "sizes");
            Map map = this.a;
            String join = TextUtils.join("|", strArr);
            zq3.g(join, "join(...)");
            map.put("sz", join);
        }

        public final void i(long j) {
            this.a.put("vid", String.valueOf(j));
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public c61(Application application, c cVar, com.nytimes.android.ad.b bVar) {
        zq3.h(application, "context");
        zq3.h(cVar, "orgIdParam");
        zq3.h(bVar, "marketingBucketParam");
        this.a = application;
        this.b = cVar;
        this.c = bVar;
    }

    @Override // defpackage.m59
    public Uri a(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "mediaItem");
        long parseLong = Long.parseLong(nYTMediaItem.a());
        a aVar = new a();
        aVar.i(parseLong);
        String b2 = nYTMediaItem.b();
        if (b2 == null) {
            b2 = AssetConstants.VIDEO_TYPE;
        }
        aVar.g(b2);
        aVar.f(nYTMediaItem.Y());
        aVar.e(nYTMediaItem.f());
        Long V = nYTMediaItem.V();
        if (V == null || V.longValue() < TimeUnit.MINUTES.toSeconds(1L)) {
            aVar.h("480x360");
        } else {
            aVar.h("480x360", "480x361", "640x480");
        }
        return aVar.a();
    }

    public final Application b() {
        return this.a;
    }

    public final com.nytimes.android.ad.b c() {
        return this.c;
    }

    public final c d() {
        return this.b;
    }
}
