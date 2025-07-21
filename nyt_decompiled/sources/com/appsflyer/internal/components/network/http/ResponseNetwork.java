package com.appsflyer.internal.components.network.http;

import android.support.annotation.NonNull;
import java.util.List;

/* loaded from: classes2.dex */
public interface ResponseNetwork<Body> {
    @NonNull
    Body getBody();

    List<String> getHeaderField(String str);

    int getStatusCode();

    boolean isSuccessful();
}
