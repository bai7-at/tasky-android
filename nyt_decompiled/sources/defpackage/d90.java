package defpackage;

import android.graphics.BlendModeColorFilter;

/* loaded from: classes.dex */
final class d90 {
    public static final d90 a = new d90();

    private d90() {
    }

    public final BlendModeColorFilter a(long j, int i) {
        return new BlendModeColorFilter(wn0.k(j), ud.a(i));
    }

    public final c90 b(BlendModeColorFilter blendModeColorFilter) {
        return new c90(wn0.b(blendModeColorFilter.getColor()), ud.b(blendModeColorFilter.getMode()), blendModeColorFilter, null);
    }
}
