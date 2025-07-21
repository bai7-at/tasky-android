package defpackage;

import android.content.res.Resources;
import com.nytimes.android.ribbon.destinations.audio.AudioDestinationData;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class mz {
    private final int a;
    private final InputStream b;
    private final AudioDestinationData c;

    public mz(at3 at3Var, Resources resources) {
        zq3.h(at3Var, "json");
        zq3.h(resources, "resources");
        int i = gj6.audio_podcast_sections;
        this.a = i;
        InputStream openRawResource = resources.openRawResource(i);
        zq3.g(openRawResource, "openRawResource(...)");
        this.b = openRawResource;
        at3Var.a();
        this.c = (AudioDestinationData) ru3.a(at3Var, AudioDestinationData.Companion.serializer(), openRawResource);
    }

    public final pz a() {
        return new pz(this.c.c(), this.c.d(), this.c.b());
    }
}
