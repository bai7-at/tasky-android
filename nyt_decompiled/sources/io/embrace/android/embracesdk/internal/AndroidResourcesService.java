package io.embrace.android.embracesdk.internal;

import android.content.res.Resources;

/* loaded from: classes5.dex */
public interface AndroidResourcesService {
    int getIdentifier(String str, String str2, String str3);

    String getString(int i) throws Resources.NotFoundException;
}
