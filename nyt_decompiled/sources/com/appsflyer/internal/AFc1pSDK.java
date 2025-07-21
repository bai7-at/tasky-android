package com.appsflyer.internal;

import android.support.annotation.NonNull;
import org.json.JSONException;

/* loaded from: classes2.dex */
public interface AFc1pSDK<ResponseType> {
    @NonNull
    ResponseType values(String str) throws JSONException;
}
