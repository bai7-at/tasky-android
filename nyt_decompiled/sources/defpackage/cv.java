package defpackage;

import com.nytimes.android.video.views.InlineVideoView;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class cv {
    private final Set a;
    private final Set b;

    public cv() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = linkedHashSet;
        this.b = linkedHashSet;
    }

    public final void a(InlineVideoView inlineVideoView) {
        zq3.h(inlineVideoView, "view");
        this.a.add(inlineVideoView);
    }

    public final void b(InlineVideoView inlineVideoView) {
        zq3.h(inlineVideoView, "view");
        this.a.remove(inlineVideoView);
    }

    public final Set c() {
        return this.b;
    }
}
