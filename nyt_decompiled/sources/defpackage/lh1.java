package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.text.h;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class lh1 implements mj2 {
    private Map a;

    public lh1(Map map) {
        zq3.h(map, "hosts");
        Set<Map.Entry> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            String str = (String) entry.getKey();
            Locale locale = Locale.US;
            zq3.g(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            zq3.g(lowerCase, "toLowerCase(...)");
            Pair a = du8.a(lowerCase, entry.getValue());
            linkedHashMap.put(a.c(), a.d());
        }
        this.a = linkedHashMap;
    }

    @Override // defpackage.mj2
    public Set a(HttpUrl httpUrl) {
        zq3.h(httpUrl, "url");
        String host = httpUrl.host();
        Map map = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!zq3.c(entry.getKey(), "*") && !zq3.c(entry.getKey(), host)) {
                if (h.v(host, InstructionFileId.DOT + entry.getKey(), false, 2, null)) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return i.c1(i.y(linkedHashMap.values()));
    }

    @Override // defpackage.mj2
    public boolean b(HttpUrl httpUrl) {
        zq3.h(httpUrl, "url");
        String host = httpUrl.host();
        Set<String> keySet = this.a.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        for (String str : keySet) {
            if (!zq3.c(str, "*") && !zq3.c(host, str)) {
                if (h.v(host, InstructionFileId.DOT + str, false, 2, null)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.mj2
    public Set c() {
        return i.c1(i.y(this.a.values()));
    }

    public final void d(Map map) {
        zq3.h(map, "hostsWithHeaderTypes");
        Map map2 = this.a;
        Set<Map.Entry> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            String str = (String) entry.getKey();
            Locale locale = Locale.US;
            zq3.g(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            zq3.g(lowerCase, "toLowerCase(...)");
            Pair a = du8.a(lowerCase, entry.getValue());
            linkedHashMap.put(a.c(), a.d());
        }
        this.a = t.p(map2, linkedHashMap);
    }

    @Override // defpackage.mj2
    public boolean isEmpty() {
        return this.a.isEmpty();
    }
}
