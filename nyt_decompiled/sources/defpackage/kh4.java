package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.nytimes.android.MainActivity;

/* loaded from: classes4.dex */
public final class kh4 implements jh4 {
    private final Class a = MainActivity.class;

    @Override // defpackage.jh4
    public Class a() {
        return this.a;
    }

    @Override // defpackage.jh4
    public Intent b(Activity activity, long j, String str, int i, String str2) {
        zq3.h(activity, "activity");
        zq3.h(str, "uri");
        Intent c = is2.a.c(activity, str, str2);
        c.putExtra("com.nytimes.android.extra.VIDEO_FROM_INLINE", true);
        c.putExtra("com.nytimes.android.extra.EXTRA_VIDEO_CONTROLS_VISIBLE", true);
        c.putExtra("com.nytimes.android.extra.EXTRA_VIDEO_PLAYBACK_STATE", i);
        return c;
    }
}
