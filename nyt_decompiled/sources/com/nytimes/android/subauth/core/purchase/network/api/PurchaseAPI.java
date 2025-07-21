package com.nytimes.android.subauth.core.purchase.network.api;

import com.nytimes.android.subauth.core.purchase.network.response.LinkResponse;
import com.nytimes.android.subauth.core.purchase.network.response.VerifyPurchaseResponse;
import defpackage.by0;
import java.io.IOException;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* loaded from: classes4.dex */
public interface PurchaseAPI {

    public static final class a {
        public static /* synthetic */ Object a(PurchaseAPI purchaseAPI, String str, String str2, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyReceipt");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return purchaseAPI.verifyReceipt(str, str2, by0Var);
        }
    }

    @POST("/svc/ecommerce/accounts/{regId}/subscriptions/google-play-store.json")
    Object linkAccountGoogle(@Path("regId") String str, @Body String str2, @Header("X-Nyt-Sartre-Token") String str3, @Header("Cookie") String str4, by0<? super LinkResponse> by0Var) throws IOException;

    @POST("/svc/ecommerce/entitlements/google-play")
    Object verifyReceipt(@Body String str, @Header("X-Nyt-Sartre-Token") String str2, by0<? super VerifyPurchaseResponse> by0Var);
}
