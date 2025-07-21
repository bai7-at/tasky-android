package defpackage;

import com.nytimes.android.media.common.NYTMediaItem;

/* loaded from: classes4.dex */
public final class kr6 implements f06 {
    private String a = "";
    private String b = "";

    @Override // defpackage.f06
    public void a(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "mediaItem");
        this.a = this.b;
        this.b = nYTMediaItem.p();
    }

    @Override // defpackage.f06
    public boolean b() {
        return !zq3.c(this.a, this.b) || this.a.length() == 0;
    }

    @Override // defpackage.f06
    public void c(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "mediaItem");
        this.a = nYTMediaItem.p();
        if (this.b.length() == 0) {
            this.b = nYTMediaItem.p();
        }
    }
}
