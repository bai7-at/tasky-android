package defpackage;

import com.nytimes.android.ad.params.video.VideoAdParamKeys;

/* loaded from: classes2.dex */
public final class c69 {
    private final g00 a;

    public c69(g00 g00Var) {
        zq3.h(g00Var, "autoPlayPrefManager");
        this.a = g00Var;
    }

    public VideoAdParamKeys a() {
        return VideoAdParamKeys.AUTOPLAY;
    }

    public String b(String str) {
        zq3.h(str, "input");
        return (p7.a(str) || !this.a.d()) ? "no" : "yes";
    }
}
