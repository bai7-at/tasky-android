package com.nytimes.android.media.player;

import android.net.Uri;
import android.view.ViewGroup;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w0;
import com.nytimes.android.entitlements.purr.client.contracts.models.PurrGDPROptOutStatus;
import com.nytimes.android.entitlements.purr.client.contracts.models.PurrOptOutStatus;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.player.m;
import defpackage.c8;
import defpackage.d96;
import defpackage.if3;
import defpackage.kh1;
import defpackage.m59;
import defpackage.y91;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class m {
    private final m59 a;
    private final y91 b;
    private v1 c = null;

    m(m59 m59Var, y91 y91Var) {
        this.a = m59Var;
        this.b = y91Var;
    }

    private Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put(PurrOptOutStatus.HIDE, "1NN-");
        hashMap.put(PurrOptOutStatus.SHOW_OPT_OUT_ACTION, "1YN-");
        hashMap.put(PurrOptOutStatus.SHOW_OPTED_OUT_MSG, "1YY-");
        return hashMap;
    }

    private com.google.android.exoplayer2.source.o d(Uri uri, a.InterfaceC0194a interfaceC0194a) {
        return new y.b(interfaceC0194a, new kh1()).a(w0.e(uri));
    }

    public static String e(String str) {
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : name.substring(lastIndexOf + 1);
    }

    private Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put(PurrGDPROptOutStatus.ALLOW_OPT_IN, "false");
        hashMap.put(PurrGDPROptOutStatus.ALLOW_OPT_OUT, "true");
        return hashMap;
    }

    private com.google.android.exoplayer2.source.o g(Uri uri, a.InterfaceC0194a interfaceC0194a) {
        return new HlsMediaSource.Factory(interfaceC0194a).a(w0.e(uri));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ViewGroup i(ViewGroup viewGroup) {
        return viewGroup;
    }

    private boolean k(NYTMediaItem nYTMediaItem, Uri uri) {
        if (nYTMediaItem.R()) {
            return true;
        }
        return "m3u8".equals(e(uri.getPath()));
    }

    public Uri b(NYTMediaItem nYTMediaItem) {
        try {
            return this.a.a(nYTMediaItem);
        } catch (Exception unused) {
            return null;
        }
    }

    com.google.android.exoplayer2.source.o h(NYTMediaItem nYTMediaItem, if3 if3Var, final ViewGroup viewGroup, d96 d96Var) {
        Uri b;
        Uri parse = Uri.parse(nYTMediaItem.Y());
        if (nYTMediaItem.P()) {
            PurrGDPROptOutStatus k = d96Var.k();
            PurrOptOutStatus l = d96Var.l();
            Map f = f();
            parse = parse.buildUpon().appendQueryParameter("us_privacy", (String) c().get(l)).build().buildUpon().appendQueryParameter("aw_0_1st.playerid", "nytnewsandapp").build();
            if (k == PurrGDPROptOutStatus.ALLOW_OPT_IN || k == PurrGDPROptOutStatus.ALLOW_OPT_OUT) {
                parse = parse.buildUpon().appendQueryParameter("aw_0_req.gdpr", (String) f.get(k)).build();
            }
        }
        a.InterfaceC0194a c = this.b.c(parse);
        com.google.android.exoplayer2.source.o g = k(nYTMediaItem, parse) ? g(parse, this.b.c(parse)) : d(parse, this.b.e(parse));
        if (viewGroup == null || if3Var == null || (b = b(nYTMediaItem)) == null) {
            return g;
        }
        y.b bVar = new y.b(c);
        c8 c8Var = new c8() { // from class: po4
            @Override // defpackage.c8
            public final ViewGroup a() {
                ViewGroup i;
                i = m.i(viewGroup);
                return i;
            }
        };
        if3Var.n(this.c);
        return new AdsMediaSource(g, new com.google.android.exoplayer2.upstream.b(b), b, bVar, if3Var, c8Var);
    }

    void j(v1 v1Var) {
        this.c = v1Var;
    }
}
