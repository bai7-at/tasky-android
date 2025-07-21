package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable;
import com.nytimes.android.eventtracker.devsettings.ET2DevSettings;
import defpackage.yn1;
import kotlin.collections.b0;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class f05 {
    public static final f05 a = new f05();
    private static final yn1.b b = new yn1.b("ET2");
    public static final int c = yn1.b.c;

    private f05() {
    }

    public final wn1 a(Context context) {
        zq3.h(context, "applicationContext");
        ET2DevSettings eT2DevSettings = ET2DevSettings.a;
        return new DevSettingGroupExpandable("ET2 Dev Settings", i.X0(b0.j(eT2DevSettings.b(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), eT2DevSettings.a(context, "2"))), null, false, b, null, false, false, 236, null);
    }

    public final yn1.b b() {
        return b;
    }
}
