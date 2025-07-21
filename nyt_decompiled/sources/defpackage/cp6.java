package defpackage;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.nytimes.android.api.cms.LatestFeed;
import java.io.Reader;

/* loaded from: classes3.dex */
public class cp6 implements bg0 {
    private final Gson a;

    public cp6(Gson gson) {
        this.a = gson;
    }

    @Override // defpackage.bg0
    public LatestFeed a(Reader reader) {
        return py3.a(this.a, new JsonReader(reader));
    }
}
