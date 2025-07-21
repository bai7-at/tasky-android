package defpackage;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class t08 {
    private static final Set c = new HashSet();
    private final String a;
    private final String b;

    public static class a extends t08 {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    t08(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }
}
