package defpackage;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzfgq;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class l5d {
    public int a = 0;
    public Map b = new HashMap();
    public String c = "";
    public long d = -1;

    public static l5d a(Reader reader) {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap hashMap = new HashMap();
                String str = "";
                jsonReader.beginObject();
                long j = -1;
                int i = 0;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if ("response".equals(nextName)) {
                        i = jsonReader.nextInt();
                    } else if ("body".equals(nextName)) {
                        str = jsonReader.nextString();
                    } else if ("latency".equals(nextName)) {
                        j = jsonReader.nextLong();
                    } else if ("headers".equals(nextName)) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), t6b.d(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                l5d l5dVar = new l5d();
                l5dVar.a = i;
                if (str != null) {
                    l5dVar.c = str;
                }
                l5dVar.d = j;
                l5dVar.b = hashMap;
                IOUtils.closeQuietly(reader);
                return l5dVar;
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e) {
                throw new zzfgq("Unable to parse Response", e);
            }
        } catch (Throwable th) {
            IOUtils.closeQuietly(reader);
            throw th;
        }
    }
}
