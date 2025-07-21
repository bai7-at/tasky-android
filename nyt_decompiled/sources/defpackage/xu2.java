package defpackage;

import android.content.Context;
import android.net.Uri;
import com.nytimes.games.spellingbee.SpellingBeeHostActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class xu2 extends id1 {
    private static final a Companion = new a(null);
    public static final int d = 8;
    private final cb2 b;
    private final ms c;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu2(cb2 cb2Var, ms msVar) {
        super("/puzzles/");
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(msVar, "wrapper");
        this.b = cb2Var;
        this.c = msVar;
    }

    @Override // defpackage.dd1
    public Object a(Context context, Uri uri, String str, b65 b65Var, boolean z, by0 by0Var) {
        String path = uri.getPath();
        if (path != null) {
            if (h.K(path, "/puzzles/spelling-bee", false, 2, null)) {
                SpellingBeeHostActivity.a aVar = SpellingBeeHostActivity.e;
                String path2 = uri.getPath();
                return aVar.a(context, path2 != null ? com.nytimes.xwords.hybrid.utils.a.a(path2) : null);
            }
        }
        ms msVar = this.c;
        String uri2 = uri.toString();
        zq3.g(uri2, "toString(...)");
        return ns.a(msVar, context, uri2, str, z);
    }

    @Override // defpackage.id1, defpackage.dd1
    public boolean b(Uri uri) {
        zq3.h(uri, "uri");
        return jd1.b(uri, c()) && this.b.s();
    }
}
