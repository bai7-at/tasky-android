package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
final class s6a {
    public final String a;
    public final int b;
    public final String c;
    public final Set d;

    private s6a(String str, int i, String str2, Set set) {
        this.b = i;
        this.a = str;
        this.c = str2;
        this.d = set;
    }

    public static s6a a(String str, int i) {
        String str2;
        String trim = str.trim();
        wad.d(!trim.isEmpty());
        int indexOf = trim.indexOf(" ");
        if (indexOf == -1) {
            str2 = "";
        } else {
            String trim2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
            str2 = trim2;
        }
        int i2 = khe.a;
        String[] split = trim.split("\\.", -1);
        String str3 = split[0];
        HashSet hashSet = new HashSet();
        for (int i3 = 1; i3 < split.length; i3++) {
            hashSet.add(split[i3]);
        }
        return new s6a(str3, i, str2, hashSet);
    }

    public static s6a b() {
        return new s6a("", 0, "", Collections.emptySet());
    }
}
