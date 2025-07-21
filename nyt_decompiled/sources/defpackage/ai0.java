package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ai0 extends ue4 {
    public /* synthetic */ ai0(String str, String str2, int i, Integer num, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, i, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : str3);
    }

    public ai0(String str, String str2, int i, Integer num, String str3) {
        super(du8.a("uri", str), du8.a("url", str2), du8.a("index", Integer.valueOf(i)), du8.a("package_index", num), du8.a("channel_uri", str3));
    }
}
