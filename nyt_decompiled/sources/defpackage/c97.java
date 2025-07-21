package defpackage;

import com.nytimes.android.saved.SavedAssetIndexList;

/* loaded from: classes4.dex */
public abstract class c97 {
    public static final boolean a(int i, int i2) {
        return i >= 3 && (((float) i) / ((float) i2)) * ((float) 100) >= 90.0f;
    }

    public static final boolean b(SavedAssetIndexList savedAssetIndexList, int i) {
        zq3.h(savedAssetIndexList, "savedAssetIndexList");
        return a(i, savedAssetIndexList.i().size());
    }

    public static final boolean c(String str) {
        zq3.h(str, "<this>");
        return zq3.c("saved", str);
    }

    public static final boolean d(String str) {
        zq3.h(str, "title");
        return zq3.c("Saved for Later", str);
    }
}
