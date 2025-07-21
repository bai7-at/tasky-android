package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public abstract class qk7 {

    public static final class a extends qk7 {
        private final b48 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b48 b48Var) {
            super(null);
            zq3.h(b48Var, "format");
            this.a = b48Var;
        }

        @Override // defpackage.qk7
        public Object a(ym1 ym1Var, ResponseBody responseBody) {
            zq3.h(ym1Var, "loader");
            zq3.h(responseBody, "body");
            String string = responseBody.string();
            zq3.g(string, "body.string()");
            return b().c(ym1Var, string);
        }

        @Override // defpackage.qk7
        public RequestBody d(MediaType mediaType, nk7 nk7Var, Object obj) {
            zq3.h(mediaType, "contentType");
            zq3.h(nk7Var, "saver");
            RequestBody create = RequestBody.create(mediaType, b().b(nk7Var, obj));
            zq3.g(create, "create(contentType, string)");
            return create;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.qk7
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public b48 b() {
            return this.a;
        }
    }

    public /* synthetic */ qk7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object a(ym1 ym1Var, ResponseBody responseBody);

    protected abstract gk7 b();

    public final KSerializer c(Type type2) {
        zq3.h(type2, TransferTable.COLUMN_TYPE);
        return sk7.a(b().a(), type2);
    }

    public abstract RequestBody d(MediaType mediaType, nk7 nk7Var, Object obj);

    private qk7() {
    }
}
