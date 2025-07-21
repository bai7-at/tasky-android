package zendesk.support;

import com.google.gson.annotations.SerializedName;
import defpackage.mn0;
import java.util.List;

/* loaded from: classes5.dex */
public class EndUserComment {

    @SerializedName("uploads")
    private List<String> attachments;
    private String value;

    public List<String> getAttachments() {
        return mn0.b(this.attachments);
    }

    public void setAttachments(List<String> list) {
        this.attachments = list;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
