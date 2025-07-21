package io.embrace.android.embracesdk.internal;

import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class PatternCache {
    private final Map<Set<String>, Collection<Pattern>> memo = new HashMap();

    public final boolean doesStringMatchesPatternInSet(String str, Set<String> set) {
        zq3.h(str, "string");
        zq3.h(set, "patternSet");
        Map<Set<String>, Collection<Pattern>> map = this.memo;
        Collection<Pattern> collection = map.get(set);
        if (collection == null) {
            Set<String> set2 = set;
            ArrayList arrayList = new ArrayList(i.w(set2, 10));
            Iterator<T> it2 = set2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Pattern.compile((String) it2.next()));
            }
            map.put(set, arrayList);
            collection = arrayList;
        }
        Collection<Pattern> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            if (((Pattern) it3.next()).matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }
}
