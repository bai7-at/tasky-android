package defpackage;

import defpackage.qk7;
import okhttp3.MediaType;
import retrofit2.Converter;

/* loaded from: classes3.dex */
public abstract class qx3 {
    public static final Converter.Factory a(b48 b48Var, MediaType mediaType) {
        zq3.h(b48Var, "<this>");
        zq3.h(mediaType, "contentType");
        return new aa2(mediaType, new qk7.a(b48Var));
    }
}
