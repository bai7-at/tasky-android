package defpackage;

/* loaded from: classes2.dex */
public final class l09 implements pk7 {
    @Override // defpackage.pk7
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String serialize(j09 j09Var) {
        zq3.h(j09Var, "model");
        String jsonElement = j09Var.f().getAsJsonObject().toString();
        zq3.g(jsonElement, "model.toJson().asJsonObject.toString()");
        return jsonElement;
    }
}
